package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BizJoinDirectParams extends F9E {

    @InterfaceC65349Pkn("link_type")
    public long linkType;

    @InterfaceC65349Pkn("reply_type")
    public int replyType;

    @InterfaceC65349Pkn("user_return_type")
    public int userReturnType;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BizJoinDirectParams() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 7
            r6 = 0
            r0 = r7
            r4 = r3
            r0.<init>(r1, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectParams.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.linkType), Integer.valueOf(this.replyType), Integer.valueOf(this.userReturnType)};
    }

    public BizJoinDirectParams(long j, int i, int i2) {
        this.linkType = j;
        this.replyType = i;
        this.userReturnType = i2;
    }

    public /* synthetic */ BizJoinDirectParams(long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
