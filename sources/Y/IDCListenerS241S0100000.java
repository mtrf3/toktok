package Y;

import X.C04D;
import X.C19900qI;
import X.C19910qJ;
import X.C19920qK;
import X.C19940qM;
import X.C1A5;
import X.C2I5;
import X.InterfaceC79150V4o;
import X.OJ6;
import X.ViewOnKeyListenerC39831hL;
import X.ViewOnKeyListenerC39841hM;
import android.view.View;
import android.view.ViewTreeObserver;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDCListenerS241S0100000 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$0(IDCListenerS241S0100000 iDCListenerS241S0100000, View view) {
    }

    public static final void onViewAttachedToWindow$1(IDCListenerS241S0100000 iDCListenerS241S0100000, View view) {
    }

    public static final void onViewAttachedToWindow$5(IDCListenerS241S0100000 iDCListenerS241S0100000, View view) {
    }

    public static final void onViewAttachedToWindow$6(IDCListenerS241S0100000 iDCListenerS241S0100000, View view) {
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
            case 2:
                o.LJIIIZ(view, "v");
                return;
            case 3:
                o.LJIIIZ(view, "v");
                return;
            case 4:
                o.LJIIIZ(view, "view");
                return;
            case 5:
                onViewAttachedToWindow$5(this, view);
                return;
            case 6:
                onViewAttachedToWindow$6(this, view);
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
            case 2:
                onViewDetachedFromWindow$2(this, view);
                return;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                return;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                return;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                return;
            case 6:
                onViewDetachedFromWindow$6(this, view);
                return;
            default:
                return;
        }
    }

    public IDCListenerS241S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewDetachedFromWindow$0(IDCListenerS241S0100000 iDCListenerS241S0100000, View view) {
        ViewTreeObserver viewTreeObserver = ((ViewOnKeyListenerC39831hL) iDCListenerS241S0100000.l0).LLFFF;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                ((ViewOnKeyListenerC39831hL) iDCListenerS241S0100000.l0).LLFFF = view.getViewTreeObserver();
            }
            ViewOnKeyListenerC39831hL viewOnKeyListenerC39831hL = (ViewOnKeyListenerC39831hL) iDCListenerS241S0100000.l0;
            viewOnKeyListenerC39831hL.LLFFF.removeGlobalOnLayoutListener(viewOnKeyListenerC39831hL.LJLL);
        }
        view.removeOnAttachStateChangeListener(iDCListenerS241S0100000);
    }

    public static final void onViewDetachedFromWindow$1(IDCListenerS241S0100000 iDCListenerS241S0100000, View view) {
        ViewTreeObserver viewTreeObserver = ((ViewOnKeyListenerC39841hM) iDCListenerS241S0100000.l0).LJLLLLLL;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                ((ViewOnKeyListenerC39841hM) iDCListenerS241S0100000.l0).LJLLLLLL = view.getViewTreeObserver();
            }
            ViewOnKeyListenerC39841hM viewOnKeyListenerC39841hM = (ViewOnKeyListenerC39841hM) iDCListenerS241S0100000.l0;
            viewOnKeyListenerC39841hM.LJLLLLLL.removeGlobalOnLayoutListener(viewOnKeyListenerC39841hM.LJLL);
        }
        view.removeOnAttachStateChangeListener(iDCListenerS241S0100000);
    }

    public static final void onViewDetachedFromWindow$2(IDCListenerS241S0100000 iDCListenerS241S0100000, View v) {
        Boolean bool;
        o.LJIIIZ(v, "v");
        C04D c04d = (C04D) iDCListenerS241S0100000.l0;
        o.LJIIIZ(c04d, "<this>");
        for (Object obj : OJ6.LJJIZ(c04d.getParent(), C2I5.LJLIL)) {
            if (obj instanceof View) {
                View view = (View) obj;
                o.LJIIIZ(view, "<this>");
                Object tag = view.getTag(R.id.esw);
                if ((tag instanceof Boolean) && (bool = (Boolean) tag) != null && bool.booleanValue()) {
                    return;
                }
            }
        }
        ((C04D) iDCListenerS241S0100000.l0).LIZLLL();
    }

    public static final void onViewDetachedFromWindow$3(IDCListenerS241S0100000 iDCListenerS241S0100000, View v) {
        o.LJIIIZ(v, "v");
        v.removeOnAttachStateChangeListener(iDCListenerS241S0100000);
        ((InterfaceC79150V4o) iDCListenerS241S0100000.l0).LIZIZ(null);
    }

    public static final void onViewDetachedFromWindow$4(IDCListenerS241S0100000 iDCListenerS241S0100000, View view) {
        o.LJIIIZ(view, "view");
        C1A5 c1a5 = (C1A5) iDCListenerS241S0100000.l0;
        c1a5.LIZLLL.removeCallbacks(c1a5.LJIJI);
    }

    public static final void onViewDetachedFromWindow$5(IDCListenerS241S0100000 iDCListenerS241S0100000, View view) {
        C19940qM c19940qM = (C19940qM) iDCListenerS241S0100000.l0;
        C19910qJ c19910qJ = (C19910qJ) ((HashMap) c19940qM.LIZIZ).get(view);
        if (c19910qJ != null && !c19910qJ.LIZ.isEmpty()) {
            Iterator<C19920qK> it = c19910qJ.LIZ.iterator();
            while (it.hasNext()) {
                ((LinkedList) c19940qM.LIZ).remove(it.next());
            }
        }
        ((HashMap) c19940qM.LIZIZ).remove(view);
    }

    public static final void onViewDetachedFromWindow$6(IDCListenerS241S0100000 iDCListenerS241S0100000, View view) {
        C19900qI c19900qI = (C19900qI) iDCListenerS241S0100000.l0;
        c19900qI.LIZ = 2;
        c19900qI.dismiss();
    }
}
