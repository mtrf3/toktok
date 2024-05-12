package com.bytedance.android.livesdk.livesetting.level;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class FansClubConfig {

    @InterfaceC65349Pkn("live_native_gecko_enter_room_res_config")
    public List<BarrageEnterRoomResConfig> barrageEnterRoomConfigList;

    @InterfaceC65349Pkn("live_native_barrage_gecko_source_config")
    public List<BarrageGradeResConfig> barrageResConfigList;

    @InterfaceC65349Pkn("fans_club_dynamic_config")
    public FansClubDynamicConfig fansClubDynamicConfig;

    @InterfaceC65349Pkn("fans_club_entrance_lottie_resource_config")
    public FansClubLottieConfig fansClubLottieConfig;

    @InterfaceC65349Pkn("live_native_entrance_gecko_source_config")
    public List<FansEntranceResConfig> fansEntranceGeckoConfigList;

    @InterfaceC65349Pkn("gecko_resource_download_config")
    public GeckoResourceDownloadConfig geckoResourceDownloadConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public FansClubConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public FansClubConfig(List<BarrageGradeResConfig> list, FansClubDynamicConfig fansClubDynamicConfig, List<FansEntranceResConfig> list2, List<BarrageEnterRoomResConfig> list3, GeckoResourceDownloadConfig geckoResourceDownloadConfig, FansClubLottieConfig fansClubLottieConfig) {
        this.barrageResConfigList = list;
        this.fansClubDynamicConfig = fansClubDynamicConfig;
        this.fansEntranceGeckoConfigList = list2;
        this.barrageEnterRoomConfigList = list3;
        this.geckoResourceDownloadConfig = geckoResourceDownloadConfig;
        this.fansClubLottieConfig = fansClubLottieConfig;
    }

    public /* synthetic */ FansClubConfig(List list, FansClubDynamicConfig fansClubDynamicConfig, List list2, List list3, GeckoResourceDownloadConfig geckoResourceDownloadConfig, FansClubLottieConfig fansClubLottieConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : fansClubDynamicConfig, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : geckoResourceDownloadConfig, (i & 32) == 0 ? fansClubLottieConfig : null);
    }
}
