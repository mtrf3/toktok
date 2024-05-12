package Y;

import X.InterfaceC65784Pro;
import X.ViewTreeObserverOnDrawListenerC84362X9a;
import X.X9Z;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDCListenerS117S0200000_15 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                return;
            case 1:
                o.LJIIIZ(view, "v");
                return;
            case 2:
                onViewAttachedToWindow$2(this, view);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(view, "v");
                return;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                return;
            case 2:
                o.LJIIIZ(view, "v");
                return;
            default:
                return;
        }
    }

    public static final void onViewAttachedToWindow$0(IDCListenerS117S0200000_15 iDCListenerS117S0200000_15, View v) {
        o.LJIIIZ(v, "v");
        View view = (View) iDCListenerS117S0200000_15.l0;
        view.getViewTreeObserver().addOnDrawListener(new X9Z(view, (InterfaceC65784Pro) iDCListenerS117S0200000_15.l1));
        ((View) iDCListenerS117S0200000_15.l0).removeOnAttachStateChangeListener(iDCListenerS117S0200000_15);
    }

    public static final void onViewAttachedToWindow$2(IDCListenerS117S0200000_15 iDCListenerS117S0200000_15, View v) {
        o.LJIIIZ(v, "v");
        if (((View) iDCListenerS117S0200000_15.l0).getViewTreeObserver().isAlive()) {
            ((View) iDCListenerS117S0200000_15.l0).getViewTreeObserver().addOnDrawListener((ViewTreeObserverOnDrawListenerC84362X9a) iDCListenerS117S0200000_15.l1);
        }
        ((View) iDCListenerS117S0200000_15.l0).removeOnAttachStateChangeListener(iDCListenerS117S0200000_15);
    }

    public static final void onViewDetachedFromWindow$1(IDCListenerS117S0200000_15 iDCListenerS117S0200000_15, View v) {
        o.LJIIIZ(v, "v");
        ((View) iDCListenerS117S0200000_15.l0).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) iDCListenerS117S0200000_15.l1);
    }

    public IDCListenerS117S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
