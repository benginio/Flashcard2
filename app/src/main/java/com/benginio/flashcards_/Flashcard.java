package com.benginio.flashcards_;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Flashcard {
    @ColumnInfo(name = "question")
    private final String question;
    @ColumnInfo(name = "answer")
    private final String answer;
    @ColumnInfo(name = "wrong_answer_1")
    private final String wrongAnswer1;
    @ColumnInfo(name = "wrong_answer_2")
    private final String wrongAnswer2;
    @PrimaryKey(autoGenerate = true)
    private int uuid;

    public Flashcard(String question, String answer, String wrongAnswer1, String wrongAnswer2, int uuid) {
        this.question = question;
        this.answer = answer;
        this.wrongAnswer1 = wrongAnswer1;
        this.wrongAnswer2 = wrongAnswer2;
        this.uuid = uuid;
    }


    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getWrongAnswer1() {
        return wrongAnswer1;
    }

    public String getWrongAnswer2() {
        return wrongAnswer2;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }
}
