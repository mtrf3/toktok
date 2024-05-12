package X;

/* loaded from: classes12.dex */
public final class PHG implements PHP {
    public volatile boolean LJLIL;
    public final PHP LJLILLLLZI;

    public PHG() {
        if (PC5.LJJIIZ()) {
            this.LJLILLLLZI = new PHC();
        } else {
            this.LJLILLLLZI = new PHT();
        }
    }

    @Override // X.PHP
    public final synchronized void LIZIZ(PGK pgk) {
        this.LJLILLLLZI.LIZIZ(pgk);
    }

    @Override // X.PHP
    public final synchronized void LJJJJJ(String str) {
        this.LJLILLLLZI.LJJJJJ(str);
    }

    @Override // X.PHP
    public final void LIZ(boolean z, boolean z2) {
        if (this.LJLIL) {
            return;
        }
        this.LJLIL = true;
        this.LJLILLLLZI.LIZ(z, z2);
    }

    @Override // X.PHP
    public final synchronized void LJJJLIIL(String str, boolean z) {
        this.LJLILLLLZI.LJJJLIIL(str, z);
    }
}
