package X;

import android.view.ViewTreeObserver;

/* loaded from: classes6.dex */
public final class CDW implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ CDV LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        CDV cdv = this.LJLIL;
        C47121t6 c47121t6 = cdv.LJLJL;
        if (c47121t6 != null) {
            C68322mC<String> c68322mC = this.LJLILLLLZI;
            ViewTreeObserver viewTreeObserver = c47121t6.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            cdv.M(c47121t6, c68322mC.element);
        }
    }

    public CDW(CDV cdv, C68322mC<String> c68322mC) {
        this.LJLIL = cdv;
        this.LJLILLLLZI = c68322mC;
    }
}
