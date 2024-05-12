package X;

import android.view.ViewTreeObserver;

/* renamed from: X.VtC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC81158VtC implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C81156VtA LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.LJLIL.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.LJLIL.getMeasuredWidth() < this.LJLIL.getPaint().measureText(this.LJLILLLLZI)) {
            this.LJLIL.LIZIZ();
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC81158VtC(C81156VtA c81156VtA, String str) {
        this.LJLIL = c81156VtA;
        this.LJLILLLLZI = str;
    }
}
