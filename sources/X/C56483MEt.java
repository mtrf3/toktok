package X;

/* renamed from: X.MEt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56483MEt {
    public static C176956x1 LIZ;
    public static String LIZIZ = "";
    public static int LIZJ = 2;
    public static int LIZLLL = 2;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0013, code lost:
    
        if (r0 == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ() {
        /*
            int r0 = X.C56483MEt.LIZJ
            r1 = 1
            if (r0 != 0) goto Lb
            int r0 = X.C56483MEt.LIZLLL
            if (r0 != r1) goto L15
            r0 = 3
        La:
            return r0
        Lb:
            if (r0 != r1) goto L13
            int r0 = X.C56483MEt.LIZLLL
            if (r0 != 0) goto L1b
            r0 = 4
            goto La
        L13:
            if (r0 != 0) goto L1b
        L15:
            int r0 = X.C56483MEt.LIZLLL
            if (r0 != 0) goto L1b
            r0 = 5
            goto La
        L1b:
            r0 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56483MEt.LIZIZ():int");
    }

    public static void LIZJ(boolean z, boolean z2) {
        C176956x1 c176956x1;
        if (z2) {
            LIZJ = z ? 1 : 0;
        } else {
            LIZLLL = z ? 1 : 0;
        }
        if (LIZJ != 2 && LIZLLL != 2 && (c176956x1 = LIZ) != null) {
            c176956x1.LIZIZ(LIZIZ());
        }
    }

    public static void LIZ(C173376rF c173376rF, String str, boolean z, String str2) {
        LIZIZ = str2;
        LIZ = new C176956x1(new C176946x0(System.currentTimeMillis(), true, z, 443), str, c173376rF);
    }
}
