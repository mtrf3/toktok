package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.activity.quiz.model.QuizAnswerInfo;
import com.bytedance.android.livesdk.activity.quiz.model.QuizCallUpWebview;
import com.bytedance.android.livesdk.activity.quiz.model.QuizFinalResult;
import com.bytedance.android.livesdk.activity.quiz.model.QuizQuestionInfo;
import com.bytedance.android.livesdk.activity.quiz.model.QuizRulesIntroduction;

/* loaded from: classes17.dex */
public final class ActivityQuizCardMessage extends CR6 {

    @InterfaceC65349Pkn("answer")
    public QuizAnswerInfo answer;

    @InterfaceC65349Pkn("call_up_webview")
    public QuizCallUpWebview callUpWebview;

    @InterfaceC65349Pkn("expired_time")
    public long expiredTime;

    @InterfaceC65349Pkn("final_result")
    public QuizFinalResult finalResult;

    @InterfaceC65349Pkn("primary_id")
    public String primaryId;

    @InterfaceC65349Pkn("question")
    public QuizQuestionInfo question;

    @InterfaceC65349Pkn("rules_introduction")
    public QuizRulesIntroduction rulesIntroduction;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("sei_delay_bias")
    public long seiDelayBias;

    @InterfaceC65349Pkn("sei_delay_multiple")
    public float seiDelayMultiple;

    @InterfaceC65349Pkn("timestamp")
    public long timestamp;

    public ActivityQuizCardMessage() {
        this.type = EnumC31509CYf.ACTIVITY_QUIZ_CARD_MESSAGE;
        this.schema = "";
        this.primaryId = "";
        System.currentTimeMillis();
    }
}
