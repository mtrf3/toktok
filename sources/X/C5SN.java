package X;

import Y.ACListenerS22S0100000_2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5SN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5SN implements InterfaceC70778RqA {
    public View LJLIL;
    public C1294256c LJLILLLLZI;
    public Integer LJLJI;

    @Override // X.InterfaceC70778RqA
    public final void LIZIZ() {
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        C16880lQ.LJLLL(this.LJLIL, (ViewGroup) parent);
    }

    @Override // X.InterfaceC70778RqA
    public final void LJFF(int i) {
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
        C1294256c c1294256c = this.LJLILLLLZI;
        if (c1294256c != null) {
            c1294256c.setRealSize(i);
        }
        if (i <= 1) {
            C1294256c c1294256c2 = this.LJLILLLLZI;
            if (c1294256c2 == null) {
                return;
            }
            c1294256c2.setVisibility(8);
            return;
        }
        C1294256c c1294256c3 = this.LJLILLLLZI;
        if (c1294256c3 == null) {
            return;
        }
        c1294256c3.setVisibility(0);
    }

    @Override // X.InterfaceC70778RqA
    public final void onPageSelected(int i) {
        C1294256c c1294256c;
        if (this.LJLIL != null && (c1294256c = this.LJLILLLLZI) != null) {
            c1294256c.LJJJIL(i);
        }
    }

    @Override // X.InterfaceC70778RqA
    public final void setAlpha(float f) {
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    @Override // X.InterfaceC70778RqA
    public final void LJI(FrameLayout parent, DialogC70776Rq8 dialog) {
        View findViewById;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(dialog, "dialog");
        C1294256c c1294256c = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.zs, C16880lQ.LLZIL(parent.getContext()), null);
        this.LJLIL = LLLZIIL;
        if (LLLZIIL != null && (findViewById = LLLZIIL.findViewById(R.id.i1x)) != null) {
            C16880lQ.LJIIJ(new ACListenerS22S0100000_2(dialog, 22), findViewById);
        }
        Integer num = this.LJLJI;
        if (num != null) {
            int intValue = num.intValue();
            View view = this.LJLIL;
            if (view != null) {
                view.setBackground(parent.getContext().getDrawable(intValue));
            }
        }
        View view2 = this.LJLIL;
        if (view2 != null) {
            c1294256c = (C1294256c) view2.findViewById(R.id.i30);
        }
        this.LJLILLLLZI = c1294256c;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        parent.addView(this.LJLIL, layoutParams);
        View view3 = this.LJLIL;
        if (view3 != null) {
            Context context = parent.getContext();
            o.LJIIIIZZ(context, "parent.context");
            view3.setPadding(0, C63081OpJ.LJJJJLI(context), 0, 0);
        }
    }
}
