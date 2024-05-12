package Y;

import X.C010002e;
import X.C02G;
import X.C16330kX;
import X.C39861hO;
import X.C45211q1;
import X.InterfaceC65784Pro;
import X.ViewOnKeyListenerC39831hL;
import X.ViewOnKeyListenerC39841hM;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDLListenerS188S0100000 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            case 4:
                onGlobalLayout$4(this);
                return;
            case 5:
                onGlobalLayout$5(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS188S0100000 iDLListenerS188S0100000) {
        if (((ViewOnKeyListenerC39831hL) iDLListenerS188S0100000.l0).isShowing() && ((ArrayList) ((ViewOnKeyListenerC39831hL) iDLListenerS188S0100000.l0).LJLJLLL).size() > 0 && !((C02G) ListProtector.get(((ViewOnKeyListenerC39831hL) iDLListenerS188S0100000.l0).LJLJLLL, 0)).LIZ.LLFF) {
            View view = ((ViewOnKeyListenerC39831hL) iDLListenerS188S0100000.l0).LJLLLLLL;
            if (view == null || !view.isShown()) {
                ((ViewOnKeyListenerC39831hL) iDLListenerS188S0100000.l0).dismiss();
                return;
            }
            Iterator it = ((ArrayList) ((ViewOnKeyListenerC39831hL) iDLListenerS188S0100000.l0).LJLJLLL).iterator();
            while (it.hasNext()) {
                ((C02G) it.next()).LIZ.show();
            }
        }
    }

    public static final void onGlobalLayout$1(IDLListenerS188S0100000 iDLListenerS188S0100000) {
        if (((ViewOnKeyListenerC39841hM) iDLListenerS188S0100000.l0).isShowing()) {
            ViewOnKeyListenerC39841hM viewOnKeyListenerC39841hM = (ViewOnKeyListenerC39841hM) iDLListenerS188S0100000.l0;
            if (!viewOnKeyListenerC39841hM.LJLJLLL.LLFF) {
                View view = viewOnKeyListenerC39841hM.LJLLL;
                if (view == null || !view.isShown()) {
                    ((ViewOnKeyListenerC39841hM) iDLListenerS188S0100000.l0).dismiss();
                } else {
                    ((ViewOnKeyListenerC39841hM) iDLListenerS188S0100000.l0).LJLJLLL.show();
                }
            }
        }
    }

    public static final void onGlobalLayout$2(IDLListenerS188S0100000 iDLListenerS188S0100000) {
        if (!((C010002e) iDLListenerS188S0100000.l0).getInternalPopup().isShowing()) {
            C010002e c010002e = (C010002e) iDLListenerS188S0100000.l0;
            c010002e.LJLJJLL.LIZIZ(c010002e.getTextDirection(), c010002e.getTextAlignment());
        }
        ViewTreeObserver viewTreeObserver = ((C010002e) iDLListenerS188S0100000.l0).getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS188S0100000);
        }
    }

    public static final void onGlobalLayout$3(IDLListenerS188S0100000 iDLListenerS188S0100000) {
        C39861hO c39861hO = (C39861hO) iDLListenerS188S0100000.l0;
        C010002e c010002e = c39861hO.LLIIIJ;
        c39861hO.getClass();
        if (C16330kX.LIZIZ(c010002e) && c010002e.getGlobalVisibleRect(c39861hO.LLIIII)) {
            ((C39861hO) iDLListenerS188S0100000.l0).LJIILLIIL();
            ((C39861hO) iDLListenerS188S0100000.l0).show();
        } else {
            ((C39861hO) iDLListenerS188S0100000.l0).dismiss();
        }
    }

    public static final void onGlobalLayout$4(IDLListenerS188S0100000 iDLListenerS188S0100000) {
        C45211q1 this$0 = (C45211q1) iDLListenerS188S0100000.l0;
        o.LJIIIZ(this$0, "this$0");
        this$0.LJJIJIIJI();
    }

    public static final void onGlobalLayout$5(IDLListenerS188S0100000 iDLListenerS188S0100000) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDLListenerS188S0100000.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public IDLListenerS188S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
