package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AnswerDataContent implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("singleChoiceAnswerData")
    public final FeelgoodOptionData singleChoiceAnswerData;

    public static /* synthetic */ AnswerDataContent copy$default(AnswerDataContent answerDataContent, FeelgoodOptionData feelgoodOptionData, int i, Object obj) {
        if ((i & 1) != 0) {
            feelgoodOptionData = answerDataContent.singleChoiceAnswerData;
        }
        return answerDataContent.copy(feelgoodOptionData);
    }

    public final AnswerDataContent copy(FeelgoodOptionData feelgoodOptionData) {
        return new AnswerDataContent(feelgoodOptionData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnswerDataContent) && o.LJ(this.singleChoiceAnswerData, ((AnswerDataContent) obj).singleChoiceAnswerData);
    }

    public int hashCode() {
        FeelgoodOptionData feelgoodOptionData = this.singleChoiceAnswerData;
        if (feelgoodOptionData == null) {
            return 0;
        }
        return feelgoodOptionData.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnswerDataContent(singleChoiceAnswerData=");
        LIZ.append(this.singleChoiceAnswerData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final FeelgoodOptionData getSingleChoiceAnswerData() {
        return this.singleChoiceAnswerData;
    }

    public AnswerDataContent(FeelgoodOptionData feelgoodOptionData) {
        this.singleChoiceAnswerData = feelgoodOptionData;
    }
}
