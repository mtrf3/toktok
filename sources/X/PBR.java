package X;

import java.util.List;

/* loaded from: classes12.dex */
public class PBR implements PBM {
    @Override // X.PBM
    public final String getName() {
        return "trace";
    }

    @Override // X.PBM
    public final List<String> LIZ() {
        PBX pbx = C64038PBi.LIZ;
        PBY pby = pbx.LJIIL;
        if (pby != null && !C78915Uy7.LJIJJ(pby.LJ)) {
            return pbx.LJIIL.LJ;
        }
        return pbx.LJII;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[Catch: Exception -> 0x0099, TRY_ENTER, TryCatch #1 {Exception -> 0x0099, blocks: (B:14:0x0031, B:18:0x004b, B:23:0x006e, B:24:0x0072, B:26:0x0078, B:29:0x0085, B:34:0x0038, B:36:0x0048, B:37:0x0052, B:40:0x005e), top: B:13:0x0031, outer: #2 }] */
    @Override // X.PBM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] LIZIZ(java.util.HashMap<java.lang.Long, org.json.JSONArray> r12) {
        /*
            r11 = this;
            r10 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> Le2
            r4.<init>()     // Catch: java.lang.Exception -> Le2
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> Le2
            r3.<init>()     // Catch: java.lang.Exception -> Le2
            java.util.Set r0 = r12.keySet()     // Catch: java.lang.Exception -> Le2
            java.util.Iterator r9 = r0.iterator()     // Catch: java.lang.Exception -> Le2
        L13:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Exception -> Le2
            java.lang.String r5 = "APM-Slardar"
            if (r0 == 0) goto La2
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Exception -> Le2
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Exception -> Le2
            java.lang.Object r8 = r12.get(r0)     // Catch: java.lang.Exception -> Le2
            org.json.JSONArray r8 = (org.json.JSONArray) r8     // Catch: java.lang.Exception -> Le2
            if (r8 != 0) goto L2a
            goto L13
        L2a:
            r7 = 0
        L2b:
            int r0 = r8.length()     // Catch: java.lang.Exception -> Le2
            if (r7 >= r0) goto L13
            org.json.JSONObject r2 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getJSONObject(r8, r7)     // Catch: java.lang.Exception -> L99
            if (r2 != 0) goto L38
            goto L5b
        L38:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L99
            r6.<init>()     // Catch: java.lang.Exception -> L99
            java.lang.String r1 = "wrapper_type_description"
            r0 = -1
            int r1 = r2.optInt(r1, r0)     // Catch: java.lang.Exception -> L99
            r0 = 1
            if (r1 == r0) goto L52
            r6.add(r2)     // Catch: java.lang.Exception -> L99
        L4b:
            boolean r0 = X.C78915Uy7.LJIJJ(r6)     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L6e
            goto L9f
        L52:
            java.lang.String r0 = "wrapper_array_data"
            org.json.JSONArray r2 = r2.optJSONArray(r0)     // Catch: java.lang.Exception -> L99
            if (r2 != 0) goto L5d
        L5b:
            r6 = r10
            goto L4b
        L5d:
            r1 = 0
        L5e:
            int r0 = r2.length()     // Catch: java.lang.Exception -> L99
            if (r1 >= r0) goto L4b
            java.lang.Object r0 = r2.get(r1)     // Catch: java.lang.Exception -> L6b
            r6.add(r0)     // Catch: java.lang.Exception -> L6b
        L6b:
            int r1 = r1 + 1
            goto L5e
        L6e:
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L99
        L72:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L9f
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Exception -> L99
            r3.put(r2)     // Catch: java.lang.Exception -> L99
            boolean r0 = X.C78248UnM.LJIIJ()     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L72
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = ":"
            r1.append(r0)     // Catch: java.lang.Exception -> L99
            r1.append(r2)     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L99
            X.C64028PAy.LIZ(r5, r0)     // Catch: java.lang.Exception -> L99
            goto L72
        L99:
            r1 = move-exception
            java.lang.String r0 = "serialize"
            X.C64028PAy.LIZJ(r5, r0, r1)     // Catch: java.lang.Exception -> Le2
        L9f:
            int r7 = r7 + 1
            goto L2b
        La2:
            boolean r0 = X.C78248UnM.LJIIJ()     // Catch: java.lang.Exception -> Le2
            if (r0 == 0) goto Lbb
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> Le2
            java.lang.String r0 = "jsonArray:"
            r1.append(r0)     // Catch: java.lang.Exception -> Le2
            r1.append(r3)     // Catch: java.lang.Exception -> Le2
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> Le2
            X.C64028PAy.LIZ(r5, r0)     // Catch: java.lang.Exception -> Le2
        Lbb:
            X.PC6 r2 = X.PC6.LIZIZ()     // Catch: java.lang.Exception -> Le2
            long r0 = X.PC7.LIZ()     // Catch: java.lang.Exception -> Le2
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Le2
            X.PCA r0 = r2.LIZ(r0)     // Catch: java.lang.Exception -> Le2
            java.lang.String r1 = "header"
            org.json.JSONObject r0 = X.PC7.LIZIZ(r0)     // Catch: java.lang.Exception -> Le2
            r4.put(r1, r0)     // Catch: java.lang.Exception -> Le2
            java.lang.String r0 = "data"
            r4.put(r0, r3)     // Catch: java.lang.Exception -> Le2
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> Le2
            byte[] r0 = X.PAK.LIZ(r0)     // Catch: java.lang.Exception -> Le2
            return r0
        Le2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PBR.LIZIZ(java.util.HashMap):byte[]");
    }
}
