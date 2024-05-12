package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CoHostSeiTalkSettingConfig_OptTypeAdapter extends TypeAdapter<CoHostSeiTalkSettingConfig> {
    public final Gson LIZ;

    public CoHostSeiTalkSettingConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CoHostSeiTalkSettingConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        CoHostSeiTalkSettingConfig coHostSeiTalkSettingConfig = new CoHostSeiTalkSettingConfig(false, 0, 0, 7, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                int hashCode = LJJ.hashCode();
                if (hashCode != -1892097058) {
                    if (hashCode != 626689136) {
                        if (hashCode == 1689090144 && LJJ.equals("talk_sei_interval")) {
                            if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                                coHostSeiTalkSettingConfig.seiInterval = reader.LJIJI();
                            } else {
                                reader.LJJIIJ();
                            }
                        }
                    } else if (LJJ.equals("min_audio_volume")) {
                        if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            coHostSeiTalkSettingConfig.minAudioVolume = reader.LJIJI();
                        } else {
                            reader.LJJIIJ();
                        }
                    }
                } else if (LJJ.equals("talk_sei_enable")) {
                    if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                        coHostSeiTalkSettingConfig.seiTalkEnable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                    } else {
                        reader.LJJIIJ();
                    }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return coHostSeiTalkSettingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, CoHostSeiTalkSettingConfig coHostSeiTalkSettingConfig) {
        CoHostSeiTalkSettingConfig coHostSeiTalkSettingConfig2 = coHostSeiTalkSettingConfig;
        o.LJIIIZ(writer, "writer");
        if (coHostSeiTalkSettingConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("talk_sei_enable");
        writer.LJJIII(coHostSeiTalkSettingConfig2.seiTalkEnable);
        writer.LJI("talk_sei_interval");
        C79062V1e.LJFF(coHostSeiTalkSettingConfig2.seiInterval, writer, "min_audio_volume");
        C77339UWx.LJFF(coHostSeiTalkSettingConfig2.minAudioVolume, writer);
    }
}
