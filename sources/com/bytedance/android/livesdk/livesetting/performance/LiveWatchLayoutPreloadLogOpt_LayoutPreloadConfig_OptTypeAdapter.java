package com.bytedance.android.livesdk.livesetting.performance;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchLayoutPreloadLogOpt;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveWatchLayoutPreloadLogOpt_LayoutPreloadConfig_OptTypeAdapter extends TypeAdapter<LiveWatchLayoutPreloadLogOpt.LayoutPreloadConfig> {
    public LiveWatchLayoutPreloadLogOpt_LayoutPreloadConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveWatchLayoutPreloadLogOpt.LayoutPreloadConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveWatchLayoutPreloadLogOpt.LayoutPreloadConfig layoutPreloadConfig = new LiveWatchLayoutPreloadLogOpt.LayoutPreloadConfig(0, 0, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable_role")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    layoutPreloadConfig.enableRole = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "sample_rate")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    layoutPreloadConfig.sampleRate = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return layoutPreloadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveWatchLayoutPreloadLogOpt.LayoutPreloadConfig layoutPreloadConfig) {
        LiveWatchLayoutPreloadLogOpt.LayoutPreloadConfig layoutPreloadConfig2 = layoutPreloadConfig;
        o.LJIIIZ(writer, "writer");
        if (layoutPreloadConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_role");
        C79062V1e.LJFF(layoutPreloadConfig2.enableRole, writer, "sample_rate");
        C77339UWx.LJFF(layoutPreloadConfig2.sampleRate, writer);
    }
}