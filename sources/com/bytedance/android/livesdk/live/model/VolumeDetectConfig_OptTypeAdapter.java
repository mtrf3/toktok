package com.bytedance.android.livesdk.live.model;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class VolumeDetectConfig_OptTypeAdapter extends TypeAdapter<VolumeDetectConfig> {
    public VolumeDetectConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final VolumeDetectConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        VolumeDetectConfig volumeDetectConfig = new VolumeDetectConfig(0, 0, 0, 0, 0, 31, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1965871738:
                        if (!LJJ.equals("volume_threshold")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            volumeDetectConfig.setVolumeThreshold(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1847532698:
                        if (!LJJ.equals("pause_prompt_duration_minutes")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            volumeDetectConfig.setPausePromptDurationMinutes(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1040225989:
                        if (!LJJ.equals("count_threshold")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            volumeDetectConfig.setCountThreshold(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1615038194:
                        if (!LJJ.equals("first_count_down_duration_minutes")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            volumeDetectConfig.setFirstCountDownDurationMinutes(reader.LJIJI());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1893021473:
                        if (!LJJ.equals("detect_interval_seconds")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            volumeDetectConfig.setDetectIntervalSeconds(reader.LJIJI());
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
        return volumeDetectConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, VolumeDetectConfig volumeDetectConfig) {
        VolumeDetectConfig volumeDetectConfig2 = volumeDetectConfig;
        o.LJIIIZ(writer, "writer");
        if (volumeDetectConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("first_count_down_duration_minutes");
        writer.LJIJJ(Integer.valueOf(volumeDetectConfig2.getFirstCountDownDurationMinutes()));
        writer.LJI("detect_interval_seconds");
        writer.LJIJJ(Integer.valueOf(volumeDetectConfig2.getDetectIntervalSeconds()));
        writer.LJI("volume_threshold");
        writer.LJIJJ(Integer.valueOf(volumeDetectConfig2.getVolumeThreshold()));
        writer.LJI("count_threshold");
        writer.LJIJJ(Integer.valueOf(volumeDetectConfig2.getCountThreshold()));
        writer.LJI("pause_prompt_duration_minutes");
        writer.LJIJJ(Integer.valueOf(volumeDetectConfig2.getPausePromptDurationMinutes()));
        writer.LJFF();
    }
}
