package X;

import android.view.ViewTreeObserver;

/* renamed from: X.JEg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnPreDrawListenerC48826JEg implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnDrawListener {
    public final C48827JEh LJLIL;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.LJLIL.LIZ();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.LJLIL.LIZ();
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC48826JEg(boolean z) {
        this.LJLIL = new C48827JEh(z);
    }
}
