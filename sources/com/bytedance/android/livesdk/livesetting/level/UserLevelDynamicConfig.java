package com.bytedance.android.livesdk.livesetting.level;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class UserLevelDynamicConfig {

    @InterfaceC65349Pkn("enable_grade_barrage_ninepatch_scale")
    public boolean enableGradeNinePatchScale;

    @InterfaceC65349Pkn("fetch_fe_gecko_delay_time")
    public int fetchFeGeckoDelayTime;

    @InterfaceC65349Pkn("fetch_client_gecko_delay_time")
    public int fetchNativeGeckoDelayTime;

    @InterfaceC65349Pkn("min_barrage_grade")
    public int minBarrageGrade;

    @InterfaceC65349Pkn("preload_badge_icon_delay_time")
    public int preloadBadgeIconDelayTime;

    /* JADX WARN: Multi-variable type inference failed */
    public UserLevelDynamicConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, null);
    }

    public UserLevelDynamicConfig(int i, boolean z, int i2, int i3, int i4) {
        this.minBarrageGrade = i;
        this.enableGradeNinePatchScale = z;
        this.fetchFeGeckoDelayTime = i2;
        this.preloadBadgeIconDelayTime = i3;
        this.fetchNativeGeckoDelayTime = i4;
    }

    public /* synthetic */ UserLevelDynamicConfig(int i, boolean z, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 10 : i, (i5 & 2) != 0 ? false : z, (i5 & 4) != 0 ? 7 : i2, (i5 & 8) != 0 ? 9 : i3, (i5 & 16) != 0 ? 4 : i4);
    }
}
