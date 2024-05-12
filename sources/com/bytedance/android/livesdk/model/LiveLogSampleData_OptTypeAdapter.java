package com.bytedance.android.livesdk.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveLogSampleData_OptTypeAdapter extends TypeAdapter<LiveLogSampleData> {
    public final Gson LIZ;

    public LiveLogSampleData_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveLogSampleData read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveLogSampleData liveLogSampleData = new LiveLogSampleData();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "live_tracker_dolphin_configuration_experiment")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveLogSampleData.isExperiment = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "live_tracker_dolphin_configuration_sample_list")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    HashMap LIZIZ = C65412Plo.LIZIZ(this.LIZ, reader, Double.TYPE);
                    o.LJI(LIZIZ);
                    liveLogSampleData.sampleList = LIZIZ;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveLogSampleData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveLogSampleData liveLogSampleData) {
        LiveLogSampleData liveLogSampleData2 = liveLogSampleData;
        o.LJIIIZ(writer, "writer");
        if (liveLogSampleData2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_tracker_dolphin_configuration_experiment");
        writer.LJJIII(liveLogSampleData2.isExperiment);
        writer.LJI("live_tracker_dolphin_configuration_sample_list");
        C65412Plo.LJ(this.LIZ, writer, liveLogSampleData2.sampleList, Double.TYPE);
        writer.LJFF();
    }
}
