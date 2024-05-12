package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: X.Njd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC60181Njd implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C60186Nji LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ Rect LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ View LJLJJL;

    public ViewTreeObserverOnGlobalLayoutListenerC60181Njd(C60186Nji c60186Nji, View view, Rect rect, int i, View view2) {
        this.LJLIL = c60186Nji;
        this.LJLILLLLZI = view;
        this.LJLJI = rect;
        this.LJLJJI = i;
        this.LJLJJL = view2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.LJLILLLLZI.getWindowVisibleDisplayFrame(this.LJLJI);
        C60186Nji c60186Nji = this.LJLIL;
        if (c60186Nji.LIZ == 0) {
            c60186Nji.LIZ = this.LJLJI.bottom;
        }
        int i = c60186Nji.LIZ;
        int i2 = this.LJLJI.bottom;
        if (i != i2 && this.LJLJJI == 1) {
            int max = Math.max(0, i - i2);
            ViewGroup.LayoutParams layoutParams = this.LJLJJL.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = max;
                this.LJLJJL.setLayoutParams(marginLayoutParams);
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        this.LJLIL.LIZ = this.LJLJI.bottom;
    }
}
