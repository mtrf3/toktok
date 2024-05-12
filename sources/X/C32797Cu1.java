package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Cu1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32797Cu1 extends AbstractC32132CjI implements InterfaceC77300UVk {
    public final String LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32797Cu1(InterfaceC32124CjA requireRef) {
        super(requireRef);
        o.LJIIIZ(requireRef, "requireRef");
        this.LIZLLL = "PreRequestSendGiftInterceptor";
    }

    @Override // X.InterfaceC77300UVk
    public final Object LIZIZ(C32816CuK c32816CuK, InterfaceC67352kd<? super C35928E8e> interfaceC67352kd) {
        if (this.LIZJ) {
            return LJIIJ(c32816CuK, interfaceC67352kd);
        }
        C0NB.LJ(this.LIZLLL, "request check on invalid interceptor!");
        return new C35928E8e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c5, code lost:
    
        if (r9.LJIIIZ(r10, r14, r15, r16, "global", r18, r3.globalBlockAny(), r3.globalBlockCheckAnchor()) != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.C32816CuK r22, X.InterfaceC67352kd<? super X.C35928E8e> r23) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32797Cu1.LJIIJ(X.CuK, X.2kd):java.lang.Object");
    }

    public final boolean LJIIIZ(C32804Cu8 c32804Cu8, Room room, DataChannel dataChannel, String str, String str2, String str3, boolean z, boolean z2) {
        Long l;
        Long l2;
        Room room2;
        Room room3;
        String LIZ;
        C0NB.LIZIZ(this.LIZLLL, "checkingRoomId");
        String str4 = "";
        if (o.LJ(str, "")) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_to_user", c32804Cu8.LIZJ);
            jSONObject2.put("event_room", c32804Cu8.LIZIZ);
            jSONObject2.put("room_source", str2);
            jSONObject.put("room_source", str2);
            jSONObject.put("type", "room_invalid");
            C0K2.LJI("gift_core_monitor", jSONObject, new JSONObject(), jSONObject2);
            return false;
        }
        if (room != null && (LIZ = C17280m4.LIZ(room)) != null) {
            str4 = LIZ;
        }
        if (!o.LJ(str4, str)) {
            C0NB.LJ(this.LIZLLL, "toRoomIdCheckBlock toRoomId not current room!");
            JSONObject jSONObject3 = new JSONObject();
            JSONObject LIZJ = C65232Piu.LIZJ("room_source", str2);
            LIZJ.put("event_to_user", c32804Cu8.LIZJ);
            LIZJ.put("current_anchor", str3);
            LIZJ.put("event_room", c32804Cu8.LIZIZ);
            LIZJ.put("current_room", str);
            Long l3 = null;
            if (dataChannel != null && (room3 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                l = Long.valueOf(room3.getId());
            } else {
                l = null;
            }
            LIZJ.put("datachannel_room", l);
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            C28246B6s c28246B6s = (C28246B6s) dataChannelGlobal.mv0(C29049Baf.class);
            if (c28246B6s != null && (room2 = c28246B6s.LIZIZ) != null) {
                l2 = Long.valueOf(room2.getId());
            } else {
                l2 = null;
            }
            LIZJ.put("global_room", l2);
            Room room4 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
            if (room4 != null) {
                l3 = Long.valueOf(room4.getId());
            }
            LIZJ.put("global_current_room", l3);
            jSONObject3.put("room_source", str2);
            jSONObject3.put("type", "room_not_current");
            if (z) {
                C0K2.LJI("gift_core_monitor", jSONObject3, new JSONObject(), LIZJ);
            } else {
                C0K2.LJ("gift_core_monitor", jSONObject3, new JSONObject(), LIZJ);
            }
            if (z) {
                return true;
            }
            if (o.LJ(String.valueOf(c32804Cu8.LIZJ), str3)) {
                jSONObject3.put("type", "room_not_current_anchor_current");
                C0K2.LJI("gift_core_monitor", jSONObject3, new JSONObject(), LIZJ);
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }
}
