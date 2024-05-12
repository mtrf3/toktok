package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RoomWindow_OptTypeAdapter extends TypeAdapter<RoomWindow> {
    public RoomWindow_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
    }

    @Override // com.google.gson.TypeAdapter
    public final RoomWindow read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        RoomWindow roomWindow = new RoomWindow(0L, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "times")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    roomWindow.allUsersTimeWindow = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "count")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    roomWindow.totalMaxTimes = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return roomWindow;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, RoomWindow roomWindow) {
        RoomWindow roomWindow2 = roomWindow;
        o.LJIIIZ(writer, "writer");
        if (roomWindow2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("times");
        writer.LJIJ(roomWindow2.allUsersTimeWindow);
        writer.LJI("count");
        writer.LJIJ(roomWindow2.totalMaxTimes);
        writer.LJFF();
    }
}
