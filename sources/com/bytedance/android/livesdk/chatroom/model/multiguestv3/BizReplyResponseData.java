package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BizReplyResponseData extends F9E {

    @InterfaceC65349Pkn("anchor_new_fix_mic_num")
    public int fixMicNumAction;

    @InterfaceC65349Pkn("anchor_new_layout")
    public int layoutTypeAction;

    @InterfaceC65349Pkn("link_type_permission")
    public long linkTypePermission;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BizReplyResponseData() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.linkTypePermission), Integer.valueOf(this.layoutTypeAction), Integer.valueOf(this.fixMicNumAction)};
    }

    public BizReplyResponseData(long j, int i, int i2) {
        this.linkTypePermission = j;
        this.layoutTypeAction = i;
        this.fixMicNumAction = i2;
    }

    public /* synthetic */ BizReplyResponseData(long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
