package X;

import Y.IDLListenerS190S0100000_2;
import android.graphics.PointF;
import android.view.ViewTreeObserver;

/* renamed from: X.67r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1553167r implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C67Z LJLJI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.LJLJI.LJIIL.getViewTreeObserver().removeOnGlobalLayoutListener(new IDLListenerS190S0100000_2(this, 5));
        PointF LJII = this.LJLJI.LJIIL.LJII(this.LJLIL, this.LJLILLLLZI);
        C67Z c67z = this.LJLJI;
        c67z.LJ = LJII.x;
        c67z.LJFF = LJII.y;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1553167r(C67Z c67z, int i, int i2) {
        this.LJLJI = c67z;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
