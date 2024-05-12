package X;

import com.ss.android.ugc.aweme.im.message.template.card.AnswerStatusComponent;

/* loaded from: classes14.dex */
public /* synthetic */ class V3S {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AnswerStatusComponent.values().length];
        try {
            iArr[AnswerStatusComponent.ANSWER_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AnswerStatusComponent.ANSWER_TIMEOUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AnswerStatusComponent.ANSWER_BAD_WORD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AnswerStatusComponent.ANSWER_RISK_QUESTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
