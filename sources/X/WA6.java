package X;

/* loaded from: classes15.dex */
public final class WA6 implements InterfaceC81849WAj {
    public static final Class<?> LIZJ = WA8.class;
    public final int[] LIZ;
    public final WAE LIZIZ;

    public WA6(int[] iArr, WAE wae) {
        this.LIZ = iArr;
        this.LIZIZ = wae;
    }

    @Override // X.InterfaceC81849WAj
    public final void LIZ(WBK wbk, WAF waf, WAA waa, int i) {
        int i2 = 1;
        do {
            WAE wae = this.LIZIZ;
            int i3 = wae.LIZLLL + i2;
            int[] iArr = this.LIZ;
            int i4 = iArr[i3 % iArr.length];
            int frameCount = wae.LIZ.getFrameCount();
            Class<?> cls = LIZJ;
            if (i4 >= frameCount) {
                W58.LJFF(cls, "Preparing frame %d, last drawn: %d, but preparing frame is out of bounds", Integer.valueOf(i4), Integer.valueOf(i));
                return;
            }
            if (W58.LJIIJ(2)) {
                W58.LJIIL(cls, "Preparing frame %d, last drawn: %d", Integer.valueOf(i4), Integer.valueOf(i));
            }
            ((WA3) wbk).LIZ(waf, waa, i4);
            i2++;
        } while (i2 <= 3);
    }
}
