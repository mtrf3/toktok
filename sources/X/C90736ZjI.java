package X;

import android.view.View;

/* renamed from: X.ZjI, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90736ZjI extends AbstractC90446Zec {
    public final View LIZIZ;

    @Override // X.AbstractC90446Zec
    public final void LJ() {
        this.LIZIZ.setEnabled(false);
        this.LIZ = null;
    }

    public C90736ZjI(View view) {
        this.LIZIZ = view;
        view.setEnabled(false);
    }

    @Override // X.AbstractC90446Zec
    public final void LIZLLL(C90613ZhJ c90613ZhJ) {
        super.LIZLLL(c90613ZhJ);
        this.LIZIZ.setEnabled(true);
    }
}
