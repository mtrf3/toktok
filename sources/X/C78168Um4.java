package X;

import org.json.JSONObject;

/* renamed from: X.Um4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78168Um4 {
    public static void LIZ(EnumC78167Um3 enumC78167Um3, long j, long j2, long j3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("event", enumC78167Um3.name());
            C78169Um5.LIZ().getClass();
            int i = 1;
            if (C78169Um5.LIZIZ.get(C78169Um5.LIZJ) == null) {
                i = 0;
            }
            jSONObject.put("player_state", i);
            jSONObject.put("message_id", j);
            jSONObject.put("gift_id", j2);
            jSONObject.put("effect_id", j3);
            InterfaceC32251ClD interfaceC32251ClD = (InterfaceC32251ClD) C32260ClM.LIZ(InterfaceC32251ClD.class);
            if (interfaceC32251ClD != null) {
                interfaceC32251ClD.monitorStatus("ttlive_video_gift_show_link_all", 0, jSONObject);
            }
        } catch (Exception unused) {
        }
    }
}
