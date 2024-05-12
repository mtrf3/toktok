package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C65385PlN;
import X.C65403Plf;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.broadcast.VBoostGoLiveSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class VBoostGoLiveSetting_VBoostSettings_OptTypeAdapter extends TypeAdapter<VBoostGoLiveSetting.VBoostSettings> {
    public VBoostGoLiveSetting_VBoostSettings_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final VBoostGoLiveSetting.VBoostSettings read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        VBoostGoLiveSetting.VBoostSettings vBoostSettings = new VBoostGoLiveSetting.VBoostSettings(0, 0L, 0L, 0L, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1328534260:
                        if (!LJJ.equals("webcast_broadcast_go_live_vboost_gpu_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            vBoostSettings.gpuTime = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 290158992:
                        if (!LJJ.equals("webcast_broadcast_go_live_vboost_cpu_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            vBoostSettings.cpuTime = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 442360458:
                        if (!LJJ.equals("webcast_broadcast_go_live_vboost_cpu_core_time")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            vBoostSettings.cpuCoreTime = reader.LJIJJ();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1223156399:
                        if (!LJJ.equals("webcast_broadcast_go_live_vboost_settings")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            vBoostSettings.settings = reader.LJIJI();
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
        return vBoostSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, VBoostGoLiveSetting.VBoostSettings vBoostSettings) {
        VBoostGoLiveSetting.VBoostSettings vBoostSettings2 = vBoostSettings;
        o.LJIIIZ(writer, "writer");
        if (vBoostSettings2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("webcast_broadcast_go_live_vboost_settings");
        C79062V1e.LJFF(vBoostSettings2.settings, writer, "webcast_broadcast_go_live_vboost_cpu_time");
        writer.LJIJ(vBoostSettings2.cpuTime);
        writer.LJI("webcast_broadcast_go_live_vboost_cpu_core_time");
        writer.LJIJ(vBoostSettings2.cpuCoreTime);
        writer.LJI("webcast_broadcast_go_live_vboost_gpu_time");
        writer.LJIJ(vBoostSettings2.gpuTime);
        writer.LJFF();
    }
}
