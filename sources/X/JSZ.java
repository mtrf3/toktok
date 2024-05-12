package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JSZ implements View.OnLayoutChangeListener {
    public final /* synthetic */ JSX LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ InterfaceC49186JSc LJLJI;

    public JSZ(JSX jsx, int i, InterfaceC49186JSc interfaceC49186JSc) {
        this.LJLIL = jsx;
        this.LJLILLLLZI = i;
        this.LJLJI = interfaceC49186JSc;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.LJLIL.LJIIIZ(this.LJLILLLLZI, this.LJLJI);
    }
}
