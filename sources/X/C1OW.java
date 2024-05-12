package X;

/* renamed from: X.1OW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1OW extends AbstractC09110Xj {
    public static final int[] LJIIIZ;
    public final int[] LJFF = new int[4];
    public final int[] LJI = new int[4];
    public final int[] LJII = new int[16];
    public static final C1OV LJIIJ = new C09120Xk() { // from class: X.1OV
        {
            C50601yi c50601yi = C50601yi.LJLIL;
        }
    };
    public static final int[] LJIIIIZZ = {7, 12, 17, 22, 5, 9, 14, 20, 4, 11, 16, 23, 6, 10, 15, 21};

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1OV] */
    static {
        int[] iArr = new int[64];
        int i = 0;
        do {
            iArr[i] = (int) (Math.abs(Math.sin(i + 1.0d)) * 4294967296L);
            i++;
        } while (i < 64);
        LJIIIZ = iArr;
    }

    @Override // X.AbstractC09110Xj
    public final void LIZJ() {
        int[] iArr = this.LJFF;
        iArr[0] = 1732584193;
        iArr[1] = (int) 4023233417L;
        iArr[2] = (int) 2562383102L;
        iArr[3] = 271733878;
    }

    public C1OW() {
        LIZJ();
    }

    @Override // X.AbstractC09110Xj
    public final void LIZ(byte[] bArr) {
        int i = 0;
        do {
            bArr[i] = (byte) (this.LJFF[i / 4] >>> ((i % 4) * 8));
            i++;
        } while (i < 16);
    }

    @Override // X.AbstractC09110Xj
    public final byte[] LIZIZ(long j) {
        long j2 = 8;
        int i = this.LIZLLL;
        long j3 = ((j + j2) / i) + 1;
        long j4 = j2 * j;
        int i2 = (int) ((j3 * i) - j);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        bArr[0] = (byte) 128;
        do {
            bArr[(i2 - 8) + i3] = (byte) (j4 >>> (i3 * 8));
            i3++;
        } while (i3 < 8);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r8 != 1) goto L18;
     */
    @Override // X.AbstractC09110Xj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(byte[] r15) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1OW.LIZLLL(byte[]):void");
    }
}
