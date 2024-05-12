package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.C0f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC30625C0f implements View.OnAttachStateChangeListener {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public InterfaceC60761Nsz LJLIL;

    public ViewOnAttachStateChangeListenerC30625C0f(InterfaceC60761Nsz interfaceC60761Nsz) {
        this.LJLIL = interfaceC60761Nsz;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLIL;
        if (interfaceC60761Nsz != null) {
            BPI.LIZ(interfaceC60761Nsz);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        View LIZJ;
        o.LJIIIZ(v, "v");
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLIL;
        if (interfaceC60761Nsz != null && (LIZJ = interfaceC60761Nsz.LIZJ()) != null) {
            LIZJ.removeOnAttachStateChangeListener(this);
        }
        this.LJLIL = null;
    }
}
