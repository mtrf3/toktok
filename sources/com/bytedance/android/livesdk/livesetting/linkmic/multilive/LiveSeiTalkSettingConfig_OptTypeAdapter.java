package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

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
public final class LiveSeiTalkSettingConfig_OptTypeAdapter extends TypeAdapter<LiveSeiTalkSettingConfig> {
    public final Gson LIZ;

    public LiveSeiTalkSettingConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSeiTalkSettingConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveSeiTalkSettingConfig liveSeiTalkSettingConfig = new LiveSeiTalkSettingConfig(false, 0, false, 0, 15, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -2063145354:
                        if (!LJJ.equals("talk_wave_enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSeiTalkSettingConfig.talkWaveEnable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1892097058:
                        if (!LJJ.equals("talk_sei_enable")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSeiTalkSettingConfig.seiTalkEnable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 626689136:
                        if (!LJJ.equals("min_audio_volume")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSeiTalkSettingConfig.volumeThreshold = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1689090144:
                        if (!LJJ.equals("talk_sei_interval")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveSeiTalkSettingConfig.seiInterval = reader.LJIJI();
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
        return liveSeiTalkSettingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveSeiTalkSettingConfig liveSeiTalkSettingConfig) {
        LiveSeiTalkSettingConfig liveSeiTalkSettingConfig2 = liveSeiTalkSettingConfig;
        o.LJIIIZ(writer, "writer");
        if (liveSeiTalkSettingConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("talk_sei_enable");
        writer.LJJIII(liveSeiTalkSettingConfig2.seiTalkEnable);
        writer.LJI("talk_sei_interval");
        C79062V1e.LJFF(liveSeiTalkSettingConfig2.seiInterval, writer, "talk_wave_enable");
        writer.LJJIII(liveSeiTalkSettingConfig2.talkWaveEnable);
        writer.LJI("min_audio_volume");
        C77339UWx.LJFF(liveSeiTalkSettingConfig2.volumeThreshold, writer);
    }
}
