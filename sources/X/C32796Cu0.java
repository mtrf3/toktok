package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Cu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32796Cu0 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.bytedance.ies.sdk.datachannel.DataChannel r12, X.C32805Cu9 r13) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32796Cu0.LIZIZ(com.bytedance.ies.sdk.datachannel.DataChannel, X.Cu9):void");
    }

    public static boolean LIZ(C32805Cu9 c32805Cu9, Room room, DataChannel dataChannel, String str, String str2, String str3, boolean z, boolean z2) {
        String str4;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        String l5;
        Room room2;
        Room room3;
        Long l6;
        String l7;
        C0NB.LIZIZ("SendGiftHelper", "checkingRoomId");
        String str5 = "";
        if (o.LJ(str, "")) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            C32822CuQ c32822CuQ = c32805Cu9.LJIILIIL;
            if (c32822CuQ != null && (l7 = Long.valueOf(c32822CuQ.LIZ).toString()) != null) {
                str5 = l7;
            }
            jSONObject2.put("event_to_user", str5);
            Room room4 = c32805Cu9.LJJI;
            if (room4 != null) {
                l6 = Long.valueOf(room4.getId());
            } else {
                l6 = null;
            }
            jSONObject2.put("event_room", l6);
            jSONObject2.put("room_source", str2);
            jSONObject.put("room_source", str2);
            jSONObject.put("type", "room_invalid");
            C0K2.LJI("gift_core_monitor", jSONObject, new JSONObject(), jSONObject2);
            return false;
        }
        String LIZ2 = C17280m4.LIZ(room);
        if (LIZ2 == null) {
            LIZ2 = "";
        }
        if (!o.LJ(LIZ2, str)) {
            C0NB.LJ("SendGiftHelper", "toRoomIdCheckBlock toRoomId not current room!");
            JSONObject jSONObject3 = new JSONObject();
            JSONObject LIZJ = C65232Piu.LIZJ("room_source", str2);
            C32822CuQ c32822CuQ2 = c32805Cu9.LJIILIIL;
            if (c32822CuQ2 == null || (str4 = Long.valueOf(c32822CuQ2.LIZ).toString()) == null) {
                str4 = "";
            }
            LIZJ.put("event_to_user", str4);
            LIZJ.put("current_anchor", str3);
            Room room5 = c32805Cu9.LJJI;
            if (room5 != null) {
                l = Long.valueOf(room5.getId());
            } else {
                l = null;
            }
            LIZJ.put("event_room", l);
            LIZJ.put("current_room", str);
            if (dataChannel != null && (room3 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                l2 = Long.valueOf(room3.getId());
            } else {
                l2 = null;
            }
            LIZJ.put("datachannel_room", l2);
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            C28246B6s c28246B6s = (C28246B6s) dataChannelGlobal.mv0(C29049Baf.class);
            if (c28246B6s != null && (room2 = c28246B6s.LIZIZ) != null) {
                l3 = Long.valueOf(room2.getId());
            } else {
                l3 = null;
            }
            LIZJ.put("global_room", l3);
            Room room6 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
            if (room6 != null) {
                l4 = Long.valueOf(room6.getId());
            } else {
                l4 = null;
            }
            LIZJ.put("global_current_room", l4);
            jSONObject3.put("room_source", str2);
            jSONObject3.put("type", "room_not_current");
            C0K2.LJI("gift_core_monitor", jSONObject3, new JSONObject(), LIZJ);
            if (z) {
                return true;
            }
            C32822CuQ c32822CuQ3 = c32805Cu9.LJIILIIL;
            if (c32822CuQ3 != null && (l5 = Long.valueOf(c32822CuQ3.LIZ).toString()) != null) {
                str5 = l5;
            }
            if (o.LJ(str5, str3)) {
                jSONObject3.put("type", "room_not_current_anchor_current");
                C0K2.LJI("gift_core_monitor", jSONObject3, new JSONObject(), LIZJ);
                if (z2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
