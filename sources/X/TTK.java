package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TTK {
    public static long LIZ;
    public static long LIZIZ;
    public static boolean LIZJ;

    public static void LIZ(java.util.Map map) {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            HashMap hashMap = (HashMap) map;
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
        }
    }

    public static void LIZIZ(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_method", BJM.LJIIIIZZ());
        hashMap.put("enter_from_merge", BJM.LJFF());
        hashMap.put("action_type", BJM.LIZLLL());
        LIZ(hashMap);
        hashMap.put("popup_action_type", str);
        LIZLLL("livesdk_guest_connection_ops_material_popup", hashMap);
    }

    public static void LIZJ(boolean z) {
        if (LIZIZ <= 0) {
            return;
        }
        LIZJ = z;
        if (z) {
            LIZ = (System.currentTimeMillis() - LIZIZ) + LIZ;
        } else {
            LIZIZ = System.currentTimeMillis();
        }
    }

    public static void LIZLLL(String str, java.util.Map map) {
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJJIFFI(map);
        LIZ2.LJJIIJZLJL();
    }
}
