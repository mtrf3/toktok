package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.J7s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48656J7s {
    public static final void LIZIZ(int i, long j) {
        HashMap LIZJ = C03660Ck.LIZJ("tag", "ad_extra_map");
        LIZJ.put("time_cost", String.valueOf(j));
        LIZJ.put("json_length", String.valueOf(i));
        C48658J7u.LIZ("rd_tiktokec_time_cost", LIZJ);
    }

    public static final void LIZ(long j, String serviceName, String str, String str2) {
        o.LJIIIZ(serviceName, "serviceName");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("anchor_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("first_show_cost", j);
            C48658J7u.LIZIZ(serviceName, jSONObject);
        } catch (Exception unused) {
        }
    }
}
