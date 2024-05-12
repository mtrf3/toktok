package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveExtendedPublicScreenMaxMessageConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveExtendedPublicScreenMaxMessageConfig_BufferConfig_OptTypeAdapter extends TypeAdapter<LiveExtendedPublicScreenMaxMessageConfig.BufferConfig> {
    public LiveExtendedPublicScreenMaxMessageConfig_BufferConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveExtendedPublicScreenMaxMessageConfig.BufferConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveExtendedPublicScreenMaxMessageConfig.BufferConfig bufferConfig = new LiveExtendedPublicScreenMaxMessageConfig.BufferConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "max_message_count")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    int LJIJI = reader.LJIJI();
                    if (LJIJI <= 0) {
                        LJIJI = 200;
                    }
                    bufferConfig.maxMessageCount = LJIJI;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return bufferConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveExtendedPublicScreenMaxMessageConfig.BufferConfig bufferConfig) {
        LiveExtendedPublicScreenMaxMessageConfig.BufferConfig bufferConfig2 = bufferConfig;
        o.LJIIIZ(writer, "writer");
        if (bufferConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("max_message_count");
        C77339UWx.LJFF(bufferConfig2.maxMessageCount, writer);
    }
}
