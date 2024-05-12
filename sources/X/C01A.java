package X;

import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.01A, reason: invalid class name */
/* loaded from: classes.dex */
public final class C01A {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, C01C c01c, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_page", c01c.LJI);
        hashMap.put("report_type", c01c.LIZ);
        hashMap.put("report_click_time", String.valueOf(System.currentTimeMillis()));
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        hashMap.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        hashMap.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        hashMap.putAll(BJB.LIZ());
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_user_report");
        LIZ2.LJJIFFI(hashMap);
        C1FL.LJI(LIZ2, c01c.LJFF, WM7.SCENE_SERVICE);
        C29702BlC LIZ3 = C18230nb.LIZ("ttlive_report_user");
        LIZ3.LIZLLL("report_url", str);
        LIZ3.LJIIIZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", c01c.LIZLLL);
        jSONObject.put("enter_method", c01c.LJ);
        jSONObject.put("use_spark", z);
        jSONObject.put("report_url", str);
        for (Map.Entry entry : hashMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        C0K2.LJIIJJI(0, "ttlive_live_report_click", jSONObject);
    }

    public static void LIZIZ(String str, C01C c01c, boolean z, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_page", c01c.LJI);
        hashMap.put("report_type", c01c.LIZ);
        hashMap.put("small_picture_order", BJM.LJIILLIIL());
        hashMap.put("live_window_mode", BJM.LJIIJ());
        if (C15380j0.LJIILLIIL()) {
            hashMap.put("room_orientation", "portrait");
        } else {
            hashMap.put("room_orientation", "landscape");
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        jSONObject.put("enter_from", c01c.LIZLLL);
        jSONObject.put("enter_method", c01c.LJ);
        jSONObject.put("use_spark", z);
        jSONObject.put("report_url", str);
        jSONObject.put("fail_reason", str2);
        C0K2.LJIIJJI(0, "ttlive_live_report_load_fail", jSONObject);
    }
}
