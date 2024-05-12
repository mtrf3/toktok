package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.ARd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC26229ARd implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.LJLIL.getVisibility() != 0) {
            AX9.LIZIZ.remove(Integer.valueOf(this.LJLILLLLZI));
            this.LJLIL.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC26229ARd(View view, int i) {
        this.LJLIL = view;
        this.LJLILLLLZI = i;
    }
}
