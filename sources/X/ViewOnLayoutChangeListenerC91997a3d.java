package X;

import android.view.View;

/* renamed from: X.a3d, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class ViewOnLayoutChangeListenerC91997a3d implements View.OnLayoutChangeListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ InterfaceC35811ar<Integer> LJLILLLLZI;

    public ViewOnLayoutChangeListenerC91997a3d(View view, InterfaceC35811ar<Integer> interfaceC35811ar) {
        this.LJLIL = view;
        this.LJLILLLLZI = interfaceC35811ar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.LJLIL.removeOnLayoutChangeListener(this);
        this.LJLILLLLZI.setValue(Integer.valueOf(this.LJLIL.getWidth()));
    }
}
