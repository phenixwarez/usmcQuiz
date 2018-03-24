/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.platoonformationquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set the content of the activity to use the activity_main xml file
        setContentView(R.layout.activity_main);

        // Find the View that shows the history  category
        TextView history = (TextView) findViewById(R.id.categoryOne);

// Set a click listener on that View
        history.setOnClickListener(new View.OnClickListener() {
            // The code is executed when the history View is clicked on.
            @Override
            public void onClick(View view) {
                Intent historyIntent = new Intent(MainActivity.this, usmcHistory.class);
                startActivity(historyIntent);
            }
        });

        // Find the View that shows the important category
        TextView important = (TextView) findViewById(R.id.categoryTwo);

// Set a click listener on that View
        important.setOnClickListener(new View.OnClickListener() {
            // Twill be executed when the important_Marines View is clicked on.
            @Override
            public void onClick(View view) {
                Intent importantIntent = new Intent(MainActivity.this, Important_Marines.class);
                startActivity(importantIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView knowledge = (TextView) findViewById(R.id.categoryThree);

// Set a click listener on that View
        knowledge.setOnClickListener(new View.OnClickListener() {
            //  executed when the basic knowledge View is clicked on.
            @Override
            public void onClick(View view) {
                Intent knowledgeIntent = new Intent(MainActivity.this, basicKnowledge.class);
                startActivity(knowledgeIntent);
            }
        });
        // Find the View that shows the numbers category
        TextView m16a2 = (TextView) findViewById(R.id.categoryFour);

// Set a click listener on that View
        m16a2.setOnClickListener(new View.OnClickListener() {
            // executed when the m16a2 View is clicked on.
            @Override
            public void onClick(View view) {
                Intent m16a2Intent = new Intent(MainActivity.this, m16a2Activity.class);
                startActivity(m16a2Intent);
            }
        });
        // Find the View that shows the numbers category
        TextView quizScore = (TextView) findViewById(R.id.categoryFour);

// Set a click listener on that View
        quizScore.setOnClickListener(new View.OnClickListener() {
            // executed when the m16a2 View is clicked on.
            @Override
            public void onClick(View view) {
                Intent scoreIntent = new Intent(MainActivity.this, scoreQuiz.class);
                startActivity(scoreIntent);
    }
}

