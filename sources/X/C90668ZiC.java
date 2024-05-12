package X;

import android.view.View;

/* renamed from: X.ZiC, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90668ZiC extends AbstractC90446Zec {
    public final View LIZIZ;
    public final int LIZJ = 8;

    public C90668ZiC(View view) {
        this.LIZIZ = view;
    }

    @Override // X.AbstractC90446Zec
    public final void LIZIZ() {
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj == null || !c90639Zhj.LJIIIZ()) {
            this.LIZIZ.setVisibility(this.LIZJ);
        } else {
            this.LIZIZ.setVisibility(0);
        }
    }

    @Override // X.AbstractC90446Zec
    public final void LJ() {
        this.LIZIZ.setVisibility(this.LIZJ);
        this.LIZ = null;
    }

    @Override // X.AbstractC90446Zec
    public final void LIZLLL(C90613ZhJ c90613ZhJ) {
        super.LIZLLL(c90613ZhJ);
        C90639Zhj c90639Zhj = this.LIZ;
        if (c90639Zhj == null || !c90639Zhj.LJIIIZ()) {
            this.LIZIZ.setVisibility(this.LIZJ);
        } else {
            this.LIZIZ.setVisibility(0);
        }
    }
}
