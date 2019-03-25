package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.ArcMotion;
import android.view.View;
import android.widget.Button;

public class HarderProblems extends AppCompatActivity {

    private Button btnConvertCharArrayToString, btnCalculateAndDisplayStudentsGrade, btnGetASCIIValueOfCharacter;
    private Button btnCheckArmstrongsNumber, btnConvertDecimalToBinary, btnGetIPAdress;
    private Button btnPrintFloydsTriangle, btnSumOfComplexNumbers, btnCheckForDuplicateCharactersInAString;
    private Button btnCheckPalindromeStringUsingRecursion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.harder_problems);

        btnConvertCharArrayToString = findViewById(R.id.btnConverChartArrayToSTring);
        btnConvertCharArrayToString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HarderProblems.this, ConvertCharArrayToString.class));
            }
        });
        btnCalculateAndDisplayStudentsGrade = findViewById(R.id.btnCalculateAndDisplayStudentsGrade);
        btnCalculateAndDisplayStudentsGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HarderProblems.this, CalculateAndDisplayStudentsGrades.class));
            }
        });

        btnGetASCIIValueOfCharacter = findViewById(R.id.btnGetASCIIValueOfCharacter);
        btnGetASCIIValueOfCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HarderProblems.this, GetASCIIValueOfCharacter.class));
            }
        });

        btnCheckArmstrongsNumber = findViewById(R.id.btnCheckArmstrongsNumber);
        btnCheckArmstrongsNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HarderProblems.this, CheckArmstrongsNumber.class));
            }
        });

        btnConvertDecimalToBinary = findViewById(R.id.btnConvertDecimalToBinary);
        btnConvertDecimalToBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HarderProblems.this, ConvertDecimalToBinary.class));
            }
        });

        btnGetIPAdress = findViewById(R.id.btnGetIPAdress);
        btnGetIPAdress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HarderProblems.this, GetIpAddress.class));
            }
        });

        btnPrintFloydsTriangle = findViewById(R.id.btnPrintFloydsTriangle);
        btnPrintFloydsTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HarderProblems.this, PrintFloydsTriangle.class));
            }
        });

        btnCheckForDuplicateCharactersInAString = findViewById(R.id.btnCheckForDuplicateCharactersInAString);
        btnCheckForDuplicateCharactersInAString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HarderProblems.this, CheckForDuplicateCharacterInAString.class));
            }
        });

        btnSumOfComplexNumbers = findViewById(R.id.btnSumOfComplexNumbers);
        btnSumOfComplexNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HarderProblems.this, SumOfComplexNumbers.class));
            }
        });

        btnCheckPalindromeStringUsingRecursion = findViewById(R.id.btnCheckPalindromeStringUsingRecursion);
        btnCheckPalindromeStringUsingRecursion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HarderProblems.this, CheckPalindromeStringUsingRecursion.class));
            }
        });

    }
}
