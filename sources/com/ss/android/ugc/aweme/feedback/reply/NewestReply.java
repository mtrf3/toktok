package com.ss.android.ugc.aweme.feedback.reply;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NewestReply {

    @InterfaceC65349Pkn("err_code")
    public final int errCode;

    @InterfaceC65349Pkn("message")
    public final String message;

    @InterfaceC65349Pkn("data")
    public final ReplyInfo replyInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public NewestReply() {
        this(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public NewestReply(String message, int i, ReplyInfo replyInfo) {
        o.LJIIIZ(message, "message");
        this.message = message;
        this.errCode = i;
        this.replyInfo = replyInfo;
    }

    public /* synthetic */ NewestReply(String str, int i, ReplyInfo replyInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : replyInfo);
    }
}
