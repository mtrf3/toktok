package X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;

/* renamed from: X.NoI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC60470NoI implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C60466NoE LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C60466NoE LJLJI;

    public ViewTreeObserverOnGlobalLayoutListenerC60470NoI(C60466NoE c60466NoE, boolean z, C60466NoE c60466NoE2) {
        this.LJLIL = c60466NoE;
        this.LJLILLLLZI = z;
        this.LJLJI = c60466NoE2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        Rect rect = new Rect();
        this.LJLIL.getWindowVisibleDisplayFrame(rect);
        if (this.LJLILLLLZI) {
            i = 0;
        } else {
            i = this.LJLJI.LJLJLJ;
        }
        C60466NoE c60466NoE = this.LJLIL;
        int i2 = (rect.bottom - rect.top) + i;
        if (c60466NoE.getLayoutParams().height != i2) {
            c60466NoE.getLayoutParams().height = i2;
            c60466NoE.requestLayout();
        }
    }
}
