package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BroadcastSmoothGoLiveConfig_OptTypeAdapter extends TypeAdapter<BroadcastSmoothGoLiveConfig> {
    public final Gson LIZ;

    public BroadcastSmoothGoLiveConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final BroadcastSmoothGoLiveConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        BroadcastSmoothGoLiveConfig broadcastSmoothGoLiveConfig = new BroadcastSmoothGoLiveConfig(false, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enable_dirty_len")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    broadcastSmoothGoLiveConfig.enableDirtyLenDetect = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "stream_info_time_out_threshold")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    broadcastSmoothGoLiveConfig.streamInfoTimeOutThreshold = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return broadcastSmoothGoLiveConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, BroadcastSmoothGoLiveConfig broadcastSmoothGoLiveConfig) {
        BroadcastSmoothGoLiveConfig broadcastSmoothGoLiveConfig2 = broadcastSmoothGoLiveConfig;
        o.LJIIIZ(writer, "writer");
        if (broadcastSmoothGoLiveConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_dirty_len");
        writer.LJJIII(broadcastSmoothGoLiveConfig2.enableDirtyLenDetect);
        writer.LJI("stream_info_time_out_threshold");
        writer.LJIJ(broadcastSmoothGoLiveConfig2.streamInfoTimeOutThreshold);
        writer.LJFF();
    }
}
