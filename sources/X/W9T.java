package X;

/* loaded from: classes15.dex */
public final class W9T implements InterfaceC81843WAd {
    public static final C81828W9o LIZ = new C81828W9o("DNG");
    public static final byte[] LIZIZ = {73, 73, 42, 0};
    public static final byte[] LIZJ = {77, 77, 0, 42};

    @Override // X.InterfaceC81843WAd
    public final int getHeaderSize() {
        return LIZIZ.length;
    }

    @Override // X.InterfaceC81843WAd
    public final C81828W9o LIZ(int i, byte[] bArr) {
        byte[] bArr2 = LIZIZ;
        if (i < bArr2.length) {
            return null;
        }
        if (!C78977Uz7.LJJLIIIJL(bArr, bArr2) && !C78977Uz7.LJJLIIIJL(bArr, LIZJ)) {
            return null;
        }
        return LIZ;
    }
}
