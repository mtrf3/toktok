package X;

import Y.ARunnableS11S0101000_7;
import android.view.ViewTreeObserver;

/* renamed from: X.HwM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnWindowFocusChangeListenerC45682HwM implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ GSR LJLIL;

    public ViewTreeObserverOnWindowFocusChangeListenerC45682HwM(GSR gsr) {
        this.LJLIL = gsr;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.LJLIL.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        if (z) {
            GSR gsr = this.LJLIL;
            gsr.post(new ARunnableS11S0101000_7(2, gsr, 17));
        }
    }
}
