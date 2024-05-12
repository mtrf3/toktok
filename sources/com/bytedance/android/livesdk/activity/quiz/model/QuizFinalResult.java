package com.bytedance.android.livesdk.activity.quiz.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class QuizFinalResult {

    @InterfaceC65349Pkn("anchor_list")
    public List<QuizAnchorInfo> anchorList;

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

    @InterfaceC65349Pkn("message_type")
    public int messageType;

    @InterfaceC65349Pkn("next_quiz")
    public List<QuizNextQuiz> nextQuiz;

    @InterfaceC65349Pkn("question_count")
    public int questionCount;

    @InterfaceC65349Pkn("quiz_type")
    public int quizType;

    @InterfaceC65349Pkn("reward_amount")
    public String rewardAmount;

    @InterfaceC65349Pkn("settled_reward")
    public List<QuizRewardRule> settledReward;

    @InterfaceC65349Pkn("sponsor_code")
    public String sponsorCode;

    @InterfaceC65349Pkn("quiz_id")
    public String quizId = "";

    @InterfaceC65349Pkn("extra")
    public String extra = "";

    public QuizFinalResult() {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.settledReward = c61878OQg;
        this.nextQuiz = c61878OQg;
        this.rewardAmount = "";
        this.extra1 = "";
        this.extra2 = "";
        this.extra3 = "";
        this.extra4 = "";
        this.extra5 = "";
        this.anchorList = c61878OQg;
        this.sponsorCode = "";
    }
}
