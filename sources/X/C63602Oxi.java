package X;

/* renamed from: X.Oxi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C63602Oxi extends AbstractC63581OxN {
    @Override // X.AbstractC63581OxN
    public String LJIIIIZZ() {
        return "ParallelRequestManager";
    }

    @Override // X.AbstractC63581OxN
    public String LJIIIZ() {
        return "IM-REQUEST-QUEUE-P";
    }

    @Override // X.AbstractC63581OxN
    public final void LJIIJJI(C63622Oy2 c63622Oy2) {
        if (this.LJLJJI.contains(c63622Oy2)) {
            LJIIZILJ(c63622Oy2);
        }
    }

    @Override // X.AbstractC63581OxN
    public final void LJIIL(C63622Oy2 c63622Oy2) {
        if (!this.LJLJJI.contains(c63622Oy2)) {
            this.LJLJJI.add(c63622Oy2);
        }
        LJIIZILJ(c63622Oy2);
    }

    @Override // X.AbstractC63581OxN
    public final void LJIILIIL(C63622Oy2 c63622Oy2) {
        super.LJIILIIL(c63622Oy2);
        if (this.LJLJJI.contains(c63622Oy2)) {
            LJIJI(103, c63622Oy2);
            LJIJI(105, c63622Oy2);
            this.LJLJJI.remove(c63622Oy2);
        }
    }
}
