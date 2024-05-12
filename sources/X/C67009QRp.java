package X;

/* renamed from: X.QRp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67009QRp extends AbstractC67010QRq<InterfaceC67017QRx> implements InterfaceC67017QRx {
    public final int LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public InterfaceC67012QRs LJFF;
    public final String LJI;
    public final C78880UxY LJII;

    @Override // X.InterfaceC67017QRx
    public final boolean LIZLLL() {
        if (!this.LJ) {
            this.LIZLLL = this.LJII.LJJLI(this.LJFF, this.LIZIZ);
            this.LJ = true;
        }
        return this.LIZLLL;
    }

    @Override // X.AbstractC67010QRq
    public final C67009QRp LJ() {
        if (!C38354F3m.LJ(this.LIZJ)) {
            try {
                Object newInstance = Class.forName(this.LIZJ).newInstance();
                if (newInstance instanceof InterfaceC67012QRs) {
                    this.LJFF = (InterfaceC67012QRs) newInstance;
                }
            } catch (Throwable unused) {
            }
        }
        return this;
    }

    @Override // X.InterfaceC67017QRx
    public final String LIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC67017QRx
    public final InterfaceC67012QRs LIZIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC67017QRx
    public final String LIZJ() {
        return this.LIZJ;
    }

    public C67009QRp(int i, String str, String str2, C78880UxY c78880UxY) {
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LJI = str2;
        this.LJII = c78880UxY;
    }
}
