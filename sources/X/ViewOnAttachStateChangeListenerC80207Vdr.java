package X;

import android.view.View;

/* renamed from: X.Vdr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnAttachStateChangeListenerC80207Vdr implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        C16340kY.LIZJ(view);
    }
}
