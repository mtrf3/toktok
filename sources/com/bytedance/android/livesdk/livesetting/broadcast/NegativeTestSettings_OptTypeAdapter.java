package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class NegativeTestSettings_OptTypeAdapter extends TypeAdapter<NegativeTestSettings> {
    public NegativeTestSettings_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final NegativeTestSettings read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        NegativeTestSettings negativeTestSettings = new NegativeTestSettings(0L, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "cpu_load_rate")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    negativeTestSettings.cpuLoadRate = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "cpu_cycle")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    negativeTestSettings.cpuCycle = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return negativeTestSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, NegativeTestSettings negativeTestSettings) {
        NegativeTestSettings negativeTestSettings2 = negativeTestSettings;
        o.LJIIIZ(writer, "writer");
        if (negativeTestSettings2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("cpu_load_rate");
        writer.LJIJ(negativeTestSettings2.cpuLoadRate);
        writer.LJI("cpu_cycle");
        writer.LJIJ(negativeTestSettings2.cpuCycle);
        writer.LJFF();
    }
}
