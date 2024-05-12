package X;

/* loaded from: classes15.dex */
public final class WA8 implements InterfaceC81849WAj {
    public static final Class<?> LIZIZ = WA8.class;
    public final int LIZ;

    public WA8() {
        this(3);
    }

    public WA8(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC81849WAj
    public final void LIZ(WBK wbk, WAF waf, WAA waa, int i) {
        for (int i2 = 1; i2 <= this.LIZ; i2++) {
            int frameCount = (i + i2) % waa.getFrameCount();
            if (W58.LJIIJ(2)) {
                W58.LJIIL(LIZIZ, "Preparing frame %d, last drawn: %d", Integer.valueOf(frameCount), Integer.valueOf(i));
            }
            ((WA3) wbk).LIZ(waf, waa, frameCount);
        }
    }
}
