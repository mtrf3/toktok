package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.NlB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnAttachStateChangeListenerC60277NlB implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIJ(v, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIJ(v, "v");
        v.removeOnAttachStateChangeListener(this);
    }
}
