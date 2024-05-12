package com.bytedance.android.live.broadcast.model;

import X.C47261Igj;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SurveyAnswer extends F9E {

    @InterfaceC65349Pkn("option_indexes")
    public final List<Integer> optionIndexes;

    @InterfaceC65349Pkn("question_id")
    public final String questionId;

    @InterfaceC65349Pkn("question_type")
    public final int questionType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.questionId, Integer.valueOf(this.questionType), this.optionIndexes};
    }

    public SurveyAnswer(String questionId, int i, List<Integer> optionIndexes) {
        o.LJIIIZ(questionId, "questionId");
        o.LJIIIZ(optionIndexes, "optionIndexes");
        this.questionId = questionId;
        this.questionType = i;
        this.optionIndexes = optionIndexes;
    }

    public /* synthetic */ SurveyAnswer(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? C47261Igj.LJJIJIL(-1, -1) : list);
    }
}
