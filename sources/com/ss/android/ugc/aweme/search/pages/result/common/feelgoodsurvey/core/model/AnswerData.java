package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AnswerData extends F9E implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("answerData")
    public final AnswerDataContent answerData;

    @InterfaceC65349Pkn("questionKey")
    public final String questionKey;

    @InterfaceC65349Pkn("questionType")
    public final int questionType;

    @InterfaceC65349Pkn("showIndex")
    public final int showIndex;

    public static /* synthetic */ AnswerData copy$default(AnswerData answerData, int i, String str, AnswerDataContent answerDataContent, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = answerData.questionType;
        }
        if ((i3 & 2) != 0) {
            str = answerData.questionKey;
        }
        if ((i3 & 4) != 0) {
            answerDataContent = answerData.answerData;
        }
        if ((i3 & 8) != 0) {
            i2 = answerData.showIndex;
        }
        return answerData.copy(i, str, answerDataContent, i2);
    }

    public final AnswerData copy(int i, String questionKey, AnswerDataContent answerData, int i2) {
        o.LJIIIZ(questionKey, "questionKey");
        o.LJIIIZ(answerData, "answerData");
        return new AnswerData(i, questionKey, answerData, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.questionType), this.questionKey, this.answerData, Integer.valueOf(this.showIndex)};
    }

    public final AnswerDataContent getAnswerData() {
        return this.answerData;
    }

    public final String getQuestionKey() {
        return this.questionKey;
    }

    public final int getQuestionType() {
        return this.questionType;
    }

    public final int getShowIndex() {
        return this.showIndex;
    }

    public AnswerData(int i, String questionKey, AnswerDataContent answerData, int i2) {
        o.LJIIIZ(questionKey, "questionKey");
        o.LJIIIZ(answerData, "answerData");
        this.questionType = i;
        this.questionKey = questionKey;
        this.answerData = answerData;
        this.showIndex = i2;
    }
}
