package com.bytedance.android.livesdk.live.model;

import X.C65385PlN;
import X.C65403Plf;
import X.C65412Plo;
import X.C79062V1e;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RoomSlideUpGuide_OptTypeAdapter extends TypeAdapter<RoomSlideUpGuide> {
    public final Gson LIZ;

    public RoomSlideUpGuide_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final RoomSlideUpGuide read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        RoomSlideUpGuide roomSlideUpGuide = new RoomSlideUpGuide();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1436844737:
                        if (!LJJ.equals("max_show_times")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            roomSlideUpGuide.maxShowTimes = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -889473228:
                        if (!LJJ.equals("switch")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            HashMap LIZIZ = C65412Plo.LIZIZ(this.LIZ, reader, Boolean.TYPE);
                            o.LJI(LIZIZ);
                            roomSlideUpGuide.switchs = LIZIZ;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 394254837:
                        if (!LJJ.equals("ec_switch")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            HashMap LIZIZ2 = C65412Plo.LIZIZ(this.LIZ, reader, Boolean.TYPE);
                            o.LJI(LIZIZ2);
                            roomSlideUpGuide.ecSwitches = LIZIZ2;
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1850025594:
                        if (!LJJ.equals("new_play_times")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            roomSlideUpGuide.newPlayTimes = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1926545019:
                        if (!LJJ.equals("play_times")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            roomSlideUpGuide.playTimes = reader.LJIJI();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return roomSlideUpGuide;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, RoomSlideUpGuide roomSlideUpGuide) {
        RoomSlideUpGuide roomSlideUpGuide2 = roomSlideUpGuide;
        o.LJIIIZ(writer, "writer");
        if (roomSlideUpGuide2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("play_times");
        C79062V1e.LJFF(roomSlideUpGuide2.playTimes, writer, "new_play_times");
        C79062V1e.LJFF(roomSlideUpGuide2.newPlayTimes, writer, "max_show_times");
        C79062V1e.LJFF(roomSlideUpGuide2.maxShowTimes, writer, "switch");
        Gson gson = this.LIZ;
        Map<String, Boolean> map = roomSlideUpGuide2.switchs;
        Class cls = Boolean.TYPE;
        C65412Plo.LJ(gson, writer, map, cls);
        writer.LJI("ec_switch");
        C65412Plo.LJ(this.LIZ, writer, roomSlideUpGuide2.ecSwitches, cls);
        writer.LJFF();
    }
}
