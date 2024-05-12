package com.ss.android.ugc.aweme.feedback.reply;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class ReplyInfo {

    @InterfaceC65349Pkn("feedback_id")
    public final Integer feedbackId;

    @InterfaceC65349Pkn("has_reply")
    public final Boolean hasReply;

    /* JADX WARN: Multi-variable type inference failed */
    public ReplyInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ReplyInfo(Integer num, Boolean bool) {
        this.feedbackId = num;
        this.hasReply = bool;
    }

    public /* synthetic */ ReplyInfo(Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? Boolean.FALSE : bool);
    }
}
