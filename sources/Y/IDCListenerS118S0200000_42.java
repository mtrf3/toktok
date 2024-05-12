package Y;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes34.dex */
public class IDCListenerS118S0200000_42 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewAttachedToWindow$0(IDCListenerS118S0200000_42 iDCListenerS118S0200000_42, View view) {
    }

    public static final void onViewAttachedToWindow$1(IDCListenerS118S0200000_42 iDCListenerS118S0200000_42, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                return;
            case 1:
                onViewAttachedToWindow$1(this, view);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                return;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onViewDetachedFromWindow$0(IDCListenerS118S0200000_42 iDCListenerS118S0200000_42, View view) {
        ((View) iDCListenerS118S0200000_42.l0).getViewTreeObserver().removeOnGlobalFocusChangeListener((ViewTreeObserver.OnGlobalFocusChangeListener) iDCListenerS118S0200000_42.l1);
    }

    public static final void onViewDetachedFromWindow$1(IDCListenerS118S0200000_42 iDCListenerS118S0200000_42, View view) {
        ((View) iDCListenerS118S0200000_42.l0).removeCallbacks((Runnable) iDCListenerS118S0200000_42.l1);
        ((View) iDCListenerS118S0200000_42.l0).removeOnAttachStateChangeListener(iDCListenerS118S0200000_42);
    }

    public IDCListenerS118S0200000_42(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
