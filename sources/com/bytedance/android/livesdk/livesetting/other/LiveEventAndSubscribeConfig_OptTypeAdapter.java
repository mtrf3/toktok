package com.bytedance.android.livesdk.livesetting.other;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveEventAndSubscribeConfig_OptTypeAdapter extends TypeAdapter<LiveEventAndSubscribeConfig> {
    public final Gson LIZ;

    public LiveEventAndSubscribeConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveEventAndSubscribeConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveEventAndSubscribeConfig liveEventAndSubscribeConfig = new LiveEventAndSubscribeConfig();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "add_live_event_and_subscribe")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveEventAndSubscribeConfig.addLiveEventAndSubscribe = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "style_of_live_event_and_subscribe")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveEventAndSubscribeConfig.styleOfLiveEventAndSubscribe = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveEventAndSubscribeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveEventAndSubscribeConfig liveEventAndSubscribeConfig) {
        LiveEventAndSubscribeConfig liveEventAndSubscribeConfig2 = liveEventAndSubscribeConfig;
        o.LJIIIZ(writer, "writer");
        if (liveEventAndSubscribeConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("add_live_event_and_subscribe");
        writer.LJJIII(liveEventAndSubscribeConfig2.addLiveEventAndSubscribe);
        writer.LJI("style_of_live_event_and_subscribe");
        C77339UWx.LJFF(liveEventAndSubscribeConfig2.styleOfLiveEventAndSubscribe, writer);
    }
}
