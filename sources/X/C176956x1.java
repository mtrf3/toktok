package X;

/* renamed from: X.6x1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176956x1 {
    public static final /* synthetic */ int LIZLLL = 0;
    public C176946x0 LIZ;
    public final String LIZIZ;
    public final InterfaceC176976x3 LIZJ;

    public final void LIZIZ(int i) {
        C176946x0 c176946x0 = this.LIZ;
        if (c176946x0 != null) {
            c176946x0.LJ = System.currentTimeMillis();
        }
        this.LIZJ.LJ(i);
        this.LIZ = null;
    }

    public final void LIZ(int i, boolean z) {
        C176946x0 c176946x0 = this.LIZ;
        if (c176946x0 != null) {
            c176946x0.LJFF = System.currentTimeMillis();
        }
        if (!z) {
            C176946x0 c176946x02 = this.LIZ;
            if (c176946x02 != null) {
                long j = c176946x02.LJ;
                long j2 = c176946x02.LIZLLL;
                if (1 <= j2 && j2 < j && j - j2 >= 0 && c176946x02 != null) {
                    long j3 = c176946x02.LIZLLL;
                    long j4 = c176946x02.LIZJ;
                    if (1 <= j4 && j4 < j3 && j3 - j4 >= 0 && c176946x02 != null) {
                        long j5 = c176946x02.LJFF;
                        long j6 = c176946x02.LJ;
                        if (1 > j6 || j6 >= j5 || j5 - j6 < 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.LIZJ.LJ(i);
        this.LIZ = null;
    }

    public C176956x1(C176946x0 c176946x0, String str, InterfaceC176976x3 interfaceC176976x3) {
        this.LIZ = c176946x0;
        this.LIZIZ = str;
        this.LIZJ = interfaceC176976x3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176956x1.LIZJ(int, java.lang.String, boolean):void");
    }
}
