package X;

import android.view.View;

/* renamed from: X.UJk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnLayoutChangeListenerC76988UJk implements View.OnLayoutChangeListener {
    public int LJLIL;
    public final /* synthetic */ C1O4 LJLILLLLZI;
    public final /* synthetic */ UJX LJLJI;

    public ViewOnLayoutChangeListenerC76988UJk(C1O4 c1o4, UJX ujx) {
        this.LJLILLLLZI = c1o4;
        this.LJLJI = ujx;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 != this.LJLIL) {
            this.LJLIL = i4;
            int height = this.LJLILLLLZI.getContainer().getHeight() - i4;
            UJX ujx = this.LJLJI;
            ujx.LLFFF = (height - ujx.LIZJ()) - this.LJLILLLLZI.LIZJ;
            UJX ujx2 = this.LJLJI;
            if (ujx2.LLFF) {
                UJX.LIZLLL(ujx2, false, false, 3);
            }
        }
    }
}
