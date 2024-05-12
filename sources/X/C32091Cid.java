package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import org.json.JSONObject;

/* renamed from: X.Cid, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32091Cid {
    public static Long LIZ;
    public static Long LIZIZ;

    public static final void LIZ(long j, DataChannel dataChannel) {
        Long l;
        Room room;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onWidgetUnLoad cur(");
        LIZ2.append(LIZ);
        LIZ2.append(") un(");
        LIZ2.append(j);
        LIZ2.append(" roomId(");
        LIZ2.append(l);
        LIZ2.append("))");
        C0NB.LIZIZ("GiftWidgetInstanceMonitor", X1D.LIZIZ(LIZ2));
        Long l2 = LIZ;
        if (l2 == null || l2.longValue() != j) {
            C0NB.LJ("GiftWidgetInstanceMonitor", "detect unload not match!");
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("type", "gift_widget_unload_error");
            jSONObject2.put("existingWidgetHashcode", LIZ);
            jSONObject2.put("existingRoomId", LIZIZ);
            jSONObject2.put("onloadHashcode", j);
            jSONObject2.put("onloadRoomId", l);
            C0K2.LJI("gift_core_monitor", jSONObject, new JSONObject(), jSONObject2);
        }
        LIZ = null;
        LIZIZ = null;
    }
}
