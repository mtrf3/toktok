package com.bytedance.android.livesdk.chatroom.model;

import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveAnchorContactConfig_OptTypeAdapter extends TypeAdapter<LiveAnchorContactConfig> {
    public LiveAnchorContactConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveAnchorContactConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveAnchorContactConfig liveAnchorContactConfig = new LiveAnchorContactConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            if (o.LJ(reader.LJJ(), "enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveAnchorContactConfig.enable = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveAnchorContactConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveAnchorContactConfig liveAnchorContactConfig) {
        LiveAnchorContactConfig liveAnchorContactConfig2 = liveAnchorContactConfig;
        o.LJIIIZ(writer, "writer");
        if (liveAnchorContactConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        C77339UWx.LJFF(liveAnchorContactConfig2.enable, writer);
    }
}
