package X;

import android.view.ViewTreeObserver;

/* renamed from: X.ZoZ, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC91063ZoZ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C91542ZwI LJLIL;
    public final /* synthetic */ AbstractC91339Zt1 LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        this.LJLIL.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        AbstractC91339Zt1 abstractC91339Zt1 = this.LJLILLLLZI;
        AbstractC91590Zx4 playerController = abstractC91339Zt1.getPlayerController();
        long j = 0;
        if (playerController != null) {
            C91330Zss c91330Zss = playerController.LJLILLLLZI.LJLJI.LJLILLLLZI;
            if (c91330Zss.LJII()) {
                C91061ZoX LJIIL = c91330Zss.LJIIL();
                if (LJIIL.LIZIZ) {
                    j = LJIIL.LIZIZ().LJIJ();
                }
            }
        }
        Integer LIZIZ = abstractC91339Zt1.LIZIZ(j);
        if (LIZIZ != null) {
            i = LIZIZ.intValue();
        } else {
            i = 0;
        }
        abstractC91339Zt1.LJII(i);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC91063ZoZ(C91542ZwI c91542ZwI, C91489ZvR c91489ZvR) {
        this.LJLIL = c91542ZwI;
        this.LJLILLLLZI = c91489ZvR;
    }
}
