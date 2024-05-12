package Y;

import X.C49618Jde;
import X.C49710Jf8;
import X.InterfaceC65784Pro;
import X.ViewTreeObserverOnDrawListenerC48790JCw;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IDCListenerS115S0200000_8 implements View.OnAttachStateChangeListener {
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
                o.LJIIIZ(view, "v");
                return;
            default:
                return;
        }
    }

    public static final void onViewAttachedToWindow$0(IDCListenerS115S0200000_8 iDCListenerS115S0200000_8, View view) {
        ((View) iDCListenerS115S0200000_8.l0).removeOnAttachStateChangeListener(iDCListenerS115S0200000_8);
        View view2 = (View) iDCListenerS115S0200000_8.l0;
        C49710Jf8 c49710Jf8 = null;
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            while (true) {
                if (parent == null) {
                    break;
                }
                if (parent instanceof C49710Jf8) {
                    c49710Jf8 = (C49710Jf8) parent;
                    break;
                }
                parent = parent.getParent();
            }
        }
        C49618Jde.LIZIZ(c49710Jf8, (Runnable) iDCListenerS115S0200000_8.l1);
    }

    public static final void onViewAttachedToWindow$1(IDCListenerS115S0200000_8 iDCListenerS115S0200000_8, View v) {
        o.LJIIIZ(v, "v");
        View view = (View) iDCListenerS115S0200000_8.l0;
        view.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC48790JCw(view, (InterfaceC65784Pro) iDCListenerS115S0200000_8.l1));
        ((View) iDCListenerS115S0200000_8.l0).removeOnAttachStateChangeListener(iDCListenerS115S0200000_8);
    }

    public static final void onViewDetachedFromWindow$0(IDCListenerS115S0200000_8 iDCListenerS115S0200000_8, View view) {
        ((View) iDCListenerS115S0200000_8.l0).removeOnAttachStateChangeListener(iDCListenerS115S0200000_8);
    }

    public IDCListenerS115S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
