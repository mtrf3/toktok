package X;

import android.view.View;

/* renamed from: X.Ver, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnLayoutChangeListenerC80269Ver implements View.OnLayoutChangeListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ C80267Vep LJLILLLLZI;

    public ViewOnLayoutChangeListenerC80269Ver(C80267Vep c80267Vep, View view) {
        this.LJLILLLLZI = c80267Vep;
        this.LJLIL = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.LJLIL.getVisibility() == 0) {
            this.LJLILLLLZI.tryUpdateBadgeDrawableBounds(this.LJLIL);
        }
    }
}
