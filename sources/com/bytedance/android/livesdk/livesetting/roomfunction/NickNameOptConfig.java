package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class NickNameOptConfig {

    @InterfaceC65349Pkn("live_nick_name_opt_font")
    public boolean optFont;

    @InterfaceC65349Pkn("live_nick_name_opt_round_corner")
    public boolean optRoundCorner;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NickNameOptConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.roomfunction.NickNameOptConfig.<init>():void");
    }

    public NickNameOptConfig(boolean z, boolean z2) {
        this.optFont = z;
        this.optRoundCorner = z2;
    }

    public /* synthetic */ NickNameOptConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
