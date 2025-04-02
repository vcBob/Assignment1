// ST10480829 Mthabela Bandile
//Assignment 1 IMAD5112
package vcmsa.ci.waterintake

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //The code below calls the buttons,edit view and text view from the front end code.
        //------------------------------------------------------------------------------------------
        val edtTxtOption = findViewById<EditText>(R.id.edtTxtOption)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val txtOutput = findViewById<TextView>(R.id.txtOutput)
       //-------------------------------------------------------------------------------------------

        //This code allows for when a user clicks on the button labeled 'Generate' for there to be an appropreat message displayed according to what the user writers in the edit view while they are using the app.
        //------------------------------------------------------------------------------------------
        btnGenerate.setOnClickListener{
            val foodOption = edtTxtOption.text.toString().toIntOrNull()

            if (foodOption == 1) {txtOutput.text = "Start your morning with some toast, eggs and salsa tomato  and onion. Drink water with that."}
            else if (foodOption == 2) {txtOutput.text= "Eat a banana and drink water!"}
            else if (foodOption == 3) {txtOutput.text= "You should get a sandwich with fries on the side."}
            else if (foodOption==4){txtOutput.text= "Dish up cooked chicken, brown rice and an a sinach salad."}
            else if (foodOption== 5){txtOutput.text="Grab some noodles with tea on the side."}
            else if (foodOption == null || foodOption<=0 || foodOption>=6)
            {txtOutput.text="PLEASE ENTER ONE OF THE AVALABLE OPTIONS!"}

            /*Title: Kotlin If ... Else
            * Author: w3schools
            * Date: 31/03/2025
            * Version:1.0
            * Available:https://www.w3schools.com/kotlin/kotlin_conditions.php */
        }
        //------------------------------------------------------------------------------------------

        //This code removes any numbers or letters written in the edit view as well as any text in the textview which is used to display there outcome of the output.
        //------------------------------------------------------------------------------------------
        btnReset.setOnClickListener{ edtTxtOption .text.clear()
            txtOutput.text=""
            /* Title: Storage clear() method
            Author: w3schools
            Date: 31/04/2025
            Version:1.0
            Available: https://www.w3schools.com/jsref/met_storage_clear.asp#gsc.tab=0
            */}
        //------------------------------------------------------------------------------------------
    }
}
