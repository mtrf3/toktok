package com.bytedance.android.livesdk.livesetting.level;

import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class UserLevelConfig {

    @InterfaceC65349Pkn("live_native_gecko_enter_room_res_config")
    public List<BarrageEnterRoomResConfig> barrageEnterRoomConfigList;

    @InterfaceC65349Pkn("live_native_gecko_source_config")
    public List<BarrageGradeResConfig> barrageResConfigList;

    @InterfaceC65349Pkn("fe_gecko_upgrade_animation_source_config")
    public List<FeResourceChannelConfig> feGeckoAnimationSourceConfigList;

    @InterfaceC65349Pkn("live_native_avatar_source_config")
    public List<GiftPanelAnimatorConfig> giftPanelAnimatorConfig;

    @InterfaceC65349Pkn("lynx_urls")
    public Map<String, String> revenueUserLevelLynxUrls;

    @InterfaceC65349Pkn("user_level_dynamic_config")
    public UserLevelDynamicConfig userLevelDynamicConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public UserLevelConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public UserLevelConfig(List<BarrageGradeResConfig> list, List<BarrageEnterRoomResConfig> list2, UserLevelDynamicConfig userLevelDynamicConfig, List<GiftPanelAnimatorConfig> list3, List<FeResourceChannelConfig> list4, Map<String, String> map) {
        this.barrageResConfigList = list;
        this.barrageEnterRoomConfigList = list2;
        this.userLevelDynamicConfig = userLevelDynamicConfig;
        this.giftPanelAnimatorConfig = list3;
        this.feGeckoAnimationSourceConfigList = list4;
        this.revenueUserLevelLynxUrls = map;
    }

    public /* synthetic */ UserLevelConfig(List list, List list2, UserLevelDynamicConfig userLevelDynamicConfig, List list3, List list4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : userLevelDynamicConfig, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) == 0 ? map : null);
    }
}
