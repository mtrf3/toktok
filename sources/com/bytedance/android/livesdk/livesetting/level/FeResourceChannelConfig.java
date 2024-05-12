package com.bytedance.android.livesdk.livesetting.level;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class FeResourceChannelConfig {

    @InterfaceC65349Pkn("channel_name")
    public String feChannelName;

    @InterfaceC65349Pkn("max_level")
    public int maxLevel;

    @InterfaceC65349Pkn("min_level")
    public int minLevel;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FeResourceChannelConfig() {
        /*
            r6 = this;
            r1 = 0
            r3 = 0
            r4 = 7
            r0 = r6
            r2 = r1
            r5 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.level.FeResourceChannelConfig.<init>():void");
    }

    public FeResourceChannelConfig(int i, int i2, String str) {
        this.minLevel = i;
        this.maxLevel = i2;
        this.feChannelName = str;
    }

    public /* synthetic */ FeResourceChannelConfig(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : str);
    }
}
