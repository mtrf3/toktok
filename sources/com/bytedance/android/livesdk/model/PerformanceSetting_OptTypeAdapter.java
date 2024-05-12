package com.bytedance.android.livesdk.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PerformanceSetting_OptTypeAdapter extends TypeAdapter<PerformanceSetting> {
    public final Gson LIZ;

    public PerformanceSetting_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PerformanceSetting read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        PerformanceSetting performanceSetting = new PerformanceSetting();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2144539042:
                        if (!LJJ.equals("monitor_delay")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            performanceSetting.monitorDelay = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -2139264982:
                        if (!LJJ.equals("fps_duration")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            performanceSetting.fpsDuration = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1298848381:
                        if (!LJJ.equals("enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            performanceSetting.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -219168044:
                        if (!LJJ.equals("resident_interval")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            performanceSetting.residentInterval = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1049471063:
                        if (!LJJ.equals("min_monitor_interval")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            performanceSetting.minMonitorInterval = reader.LJIJJ();
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
        return performanceSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, PerformanceSetting performanceSetting) {
        PerformanceSetting performanceSetting2 = performanceSetting;
        o.LJIIIZ(writer, "writer");
        if (performanceSetting2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(performanceSetting2.enable);
        writer.LJI("resident_interval");
        writer.LJIJ(performanceSetting2.residentInterval);
        writer.LJI("min_monitor_interval");
        writer.LJIJ(performanceSetting2.minMonitorInterval);
        writer.LJI("monitor_delay");
        writer.LJIJ(performanceSetting2.monitorDelay);
        writer.LJI("fps_duration");
        writer.LJIJ(performanceSetting2.fpsDuration);
        writer.LJFF();
    }
}
