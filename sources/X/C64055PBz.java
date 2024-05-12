package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.PBz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64055PBz {
    public static boolean LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LJFF(org.json.JSONObject r9) {
        /*
            r8 = 0
            if (r9 != 0) goto L4
            return r8
        L4:
            java.util.Iterator r7 = r9.keys()
            if (r7 != 0) goto Lb
            return r8
        Lb:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L76
            r6.<init>()     // Catch: java.lang.Exception -> L76
        L10:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L75
            java.lang.Object r5 = r7.next()     // Catch: java.lang.Exception -> L76
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L76
            java.lang.Object r4 = r9.opt(r5)     // Catch: java.lang.Exception -> L76
            boolean r0 = r4 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L51
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch: java.lang.Exception -> L76
            if (r4 != 0) goto L29
            goto L2f
        L29:
            java.util.Iterator r3 = r4.keys()     // Catch: java.lang.Exception -> L76
            if (r3 != 0) goto L31
        L2f:
            r4 = r8
            goto L4b
        L31:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4b
            r2.<init>()     // Catch: java.lang.Exception -> L4b
        L36:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L4b
            if (r0 == 0) goto L4a
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Exception -> L4b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L4b
            java.lang.Object r0 = r4.opt(r1)     // Catch: java.lang.Exception -> L4b
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L4b
            goto L36
        L4a:
            r4 = r2
        L4b:
            if (r4 == 0) goto L10
            r6.put(r5, r4)     // Catch: java.lang.Exception -> L76
            goto L10
        L51:
            boolean r0 = r4 instanceof org.json.JSONArray     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L71
            org.json.JSONArray r4 = (org.json.JSONArray) r4     // Catch: java.lang.Exception -> L76
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Exception -> L76
            r2.<init>()     // Catch: java.lang.Exception -> L76
            r1 = 0
        L5d:
            int r0 = r4.length()     // Catch: java.lang.Exception -> L76
            if (r1 >= r0) goto L6d
            java.lang.Object r0 = r4.get(r1)     // Catch: java.lang.Exception -> L76
            r2.put(r0)     // Catch: java.lang.Exception -> L76
            int r1 = r1 + 1
            goto L5d
        L6d:
            r6.put(r5, r2)     // Catch: java.lang.Exception -> L76
            goto L10
        L71:
            r6.put(r5, r4)     // Catch: java.lang.Exception -> L76
            goto L10
        L75:
            return r6
        L76:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64055PBz.LJFF(org.json.JSONObject):org.json.JSONObject");
    }

    public static JSONObject LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys;
        if (jSONObject == null || jSONObject2 == null || (keys = jSONObject2.keys()) == null) {
            return null;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.isNull(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
        return jSONObject;
    }

    public static int LIZJ(String str, JSONObject jSONObject) {
        try {
            if (!jSONObject.has(str)) {
                return 0;
            }
            int i = JSONObjectProtectorUtils.getInt(jSONObject, str);
            jSONObject.remove(str);
            return i;
        } catch (Exception e) {
            C64028PAy.LIZJ("JsonUtils", "removeInt", e);
            return 0;
        }
    }

    public static long LIZLLL(String str, JSONObject jSONObject) {
        try {
            if (!jSONObject.has(str)) {
                return 0L;
            }
            long j = JSONObjectProtectorUtils.getLong(jSONObject, str);
            jSONObject.remove(str);
            return j;
        } catch (Exception e) {
            C64028PAy.LIZJ("JsonUtils", "removeLong", e);
            return 0L;
        }
    }

    public static String LJ(String str, JSONObject jSONObject) {
        try {
            if (!jSONObject.has(str)) {
                return null;
            }
            String string = JSONObjectProtectorUtils.getString(jSONObject, str);
            jSONObject.remove(str);
            return string;
        } catch (Exception e) {
            C64028PAy.LIZJ("JsonUtils", "removeString", e);
            return null;
        }
    }
}
