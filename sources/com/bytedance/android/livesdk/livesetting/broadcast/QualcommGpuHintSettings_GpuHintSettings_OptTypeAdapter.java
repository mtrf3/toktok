package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.broadcast.QualcommGpuHintSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class QualcommGpuHintSettings_GpuHintSettings_OptTypeAdapter extends TypeAdapter<QualcommGpuHintSettings.GpuHintSettings> {
    public final Gson LIZ;

    public QualcommGpuHintSettings_GpuHintSettings_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final QualcommGpuHintSettings.GpuHintSettings read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        QualcommGpuHintSettings.GpuHintSettings gpuHintSettings = new QualcommGpuHintSettings.GpuHintSettings(false, 0, 0, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1547555666) {
                    if (hashCode != -481544705) {
                        if (hashCode == -389978843 && LJJ.equals("webcast_broadcast_qualcomm_gpu_hint_type")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                gpuHintSettings.gpuHintType = reader.LJIJI();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("webcast_broadcast_qualcomm_gpu_hint_duration")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            gpuHintSettings.gpuHintDuration = reader.LJIJI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("webcast_broadcast_qualcomm_gpu_hint_enable")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        gpuHintSettings.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return gpuHintSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, QualcommGpuHintSettings.GpuHintSettings gpuHintSettings) {
        QualcommGpuHintSettings.GpuHintSettings gpuHintSettings2 = gpuHintSettings;
        o.LJIIIZ(writer, "writer");
        if (gpuHintSettings2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("webcast_broadcast_qualcomm_gpu_hint_enable");
        writer.LJJIII(gpuHintSettings2.enable);
        writer.LJI("webcast_broadcast_qualcomm_gpu_hint_type");
        C79062V1e.LJFF(gpuHintSettings2.gpuHintType, writer, "webcast_broadcast_qualcomm_gpu_hint_duration");
        C77339UWx.LJFF(gpuHintSettings2.gpuHintDuration, writer);
    }
}
