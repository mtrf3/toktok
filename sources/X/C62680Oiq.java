package X;

import Y.ACListenerS45S0200000_10;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o3.IDaS469S0100000_10;
import o3.h0;

/* renamed from: X.Oiq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62680Oiq implements InterfaceC62517OgD {
    public boolean LJLIL = true;
    public boolean LJLILLLLZI = true;

    @Override // X.InterfaceC62517OgD
    public final void LIZ(boolean z) {
        if (this.LJLIL != z) {
            this.LJLIL = z;
        }
    }

    @Override // X.InterfaceC62517OgD
    public final void LIZLLL(Dialog dialog) {
        o.LJIIIZ(dialog, "dialog");
        Context context = dialog.getContext();
        if (context != null && C012403c.LIZ(context) == 1) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.a8p);
                return;
            }
            return;
        }
        Window window2 = dialog.getWindow();
        if (window2 == null) {
            return;
        }
        window2.setWindowAnimations(R.style.a_e);
    }

    @Override // X.InterfaceC62517OgD
    public final void LJ(boolean z) {
        if (z && !this.LJLIL) {
            this.LJLIL = true;
        }
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC62517OgD
    public final View LIZJ(Dialog dialog, int i, View view, ViewGroup.LayoutParams layoutParams, C25600zU c25600zU) {
        ViewParent viewParent;
        o.LJIIIZ(dialog, "dialog");
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof View) {
            Object parent = view.getParent();
            if (parent != null) {
                if (((View) parent).getId() == R.id.bs8) {
                    View findViewById = view.getRootView().findViewById(R.id.fg4);
                    o.LJIIIIZZ(findViewById, "view.rootView.findViewById(R.id.layout)");
                    return findViewById;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
        }
        LayoutInflater layoutInflater = dialog.getLayoutInflater();
        o.LJIIIIZZ(layoutInflater, "dialog.layoutInflater");
        if (c25600zU != null) {
            layoutInflater = C16880lQ.LLZIL(c25600zU);
        }
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bmt, layoutInflater, null);
        View findViewById2 = LLLZIIL.findViewById(R.id.dmv);
        if (findViewById2 != null) {
            ViewGroup viewGroup = (ViewGroup) findViewById2;
            if (i != 0 && view == null) {
                view = C16880lQ.LLLLIILL(layoutInflater, i, viewGroup, false);
            }
            ViewGroup container = (ViewGroup) viewGroup.findViewById(R.id.bs8);
            o.LJIIIIZZ(container, "container");
            ViewGroup.LayoutParams layoutParams2 = container.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart(0);
                container.setLayoutParams(layoutParams2);
            }
            if (layoutParams != null) {
                container.addView(view, layoutParams);
            } else {
                container.addView(view);
            }
            C16880lQ.LJIIJ(new ACListenerS45S0200000_10(this, dialog, 20), viewGroup.findViewById(R.id.liz));
            h0.LJIJI(container, new IDaS469S0100000_10(this, 3));
            return LLLZIIL;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }
}
