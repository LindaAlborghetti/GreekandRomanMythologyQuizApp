package com.example.android.greekandromanmythologyquizapp;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.security.DigestOutputStream;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the button result is clicked.
     */

    private int calculateScore() {
        RadioButton Odyssey = (RadioButton) findViewById(R.id.odyssey_radiobutton);
        boolean isOdyssey = Odyssey.isChecked();

        RadioButton Iliad = (RadioButton) findViewById(R.id.iliad_radiobutton);
        boolean isIliad = Iliad.isChecked();

        RadioButton Aeneid = (RadioButton) findViewById(R.id.aeneid_radiobutton);
        boolean isAeneid = Aeneid.isChecked();

        RadioButton Oresteia = (RadioButton) findViewById(R.id.oresteia_radiobutton);
        boolean isOresteia = Oresteia.isChecked();

        CheckBox Cyclops = (CheckBox) findViewById(R.id.cyclops_checkbox);
        boolean isCyclops = Cyclops.isChecked();

        CheckBox Circe = (CheckBox) findViewById(R.id.circe_checkbox);
        boolean isCirce = Circe.isChecked();

        CheckBox Minotaur = (CheckBox) findViewById(R.id.minotaur_checkbox);
        boolean isMinotaur = Minotaur.isChecked();

        CheckBox Sirens = (CheckBox) findViewById(R.id.sirens_checkbox);
        boolean isSirens = Sirens.isChecked();

        CheckBox Apollo = (CheckBox) findViewById(R.id.apollo_checkbox);
        boolean isApollo = Apollo.isChecked();

        CheckBox Jupiter = (CheckBox) findViewById(R.id.jupiter_checkbox);
        boolean isJupiter = Jupiter.isChecked();

        CheckBox Demeter = (CheckBox) findViewById(R.id.demeter_checkbox);
        boolean isDemeter = Demeter.isChecked();

        CheckBox Venus = (CheckBox) findViewById(R.id.venus_checkbox);
        boolean isVenus = Venus.isChecked();

        CheckBox Poseidon = (CheckBox) findViewById(R.id.poseidon_checkbox);
        boolean isPoseidon = Poseidon.isChecked();

        RadioButton Zeus = (RadioButton) findViewById(R.id.zeus_radiobutton);
        boolean isZeus = Zeus.isChecked();

        RadioButton Dionysus = (RadioButton) findViewById(R.id.dionysus_radiobutton);
        boolean isDionysus = Dionysus.isChecked();

        RadioButton Ermes = (RadioButton) findViewById(R.id.ermes_radiobutton);
        boolean isErmes = Ermes.isChecked();

        RadioButton Hades = (RadioButton) findViewById(R.id.hades_radiobutton);
        boolean isHades = Hades.isChecked();

        RadioButton Knee = (RadioButton) findViewById(R.id.knee_radiobutton);
        boolean isKnee = Knee.isChecked();

        RadioButton Foot = (RadioButton) findViewById(R.id.foot_radiobutton);
        boolean isFoot = Foot.isChecked();

        RadioButton Hand = (RadioButton) findViewById(R.id.hand_radiobutton);
        boolean isHand = Hand.isChecked();

        RadioButton Heel = (RadioButton) findViewById(R.id.heel_radiobutton);
        boolean isHeel = Heel.isChecked();

        RadioButton Hero = (RadioButton) findViewById(R.id.hero_radiobutton);
        boolean isHero = Hero.isChecked();

        RadioButton War = (RadioButton) findViewById(R.id.war_radiobutton);
        boolean isWar = War.isChecked();

        RadioButton Rome = (RadioButton) findViewById(R.id.rome_radiobutton);
        boolean isRome = Rome.isChecked();

        RadioButton Gods = (RadioButton) findViewById(R.id.gods_radiobutton);
        boolean isGods = Gods.isChecked();


        int score = 0 ;

        if (isOdyssey) {
            score = score;
        }
        if (isIliad) {
            score = score + 1;
        }
        if (isAeneid) {
            score = score;
        }
        if (isOresteia) {
            score = score;
        }
        if (isCyclops) {
            score = score + 1;
        }
        if (isCirce) {
            score = score + 1;
        }
        if (isMinotaur) {
            score = score;
        }
        if (isSirens) {
            score = score + 1;
        }
        if (isApollo) {
            score = score + 1;
        }
        if (isJupiter) {
            score = score;
        }
        if (isDemeter) {
            score = score + 1;
        }
        if (isVenus) {
            score = score;
        }
        if (isPoseidon) {
            score = score + 1;
        }
        if (isZeus) {
            score = score;
        }
        if (isDionysus) {
            score = score + 1;
        }
        if (isErmes) {
            score = score;
        }
        if (isHades) {
            score = score;
        }
        if (isKnee) {
            score = score;
        }
        if (isFoot) {
            score = score;
        }
        if (isHand) {
            score = score;
        }
        if (isHeel) {
            score = score + 1;
        }
        if (isHero) {
            score = score;
        }
        if (isWar) {
            score = score;
        }
        if (isRome) {
            score = score + 1;
        }
        if (isGods) {
            score = score;
        }

        return score;
    }

    /**
     * This method calculates the score of the quiz.
     */
    public void showResult(View view) {
        score = calculateScore();
        display(score);
    }

    /**
     * This method displays the score on the screen.
     */
    private void display(int finalScore) {
        EditText nameField = (EditText) findViewById(R.id.edit_text_view);
        name = nameField.getText().toString();

        if (score >= 8) {
            TextView scoreTextView = (TextView) findViewById(R.id.summary_score);
            scoreTextView.setText("Congratulations " + name + "!" + "\nYou did great! " + "\nScore: " + score + "/10");
        }

        if (score <= 5) {
            TextView scoreTextView2 = (TextView) findViewById(R.id.summary_score);
            scoreTextView2.setText("You can do better " + name + "\nTry again " + "\nScore: " + score + "/10");
        }

    }


    /**
     * Resets the score of the quiz to 0.
     * Clears all RadioGroups and CheckBoxes.
     */
    public void resetScore (View v) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.RGroup1);
        radioGroup.clearCheck();

        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.RGroup2);
        radioGroup2.clearCheck();

        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.RGroup3);
        radioGroup3.clearCheck();

        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.RGroup4);
        radioGroup4.clearCheck();

        CheckBox checkBox = (CheckBox) findViewById(R.id.cyclops_checkbox);
        checkBox.setChecked(false);

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.circe_checkbox);
        checkBox1.setChecked(false);

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.minotaur_checkbox);
        checkBox2.setChecked(false);

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.sirens_checkbox);
        checkBox3.setChecked(false);

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.apollo_checkbox);
        checkBox4.setChecked(false);

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.jupiter_checkbox);
        checkBox5.setChecked(false);

        CheckBox checkBox6 = (CheckBox) findViewById(R.id.demeter_checkbox);
        checkBox6.setChecked(false);

        CheckBox checkBox7 = (CheckBox) findViewById(R.id.venus_checkbox);
        checkBox7.setChecked(false);

        CheckBox checkBox8 = (CheckBox) findViewById(R.id.poseidon_checkbox);
        checkBox8.setChecked(false);

        TextView textView = (TextView) findViewById(R.id.summary_score);
        textView.setText("Score");


    }

}