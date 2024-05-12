package X;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

/* renamed from: X.GtD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnPreDrawListenerC42939GtD implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ LinearLayout LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ C42938GtC LJLJI;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.LJLIL.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        float measuredWidth = this.LJLIL.getMeasuredWidth();
        float f = this.LJLILLLLZI;
        if (measuredWidth > f) {
            C42938GtC c42938GtC = this.LJLJI;
            LinearLayout linearLayout = this.LJLIL;
            Float valueOf = Float.valueOf(f);
            c42938GtC.getClass();
            C42938GtC.LJIIIZ(linearLayout, valueOf, -1);
            return false;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC42939GtD(LinearLayout linearLayout, float f, C42938GtC c42938GtC) {
        this.LJLIL = linearLayout;
        this.LJLILLLLZI = f;
        this.LJLJI = c42938GtC;
    }
}
