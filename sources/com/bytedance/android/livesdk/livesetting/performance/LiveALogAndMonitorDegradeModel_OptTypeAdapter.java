package com.bytedance.android.livesdk.livesetting.performance;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveALogAndMonitorDegradeModel_OptTypeAdapter extends TypeAdapter<LiveALogAndMonitorDegradeModel> {
    public final Gson LIZ;

    public LiveALogAndMonitorDegradeModel_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveALogAndMonitorDegradeModel read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveALogAndMonitorDegradeModel liveALogAndMonitorDegradeModel = new LiveALogAndMonitorDegradeModel(null, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "live_alog_degrade_allowlist")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    ArrayList LIZ = C65412Plo.LIZ(this.LIZ, reader, String.class);
                    o.LJI(LIZ);
                    liveALogAndMonitorDegradeModel.aLogList = LIZ;
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "live_monitor_degrade_allowlist")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    ArrayList LIZ2 = C65412Plo.LIZ(this.LIZ, reader, String.class);
                    o.LJI(LIZ2);
                    liveALogAndMonitorDegradeModel.monitorList = LIZ2;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveALogAndMonitorDegradeModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveALogAndMonitorDegradeModel liveALogAndMonitorDegradeModel) {
        LiveALogAndMonitorDegradeModel liveALogAndMonitorDegradeModel2 = liveALogAndMonitorDegradeModel;
        o.LJIIIZ(writer, "writer");
        if (liveALogAndMonitorDegradeModel2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_alog_degrade_allowlist");
        C65412Plo.LIZLLL(this.LIZ, writer, liveALogAndMonitorDegradeModel2.aLogList, String.class);
        writer.LJI("live_monitor_degrade_allowlist");
        C65412Plo.LIZLLL(this.LIZ, writer, liveALogAndMonitorDegradeModel2.monitorList, String.class);
        writer.LJFF();
    }
}
