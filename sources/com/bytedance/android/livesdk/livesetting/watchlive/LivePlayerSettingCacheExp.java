package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C5H3;
import X.C78996UzQ;
import X.CFO;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_player_setting_cache_exp")
/* loaded from: classes6.dex */
public final class LivePlayerSettingCacheExp {

    @Group(isDefault = true, value = "default")
    public static final LivePlayerSettingCacheConfig DEFAULT;
    public static final LivePlayerSettingCacheExp INSTANCE = new LivePlayerSettingCacheExp();
    public static final C5H3 setting$delegate = C78996UzQ.LJJIJIIJI(CFO.LJLIL);

    static {
        int i = 0;
        DEFAULT = new LivePlayerSettingCacheConfig(i, i, 3, null);
    }

    private final LivePlayerSettingCacheConfig getSetting() {
        return (LivePlayerSettingCacheConfig) setting$delegate.getValue();
    }

    public final int getMapSize() {
        return getSetting().settingMapSize;
    }

    public final boolean getValue() {
        if (getSetting().cacheSetting == 1) {
            return true;
        }
        return false;
    }

    /* loaded from: classes6.dex */
    public static final class LivePlayerSettingCacheConfig {

        @InterfaceC65349Pkn("player_cache_setting")
        public int cacheSetting;

        @InterfaceC65349Pkn("setting_map_size")
        public int settingMapSize;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public LivePlayerSettingCacheConfig() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerSettingCacheExp.LivePlayerSettingCacheConfig.<init>():void");
        }

        public LivePlayerSettingCacheConfig(int i, int i2) {
            this.cacheSetting = i;
            this.settingMapSize = i2;
        }

        public /* synthetic */ LivePlayerSettingCacheConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 70 : i2);
        }
    }
}
