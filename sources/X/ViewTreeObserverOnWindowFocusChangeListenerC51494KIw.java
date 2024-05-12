package X;

import Y.ARunnableS44S0100000_8;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.KIw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnWindowFocusChangeListenerC51494KIw implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ View LJLIL;

    public ViewTreeObserverOnWindowFocusChangeListenerC51494KIw(View view) {
        this.LJLIL = view;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            if (!this.LJLIL.isFocused()) {
                this.LJLIL.requestFocus();
            }
            View view = this.LJLIL;
            if (view.isFocused()) {
                view.post(new ARunnableS44S0100000_8(view, 114));
            }
            this.LJLIL.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }
}
