package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Uu1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnAttachStateChangeListenerC78661Uu1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C78657Utx LJLIL;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    public ViewOnAttachStateChangeListenerC78661Uu1(C78657Utx c78657Utx) {
        this.LJLIL = c78657Utx;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        this.LJLIL.LJLL = true;
        v.removeOnAttachStateChangeListener(this);
    }
}
