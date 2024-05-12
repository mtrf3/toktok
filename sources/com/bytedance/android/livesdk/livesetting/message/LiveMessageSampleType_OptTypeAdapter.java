package com.bytedance.android.livesdk.livesetting.message;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMessageSampleType_OptTypeAdapter extends TypeAdapter<LiveMessageSampleType> {
    public final Gson LIZ;

    public LiveMessageSampleType_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessageSampleType read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveMessageSampleType liveMessageSampleType = new LiveMessageSampleType(null, null, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "room_ratio")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveMessageSampleType.setRoomRatio((LiveMessageSampleRatio) C64.LIZ(this.LIZ, LiveMessageSampleRatio.class, reader, "gson.getAdapter(LiveMess…:class.java).read(reader)"));
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "p2p_ratio")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveMessageSampleType.setP2pRatio((LiveMessageSampleRatio) C64.LIZ(this.LIZ, LiveMessageSampleRatio.class, reader, "gson.getAdapter(LiveMess…:class.java).read(reader)"));
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveMessageSampleType;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveMessageSampleType liveMessageSampleType) {
        LiveMessageSampleType liveMessageSampleType2 = liveMessageSampleType;
        o.LJIIIZ(writer, "writer");
        if (liveMessageSampleType2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("room_ratio");
        TypeAdapter LJIIJ = this.LIZ.LJIIJ(LiveMessageSampleRatio.class);
        LJIIJ.write(writer, liveMessageSampleType2.getRoomRatio());
        writer.LJI("p2p_ratio");
        LJIIJ.write(writer, liveMessageSampleType2.getP2pRatio());
        writer.LJFF();
    }
}
