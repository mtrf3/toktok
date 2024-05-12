package Y;

import X.C139355dT;
import X.C139825eE;
import X.C140525fM;
import X.C6O9;
import X.C6OE;
import X.C82682Wcg;
import X.InterfaceC65784Pro;
import X.InterfaceC82683Wch;
import X.WHL;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDCListenerS147S0200000_2 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
            default:
                return;
        }
    }

    public IDCListenerS147S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLayoutChange$0(IDCListenerS147S0200000_2 iDCListenerS147S0200000_2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS147S0200000_2);
        ViewGroup.LayoutParams layoutParams = ((ViewGroup) iDCListenerS147S0200000_2.l0).getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            i9 = marginLayoutParams.topMargin;
        } else {
            i9 = 0;
        }
        ((RecyclerView) iDCListenerS147S0200000_2.l1).scrollBy(0, ((ViewGroup) iDCListenerS147S0200000_2.l0).getHeight() + i9);
        ViewGroup viewGroup = (ViewGroup) iDCListenerS147S0200000_2.l0;
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = -((ViewGroup) iDCListenerS147S0200000_2.l0).getHeight();
            viewGroup.setLayoutParams(marginLayoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void onLayoutChange$1(IDCListenerS147S0200000_2 iDCListenerS147S0200000_2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS147S0200000_2);
        try {
            ((C139355dT) iDCListenerS147S0200000_2.l0).LIZ.storeInt("edit_text_tux_bubble_1", 1);
            C6O9 c6o9 = (C6O9) iDCListenerS147S0200000_2.l1;
            Context context = c6o9.LIZIZ.getContext();
            o.LJIIIIZZ(context, "viewContainer.context");
            C139825eE c139825eE = new C139825eE(context);
            c139825eE.LIZ.LIZIZ = view;
            c139825eE.LJI(WHL.TOP);
            C82682Wcg c82682Wcg = c139825eE.LIZ;
            c82682Wcg.LJII = 3000L;
            c82682Wcg.LJIJJLI = false;
            c139825eE.LJIIJJI(R.string.s6b);
            c6o9.LJII = c139825eE.LIZJ();
            InterfaceC82683Wch interfaceC82683Wch = ((C6O9) iDCListenerS147S0200000_2.l1).LJII;
            if (interfaceC82683Wch != null) {
                interfaceC82683Wch.show();
            }
            C6OE c6oe = ((C6O9) iDCListenerS147S0200000_2.l1).LIZJ.LIZLLL;
            if (c6oe != null) {
                c6oe.LIZ();
            }
        } catch (Exception unused) {
        }
    }

    public static final void onLayoutChange$2(IDCListenerS147S0200000_2 iDCListenerS147S0200000_2, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(iDCListenerS147S0200000_2);
        ((C140525fM) iDCListenerS147S0200000_2.l0).LIZLLL();
        ((InterfaceC65784Pro) iDCListenerS147S0200000_2.l1).invoke();
    }
}
