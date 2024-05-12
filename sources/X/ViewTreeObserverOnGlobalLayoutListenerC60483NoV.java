package X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;

/* renamed from: X.NoV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC60483NoV implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C60484NoW LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C60484NoW LJLJI;

    public ViewTreeObserverOnGlobalLayoutListenerC60483NoV(C60484NoW c60484NoW, boolean z, C60484NoW c60484NoW2) {
        this.LJLIL = c60484NoW;
        this.LJLILLLLZI = z;
        this.LJLJI = c60484NoW2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        Rect rect = new Rect();
        this.LJLIL.getWindowVisibleDisplayFrame(rect);
        if (this.LJLILLLLZI) {
            i = 0;
        } else {
            i = this.LJLJI.LJLL;
        }
        C60484NoW c60484NoW = this.LJLIL;
        int i2 = (rect.bottom - rect.top) + i;
        if (c60484NoW.getLayoutParams().height != i2) {
            c60484NoW.getLayoutParams().height = i2;
            c60484NoW.requestLayout();
        }
    }
}
