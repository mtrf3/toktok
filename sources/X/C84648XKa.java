package X;

/* renamed from: X.XKa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84648XKa {
    public static final boolean LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
    
        if (r2.equals("on") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r2.equals("") != false) goto L19;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r2 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L32
            if (r2 == 0) goto L32
            int r1 = r2.hashCode()
            if (r1 == 0) goto L2a
            r0 = 3551(0xddf, float:4.976E-42)
            if (r1 == r0) goto L21
            r0 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r0) goto L36
            java.lang.String r0 = "off"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L36
            r0 = 0
            goto L33
        L21:
            java.lang.String r0 = "on"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L36
            goto L32
        L2a:
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L36
        L32:
            r0 = 1
        L33:
            X.C84648XKa.LIZ = r0
            return
        L36:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r0)
            r1.append(r2)
            r0 = 39
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84648XKa.<clinit>():void");
    }

    public static final MBA LIZ(InterfaceC70422pa interfaceC70422pa, MBA mba) {
        MBA plus = interfaceC70422pa.getCoroutineContext().plus(mba);
        XIC xic = C78613UtF.LIZ;
        if (plus != xic && plus.get(C3CQ.LJJIJLIJ) == null) {
            return plus.plus(xic);
        }
        return plus;
    }

    public static final C84653XKf<?> LIZIZ(InterfaceC67352kd<?> interfaceC67352kd, MBA mba, Object obj) {
        C84653XKf<?> c84653XKf = null;
        if (!(interfaceC67352kd instanceof XLE) || mba.get(MB7.LJLIL) == null) {
            return null;
        }
        XLE xle = (XLE) interfaceC67352kd;
        while (true) {
            if ((xle instanceof C84651XKd) || (xle = xle.getCallerFrame()) == null) {
                break;
            }
            if (xle instanceof C84653XKf) {
                c84653XKf = (C84653XKf) xle;
                if (c84653XKf != null) {
                    c84653XKf.LJLJJI = mba;
                    c84653XKf.LJLJJL = obj;
                }
            }
        }
        return c84653XKf;
    }
}
