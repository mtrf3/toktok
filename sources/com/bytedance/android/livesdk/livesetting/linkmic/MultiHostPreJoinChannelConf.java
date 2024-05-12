package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class MultiHostPreJoinChannelConf {

    @InterfaceC65349Pkn("receive_invite_enable")
    public boolean receiveInviteEnable;

    @InterfaceC65349Pkn("send_apply_enable")
    public boolean sendApplyEnable;

    @InterfaceC65349Pkn("send_invite_enable")
    public boolean sendInviteEnable;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiHostPreJoinChannelConf() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.MultiHostPreJoinChannelConf.<init>():void");
    }

    public MultiHostPreJoinChannelConf(boolean z, boolean z2, boolean z3) {
        this.sendInviteEnable = z;
        this.receiveInviteEnable = z2;
        this.sendApplyEnable = z3;
    }

    public /* synthetic */ MultiHostPreJoinChannelConf(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
