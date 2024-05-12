package com.bytedance.android.livesdk.livesetting.level;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LevelSystemResourceConfig {

    @InterfaceC65349Pkn("barrage_effect_strategy")
    public int effectStrategy;

    @InterfaceC65349Pkn("fans_gecko_enter_room_res_config")
    public List<BarrageEnterRoomResConfig> fansBarrageEnterRoomConfigList;

    @InterfaceC65349Pkn("fans_club_native_gecko_source_video_config")
    public List<BarrageGradeResConfig> fansBarrageResConfigList;

    @InterfaceC65349Pkn("gecko_ondemand_config")
    public LevelSystemGeckoOnDemandConfig geckoOnDemandConfig;

    @InterfaceC65349Pkn("level_gecko_enter_room_res_config")
    public List<BarrageEnterRoomResConfig> levelBarrageEnterRoomConfigList;

    @InterfaceC65349Pkn("user_level_native_gecko_source_video_config")
    public List<BarrageGradeResConfig> levelBarrageResConfigList;

    /* JADX WARN: Multi-variable type inference failed */
    public LevelSystemResourceConfig() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public LevelSystemResourceConfig(int i, List<BarrageGradeResConfig> list, List<BarrageGradeResConfig> list2, List<BarrageEnterRoomResConfig> list3, List<BarrageEnterRoomResConfig> list4, LevelSystemGeckoOnDemandConfig levelSystemGeckoOnDemandConfig) {
        this.effectStrategy = i;
        this.levelBarrageResConfigList = list;
        this.fansBarrageResConfigList = list2;
        this.levelBarrageEnterRoomConfigList = list3;
        this.fansBarrageEnterRoomConfigList = list4;
        this.geckoOnDemandConfig = levelSystemGeckoOnDemandConfig;
    }

    public /* synthetic */ LevelSystemResourceConfig(int i, List list, List list2, List list3, List list4, LevelSystemGeckoOnDemandConfig levelSystemGeckoOnDemandConfig, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : list4, (i2 & 32) == 0 ? levelSystemGeckoOnDemandConfig : null);
    }
}
