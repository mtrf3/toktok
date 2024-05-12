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
public final class MonitorSampleData_OptTypeAdapter extends TypeAdapter<MonitorSampleData> {
    public final Gson LIZ;

    public MonitorSampleData_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MonitorSampleData read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        MonitorSampleData monitorSampleData = new MonitorSampleData();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -879369460) {
                    if (hashCode != -540743180) {
                        if (hashCode == 2079641381 && LJJ.equals("live_slardar_dolphin_monitor_sample_experiment")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                monitorSampleData.isDolphinExperiment = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("live_slardar_before_monitor_sample_experiment")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            monitorSampleData.isSlardarBeforeExperiment = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("live_slardar_sample_list")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        HashMap LIZIZ = C65412Plo.LIZIZ(this.LIZ, reader, Double.TYPE);
                        o.LJI(LIZIZ);
                        monitorSampleData.sampleList = LIZIZ;
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return monitorSampleData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, MonitorSampleData monitorSampleData) {
        MonitorSampleData monitorSampleData2 = monitorSampleData;
        o.LJIIIZ(writer, "writer");
        if (monitorSampleData2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("live_slardar_dolphin_monitor_sample_experiment");
        writer.LJJIII(monitorSampleData2.isDolphinExperiment);
        writer.LJI("live_slardar_before_monitor_sample_experiment");
        writer.LJJIII(monitorSampleData2.isSlardarBeforeExperiment);
        writer.LJI("live_slardar_sample_list");
        C65412Plo.LJ(this.LIZ, writer, monitorSampleData2.sampleList, Double.TYPE);
        writer.LJFF();
    }
}
