package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LinkMicPerfSladarEventReportConf_OptTypeAdapter extends TypeAdapter<LinkMicPerfSladarEventReportConf> {
    public LinkMicPerfSladarEventReportConf_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicPerfSladarEventReportConf read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LinkMicPerfSladarEventReportConf linkMicPerfSladarEventReportConf = new LinkMicPerfSladarEventReportConf(0, 1, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "max-length")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    linkMicPerfSladarEventReportConf.maxLength = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return linkMicPerfSladarEventReportConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LinkMicPerfSladarEventReportConf linkMicPerfSladarEventReportConf) {
        LinkMicPerfSladarEventReportConf linkMicPerfSladarEventReportConf2 = linkMicPerfSladarEventReportConf;
        o.LJIIIZ(writer, "writer");
        if (linkMicPerfSladarEventReportConf2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("max-length");
        C77339UWx.LJFF(linkMicPerfSladarEventReportConf2.maxLength, writer);
    }
}
