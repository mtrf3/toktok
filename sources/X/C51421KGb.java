package X;

import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* renamed from: X.KGb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51421KGb {
    public static C51422KGc LIZ;

    public static void LIZ() {
        String str;
        Long l;
        Long l2;
        String str2;
        C51422KGc c51422KGc = LIZ;
        if (c51422KGc != null) {
            long j = 0;
            if (c51422KGc.LIZ == 0) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            C51422KGc c51422KGc2 = LIZ;
            if (c51422KGc2 != null) {
                j = c51422KGc2.LIZ;
            }
            c51422KGc.LIZJ = currentTimeMillis - j;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("type:");
            C51422KGc c51422KGc3 = LIZ;
            if (c51422KGc3 != null) {
                str = c51422KGc3.LIZIZ;
            } else {
                str = null;
            }
            LIZ2.append(str);
            LIZ2.append(" cost:");
            C51422KGc c51422KGc4 = LIZ;
            if (c51422KGc4 != null) {
                l = Long.valueOf(c51422KGc4.LIZJ);
            } else {
                l = null;
            }
            LIZ2.append(l);
            X1D.LIZIZ(LIZ2);
            JSONObject jSONObject = new JSONObject();
            C51422KGc c51422KGc5 = LIZ;
            if (c51422KGc5 != null) {
                l2 = Long.valueOf(c51422KGc5.LIZJ);
            } else {
                l2 = null;
            }
            jSONObject.put("cost", l2);
            C51422KGc c51422KGc6 = LIZ;
            if (c51422KGc6 != null) {
                str2 = c51422KGc6.LIZIZ;
            } else {
                str2 = null;
            }
            jSONObject.put("type", str2);
            AppLogNewUtils.onEventV3("search_trigger_keyboard_monitor", jSONObject);
            LIZ = null;
        }
    }

    public static void LIZIZ(String str) {
        C51422KGc c51422KGc = new C51422KGc();
        c51422KGc.LIZ = System.currentTimeMillis();
        c51422KGc.LIZIZ = str;
        LIZ = c51422KGc;
    }
}
