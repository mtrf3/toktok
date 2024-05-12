package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.So7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnAttachStateChangeListenerC73199So7 implements View.OnAttachStateChangeListener {
    public RecyclerView LJLIL;
    public final InterfaceC88472Yns<RecyclerView, C76800UCe> LJLILLLLZI = null;
    public final InterfaceC88472Yns<RecyclerView, C76800UCe> LJLJI = null;

    public ViewOnAttachStateChangeListenerC73199So7(int i) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIJ(v, "v");
        this.LJLIL = (RecyclerView) v;
        InterfaceC88472Yns<RecyclerView, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(v);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIJ(v, "v");
        this.LJLIL = null;
        InterfaceC88472Yns<RecyclerView, C76800UCe> interfaceC88472Yns = this.LJLJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(v);
        }
    }
}
