package com.bytedance.android.livesdk.livesetting.message;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMessageConfig_OptTypeAdapter extends TypeAdapter<LiveMessageConfig> {
    public final Gson LIZ;

    public LiveMessageConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessageConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveMessageConfig liveMessageConfig = new LiveMessageConfig(0, false, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "duplicate_size")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveMessageConfig.setDuplicateSize(reader.LJIJI());
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "enhance_websocket")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveMessageConfig.setEnhanceWebsocket(((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue());
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveMessageConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveMessageConfig liveMessageConfig) {
        LiveMessageConfig liveMessageConfig2 = liveMessageConfig;
        o.LJIIIZ(writer, "writer");
        if (liveMessageConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("duplicate_size");
        writer.LJIJJ(Integer.valueOf(liveMessageConfig2.getDuplicateSize()));
        writer.LJI("enhance_websocket");
        writer.LJJIII(liveMessageConfig2.getEnhanceWebsocket());
        writer.LJFF();
    }
}
