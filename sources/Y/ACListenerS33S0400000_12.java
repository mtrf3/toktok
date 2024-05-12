package Y;

import X.C44100HSm;
import X.C70917RsP;
import X.C71102RvO;
import X.C78946Uyc;
import X.C7F9;
import X.InterfaceC88471Ynr;
import X.S1B;
import X.S1C;
import X.S1E;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.addon.USAddonOrderVH;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ACListenerS33S0400000_12 implements View.OnClickListener {
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
            case 2:
                onClick$2(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS33S0400000_12 aCListenerS33S0400000_12, View view) {
        int i;
        int i2;
        boolean isSelected = ((TuxIconView) aCListenerS33S0400000_12.l0).isSelected();
        ((TuxIconView) aCListenerS33S0400000_12.l0).setSelected(!isSelected);
        HorizontalScrollView horizontalScrollViewContainer = (HorizontalScrollView) aCListenerS33S0400000_12.l1;
        o.LJIIIIZZ(horizontalScrollViewContainer, "horizontalScrollViewContainer");
        if (!isSelected) {
            i = 0;
        } else {
            i = 8;
        }
        horizontalScrollViewContainer.setVisibility(i);
        TuxIconView tuxIconView = (TuxIconView) aCListenerS33S0400000_12.l0;
        if (!isSelected) {
            i2 = R.raw.icon_chevron_up;
        } else {
            i2 = R.raw.icon_chevron_down;
        }
        tuxIconView.setIconRes(i2);
        ConstraintLayout horizontalTitleContainer = (ConstraintLayout) aCListenerS33S0400000_12.l2;
        o.LJIIIIZZ(horizontalTitleContainer, "horizontalTitleContainer");
        C78946Uyc.LJJIIJ(horizontalTitleContainer, new C70917RsP(), C71102RvO.LJLIL);
        if (!isSelected) {
            ((USAddonOrderVH) aCListenerS33S0400000_12.l3).V();
        }
    }

    public static final void onClick$1(ACListenerS33S0400000_12 aCListenerS33S0400000_12, View view) {
        S1E s1e = (S1E) aCListenerS33S0400000_12.l0;
        C7F9 c7f9 = (C7F9) aCListenerS33S0400000_12.l1;
        s1e.LJI(C44100HSm.LIZIZ(c7f9, s1e, ((S1C) aCListenerS33S0400000_12.l2).LJIILL(c7f9)));
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aCListenerS33S0400000_12.l3;
        Boolean bool = Boolean.TRUE;
        interfaceC88471Ynr.invoke(bool, bool);
    }

    public static final void onClick$2(ACListenerS33S0400000_12 aCListenerS33S0400000_12, View view) {
        S1E s1e = (S1E) aCListenerS33S0400000_12.l0;
        C7F9 c7f9 = (C7F9) aCListenerS33S0400000_12.l1;
        s1e.LJI(C44100HSm.LIZ(s1e, c7f9, "click_list", ((S1B) aCListenerS33S0400000_12.l2).LJIILL(c7f9)));
        ((InterfaceC88471Ynr) aCListenerS33S0400000_12.l3).invoke(Boolean.TRUE, Boolean.FALSE);
    }

    public ACListenerS33S0400000_12(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
