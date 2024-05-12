package X;

import android.view.View;

/* renamed from: X.Zj2, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90720Zj2 extends AbstractC90446Zec implements InterfaceC90124ZYq {
    public final View LIZIZ;
    public final C90447Zed LIZJ;

    @Override // X.AbstractC90446Zec
    public final void LIZJ() {
        this.LIZIZ.setEnabled(false);
    }

    @Override // X.AbstractC90446Zec
    public final void LJ() {
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj != null) {
            c90639Zhj.LJIJ(this);
        }
        this.LIZIZ.setEnabled(false);
        this.LIZ = null;
        LJFF();
    }

    public final void LJFF() {
        C90639Zhj c90639Zhj = this.LIZ;
        boolean z = false;
        if (c90639Zhj == null || !c90639Zhj.LJIIIZ() || c90639Zhj.LJIILL()) {
            this.LIZIZ.setEnabled(false);
            return;
        }
        if (!c90639Zhj.LJIIJJI()) {
            this.LIZIZ.setEnabled(true);
            return;
        }
        View view = this.LIZIZ;
        if (c90639Zhj.LJJIFFI()) {
            C90447Zed c90447Zed = this.LIZJ;
            long LIZ = c90447Zed.LIZ() + c90447Zed.LJ();
            C90639Zhj c90639Zhj2 = c90447Zed.LIZ;
            if (c90639Zhj2 == null || !c90639Zhj2.LJIIIZ() || !c90447Zed.LIZ.LJJIFFI() || (c90447Zed.LIZJ() + c90447Zed.LJ()) - LIZ >= 10000) {
                z = true;
            }
        }
        view.setEnabled(z);
    }

    @Override // X.AbstractC90446Zec
    public final void LIZIZ() {
        LJFF();
    }

    @Override // X.AbstractC90446Zec
    public final void LIZLLL(C90613ZhJ c90613ZhJ) {
        super.LIZLLL(c90613ZhJ);
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj != null) {
            c90639Zhj.LIZIZ(this, 1000L);
        }
        LJFF();
    }

    public C90720Zj2(View view, C90447Zed c90447Zed) {
        this.LIZIZ = view;
        this.LIZJ = c90447Zed;
        view.setEnabled(false);
    }

    @Override // X.InterfaceC90124ZYq
    public final void LIZ(long j, long j2) {
        LJFF();
    }
}
