package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.N4o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58766N4o {
    public static C58764N4m LIZ;

    public static C58764N4m LIZ() {
        C58764N4m c58764N4m;
        synchronized (C58766N4o.class) {
            c58764N4m = LIZ;
            if (c58764N4m != null) {
                LIZ = null;
            } else {
                c58764N4m = null;
            }
        }
        if (c58764N4m == null) {
            return new C58764N4m();
        }
        c58764N4m.LIZ = null;
        c58764N4m.LIZIZ = null;
        c58764N4m.LIZJ = null;
        c58764N4m.LIZLLL = null;
        c58764N4m.LJ.LIZ = null;
        return c58764N4m;
    }

    public static C58764N4m LIZIZ(long j, String str, String str2) {
        String LIZ2;
        C58764N4m LIZ3 = LIZ();
        LIZ3.LJ.LIZ("ad_event_priority", "10");
        LIZ3.LJ.LIZ("ad_event_type", "monitor");
        LIZ3.LJ.LIZ("track_url_list", str);
        LIZ3.LJ.LIZ("track_status", str2);
        C58765N4n c58765N4n = LIZ3.LJ;
        c58765N4n.getClass();
        try {
            if (c58765N4n.LIZ == null) {
                c58765N4n.LIZ = new JSONObject();
            }
            c58765N4n.LIZ.put("ts", j);
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
        }
        LIZ2 = FLE.LIZ("other");
        if (!TextUtils.isEmpty(LIZ2)) {
            LIZ3.LJ.LIZ("user_agent", LIZ2);
        }
        return LIZ3;
    }
}
