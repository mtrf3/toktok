package X;

import org.json.JSONObject;

/* renamed from: X.BqO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30024BqO {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(long j, long j2, long j3, String str, String str2, String str3, String str4) {
        JSONObject LIZLLL = Q7K.LIZLLL("room_id", j);
        LIZLLL.put("user_id", j2);
        LIZLLL.put("anchor_id", j3);
        LIZLLL.put("overall_state", str);
        LIZLLL.put("send_state", str2);
        LIZLLL.put("receive_state", str3);
        LIZLLL.put("progress_effect_state", str4);
        C0NB.LIZIZ("ttlive_like", LIZLLL.toString());
    }
}
