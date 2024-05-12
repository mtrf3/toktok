package X;

/* renamed from: X.W8n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81801W8n implements InterfaceC81843WAd {
    public static final byte[] LIZIZ;
    public static final int LIZJ;
    public static final byte[] LIZLLL;
    public static final int LJ;
    public static final byte[] LJFF;
    public static final byte[] LJI;
    public static final byte[] LJII;
    public static final int LJIIIIZZ;
    public static final byte[] LJIIIZ;
    public static final int LJIIJ;
    public static final String[] LJIIJJI;
    public static final int LJIIL;
    public static final byte[] LJIILIIL;
    public static final byte[] LJIILJJIL;
    public final int LIZ = C1A7.LJJIIZ(21, 20, LIZJ, LJ, 6, LJIIIIZZ, LJIIJ, LJIIL);

    static {
        byte[] bArr = {-1, -40, -1};
        LIZIZ = bArr;
        LIZJ = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, XC5.LJFF, 10, 26, 10};
        LIZLLL = bArr2;
        LJ = bArr2.length;
        LJFF = C78977Uz7.LJJIII("GIF87a");
        LJI = C78977Uz7.LJJIII("GIF89a");
        byte[] LJJIII = C78977Uz7.LJJIII("BM");
        LJII = LJJIII;
        LJIIIIZZ = LJJIII.length;
        byte[] bArr3 = {0, 0, 1, 0};
        LJIIIZ = bArr3;
        LJIIJ = bArr3.length;
        String[] strArr = {"heic", "heix", "hevc", "hevx", "mif1", "msf1"};
        LJIIJJI = strArr;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ftyp");
        LIZ.append(strArr[0]);
        LJIIL = C78977Uz7.LJJIII(X1D.LIZIZ(LIZ)).length;
        LJIILIIL = new byte[]{73, 73, 42, 0};
        LJIILJJIL = new byte[]{77, 77, 0, 42};
    }

    @Override // X.InterfaceC81843WAd
    public final int getHeaderSize() {
        return this.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0077, code lost:
    
        if (r8 < 6) goto L41;
     */
    @Override // X.InterfaceC81843WAd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C81828W9o LIZ(int r8, byte[] r9) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81801W8n.LIZ(int, byte[]):X.W9o");
    }
}
