package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class EP1 {
    public final /* synthetic */ int LIZ;
    public final java.util.Map LIZIZ;

    public EP1() {
        this.LIZ = 1;
        this.LIZIZ = new ConcurrentHashMap(20);
    }

    public final String toString() {
        switch (this.LIZ) {
            case 1:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("TraceStruct{innerStorage=");
                return C15890jp.LIZ(LIZ, this.LIZIZ, '}', LIZ);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EP1(org.json.JSONObject r11) {
        /*
            r10 = this;
            r8 = 0
            r10.LIZ = r8
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Iterator r6 = r11.keys()
            java.lang.String r0 = "rulesObj.keys()"
            kotlin.jvm.internal.o.LJFF(r6, r0)
        L11:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r5 = r6.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r9 = r11.opt(r5)
            boolean r0 = r9 instanceof org.json.JSONObject
            java.lang.String r1 = "key"
            if (r0 == 0) goto L3e
            kotlin.jvm.internal.o.LJFF(r5, r1)
            r0 = 1
            X.EbJ[] r1 = new X.C36733EbJ[r0]
            X.EbJ r0 = new X.EbJ
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            r0.<init>(r5, r9)
            r1[r8] = r0
            java.util.List r0 = X.C47261Igj.LJJIJIL(r1)
            r7.put(r5, r0)
            goto L11
        L3e:
            boolean r0 = r9 instanceof org.json.JSONArray
            if (r0 == 0) goto L11
            kotlin.jvm.internal.o.LJFF(r5, r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            org.json.JSONArray r9 = (org.json.JSONArray) r9
            int r3 = r9.length()
            r2 = 0
        L51:
            if (r2 >= r3) goto L64
            org.json.JSONObject r1 = r9.optJSONObject(r2)
            if (r1 == 0) goto L61
            X.EbJ r0 = new X.EbJ
            r0.<init>(r5, r1)
            r4.add(r0)
        L61:
            int r2 = r2 + 1
            goto L51
        L64:
            r7.put(r5, r4)
            goto L11
        L68:
            r10.<init>(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EP1.<init>(org.json.JSONObject):void");
    }

    public EP1(java.util.Map map) {
        this.LIZ = 0;
        this.LIZIZ = map;
    }

    public final void LIZ(int i, long j) {
        this.LIZIZ.put(Integer.valueOf(i), Long.valueOf(j));
    }
}
