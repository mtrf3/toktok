package com.bytedance.android.livesdk.livesetting.game;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DefaultHighLightCutConfig_OptTypeAdapter extends TypeAdapter<DefaultHighLightCutConfig> {
    public DefaultHighLightCutConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final DefaultHighLightCutConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        DefaultHighLightCutConfig defaultHighLightCutConfig = new DefaultHighLightCutConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "min_cut_interval")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    defaultHighLightCutConfig.setMinCutInterval(reader.LJIJI());
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return defaultHighLightCutConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, DefaultHighLightCutConfig defaultHighLightCutConfig) {
        DefaultHighLightCutConfig defaultHighLightCutConfig2 = defaultHighLightCutConfig;
        o.LJIIIZ(writer, "writer");
        if (defaultHighLightCutConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("min_cut_interval");
        writer.LJIJJ(Integer.valueOf(defaultHighLightCutConfig2.getMinCutInterval()));
        writer.LJFF();
    }
}
