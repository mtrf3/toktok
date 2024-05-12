package com.ss.android.ugc.aweme.qasticker.permission;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class AllowUserToQuestionResponse {

    @InterfaceC65349Pkn("allow_ask_question")
    public final boolean allowAskQuestion;

    public AllowUserToQuestionResponse() {
        this(false, 1, null);
    }

    public AllowUserToQuestionResponse(boolean z) {
        this.allowAskQuestion = z;
    }

    public /* synthetic */ AllowUserToQuestionResponse(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
