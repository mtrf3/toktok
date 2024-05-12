package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class InviteFriendFreCtrlConfig_OptTypeAdapter extends TypeAdapter<InviteFriendFreCtrlConfig> {
    public final Gson LIZ;

    public InviteFriendFreCtrlConfig_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final InviteFriendFreCtrlConfig read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        InviteFriendFreCtrlConfig inviteFriendFreCtrlConfig = new InviteFriendFreCtrlConfig(null, 0L, 3, null);
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (o.LJ(LJJ, "room_window")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    inviteFriendFreCtrlConfig.roomWindow = (RoomWindow) C64.LIZ(this.LIZ, RoomWindow.class, reader, "gson.getAdapter(RoomWind…:class.java).read(reader)");
                } else {
                    reader.LJJIIJ();
                }
            } else if (o.LJ(LJJ, "friend_window")) {
                if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                    inviteFriendFreCtrlConfig.singleUserTimeWindow = reader.LJIJJ();
                } else {
                    reader.LJJIIJ();
                }
            } else {
                reader.LJJJJ();
            }
        }
        reader.LJFF();
        return inviteFriendFreCtrlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, InviteFriendFreCtrlConfig inviteFriendFreCtrlConfig) {
        InviteFriendFreCtrlConfig inviteFriendFreCtrlConfig2 = inviteFriendFreCtrlConfig;
        o.LJIIIZ(writer, "writer");
        if (inviteFriendFreCtrlConfig2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("room_window");
        this.LIZ.LJIIJ(RoomWindow.class).write(writer, inviteFriendFreCtrlConfig2.roomWindow);
        writer.LJI("friend_window");
        writer.LJIJ(inviteFriendFreCtrlConfig2.singleUserTimeWindow);
        writer.LJFF();
    }
}
