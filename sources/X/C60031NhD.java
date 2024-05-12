package X;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.NhD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60031NhD {
    public static WindowManager LIZ;
    public static final String[] LIZIZ = {"x", "y", "width", "height"};
    public static float LIZJ = Resources.getSystem().getDisplayMetrics().density;

    public static void LIZJ(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("JSONException during JSONObject.put for name [");
            LIZ2.append(str);
            LIZ2.append("]");
            C1GE.LIZ(X1D.LIZIZ(LIZ2));
        }
    }

    public static void LIZIZ(JSONObject jSONObject) {
        float f;
        float f2;
        if (LIZ != null) {
            Point point = new Point(0, 0);
            LIZ.getDefaultDisplay().getRealSize(point);
            float f3 = point.x;
            float f4 = LIZJ;
            f = f3 / f4;
            f2 = point.y / f4;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        try {
            jSONObject.put("width", f);
            jSONObject.put("height", f2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r3 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(org.json.JSONObject r9, org.json.JSONObject r10) {
        /*
            r8 = 1
            if (r9 != 0) goto L6
            if (r10 != 0) goto L6
            return r8
        L6:
            r0 = 0
            if (r9 == 0) goto Lb
            if (r10 != 0) goto Lc
        Lb:
            return r0
        Lc:
            java.lang.String[] r7 = X.C60031NhD.LIZIZ
            int r6 = r7.length
            r5 = 0
        L10:
            if (r5 >= r6) goto L25
            r0 = r7[r5]
            double r3 = r9.optDouble(r0)
            double r1 = r10.optDouble(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L22
        L20:
            r8 = 0
        L21:
            return r8
        L22:
            int r5 = r5 + 1
            goto L10
        L25:
            java.lang.String r0 = "adSessionId"
            java.lang.String r5 = ""
            java.lang.String r1 = r9.optString(r0, r5)
            java.lang.String r0 = r10.optString(r0, r5)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r9.optJSONArray(r0)
            org.json.JSONArray r3 = r10.optJSONArray(r0)
            if (r4 != 0) goto L54
            if (r3 != 0) goto L20
        L45:
            java.lang.String r0 = "childViews"
            org.json.JSONArray r4 = r9.optJSONArray(r0)
            org.json.JSONArray r3 = r10.optJSONArray(r0)
            if (r4 != 0) goto L7a
            if (r3 != 0) goto L20
            goto L21
        L54:
            if (r3 != 0) goto L57
            goto L20
        L57:
            int r1 = r4.length()
            int r0 = r3.length()
            if (r1 != r0) goto L20
            r2 = 0
        L62:
            int r0 = r4.length()
            if (r2 >= r0) goto L45
            java.lang.String r1 = r4.optString(r2, r5)
            java.lang.String r0 = r3.optString(r2, r5)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L77
            goto L20
        L77:
            int r2 = r2 + 1
            goto L62
        L7a:
            if (r3 != 0) goto L7d
            goto L20
        L7d:
            int r1 = r4.length()
            int r0 = r3.length()
            if (r1 != r0) goto L20
            r2 = 0
        L88:
            int r0 = r4.length()
            if (r2 >= r0) goto L21
            org.json.JSONObject r1 = r4.optJSONObject(r2)
            org.json.JSONObject r0 = r3.optJSONObject(r2)
            boolean r0 = LIZLLL(r1, r0)
            if (r0 != 0) goto L9d
            goto L20
        L9d:
            int r2 = r2 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60031NhD.LIZLLL(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    public static JSONObject LIZ(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / LIZJ);
            jSONObject.put("y", i2 / LIZJ);
            jSONObject.put("width", i3 / LIZJ);
            jSONObject.put("height", i4 / LIZJ);
        } catch (JSONException unused) {
            C1GE.LIZ("Error with creating viewStateObject");
        }
        return jSONObject;
    }
}
