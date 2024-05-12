package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MultiGuestThresholdConfig_OptTypeAdapter extends TypeAdapter<MultiGuestThresholdConfig> {
    public final Gson LIZ;

    public MultiGuestThresholdConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestThresholdConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MultiGuestThresholdConfig multiGuestThresholdConfig = new MultiGuestThresholdConfig(null, 0, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "options")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, Integer.TYPE);
                    o.LJI(LIZ);
                    multiGuestThresholdConfig.options = LIZ;
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "max_coins")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    multiGuestThresholdConfig.maxCoins = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return multiGuestThresholdConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MultiGuestThresholdConfig multiGuestThresholdConfig) {
        MultiGuestThresholdConfig multiGuestThresholdConfig2 = multiGuestThresholdConfig;
        o.LJIIIZ(writer, "writer");
        if (multiGuestThresholdConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("options");
        C65412Plo.LIZLLL(this.LIZ, writer, multiGuestThresholdConfig2.options, Integer.TYPE);
        writer.LJI("max_coins");
        C77339UWx.LJFF(multiGuestThresholdConfig2.maxCoins, writer);
    }
}
