package com.bytedance.android.livesdk.livesetting.level;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class FansClubDynamicConfig {

    @InterfaceC65349Pkn("badge_span_factor")
    public int badgeMarginSpanFactor;

    @InterfaceC65349Pkn("enable_fast_follow_by_fans")
    public boolean enableFastFollowByFansLevel;

    @InterfaceC65349Pkn("min_barrage_grade")
    public int minBarrageGrade;

    @InterfaceC65349Pkn("play_guide_anim_delay_time")
    public long playGuideAnimDelayTime;

    /* JADX WARN: Multi-variable type inference failed */
    public FansClubDynamicConfig() {
        this(0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 15, null);
    }

    public FansClubDynamicConfig(int i, boolean z, long j, int i2) {
        this.minBarrageGrade = i;
        this.enableFastFollowByFansLevel = z;
        this.playGuideAnimDelayTime = j;
        this.badgeMarginSpanFactor = i2;
    }

    public /* synthetic */ FansClubDynamicConfig(int i, boolean z, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 10 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 4000L : j, (i3 & 8) != 0 ? 1 : i2);
    }
}
