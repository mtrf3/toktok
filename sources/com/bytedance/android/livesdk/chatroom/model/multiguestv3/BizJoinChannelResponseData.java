package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BizJoinChannelResponseData extends F9E {

    @InterfaceC65349Pkn("anchor_new_fix_mic_num")
    public int fixMicNumAction;

    @InterfaceC65349Pkn("anchor_new_layout")
    public int layoutTypeAction;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BizJoinChannelResponseData() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelResponseData.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.layoutTypeAction), Integer.valueOf(this.fixMicNumAction)};
    }

    public BizJoinChannelResponseData(int i, int i2) {
        this.layoutTypeAction = i;
        this.fixMicNumAction = i2;
    }

    public /* synthetic */ BizJoinChannelResponseData(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
