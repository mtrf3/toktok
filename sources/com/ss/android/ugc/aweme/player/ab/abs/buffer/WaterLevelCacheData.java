package com.ss.android.ugc.aweme.player.ab.abs.buffer;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes9.dex */
public final class WaterLevelCacheData extends F9E {

    @InterfaceC65349Pkn("netStartingBlockDurationInitial")
    public final int netStartingBlockDurationInitial;

    @InterfaceC65349Pkn("water_level_cache_size")
    public final int waterLevelCacheSize;

    public static /* synthetic */ WaterLevelCacheData copy$default(WaterLevelCacheData waterLevelCacheData, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = waterLevelCacheData.waterLevelCacheSize;
        }
        if ((i3 & 2) != 0) {
            i2 = waterLevelCacheData.netStartingBlockDurationInitial;
        }
        return waterLevelCacheData.copy(i, i2);
    }

    public final WaterLevelCacheData copy(int i, int i2) {
        return new WaterLevelCacheData(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.waterLevelCacheSize), Integer.valueOf(this.netStartingBlockDurationInitial)};
    }

    public final int getNetStartingBlockDurationInitial() {
        return this.netStartingBlockDurationInitial;
    }

    public final int getWaterLevelCacheSize() {
        return this.waterLevelCacheSize;
    }

    public WaterLevelCacheData(int i, int i2) {
        this.waterLevelCacheSize = i;
        this.netStartingBlockDurationInitial = i2;
    }
}
