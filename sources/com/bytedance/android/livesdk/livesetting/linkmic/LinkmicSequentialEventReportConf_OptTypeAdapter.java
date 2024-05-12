package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkmicSequentialEventReportConf_OptTypeAdapter extends TypeAdapter<LinkmicSequentialEventReportConf> {
    public final Gson LIZ;

    public LinkmicSequentialEventReportConf_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkmicSequentialEventReportConf read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LinkmicSequentialEventReportConf linkmicSequentialEventReportConf = new LinkmicSequentialEventReportConf(false, 0L, 0L, 0L, 0L, 0L, 63, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1298848381:
                        if (!LJJ.equals("enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkmicSequentialEventReportConf.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -213782321:
                        if (!LJJ.equals("loop_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkmicSequentialEventReportConf.loopDuration = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -96179731:
                        if (!LJJ.equals("expire_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkmicSequentialEventReportConf.expireTime = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 218779355:
                        if (!LJJ.equals("mem_caches")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkmicSequentialEventReportConf.memCaches = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 828858882:
                        if (!LJJ.equals("start_up_trigger_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkmicSequentialEventReportConf.startUpTriggerDuration = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1135732128:
                        if (!LJJ.equals("time_slice")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            linkmicSequentialEventReportConf.timeSlice = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return linkmicSequentialEventReportConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LinkmicSequentialEventReportConf linkmicSequentialEventReportConf) {
        LinkmicSequentialEventReportConf linkmicSequentialEventReportConf2 = linkmicSequentialEventReportConf;
        o.LJIIIZ(writer, "writer");
        if (linkmicSequentialEventReportConf2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(linkmicSequentialEventReportConf2.enable);
        writer.LJI("loop_duration");
        writer.LJIJ(linkmicSequentialEventReportConf2.loopDuration);
        writer.LJI("mem_caches");
        writer.LJIJ(linkmicSequentialEventReportConf2.memCaches);
        writer.LJI("expire_time");
        writer.LJIJ(linkmicSequentialEventReportConf2.expireTime);
        writer.LJI("time_slice");
        writer.LJIJ(linkmicSequentialEventReportConf2.timeSlice);
        writer.LJI("start_up_trigger_duration");
        writer.LJIJ(linkmicSequentialEventReportConf2.startUpTriggerDuration);
        writer.LJFF();
    }
}
