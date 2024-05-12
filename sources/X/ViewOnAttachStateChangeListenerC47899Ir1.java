package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Ir1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnAttachStateChangeListenerC47899Ir1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ String LJLIL;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    public ViewOnAttachStateChangeListenerC47899Ir1(String str) {
        this.LJLIL = str;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        C46321IFx.LIZ.remove(this.LJLIL);
    }
}
