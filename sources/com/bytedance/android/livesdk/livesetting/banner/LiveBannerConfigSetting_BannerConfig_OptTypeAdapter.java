package com.bytedance.android.livesdk.livesetting.banner;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.banner.LiveBannerConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveBannerConfigSetting_BannerConfig_OptTypeAdapter extends TypeAdapter<LiveBannerConfigSetting.BannerConfig> {
    public LiveBannerConfigSetting_BannerConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveBannerConfigSetting.BannerConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveBannerConfigSetting.BannerConfig bannerConfig = new LiveBannerConfigSetting.BannerConfig(0L, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "normal_interval")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    bannerConfig.normalInterval = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "anchor_interval")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    bannerConfig.anchorInterval = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return bannerConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveBannerConfigSetting.BannerConfig bannerConfig) {
        LiveBannerConfigSetting.BannerConfig bannerConfig2 = bannerConfig;
        o.LJIIIZ(writer, "writer");
        if (bannerConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("normal_interval");
        writer.LJIJ(bannerConfig2.normalInterval);
        writer.LJI("anchor_interval");
        writer.LJIJ(bannerConfig2.anchorInterval);
        writer.LJFF();
    }
}
