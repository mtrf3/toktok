package com.bytedance.android.livesdk.performance.config;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ScorePiecewise_OptTypeAdapter extends TypeAdapter<ScorePiecewise> {
    public ScorePiecewise_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final ScorePiecewise read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        ScorePiecewise scorePiecewise = new ScorePiecewise(0.0f, 0.0f, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "e")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    scorePiecewise.setEdge((float) reader.LJIJ());
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "f")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    scorePiecewise.setFactor((float) reader.LJIJ());
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return scorePiecewise;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, ScorePiecewise scorePiecewise) {
        ScorePiecewise scorePiecewise2 = scorePiecewise;
        o.LJIIIZ(writer, "writer");
        if (scorePiecewise2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("e");
        writer.LJIJJ(Float.valueOf(scorePiecewise2.getEdge()));
        writer.LJI("f");
        writer.LJIJJ(Float.valueOf(scorePiecewise2.getFactor()));
        writer.LJFF();
    }
}
