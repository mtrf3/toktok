package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.N0j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58657N0j {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r10 != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r12, java.lang.String r13, org.json.JSONObject r14, long r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58657N0j.LIZIZ(java.lang.String, java.lang.String, org.json.JSONObject, long):void");
    }

    public static void LIZ(long j, String str, String str2, String str3, JSONObject jSONObject) {
        C55509LqT.LIZ.LIZ(str, str2, str3, jSONObject);
        if (TextUtils.equals("click", str2)) {
            LIZIZ(str, str3, jSONObject, j);
            try {
                jSONObject.put("has_v3", 1);
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
        } else {
            String LIZLLL = C47959Irz.LIZLLL(31744, "enable_send_staging_adlog", "v3", true);
            if (TextUtils.equals(LIZLLL, "v3")) {
                return;
            }
            if (TextUtils.equals(LIZLLL, "all")) {
                try {
                    jSONObject.put("_ad_staging_flag", "1");
                } catch (JSONException e2) {
                    C78983UzD.LJIIZILJ(e2);
                }
            }
        }
        if (C59835Ne3.LIZ() != null) {
            C59835Ne3.LIZ().onEventV1(EF7.LIZIZ(), str, null, str2, str3, j, jSONObject);
        }
    }
}
