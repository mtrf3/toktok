package X;

import com.google.gson.m;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes7.dex */
public final class EP3 {
    public static InterfaceC58609MzN LIZIZ;
    public static InterfaceC65784Pro<m> LIZJ;
    public static java.util.Set<String> LIZLLL;
    public static boolean LJ;
    public static final EP3 LJFF = new EP3();
    public static final java.util.Set<EP4> LIZ = new LinkedHashSet();

    public final synchronized void LIZ() {
        Object LIZ2;
        Iterator<EP4> it = LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().LIZ();
                LIZ2 = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            C3C5.m10exceptionOrNullimpl(LIZ2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0030, code lost:
    
        if (r0 == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.InterfaceC65784Pro r5) {
        /*
            java.lang.String r4 = "location"
            X.EP3.LIZJ = r5     // Catch: java.lang.Throwable -> L8e
            if (r5 == 0) goto L9a
            java.lang.Object r0 = r5.invoke()     // Catch: java.lang.Throwable -> L8e
            com.google.gson.m r0 = (com.google.gson.m) r0     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L9a
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8e
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L8e
            org.json.JSONObject r0 = r3.optJSONObject(r4)     // Catch: java.lang.Throwable -> L8e
            r5 = 0
            java.lang.String r2 = "precise_location_config"
            if (r0 == 0) goto L21
            goto L23
        L21:
            r1 = 0
            goto L32
        L23:
            org.json.JSONObject r1 = r0.optJSONObject(r2)     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L21
            java.lang.String r0 = "bpea_check_enable"
            boolean r0 = r1.optBoolean(r0)     // Catch: java.lang.Throwable -> L8e
            r1 = 1
            if (r0 != r1) goto L21
        L32:
            X.EP3.LJ = r1     // Catch: java.lang.Throwable -> L8e
            org.json.JSONObject r0 = r3.optJSONObject(r4)     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L64
            org.json.JSONObject r1 = r0.optJSONObject(r2)     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L64
            java.lang.String r0 = "white_list"
            org.json.JSONArray r4 = r1.optJSONArray(r0)     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L64
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L8e
            r3.<init>()     // Catch: java.lang.Throwable -> L8e
            int r2 = r4.length()     // Catch: java.lang.Throwable -> L8e
        L51:
            if (r5 >= r2) goto L62
            java.lang.String r1 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getString(r4, r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "getString(i)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L8e
            r3.add(r1)     // Catch: java.lang.Throwable -> L8e
            int r5 = r5 + 1
            goto L51
        L62:
            X.EP3.LIZLLL = r3     // Catch: java.lang.Throwable -> L8e
        L64:
            java.lang.String r2 = "BPEA"
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "updatePumbaaSettings  preciseLocationCheckEnable>>"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8e
            boolean r0 = X.EP3.LJ     // Catch: java.lang.Throwable -> L8e
            r1.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "   preciseRegionWhiteList>>"
            r1.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.util.Set<java.lang.String> r0 = X.EP3.LIZLLL     // Catch: java.lang.Throwable -> L8e
            r1.append(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L8e
            int r0 = android.util.Log.d(r2, r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L8e
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L8e
            goto L96
        L8e:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L96:
            X.C3C5.m10exceptionOrNullimpl(r0)
            return
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EP3.LIZIZ(X.Pro):void");
    }
}
