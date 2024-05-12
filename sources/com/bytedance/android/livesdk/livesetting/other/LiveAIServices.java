package com.bytedance.android.livesdk.livesetting.other;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveAIServices {

    @InterfaceC65349Pkn("gift_guide_client_collect")
    public GiftGuideOpenPredictService giftGuideOpenPredictService;

    @InterfaceC65349Pkn("gift_panel_open_predict")
    public GiftPanelOpenPredictService giftPanelOpenPredictService;

    @InterfaceC65349Pkn("live_har_config")
    public LiveHarConfig liveHarConfig;

    @InterfaceC65349Pkn("live_ohr_config")
    public LiveOhrConfig liveOhrConfig;

    @InterfaceC65349Pkn("live_revenue_feature_collect")
    public LiveRevenueFeatureCollectService liveRevenueFeatureCollectService;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveAIServices() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public LiveAIServices(GiftPanelOpenPredictService giftPanelOpenPredictService, LiveRevenueFeatureCollectService liveRevenueFeatureCollectService, GiftGuideOpenPredictService giftGuideOpenPredictService, LiveHarConfig liveHarConfig, LiveOhrConfig liveOhrConfig) {
        o.LJIIIZ(giftPanelOpenPredictService, "giftPanelOpenPredictService");
        o.LJIIIZ(liveRevenueFeatureCollectService, "liveRevenueFeatureCollectService");
        o.LJIIIZ(giftGuideOpenPredictService, "giftGuideOpenPredictService");
        o.LJIIIZ(liveHarConfig, "liveHarConfig");
        o.LJIIIZ(liveOhrConfig, "liveOhrConfig");
        this.giftPanelOpenPredictService = giftPanelOpenPredictService;
        this.liveRevenueFeatureCollectService = liveRevenueFeatureCollectService;
        this.giftGuideOpenPredictService = giftGuideOpenPredictService;
        this.liveHarConfig = liveHarConfig;
        this.liveOhrConfig = liveOhrConfig;
    }

    public /* synthetic */ LiveAIServices(GiftPanelOpenPredictService giftPanelOpenPredictService, LiveRevenueFeatureCollectService liveRevenueFeatureCollectService, GiftGuideOpenPredictService giftGuideOpenPredictService, LiveHarConfig liveHarConfig, LiveOhrConfig liveOhrConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new GiftPanelOpenPredictService(null, 0, 0, null, 15, null) : giftPanelOpenPredictService, (i & 2) != 0 ? new LiveRevenueFeatureCollectService(null, 0, 3, null) : liveRevenueFeatureCollectService, (i & 4) != 0 ? new GiftGuideOpenPredictService(null, 0, 3, null) : giftGuideOpenPredictService, (i & 8) != 0 ? new LiveHarConfig(false, false, 0L, 0L, 15, null) : liveHarConfig, (i & 16) != 0 ? new LiveOhrConfig(false, 1, null) : liveOhrConfig);
    }
}
