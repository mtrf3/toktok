package com.bytedance.android.livesdk.activity.quiz.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class QuizAnswerInfo {

    @InterfaceC65349Pkn("correct_answer")
    public String correctAnswer;

    @InterfaceC65349Pkn("correct_answer_image")
    public List<QuizImage> correctAnswerImage;

    @InterfaceC65349Pkn("display_duration_ms")
    public int displayDurationMs;

    @InterfaceC65349Pkn("extra1")
    public String extra1;

    @InterfaceC65349Pkn("extra2")
    public String extra2;

    @InterfaceC65349Pkn("extra3")
    public String extra3;

    @InterfaceC65349Pkn("extra4")
    public String extra4;

    @InterfaceC65349Pkn("extra5")
    public String extra5;

    @InterfaceC65349Pkn("image")
    public List<QuizImage> image;

    @InterfaceC65349Pkn("message_type")
    public int messageType;

    @InterfaceC65349Pkn("next_quiz")
    public List<QuizNextQuiz> nextQuiz;

    @InterfaceC65349Pkn("options")
    public List<QuizQuestionOption> options;

    @InterfaceC65349Pkn("participants_count")
    public long participantsCount;

    @InterfaceC65349Pkn("question_count")
    public int questionCount;

    @InterfaceC65349Pkn("question_no")
    public int questionNo;

    @InterfaceC65349Pkn("question_type")
    public int questionType;

    @InterfaceC65349Pkn("quiz_type")
    public int quizType;

    @InterfaceC65349Pkn("reward_amount")
    public String rewardAmount;

    @InterfaceC65349Pkn("sponsor_code")
    public String sponsorCode;

    @InterfaceC65349Pkn("statistics")
    public QuizStatistics statistics;

    @InterfaceC65349Pkn("quiz_id")
    public String quizId = "";

    @InterfaceC65349Pkn("extra")
    public String extra = "";

    @InterfaceC65349Pkn("question_id")
    public String questionId = "";

    @InterfaceC65349Pkn("title")
    public String title = "";

    public QuizAnswerInfo() {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.image = c61878OQg;
        this.options = c61878OQg;
        this.correctAnswer = "";
        this.nextQuiz = c61878OQg;
        this.rewardAmount = "";
        this.correctAnswerImage = c61878OQg;
        this.extra1 = "";
        this.extra2 = "";
        this.extra3 = "";
        this.extra4 = "";
        this.extra5 = "";
        this.sponsorCode = "";
    }
}
