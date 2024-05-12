package com.bytedance.android.livesdk.livesetting.model;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PerformanceOpt_OptTypeAdapter extends TypeAdapter<PerformanceOpt> {
    public PerformanceOpt_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final PerformanceOpt read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        PerformanceOpt performanceOpt = new PerformanceOpt();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "live_audience_performance_collect_report_gap_time")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    performanceOpt.audienceGapTime = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "live_host_performance_collect_report_gap_time")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    performanceOpt.hostGapTime = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return performanceOpt;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, PerformanceOpt performanceOpt) {
        PerformanceOpt performanceOpt2 = performanceOpt;
        o.LJIIIZ(writer, "writer");
        if (performanceOpt2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_audience_performance_collect_report_gap_time");
        C79062V1e.LJFF(performanceOpt2.audienceGapTime, writer, "live_host_performance_collect_report_gap_time");
        C77339UWx.LJFF(performanceOpt2.hostGapTime, writer);
    }
}
