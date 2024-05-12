package com.bytedance.android.livesdk.live.model;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SpeakingVoiceConfig_OptTypeAdapter extends TypeAdapter<SpeakingVoiceConfig> {
    public SpeakingVoiceConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final SpeakingVoiceConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        SpeakingVoiceConfig speakingVoiceConfig = new SpeakingVoiceConfig(0, 0, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "voice_low_value")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    speakingVoiceConfig.setLow(reader.LJIJI());
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "voice_high_value")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    speakingVoiceConfig.setHigh(reader.LJIJI());
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return speakingVoiceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, SpeakingVoiceConfig speakingVoiceConfig) {
        SpeakingVoiceConfig speakingVoiceConfig2 = speakingVoiceConfig;
        o.LJIIIZ(writer, "writer");
        if (speakingVoiceConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("voice_low_value");
        writer.LJIJJ(Integer.valueOf(speakingVoiceConfig2.getLow()));
        writer.LJI("voice_high_value");
        writer.LJIJJ(Integer.valueOf(speakingVoiceConfig2.getHigh()));
        writer.LJFF();
    }
}
