package X;

import android.view.ViewTreeObserver;

/* renamed from: X.T4u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewTreeObserverOnPreDrawListenerC74060T4u implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C74059T4t LJLIL;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.LJLIL.isShown()) {
            return true;
        }
        this.LJLIL.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = this.LJLIL.getHeight() / 2;
        C74059T4t c74059T4t = this.LJLIL;
        c74059T4t.setRadius((height - c74059T4t.LJLJJI.LJLJLJ) - c74059T4t.LJLLI);
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC74060T4u(C74059T4t c74059T4t) {
        this.LJLIL = c74059T4t;
    }
}
