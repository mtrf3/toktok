package X;

import Y.ARunnableS49S0100000_13;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.UGs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewTreeObserverOnWindowFocusChangeListenerC76918UGs implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ View LJLIL;

    public ViewTreeObserverOnWindowFocusChangeListenerC76918UGs(T5T t5t) {
        this.LJLIL = t5t;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            if (!this.LJLIL.isFocused()) {
                this.LJLIL.requestFocus();
            }
            View view = this.LJLIL;
            if (view.isFocused()) {
                view.post(new ARunnableS49S0100000_13(view, 152));
            }
            this.LJLIL.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }
}
