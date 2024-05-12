package X;

/* renamed from: X.PDh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64089PDh extends AbstractC64084PDc<InterfaceC64090PDi> {
    public static volatile C64089PDh LJLJLLL;
    public InterfaceC64091PDj LJLJLJ;

    public static C64089PDh LJIIJ() {
        if (LJLJLLL == null) {
            synchronized (C64089PDh.class) {
                if (LJLJLLL == null) {
                    LJLJLLL = new C64089PDh();
                }
            }
        }
        return LJLJLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC64084PDc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.InterfaceC64090PDi r12) {
        /*
            r11 = this;
            org.json.JSONObject r8 = r12.LIZ()
            r5 = r11
            X.PDX r0 = r5.LJLJJL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L1c
            boolean r0 = X.PDX.LIZ(r8)
            if (r0 == 0) goto L1c
            r1 = 1
        L12:
            r9 = 1
            if (r1 == 0) goto L2b
            X.PDX r0 = r5.LJLJJL
            if (r0 == 0) goto L2b
            if (r8 == 0) goto L2b
            goto L24
        L1c:
            r1 = 0
            boolean r0 = r12.LIZLLL(r8)
            if (r0 == 0) goto L2a
            goto L12
        L24:
            java.lang.String r0 = "single_point_only"
            r8.put(r0, r3)     // Catch: org.json.JSONException -> L2b
            goto L2b
        L2a:
            r9 = 0
        L2b:
            boolean r0 = X.C09970aH.LJII()
            if (r0 == 0) goto L78
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L74
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L74
            java.lang.String r0 = "logType: "
            r1.append(r0)     // Catch: java.lang.Exception -> L74
            java.lang.String r0 = r12.LJ()     // Catch: java.lang.Exception -> L74
            r1.append(r0)     // Catch: java.lang.Exception -> L74
            java.lang.String r0 = ", subType: "
            r1.append(r0)     // Catch: java.lang.Exception -> L74
            java.lang.String r0 = r12.LIZIZ()     // Catch: java.lang.Exception -> L74
            r1.append(r0)     // Catch: java.lang.Exception -> L74
            java.lang.String r0 = "data: "
            r1.append(r0)     // Catch: java.lang.Exception -> L74
            r1.append(r8)     // Catch: java.lang.Exception -> L74
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L74
            r2[r4] = r0     // Catch: java.lang.Exception -> L74
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L74
            java.lang.String r0 = " ,sample: "
            r1.append(r0)     // Catch: java.lang.Exception -> L74
            r1.append(r9)     // Catch: java.lang.Exception -> L74
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L74
            r2[r3] = r0     // Catch: java.lang.Exception -> L74
            X.E36.LIZ(r2)     // Catch: java.lang.Exception -> L74
            goto L78
        L74:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L78:
            if (r9 != 0) goto L81
            boolean r0 = r12.LIZJ()
            if (r0 != 0) goto L81
            return
        L81:
            java.lang.String r6 = r12.LJ()
            java.lang.String r7 = r12.LIZIZ()
            r10 = 0
            r5.LJIIIIZZ(r6, r7, r8, r9, r10)
            X.PDj r1 = r5.LJLJLJ
            if (r1 == 0) goto L9b
            r12.LJ()
            java.lang.String r0 = r12.LIZIZ()
            r1.LIZ(r0, r8)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64089PDh.LJFF(X.PDi):void");
    }
}
