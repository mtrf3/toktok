package com.bytedance.android.livesdk.livesetting.other;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveAvatarAnimationOptimizeV2Config_OptTypeAdapter extends TypeAdapter<LiveAvatarAnimationOptimizeV2Config> {
    public final Gson LIZ;

    public LiveAvatarAnimationOptimizeV2Config_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveAvatarAnimationOptimizeV2Config read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveAvatarAnimationOptimizeV2Config liveAvatarAnimationOptimizeV2Config = new LiveAvatarAnimationOptimizeV2Config();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveAvatarAnimationOptimizeV2Config.enable = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "enable_video_cell")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveAvatarAnimationOptimizeV2Config.enableVideoCell = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveAvatarAnimationOptimizeV2Config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveAvatarAnimationOptimizeV2Config liveAvatarAnimationOptimizeV2Config) {
        LiveAvatarAnimationOptimizeV2Config liveAvatarAnimationOptimizeV2Config2 = liveAvatarAnimationOptimizeV2Config;
        o.LJIIIZ(writer, "writer");
        if (liveAvatarAnimationOptimizeV2Config2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable");
        writer.LJJIII(liveAvatarAnimationOptimizeV2Config2.enable);
        writer.LJI("enable_video_cell");
        writer.LJJIII(liveAvatarAnimationOptimizeV2Config2.enableVideoCell);
        writer.LJFF();
    }
}
