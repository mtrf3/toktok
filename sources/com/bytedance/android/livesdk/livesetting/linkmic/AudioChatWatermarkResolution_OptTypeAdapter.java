package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AudioChatWatermarkResolution_OptTypeAdapter extends TypeAdapter<AudioChatWatermarkResolution> {
    public AudioChatWatermarkResolution_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final AudioChatWatermarkResolution read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        AudioChatWatermarkResolution audioChatWatermarkResolution = new AudioChatWatermarkResolution(0, 0, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "w")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    audioChatWatermarkResolution.w = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "h")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    audioChatWatermarkResolution.h = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return audioChatWatermarkResolution;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, AudioChatWatermarkResolution audioChatWatermarkResolution) {
        AudioChatWatermarkResolution audioChatWatermarkResolution2 = audioChatWatermarkResolution;
        o.LJIIIZ(writer, "writer");
        if (audioChatWatermarkResolution2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("w");
        C79062V1e.LJFF(audioChatWatermarkResolution2.w, writer, "h");
        C77339UWx.LJFF(audioChatWatermarkResolution2.h, writer);
    }
}
