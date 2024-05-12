package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* loaded from: classes6.dex */
public final class B52 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && room.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(String str, OSZ... oszArr) {
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJIIZILJ();
        C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ2, "user_id");
        for (OSZ osz : oszArr) {
            LIZ2.LJIJJ(osz.getSecond(), (String) osz.getFirst());
        }
        LIZ2.LJJIIJZLJL();
    }
}
