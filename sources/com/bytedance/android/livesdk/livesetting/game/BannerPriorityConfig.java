package com.bytedance.android.livesdk.livesetting.game;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BannerPriorityConfig extends F9E {

    @InterfaceC65349Pkn("game_banner_count")
    public final int gameBannerCount;

    @InterfaceC65349Pkn("game_banner_list")
    public final LinkedList<BannerInfo> gameBannerInfoList;

    @InterfaceC65349Pkn("live_studio_banner_count")
    public final int liveStudioBannerCount;

    @InterfaceC65349Pkn("live_studio_banner_list")
    public final LinkedList<BannerInfo> liveStudioBannerInfoList;

    @InterfaceC65349Pkn("obs_banner_count")
    public final int obsBannerCount;

    @InterfaceC65349Pkn("obs_banner_list")
    public final LinkedList<BannerInfo> obsBannerInfoList;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.gameBannerInfoList, this.obsBannerInfoList, Integer.valueOf(this.gameBannerCount), Integer.valueOf(this.obsBannerCount), this.liveStudioBannerInfoList, Integer.valueOf(this.liveStudioBannerCount)};
    }

    public BannerPriorityConfig(LinkedList<BannerInfo> gameBannerInfoList, LinkedList<BannerInfo> obsBannerInfoList, int i, int i2, LinkedList<BannerInfo> liveStudioBannerInfoList, int i3) {
        o.LJIIIZ(gameBannerInfoList, "gameBannerInfoList");
        o.LJIIIZ(obsBannerInfoList, "obsBannerInfoList");
        o.LJIIIZ(liveStudioBannerInfoList, "liveStudioBannerInfoList");
        this.gameBannerInfoList = gameBannerInfoList;
        this.obsBannerInfoList = obsBannerInfoList;
        this.gameBannerCount = i;
        this.obsBannerCount = i2;
        this.liveStudioBannerInfoList = liveStudioBannerInfoList;
        this.liveStudioBannerCount = i3;
    }
}
