package X;

import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BUF extends AbstractC38127Exn<JSONObject, Object> {
    @Override // X.AbstractC38127Exn
    public final Object invoke(JSONObject jSONObject, C38131Exr c38131Exr) {
        boolean z;
        BZI LIZ;
        JSONObject jSONObject2 = jSONObject;
        String eventName = jSONObject2.optString("eventName");
        JSONObject optJSONObject = jSONObject2.optJSONObject("config");
        if (optJSONObject != null) {
            z = optJSONObject.optBoolean("disable_livesdk", false);
        } else {
            z = false;
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("params");
        Iterator<String> keys = optJSONObject2.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = optJSONObject2.optString(next);
            keys.remove();
            hashMap.put(next, optString);
        }
        if (z) {
            o.LJIIIZ(eventName, "eventName");
            LIZ = new BZI(eventName, false);
        } else {
            LIZ = C28787BRn.LIZ(eventName);
        }
        if ("livesdk_report_success".equals(eventName) || "report_success".equals(eventName)) {
            ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
            hashMap.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
            hashMap.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        }
        LIZ.LJIIZILJ();
        LIZ.LJJIFFI(hashMap);
        LIZ.LJJIIJZLJL();
        return null;
    }
}
