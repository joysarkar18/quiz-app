package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.quizapp.databinding.ActivityQuestionAnsBinding

private val arr = constants.getQuestions();
private lateinit var binding:ActivityQuestionAnsBinding
var questionNo = 0
var is_selected = false
var score = 0;
var ft = 0;
class QuestionAns : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionAnsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setQuestion(0)
        var temp = 0
        var selected_ans = 0

        binding.op1.setOnClickListener {
            makedefault()
            binding.op1.background = ContextCompat.getDrawable(this ,R.drawable.selected_backgraoun)
            is_selected = true
            selected_ans = 1

        }
        binding.op2.setOnClickListener {
            makedefault()
            binding.op2.background = ContextCompat.getDrawable(this ,R.drawable.selected_backgraoun)
            is_selected = true
            selected_ans = 2

        }
        binding.op3.setOnClickListener {
            makedefault()
            binding.op3.background = ContextCompat.getDrawable(this ,R.drawable.selected_backgraoun)
            is_selected = true
            selected_ans = 3

        }
        binding.op4.setOnClickListener {
            makedefault()
            binding.op4.background = ContextCompat.getDrawable(this ,R.drawable.selected_backgraoun)
            is_selected = true
            selected_ans = 4

        }

        binding.submitBtn.setOnClickListener {
            if(temp%2==0){
                if(questionNo>=9){
                    check(selected_ans , arr[questionNo].ans)
                    binding.submitBtn.text = "SHOW RESULT"
                    binding.progressBar.progress++
                    ft = 1
                }
                else{
                    if(is_selected){
                        check(selected_ans , arr[questionNo].ans)
                        binding.submitBtn.text = "NEXT QUESTION"
                        binding.progressBar.progress++
                        questionNo++

                    }

                    else{
                        Toast.makeText(applicationContext , "Please select an option!" , Toast.LENGTH_SHORT).show()
                    }



                }
            }

            else{
                if(ft==1){
                    val intent = Intent(this , Result::class.java)
                    startActivity(intent)
                    finish()

                }
                else{
                    setQuestion(questionNo)
                    binding.submitBtn.text="SUBMIT"
                    makedefault()
                }
                    setQuestion(questionNo)
                    binding.submitBtn.text="SUBMIT"
                makedefault()
            }
            temp++
        }


    }

   fun setQuestion(qNo:Int){
       var question = arr[qNo]
       binding.flag.setImageResource(question.img)
       binding.qsn.text = question.question
       binding.op1.text = question.q1
       binding.op2.text = question.q2
       binding.op3.text = question.q3
       binding.op4.text = question.q4


   }
   fun makedefault(){
       binding.op1.background = ContextCompat.getDrawable(this , R.drawable.option_backgraoun);
       binding.op2.background = ContextCompat.getDrawable(this , R.drawable.option_backgraoun);
       binding.op3.background = ContextCompat.getDrawable(this , R.drawable.option_backgraoun);
       binding.op4.background = ContextCompat.getDrawable(this , R.drawable.option_backgraoun);
       is_selected = false
   }

    fun check(s:Int , a:Int) {
        if (a == s) {
            score++
            if (a == 1) {
                makedefault()
                binding.op1.background = ContextCompat.getDrawable(this, R.color.green)
            }
            if (a == 2) {
                makedefault()
                binding.op2.background = ContextCompat.getDrawable(this, R.color.green)
            }
            if (a == 3) {
                makedefault()
                binding.op3.background = ContextCompat.getDrawable(this, R.color.green)
            }
            if (a == 4) {
                makedefault()
                binding.op4.background = ContextCompat.getDrawable(this, R.color.green)
            }

        } else {

            if(a==1){
                makedefault()
                binding.op1.background = ContextCompat.getDrawable(this, R.color.green)
                if (s == 2) {
                    binding.op2.background = ContextCompat.getDrawable(this, R.color.red)
                }
                if (s == 3) {

                    binding.op3.background = ContextCompat.getDrawable(this, R.color.red)
                }
                if (s== 4) {

                    binding.op4.background = ContextCompat.getDrawable(this, R.color.red)
                }


            }

            if(a==2){
                makedefault()
                binding.op2.background = ContextCompat.getDrawable(this, R.color.green)
                if (s == 1) {
                    binding.op1.background = ContextCompat.getDrawable(this, R.color.red)
                }
                if (s == 3) {

                    binding.op3.background = ContextCompat.getDrawable(this, R.color.red)
                }
                if (s== 4) {
                    binding.op4.background = ContextCompat.getDrawable(this, R.color.red)
                }


            }



            if(a==3){
                makedefault()
                binding.op3.background = ContextCompat.getDrawable(this, R.color.green)
                if (s == 1) {
                    binding.op1.background = ContextCompat.getDrawable(this, R.color.red)
                }
                if (s == 2) {

                    binding.op2.background = ContextCompat.getDrawable(this, R.color.red)
                }
                if (s== 4) {
                    binding.op4.background = ContextCompat.getDrawable(this, R.color.red)
                }


            }


            if(a==4){
                makedefault()
                binding.op4.background = ContextCompat.getDrawable(this, R.color.green)
                if (s == 1) {
                    binding.op1.background = ContextCompat.getDrawable(this, R.color.red)
                }
                if (s == 2) {

                    binding.op2.background = ContextCompat.getDrawable(this, R.color.red)
                }
                if (s== 3) {
                    binding.op3.background = ContextCompat.getDrawable(this, R.color.red)
                }


            }

        }
    }


}