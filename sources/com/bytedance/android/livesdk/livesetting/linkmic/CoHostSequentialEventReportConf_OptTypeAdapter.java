package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CoHostSequentialEventReportConf_OptTypeAdapter extends TypeAdapter<CoHostSequentialEventReportConf> {
    public final Gson LIZ;

    public CoHostSequentialEventReportConf_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CoHostSequentialEventReportConf read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        CoHostSequentialEventReportConf coHostSequentialEventReportConf = new CoHostSequentialEventReportConf(false, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    coHostSequentialEventReportConf.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return coHostSequentialEventReportConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, CoHostSequentialEventReportConf coHostSequentialEventReportConf) {
        CoHostSequentialEventReportConf coHostSequentialEventReportConf2 = coHostSequentialEventReportConf;
        o.LJIIIZ(writer, "writer");
        if (coHostSequentialEventReportConf2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(coHostSequentialEventReportConf2.enable);
        writer.LJFF();
    }
}
