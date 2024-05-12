package com.bytedance.android.livesdk.livesetting.other;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveAIServices_OptTypeAdapter extends TypeAdapter<LiveAIServices> {
    public final Gson LIZ;

    public LiveAIServices_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveAIServices read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveAIServices liveAIServices = new LiveAIServices(null, null, null, null, null, 31, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2122532421:
                        if (!LJJ.equals("live_ohr_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveAIServices.liveOhrConfig = (LiveOhrConfig) C64.LIZ(this.LIZ, LiveOhrConfig.class, reader, "gson.getAdapter(LiveOhrC…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1947484053:
                        if (!LJJ.equals("live_revenue_feature_collect")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveAIServices.liveRevenueFeatureCollectService = (LiveRevenueFeatureCollectService) C64.LIZ(this.LIZ, LiveRevenueFeatureCollectService.class, reader, "gson.getAdapter(LiveReve…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -979658533:
                        if (!LJJ.equals("live_har_config")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveAIServices.liveHarConfig = (LiveHarConfig) C64.LIZ(this.LIZ, LiveHarConfig.class, reader, "gson.getAdapter(LiveHarC…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 435473838:
                        if (!LJJ.equals("gift_panel_open_predict")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveAIServices.giftPanelOpenPredictService = (GiftPanelOpenPredictService) C64.LIZ(this.LIZ, GiftPanelOpenPredictService.class, reader, "gson.getAdapter(GiftPane…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 825338888:
                        if (!LJJ.equals("gift_guide_client_collect")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveAIServices.giftGuideOpenPredictService = (GiftGuideOpenPredictService) C64.LIZ(this.LIZ, GiftGuideOpenPredictService.class, reader, "gson.getAdapter(GiftGuid…:class.java).read(reader)");
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveAIServices;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveAIServices liveAIServices) {
        LiveAIServices liveAIServices2 = liveAIServices;
        o.LJIIIZ(writer, "writer");
        if (liveAIServices2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("gift_panel_open_predict");
        this.LIZ.LJIIJ(GiftPanelOpenPredictService.class).write(writer, liveAIServices2.giftPanelOpenPredictService);
        writer.LJI("live_revenue_feature_collect");
        this.LIZ.LJIIJ(LiveRevenueFeatureCollectService.class).write(writer, liveAIServices2.liveRevenueFeatureCollectService);
        writer.LJI("gift_guide_client_collect");
        this.LIZ.LJIIJ(GiftGuideOpenPredictService.class).write(writer, liveAIServices2.giftGuideOpenPredictService);
        writer.LJI("live_har_config");
        this.LIZ.LJIIJ(LiveHarConfig.class).write(writer, liveAIServices2.liveHarConfig);
        writer.LJI("live_ohr_config");
        this.LIZ.LJIIJ(LiveOhrConfig.class).write(writer, liveAIServices2.liveOhrConfig);
        writer.LJFF();
    }
}
