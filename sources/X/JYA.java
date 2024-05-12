package X;

import android.view.ViewTreeObserver;

/* loaded from: classes9.dex */
public final class JYA implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ JY9 LJLIL;
    public final /* synthetic */ C68322mC<JYC> LJLILLLLZI;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.JYC, T] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        JY9 jy9 = this.LJLIL;
        jy9.LJLILLLLZI.LIZIZ.getLocationOnScreen(jy9.LJLJJI);
        if (this.LJLIL.LJLILLLLZI.LIZIZ.getHeight() != 0) {
            C68322mC<JYC> c68322mC = this.LJLILLLLZI;
            JY9 jy92 = this.LJLIL;
            int i = jy92.LJLJJI[1];
            c68322mC.element = new JYC(i, jy92.LJLILLLLZI.LIZIZ.getHeight() + i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("container vertical change: ");
            LIZ.append(this.LJLILLLLZI.element);
            C49133JQb.LIZ("SCIP", X1D.LIZIZ(LIZ));
            this.LJLIL.LJLILLLLZI.LIZIZ.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            JY9 jy93 = this.LJLIL;
            jy93.LIZ(jy93.LJLILLLLZI.LIZ, 0, this.LJLILLLLZI.element);
        }
    }

    public JYA(JY9 jy9, C68322mC<JYC> c68322mC) {
        this.LJLIL = jy9;
        this.LJLILLLLZI = c68322mC;
    }
}
