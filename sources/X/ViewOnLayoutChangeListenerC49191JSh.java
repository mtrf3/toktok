package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.JSh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnLayoutChangeListenerC49191JSh implements View.OnLayoutChangeListener {
    public final /* synthetic */ C49189JSf LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ InterfaceC49186JSc LJLJI;

    public ViewOnLayoutChangeListenerC49191JSh(C49189JSf c49189JSf, int i, InterfaceC49186JSc interfaceC49186JSc) {
        this.LJLIL = c49189JSf;
        this.LJLILLLLZI = i;
        this.LJLJI = interfaceC49186JSc;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(this);
        C49133JQb.LIZ("GHGCA", "play when layout finish");
        this.LJLIL.LJIIIZ(this.LJLILLLLZI, this.LJLJI);
    }
}
