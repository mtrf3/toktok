package com.bytedance.android.livesdk.livesetting.game;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class UploadSpeedDetectionMapping_OptTypeAdapter extends TypeAdapter<UploadSpeedDetectionMapping> {
    public UploadSpeedDetectionMapping_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final UploadSpeedDetectionMapping read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        UploadSpeedDetectionMapping uploadSpeedDetectionMapping = new UploadSpeedDetectionMapping(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 63, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1222245233:
                        if (!LJJ.equals("hd_min")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            uploadSpeedDetectionMapping.setHd_min((float) reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1107728629:
                        if (!LJJ.equals("ld_min")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            uploadSpeedDetectionMapping.setLd_min((float) reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -907324572:
                        if (!LJJ.equals("sd_min")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            uploadSpeedDetectionMapping.setSd_min((float) reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -802583568:
                        if (!LJJ.equals("hd_60_min")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            uploadSpeedDetectionMapping.setHd_60_min((float) reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -463529660:
                        if (!LJJ.equals("uhd_min")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            uploadSpeedDetectionMapping.setUhd_min((float) reader.LJIJ());
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1975140123:
                        if (!LJJ.equals("uhd_60_min")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            uploadSpeedDetectionMapping.setUhd_60_min((float) reader.LJIJ());
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
        return uploadSpeedDetectionMapping;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, UploadSpeedDetectionMapping uploadSpeedDetectionMapping) {
        UploadSpeedDetectionMapping uploadSpeedDetectionMapping2 = uploadSpeedDetectionMapping;
        o.LJIIIZ(writer, "writer");
        if (uploadSpeedDetectionMapping2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("ld_min");
        writer.LJIJJ(Float.valueOf(uploadSpeedDetectionMapping2.getLd_min()));
        writer.LJI("sd_min");
        writer.LJIJJ(Float.valueOf(uploadSpeedDetectionMapping2.getSd_min()));
        writer.LJI("hd_min");
        writer.LJIJJ(Float.valueOf(uploadSpeedDetectionMapping2.getHd_min()));
        writer.LJI("hd_60_min");
        writer.LJIJJ(Float.valueOf(uploadSpeedDetectionMapping2.getHd_60_min()));
        writer.LJI("uhd_min");
        writer.LJIJJ(Float.valueOf(uploadSpeedDetectionMapping2.getUhd_min()));
        writer.LJI("uhd_60_min");
        writer.LJIJJ(Float.valueOf(uploadSpeedDetectionMapping2.getUhd_60_min()));
        writer.LJFF();
    }
}
