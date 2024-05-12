package com.bytedance.android.livesdk.performance.config;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RealtimePerfScoreConfig_OptTypeAdapter extends TypeAdapter<RealtimePerfScoreConfig> {
    public final Gson LIZ;

    public RealtimePerfScoreConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final RealtimePerfScoreConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        RealtimePerfScoreConfig realtimePerfScoreConfig = new RealtimePerfScoreConfig(false, false, 0.0f, null, null, null, null, 127, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1690628410:
                        if (!LJJ.equals("battery_temp")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            realtimePerfScoreConfig.setBatteryTemperature((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(reader));
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1629944080:
                        if (!LJJ.equals("cpu_speed")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            realtimePerfScoreConfig.setCpuSpeed((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(reader));
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -463419412:
                        if (!LJJ.equals("jvm_heap_usage")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            realtimePerfScoreConfig.setJvmHeapUsage((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(reader));
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -234837001:
                        if (!LJJ.equals("max_score")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            realtimePerfScoreConfig.setMaxScore((float) reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -109284052:
                        if (!LJJ.equals("is_enabled")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            realtimePerfScoreConfig.setEnabled(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -57897397:
                        if (!LJJ.equals("is_report_all")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            realtimePerfScoreConfig.setReportAll(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 101609:
                        if (!LJJ.equals("fps")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            realtimePerfScoreConfig.setFps((PerfItemConfig) this.LIZ.LJIIJ(PerfItemConfig.class).read(reader));
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
        return realtimePerfScoreConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, RealtimePerfScoreConfig realtimePerfScoreConfig) {
        RealtimePerfScoreConfig realtimePerfScoreConfig2 = realtimePerfScoreConfig;
        o.LJIIIZ(writer, "writer");
        if (realtimePerfScoreConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("is_enabled");
        writer.LJJIII(realtimePerfScoreConfig2.isEnabled());
        writer.LJI("is_report_all");
        writer.LJJIII(realtimePerfScoreConfig2.isReportAll());
        writer.LJI("max_score");
        writer.LJIJJ(Float.valueOf(realtimePerfScoreConfig2.getMaxScore()));
        writer.LJI("cpu_speed");
        TypeAdapter LJIIJ = this.LIZ.LJIIJ(PerfItemConfig.class);
        LJIIJ.write(writer, realtimePerfScoreConfig2.getCpuSpeed());
        writer.LJI("fps");
        LJIIJ.write(writer, realtimePerfScoreConfig2.getFps());
        writer.LJI("battery_temp");
        LJIIJ.write(writer, realtimePerfScoreConfig2.getBatteryTemperature());
        writer.LJI("jvm_heap_usage");
        LJIIJ.write(writer, realtimePerfScoreConfig2.getJvmHeapUsage());
        writer.LJFF();
    }
}
