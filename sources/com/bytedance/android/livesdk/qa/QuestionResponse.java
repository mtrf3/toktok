package com.bytedance.android.livesdk.qa;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class QuestionResponse extends F9E {

    @InterfaceC65349Pkn("question_id")
    public long questionId;

    public QuestionResponse() {
        this(0L, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.questionId)};
    }

    public QuestionResponse(long j) {
        this.questionId = j;
    }

    public /* synthetic */ QuestionResponse(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}
