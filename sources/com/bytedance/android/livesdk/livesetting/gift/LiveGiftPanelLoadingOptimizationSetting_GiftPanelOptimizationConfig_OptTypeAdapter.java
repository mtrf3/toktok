package com.bytedance.android.livesdk.livesetting.gift;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelLoadingOptimizationSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGiftPanelLoadingOptimizationSetting_GiftPanelOptimizationConfig_OptTypeAdapter extends TypeAdapter<LiveGiftPanelLoadingOptimizationSetting.GiftPanelOptimizationConfig> {
    public final Gson LIZ;

    public LiveGiftPanelLoadingOptimizationSetting_GiftPanelOptimizationConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGiftPanelLoadingOptimizationSetting.GiftPanelOptimizationConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveGiftPanelLoadingOptimizationSetting.GiftPanelOptimizationConfig giftPanelOptimizationConfig = new LiveGiftPanelLoadingOptimizationSetting.GiftPanelOptimizationConfig(false, false, false, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -542606534) {
                    if (hashCode != 412464598) {
                        if (hashCode == 1418222185 && LJJ.equals("live_cache_hit_optimization")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                giftPanelOptimizationConfig.cacheHitOptimization = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("live_image_load_report_optimization")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            giftPanelOptimizationConfig.imageLoadReportOptimization = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("live_file_util_optimization")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        giftPanelOptimizationConfig.fileUtilOptimization = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return giftPanelOptimizationConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveGiftPanelLoadingOptimizationSetting.GiftPanelOptimizationConfig giftPanelOptimizationConfig) {
        LiveGiftPanelLoadingOptimizationSetting.GiftPanelOptimizationConfig giftPanelOptimizationConfig2 = giftPanelOptimizationConfig;
        o.LJIIIZ(writer, "writer");
        if (giftPanelOptimizationConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_file_util_optimization");
        writer.LJJIII(giftPanelOptimizationConfig2.fileUtilOptimization);
        writer.LJI("live_cache_hit_optimization");
        writer.LJJIII(giftPanelOptimizationConfig2.cacheHitOptimization);
        writer.LJI("live_image_load_report_optimization");
        writer.LJJIII(giftPanelOptimizationConfig2.imageLoadReportOptimization);
        writer.LJFF();
    }
}
