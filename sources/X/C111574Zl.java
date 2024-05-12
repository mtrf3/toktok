package X;

import org.json.JSONObject;

/* renamed from: X.4Zl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111574Zl {
    public static final void LIZ(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("npe", str);
            C09900aA.LJI("ttk_comment_crash", jSONObject, null, null);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("service:ttk_comment_crash category:");
            LIZ.append(jSONObject);
            C71Y.LIZLLL("CommentCrashMonitor", X1D.LIZIZ(LIZ));
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("json error ");
            LIZ2.append(e.getMessage());
            C71Y.LIZLLL("CommentCrashMonitor", X1D.LIZIZ(LIZ2));
        }
    }
}
