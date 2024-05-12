package X;

import android.widget.ProgressBar;

/* renamed from: X.Zjg, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90760Zjg extends AbstractC90446Zec implements InterfaceC90124ZYq {
    public final ProgressBar LIZIZ;
    public final long LIZJ = 1000;

    @Override // X.AbstractC90446Zec
    public final void LJ() {
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj != null) {
            c90639Zhj.LJIJ(this);
        }
        this.LIZ = null;
        LJFF();
    }

    public final void LJFF() {
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj == null || !c90639Zhj.LJIIIZ() || c90639Zhj.LJIIJJI()) {
            this.LIZIZ.setMax(1);
            this.LIZIZ.setProgress(0);
        } else {
            this.LIZIZ.setMax((int) c90639Zhj.LJIIIIZZ());
            this.LIZIZ.setProgress((int) c90639Zhj.LIZJ());
        }
    }

    @Override // X.AbstractC90446Zec
    public final void LIZIZ() {
        LJFF();
    }

    public C90760Zjg(ProgressBar progressBar) {
        this.LIZIZ = progressBar;
        LJFF();
    }

    @Override // X.AbstractC90446Zec
    public final void LIZLLL(C90613ZhJ c90613ZhJ) {
        super.LIZLLL(c90613ZhJ);
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj != null) {
            c90639Zhj.LIZIZ(this, this.LIZJ);
        }
        LJFF();
    }

    @Override // X.InterfaceC90124ZYq
    public final void LIZ(long j, long j2) {
        LJFF();
    }
}
