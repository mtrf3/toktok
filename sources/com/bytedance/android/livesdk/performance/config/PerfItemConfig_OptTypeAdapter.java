package com.bytedance.android.livesdk.performance.config;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PerfItemConfig_OptTypeAdapter extends TypeAdapter<PerfItemConfig> {
    public final Gson LIZ;

    public PerfItemConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PerfItemConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        PerfItemConfig perfItemConfig = new PerfItemConfig(null, 0.0f, 0.0f, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -997445875) {
                    if (hashCode != 98) {
                        if (hashCode == 119 && LJJ.equals("w")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                perfItemConfig.setWeight((float) reader.LJIJ());
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("b")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            perfItemConfig.setBase((float) reader.LJIJ());
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("p_list")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, ScorePiecewise.class);
                        o.LJI(LIZ);
                        perfItemConfig.setPieces(LIZ);
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return perfItemConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, PerfItemConfig perfItemConfig) {
        PerfItemConfig perfItemConfig2 = perfItemConfig;
        o.LJIIIZ(writer, "writer");
        if (perfItemConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("p_list");
        C65412Plo.LIZLLL(this.LIZ, writer, perfItemConfig2.getPieces(), ScorePiecewise.class);
        writer.LJI("b");
        writer.LJIJJ(Float.valueOf(perfItemConfig2.getBase()));
        writer.LJI("w");
        writer.LJIJJ(Float.valueOf(perfItemConfig2.getWeight()));
        writer.LJFF();
    }
}
