package com.bytedance.android.livesdk.livesetting.gift;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TrayShowConfig_OptTypeAdapter extends TypeAdapter<TrayShowConfig> {
    public final Gson LIZ;

    public TrayShowConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TrayShowConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        TrayShowConfig trayShowConfig = new TrayShowConfig(null, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "animation_duration")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, Integer.TYPE);
                    o.LJI(LIZ);
                    trayShowConfig.animationDuration = LIZ;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return trayShowConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, TrayShowConfig trayShowConfig) {
        TrayShowConfig trayShowConfig2 = trayShowConfig;
        o.LJIIIZ(writer, "writer");
        if (trayShowConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("animation_duration");
        C65412Plo.LIZLLL(this.LIZ, writer, trayShowConfig2.animationDuration, Integer.TYPE);
        writer.LJFF();
    }
}
