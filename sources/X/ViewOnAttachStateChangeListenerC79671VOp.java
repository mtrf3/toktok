package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.VOp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class ViewOnAttachStateChangeListenerC79671VOp implements View.OnAttachStateChangeListener {
    public final WeakReference<C79669VOn> LJLIL;
    public final String LJLILLLLZI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C79669VOn c79669VOn = this.LJLIL.get();
        if (c79669VOn != null) {
            c79669VOn.LJII(this.LJLILLLLZI);
        }
    }

    public ViewOnAttachStateChangeListenerC79671VOp(C79669VOn c79669VOn, String str) {
        this.LJLIL = new WeakReference<>(c79669VOn);
        this.LJLILLLLZI = str;
    }
}
