package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Tiw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnLayoutChangeListenerC75426Tiw implements View.OnLayoutChangeListener {
    public final /* synthetic */ ViewGroup LJLIL;
    public final /* synthetic */ C75425Tiv LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    public ViewOnLayoutChangeListenerC75426Tiw(ViewGroup viewGroup, C75425Tiv c75425Tiv, View view) {
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = c75425Tiv;
        this.LJLJI = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        if (i8 <= 0 || i4 <= 0 || i2 - i4 == i6 - i8 || this.LJLIL == null) {
            return;
        }
        C75425Tiv c75425Tiv = this.LJLILLLLZI;
        if (c75425Tiv.LJJ == null || c75425Tiv.LJIJJLI == null || c75425Tiv.LJIL == null || this.LJLJI == null) {
            return;
        }
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        boolean z2 = true;
        if (i9 < i10) {
            z = true;
        } else {
            z = false;
        }
        if (i9 <= i10) {
            z2 = false;
        }
        c75425Tiv.LJIJJLI(z, z2, false);
    }
}
