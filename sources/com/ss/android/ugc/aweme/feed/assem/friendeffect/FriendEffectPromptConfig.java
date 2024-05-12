package com.ss.android.ugc.aweme.feed.assem.friendeffect;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class FriendEffectPromptConfig extends F9E {

    @InterfaceC65349Pkn("group")
    public final int group;

    @InterfaceC65349Pkn("transform_effect_daily_limits")
    public final int transformEffectDailyLimit;

    @InterfaceC65349Pkn("transform_total_daily_limits")
    public final int transformTotalDailyLimit;

    @InterfaceC65349Pkn("transform_video_interval")
    public final int transformVideoInterval;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FriendEffectPromptConfig() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.friendeffect.FriendEffectPromptConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.group), Integer.valueOf(this.transformTotalDailyLimit), Integer.valueOf(this.transformEffectDailyLimit), Integer.valueOf(this.transformVideoInterval)};
    }

    public FriendEffectPromptConfig(int i, int i2, int i3, int i4) {
        this.group = i;
        this.transformTotalDailyLimit = i2;
        this.transformEffectDailyLimit = i3;
        this.transformVideoInterval = i4;
    }

    public /* synthetic */ FriendEffectPromptConfig(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
