package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LinkMicLoggerReportConf_OptTypeAdapter extends TypeAdapter<LinkMicLoggerReportConf> {
    public final Gson LIZ;

    public LinkMicLoggerReportConf_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicLoggerReportConf read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LinkMicLoggerReportConf linkMicLoggerReportConf = new LinkMicLoggerReportConf(false, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "sladar_report_enabled")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    linkMicLoggerReportConf.sladarReportEnabled = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "sladar_report_level")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                    linkMicLoggerReportConf.sladarReportLevel = LJJIIZI;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return linkMicLoggerReportConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LinkMicLoggerReportConf linkMicLoggerReportConf) {
        LinkMicLoggerReportConf linkMicLoggerReportConf2 = linkMicLoggerReportConf;
        o.LJIIIZ(writer, "writer");
        if (linkMicLoggerReportConf2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("sladar_report_enabled");
        writer.LJJIII(linkMicLoggerReportConf2.sladarReportEnabled);
        writer.LJI("sladar_report_level");
        writer.LJJ(linkMicLoggerReportConf2.sladarReportLevel);
        writer.LJFF();
    }
}
