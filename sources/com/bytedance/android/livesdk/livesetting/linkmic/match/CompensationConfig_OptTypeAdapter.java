package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CompensationConfig_OptTypeAdapter extends TypeAdapter<CompensationConfig> {
    public final Gson LIZ;

    public CompensationConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CompensationConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        CompensationConfig compensationConfig = new CompensationConfig(false, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    compensationConfig.compensateEnable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "time_interval")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    compensationConfig.compensateTimeSec = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return compensationConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, CompensationConfig compensationConfig) {
        CompensationConfig compensationConfig2 = compensationConfig;
        o.LJIIIZ(writer, "writer");
        if (compensationConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(compensationConfig2.compensateEnable);
        writer.LJI("time_interval");
        writer.LJIJ(compensationConfig2.compensateTimeSec);
        writer.LJFF();
    }
}
