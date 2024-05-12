package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class JoinDirectBizContent extends F9E {

    @InterfaceC65349Pkn("reply_im_msg_id")
    public long replyImMsgId;

    public JoinDirectBizContent() {
        this(0L, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.replyImMsgId)};
    }

    public JoinDirectBizContent(long j) {
        this.replyImMsgId = j;
    }

    public /* synthetic */ JoinDirectBizContent(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}
