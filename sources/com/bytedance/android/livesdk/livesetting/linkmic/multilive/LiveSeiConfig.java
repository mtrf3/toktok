package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveSeiConfig {

    @InterfaceC65349Pkn("parse_interval")
    public int interval;

    @InterfaceC65349Pkn("parse_type")
    public int parseType;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveSeiConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiConfig.<init>():void");
    }

    public LiveSeiConfig(int i, int i2) {
        this.parseType = i;
        this.interval = i2;
    }

    public /* synthetic */ LiveSeiConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 2 : i, (i3 & 2) != 0 ? 300 : i2);
    }
}
