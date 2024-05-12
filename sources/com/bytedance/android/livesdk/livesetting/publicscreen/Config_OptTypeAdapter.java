package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class Config_OptTypeAdapter extends TypeAdapter<Config> {
    public Config_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final Config read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        Config config = new Config();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "gblMiniHeight")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    config.gblMiniHeight = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "triggerAutomaticallyRefreshPercent")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    config.triggerAutomaticallyRefreshPercent = reader.LJIJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, Config config) {
        Config config2 = config;
        o.LJIIIZ(writer, "writer");
        if (config2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("gblMiniHeight");
        C79062V1e.LJFF(config2.gblMiniHeight, writer, "triggerAutomaticallyRefreshPercent");
        writer.LJIILL(config2.triggerAutomaticallyRefreshPercent);
        writer.LJFF();
    }
}
