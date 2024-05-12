package Y;

import X.C157116Ep;
import X.C34K;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACListenerS26S0400000_2 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS26S0400000_2 aCListenerS26S0400000_2, View view) {
        C34K c34k = (C34K) aCListenerS26S0400000_2.l0;
        if (c34k.element) {
            c34k.element = false;
            LinearLayout detailsView = (LinearLayout) aCListenerS26S0400000_2.l1;
            o.LJIIIIZZ(detailsView, "detailsView");
            C157116Ep.LIZ(detailsView, false);
            TuxIconView tuxIconView = (TuxIconView) aCListenerS26S0400000_2.l2;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_chevron_down);
            }
        } else {
            c34k.element = true;
            ((LinearLayout) aCListenerS26S0400000_2.l1).setVisibility(0);
            LinearLayout detailsView2 = (LinearLayout) aCListenerS26S0400000_2.l1;
            o.LJIIIIZZ(detailsView2, "detailsView");
            C157116Ep.LIZ(detailsView2, true);
            TuxIconView tuxIconView2 = (TuxIconView) aCListenerS26S0400000_2.l2;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_chevron_up);
            }
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aCListenerS26S0400000_2.l3;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(2);
        }
    }

    public static final void onClick$1(ACListenerS26S0400000_2 aCListenerS26S0400000_2, View view) {
        C34K c34k = (C34K) aCListenerS26S0400000_2.l0;
        if (c34k.element) {
            c34k.element = false;
            LinearLayout detailsView = (LinearLayout) aCListenerS26S0400000_2.l1;
            o.LJIIIIZZ(detailsView, "detailsView");
            C157116Ep.LIZ(detailsView, false);
            TuxIconView tuxIconView = (TuxIconView) aCListenerS26S0400000_2.l2;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_chevron_down);
            }
        } else {
            c34k.element = true;
            ((LinearLayout) aCListenerS26S0400000_2.l1).setVisibility(0);
            LinearLayout detailsView2 = (LinearLayout) aCListenerS26S0400000_2.l1;
            o.LJIIIIZZ(detailsView2, "detailsView");
            C157116Ep.LIZ(detailsView2, true);
            TuxIconView tuxIconView2 = (TuxIconView) aCListenerS26S0400000_2.l2;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_chevron_up);
            }
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aCListenerS26S0400000_2.l3;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS26S0400000_2(C34K c34k, C34K c34k2, LinearLayout linearLayout, TuxIconView tuxIconView, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.$t = interfaceC88472Yns;
        this.l0 = c34k;
        this.l1 = c34k2;
        this.l2 = linearLayout;
        this.l3 = tuxIconView;
    }
}
