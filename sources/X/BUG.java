package X;

import com.bytedance.android.live.microom.IMicRoomService;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BUG extends AbstractC38127Exn<JSONObject, JSONObject> {
    @Override // X.AbstractC38127Exn
    public final JSONObject invoke(JSONObject params, C38131Exr context) {
        boolean z;
        boolean z2;
        String str;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        JSONObject jSONObject = new JSONObject();
        IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
        int i = 0;
        if (iMicRoomService != null) {
            z = iMicRoomService.Nl();
        } else {
            z = false;
        }
        jSONObject.put("isLiveHouseAudience", z);
        IMicRoomService iMicRoomService2 = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
        if (iMicRoomService2 != null) {
            z2 = iMicRoomService2.rk();
        } else {
            z2 = false;
        }
        jSONObject.put("isInLiveHouseRoom", z2);
        if (BM1.LJIILIIL) {
            IMicRoomService iMicRoomService3 = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
            if (iMicRoomService3 != null && iMicRoomService3.oT()) {
                i = BM1.LIZIZ ? 2 : 1;
            }
            jSONObject.put("anchor_type", i);
        } else {
            IMicRoomService iMicRoomService4 = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
            if (iMicRoomService4 != null) {
                i = iMicRoomService4.zd0();
            }
            jSONObject.put("anchor_type", i);
        }
        IMicRoomService iMicRoomService5 = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
        String str2 = null;
        if (iMicRoomService5 != null) {
            str = iMicRoomService5.getEnterFromMerge();
        } else {
            str = null;
        }
        jSONObject.put("enter_from_merge", str);
        IMicRoomService iMicRoomService6 = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
        if (iMicRoomService6 != null) {
            str2 = iMicRoomService6.getEnterMethod();
        }
        jSONObject.put("enter_method", str2);
        for (Map.Entry<String, String> entry : ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).getRoomInfo().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            switch (key.hashCode()) {
                case -1157405417:
                    if (key.equals("live_lineup_type")) {
                        break;
                    } else {
                        break;
                    }
                case -233946764:
                    if (key.equals("actual_anchor_id")) {
                        jSONObject.put("author_id", value);
                        break;
                    } else {
                        continue;
                    }
                case -41830683:
                    if (key.equals("anchor_id")) {
                        jSONObject.put("lineup_author_id", value);
                        break;
                    } else {
                        continue;
                    }
                case 709644145:
                    if (key.equals("live_lineup_user_type")) {
                        break;
                    } else {
                        break;
                    }
                case 1379892991:
                    if (key.equals("room_id")) {
                        jSONObject.put("lineup_room_id", value);
                        break;
                    } else {
                        continue;
                    }
                case 1446732110:
                    if (key.equals("actual_room_id")) {
                        jSONObject.put("room_id", value);
                        break;
                    } else {
                        continue;
                    }
                case 1825589740:
                    if (key.equals("live_lineup_change_type")) {
                        break;
                    } else {
                        break;
                    }
            }
            jSONObject.put(key, value);
        }
        return jSONObject;
    }
}
