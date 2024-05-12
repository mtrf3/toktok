package com.bytedance.android.livesdk.live.model;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C77339UWx;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveFollowFeedDrawLoop_OptTypeAdapter extends TypeAdapter<LiveFollowFeedDrawLoop> {
    public final Gson LIZ;

    public LiveFollowFeedDrawLoop_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveFollowFeedDrawLoop read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveFollowFeedDrawLoop liveFollowFeedDrawLoop = new LiveFollowFeedDrawLoop();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "loop_enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveFollowFeedDrawLoop.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "threshold")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveFollowFeedDrawLoop.threshold = reader.LJIJI();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveFollowFeedDrawLoop;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveFollowFeedDrawLoop liveFollowFeedDrawLoop) {
        LiveFollowFeedDrawLoop liveFollowFeedDrawLoop2 = liveFollowFeedDrawLoop;
        o.LJIIIZ(writer, "writer");
        if (liveFollowFeedDrawLoop2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("loop_enable");
        writer.LJJIII(liveFollowFeedDrawLoop2.enable);
        writer.LJI("threshold");
        C77339UWx.LJFF(liveFollowFeedDrawLoop2.threshold, writer);
    }
}
