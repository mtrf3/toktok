package X;

import Y.ACListenerS45S0200000_10;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.Ojm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62738Ojm implements InterfaceC62517OgD {
    public BottomSheetBehavior<FrameLayout> LJLIL;
    public boolean LJLILLLLZI = true;
    public boolean LJLJI = true;
    public boolean LJLJJI;

    @Override // X.InterfaceC62517OgD
    public final void LIZLLL(Dialog dialog) {
        o.LJIIIZ(dialog, "dialog");
    }

    @Override // X.InterfaceC62517OgD
    public final void LIZ(boolean z) {
        if (this.LJLILLLLZI != z) {
            this.LJLILLLLZI = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.LJLIL;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
        }
    }

    @Override // X.InterfaceC62517OgD
    public final void LJ(boolean z) {
        if (z && !this.LJLILLLLZI) {
            this.LJLILLLLZI = true;
        }
        this.LJLJI = z;
        this.LJLJJI = true;
    }

    @Override // X.InterfaceC62517OgD
    public final View LIZJ(Dialog dialog, int i, View view, ViewGroup.LayoutParams layoutParams, C25600zU c25600zU) {
        o.LJIIIZ(dialog, "dialog");
        View inflate = View.inflate(c25600zU, R.layout.ak4, null);
        if (inflate != null) {
            View findViewById = inflate.findViewById(R.id.bv5);
            if (findViewById != null) {
                ViewGroup viewGroup = (ViewGroup) findViewById;
                if (i != 0 && view == null) {
                    view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c25600zU), i, viewGroup, false);
                }
                View findViewById2 = viewGroup.findViewById(R.id.c8m);
                if (findViewById2 != null) {
                    ViewGroup viewGroup2 = (ViewGroup) findViewById2;
                    BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from(viewGroup2);
                    this.LJLIL = from;
                    if (from != null) {
                        from.setBottomSheetCallback(new C62740Ojo(dialog));
                    }
                    BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.LJLIL;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.setHideable(this.LJLILLLLZI);
                    }
                    if (layoutParams == null) {
                        viewGroup2.addView(view);
                    } else {
                        viewGroup2.addView(view, layoutParams);
                    }
                    C16880lQ.LJIIJ(new ACListenerS45S0200000_10(this, dialog, 22), viewGroup.findViewById(R.id.liz));
                    h0.LJIJI(viewGroup2, new C62739Ojn(this, dialog));
                    viewGroup2.setOnTouchListener(ViewOnTouchListenerC62741Ojp.LJLIL);
                    return inflate;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }
}
