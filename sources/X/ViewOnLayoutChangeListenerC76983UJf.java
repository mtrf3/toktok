package X;

import android.view.View;

/* renamed from: X.UJf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnLayoutChangeListenerC76983UJf implements View.OnLayoutChangeListener {
    public int LJLIL;
    public final /* synthetic */ UJX LJLILLLLZI;

    public ViewOnLayoutChangeListenerC76983UJf(UJX ujx) {
        this.LJLILLLLZI = ujx;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 != this.LJLIL) {
            this.LJLIL = i4;
            int height = this.LJLILLLLZI.LJLIL.getContainer().getHeight() - i4;
            UJX ujx = this.LJLILLLLZI;
            int LIZJ = height - ujx.LIZJ();
            UJX ujx2 = this.LJLILLLLZI;
            ujx.LLFFF = LIZJ - ujx2.LJLIL.LIZLLL;
            if (ujx2.LLFF) {
                UJX.LIZLLL(ujx2, false, false, 1);
            }
        }
    }
}
