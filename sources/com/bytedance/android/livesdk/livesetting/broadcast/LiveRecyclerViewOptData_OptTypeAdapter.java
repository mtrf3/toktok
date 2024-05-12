package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveRecyclerViewOptData_OptTypeAdapter extends TypeAdapter<LiveRecyclerViewOptData> {
    public final Gson LIZ;

    public LiveRecyclerViewOptData_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRecyclerViewOptData read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveRecyclerViewOptData liveRecyclerViewOptData = new LiveRecyclerViewOptData();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "enabled")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    liveRecyclerViewOptData.enabled = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "panel_dy_map")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    HashMap LIZIZ = C65412Plo.LIZIZ(this.LIZ, reader, Integer.TYPE);
                    o.LJI(LIZIZ);
                    liveRecyclerViewOptData.dyMap = LIZIZ;
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return liveRecyclerViewOptData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveRecyclerViewOptData liveRecyclerViewOptData) {
        LiveRecyclerViewOptData liveRecyclerViewOptData2 = liveRecyclerViewOptData;
        o.LJIIIZ(writer, "writer");
        if (liveRecyclerViewOptData2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enabled");
        writer.LJJIII(liveRecyclerViewOptData2.enabled);
        writer.LJI("panel_dy_map");
        C65412Plo.LJ(this.LIZ, writer, liveRecyclerViewOptData2.dyMap, Integer.TYPE);
        writer.LJFF();
    }
}
