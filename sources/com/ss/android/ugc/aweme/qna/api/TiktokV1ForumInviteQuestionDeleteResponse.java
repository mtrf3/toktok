package com.ss.android.ugc.aweme.qna.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TiktokV1ForumInviteQuestionDeleteResponse extends F9E {

    @InterfaceC65349Pkn("msg")
    public final String msg;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.statusCode), this.msg};
    }

    public TiktokV1ForumInviteQuestionDeleteResponse(int i, String msg) {
        o.LJIIIZ(msg, "msg");
        this.statusCode = i;
        this.msg = msg;
    }
}
