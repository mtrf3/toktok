package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BKQ {
    public static volatile BKQ LIZ;
    public static final C28733BPl LIZIZ = C28733BPl.LJIILIIL();

    public static BKQ LIZIZ() {
        if (LIZ == null) {
            synchronized (BKQ.class) {
                if (LIZ == null) {
                    LIZ = new BKQ();
                }
            }
        }
        return LIZ;
    }

    public static JSONObject LIZJ(java.util.Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(int r6, android.view.ViewGroup r7) {
        /*
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            if (r7 != 0) goto Lc
            java.lang.String r0 = r4.toString()
            return r0
        Lc:
            r3 = 0
        Ld:
            int r0 = r7.getChildCount()
            if (r3 >= r0) goto L86
            android.view.View r5 = r7.getChildAt(r3)
            java.lang.String r0 = "|index:"
            r4.append(r0)
            r4.append(r6)
            r4.append(r3)
            boolean r0 = r5 instanceof android.widget.TextView
            java.lang.String r1 = ""
            if (r0 == 0) goto L84
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r2 = r0.toString()
        L33:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L41
            java.lang.String r0 = "|text:"
            r4.append(r0)
            r4.append(r2)
        L41:
            if (r5 == 0) goto L7e
            java.lang.Object r0 = r5.getTag()
            if (r0 != 0) goto L7f
            r0 = r1
        L4a:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L58
            java.lang.String r0 = "|tag:"
            r4.append(r0)
            r4.append(r2)
        L58:
            if (r5 == 0) goto L60
            java.lang.CharSequence r1 = r5.getContentDescription()
            java.lang.String r1 = (java.lang.String) r1
        L60:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L6e
            java.lang.String r0 = "|description:"
            r4.append(r0)
            r4.append(r1)
        L6e:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L7b
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.String r0 = LIZ(r3, r5)
            r4.append(r0)
        L7b:
            int r3 = r3 + 1
            goto Ld
        L7e:
            r0 = r1
        L7f:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L4a
        L84:
            r2 = r1
            goto L33
        L86:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BKQ.LIZ(int, android.view.ViewGroup):java.lang.String");
    }

    public static void LJ(java.util.Map map, String str, String str2) {
        LIZLLL(str, str2, 1, LIZJ(map));
    }

    public static void LJFF(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public static void LIZLLL(String str, String str2, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            LJFF("service", str2, jSONObject2);
            try {
                jSONObject2.put("status_code", i);
            } catch (Exception unused) {
            }
            LIZIZ.LIZJ(str, jSONObject2);
        } catch (Exception unused2) {
        }
    }
}
