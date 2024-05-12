package com.bytedance.android.livesdk.livesetting.effect;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ReportFeedbackUrls_OptTypeAdapter extends TypeAdapter<ReportFeedbackUrls> {
    public ReportFeedbackUrls_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final ReportFeedbackUrls read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        ReportFeedbackUrls reportFeedbackUrls = new ReportFeedbackUrls(null, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "creator")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI, "reader.nextString()");
                    reportFeedbackUrls.reportCreatorUrl = LJJIIZI;
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "official")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    String LJJIIZI2 = reader.LJJIIZI();
                    o.LJIIIIZZ(LJJIIZI2, "reader.nextString()");
                    reportFeedbackUrls.reportOfficialUrl = LJJIIZI2;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return reportFeedbackUrls;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, ReportFeedbackUrls reportFeedbackUrls) {
        ReportFeedbackUrls reportFeedbackUrls2 = reportFeedbackUrls;
        o.LJIIIZ(writer, "writer");
        if (reportFeedbackUrls2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("creator");
        writer.LJJ(reportFeedbackUrls2.reportCreatorUrl);
        writer.LJI("official");
        writer.LJJ(reportFeedbackUrls2.reportOfficialUrl);
        writer.LJFF();
    }
}
