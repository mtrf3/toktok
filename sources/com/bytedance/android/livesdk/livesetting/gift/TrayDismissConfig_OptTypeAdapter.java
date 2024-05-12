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
public final class TrayDismissConfig_OptTypeAdapter extends TypeAdapter<TrayDismissConfig> {
    public final Gson LIZ;

    public TrayDismissConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TrayDismissConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        TrayDismissConfig trayDismissConfig = new TrayDismissConfig(null, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "animation_duration")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, Integer.TYPE);
                    o.LJI(LIZ);
                    trayDismissConfig._animationDuration = LIZ;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return trayDismissConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, TrayDismissConfig trayDismissConfig) {
        TrayDismissConfig trayDismissConfig2 = trayDismissConfig;
        o.LJIIIZ(writer, "writer");
        if (trayDismissConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("animation_duration");
        C65412Plo.LIZLLL(this.LIZ, writer, trayDismissConfig2._animationDuration, Integer.TYPE);
        writer.LJFF();
    }
}
