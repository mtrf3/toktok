package com.bytedance.android.livesdk.livesetting.watchlive.player;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveDnsOptimizeConfig_OptTypeAdapter extends TypeAdapter<LiveDnsOptimizeConfig> {
    public LiveDnsOptimizeConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveDnsOptimizeConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveDnsOptimizeConfig liveDnsOptimizeConfig = new LiveDnsOptimizeConfig(0, 0, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable_check_dns")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveDnsOptimizeConfig.enableCheckDns = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "check_host_count")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveDnsOptimizeConfig.checkHostCount = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveDnsOptimizeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveDnsOptimizeConfig liveDnsOptimizeConfig) {
        LiveDnsOptimizeConfig liveDnsOptimizeConfig2 = liveDnsOptimizeConfig;
        o.LJIIIZ(writer, "writer");
        if (liveDnsOptimizeConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_check_dns");
        C79062V1e.LJFF(liveDnsOptimizeConfig2.enableCheckDns, writer, "check_host_count");
        C77339UWx.LJFF(liveDnsOptimizeConfig2.checkHostCount, writer);
    }
}
