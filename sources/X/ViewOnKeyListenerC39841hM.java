package X;

import Y.IDCListenerS241S0100000;
import Y.IDLListenerS188S0100000;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1hM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC39841hM extends AbstractC37391dP implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context LJLILLLLZI;
    public final C281318n LJLJI;
    public final C02I LJLJJI;
    public final boolean LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final C39901hS LJLJLLL;
    public PopupWindow.OnDismissListener LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public C02N LJLLLL;
    public ViewTreeObserver LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public int LJZI;
    public boolean LL;
    public final IDLListenerS188S0100000 LJLL = new IDLListenerS188S0100000(this, 1);
    public final IDCListenerS241S0100000 LJLLI = new IDCListenerS241S0100000(this, 1);
    public int LJZL = 0;

    @Override // X.C02O
    public final Parcelable LIZIZ() {
        return null;
    }

    @Override // X.C02O
    public final boolean LJII() {
        return false;
    }

    @Override // X.C02O
    public final void LJIIJ(Parcelable parcelable) {
    }

    @Override // X.AbstractC37391dP
    public final void LJIIJJI(C281318n c281318n) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.LJLZ = true;
        this.LJLJI.LIZJ(true);
        ViewTreeObserver viewTreeObserver = this.LJLLLLLL;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.LJLLLLLL = this.LJLLL.getViewTreeObserver();
            }
            this.LJLLLLLL.removeGlobalOnLayoutListener(this.LJLL);
            this.LJLLLLLL = null;
        }
        this.LJLLL.removeOnAttachStateChangeListener(this.LJLLI);
        PopupWindow.OnDismissListener onDismissListener = this.LJLLILLLL;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // X.AnonymousClass112
    public final C03G LIZLLL() {
        return this.LJLJLLL.LJLJI;
    }

    @Override // X.AnonymousClass112
    public final boolean isShowing() {
        if (!this.LJLZ && this.LJLJLLL.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // X.AnonymousClass112
    public final void dismiss() {
        if (isShowing()) {
            this.LJLJLLL.dismiss();
        }
    }

    @Override // X.AnonymousClass112
    public final void show() {
        View view;
        boolean z;
        Rect rect;
        if (isShowing()) {
            return;
        }
        if (this.LJLZ || (view = this.LJLLJ) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.LJLLL = view;
        this.LJLJLLL.LLFFF.setOnDismissListener(this);
        C39901hS c39901hS = this.LJLJLLL;
        c39901hS.LJLLLLLL = this;
        c39901hS.LLFF = true;
        c39901hS.LLFFF.setFocusable(true);
        View view2 = this.LJLLL;
        if (this.LJLLLLLL == null) {
            z = true;
        } else {
            z = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.LJLLLLLL = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.LJLL);
        }
        view2.addOnAttachStateChangeListener(this.LJLLI);
        C39901hS c39901hS2 = this.LJLJLLL;
        c39901hS2.LJLLLL = view2;
        c39901hS2.LJLLILLLL = this.LJZL;
        if (!this.LJZ) {
            this.LJZI = AbstractC37391dP.LJIIL(this.LJLJJI, this.LJLILLLLZI, this.LJLJJLL);
            this.LJZ = true;
        }
        this.LJLJLLL.LJIILL(this.LJZI);
        this.LJLJLLL.LLFFF.setInputMethodMode(2);
        C39901hS c39901hS3 = this.LJLJLLL;
        Rect rect2 = this.LJLIL;
        if (rect2 != null) {
            c39901hS3.getClass();
            rect = new Rect(rect2);
        } else {
            rect = null;
        }
        c39901hS3.LLF = rect;
        this.LJLJLLL.show();
        C03G c03g = this.LJLJLLL.LJLJI;
        c03g.setOnKeyListener(this);
        if (this.LL && this.LJLJI.LJIIL != null) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLILLLLZI), R.layout.da, c03g, false);
            TextView textView = (TextView) LLLLIILL.findViewById(android.R.id.title);
            if (textView != null) {
                textView.setText(this.LJLJI.LJIIL);
            }
            LLLLIILL.setEnabled(false);
            c03g.addHeaderView(LLLLIILL, null, false);
        }
        this.LJLJLLL.LJIILIIL(this.LJLJJI);
        this.LJLJLLL.show();
    }

    @Override // X.C02O
    public final void LIZJ(boolean z) {
        this.LJZ = false;
        C02I c02i = this.LJLJJI;
        if (c02i != null) {
            c02i.notifyDataSetChanged();
        }
    }

    @Override // X.C02O
    public final boolean LJFF(SubMenuC39851hN subMenuC39851hN) {
        if (subMenuC39851hN.hasVisibleItems()) {
            C02M c02m = new C02M(this.LJLJL, this.LJLJLJ, this.LJLILLLLZI, this.LJLLL, subMenuC39851hN, this.LJLJJL);
            C02N c02n = this.LJLLLL;
            c02m.LJIIIIZZ = c02n;
            AbstractC37391dP abstractC37391dP = c02m.LJIIIZ;
            if (abstractC37391dP != null) {
                abstractC37391dP.LJIIIZ(c02n);
            }
            boolean LJIJJ = AbstractC37391dP.LJIJJ(subMenuC39851hN);
            c02m.LJII = LJIJJ;
            AbstractC37391dP abstractC37391dP2 = c02m.LJIIIZ;
            if (abstractC37391dP2 != null) {
                abstractC37391dP2.LJIILJJIL(LJIJJ);
            }
            c02m.LJIIJ = this.LJLLILLLL;
            this.LJLLILLLL = null;
            this.LJLJI.LIZJ(false);
            C39901hS c39901hS = this.LJLJLLL;
            int i = c39901hS.LJLJJLL;
            int LJIIIIZZ = c39901hS.LJIIIIZZ();
            if ((Gravity.getAbsoluteGravity(this.LJZL, C16310kV.LIZLLL(this.LJLLJ)) & 7) == 5) {
                i += this.LJLLJ.getWidth();
            }
            if (!c02m.LIZIZ()) {
                if (c02m.LJFF != null) {
                    c02m.LIZLLL(i, LJIIIIZZ, true, true);
                }
            }
            C02N c02n2 = this.LJLLLL;
            if (c02n2 != null) {
                c02n2.LIZIZ(subMenuC39851hN);
            }
            return true;
        }
        return false;
    }

    @Override // X.C02O
    public final void LJIIIZ(C02N c02n) {
        this.LJLLLL = c02n;
    }

    @Override // X.AbstractC37391dP
    public final void LJIILIIL(View view) {
        this.LJLLJ = view;
    }

    @Override // X.AbstractC37391dP
    public final void LJIILJJIL(boolean z) {
        this.LJLJJI.LJLJI = z;
    }

    @Override // X.AbstractC37391dP
    public final void LJIILL(int i) {
        this.LJZL = i;
    }

    @Override // X.AbstractC37391dP
    public final void LJIILLIIL(int i) {
        this.LJLJLLL.LJLJJLL = i;
    }

    @Override // X.AbstractC37391dP
    public final void LJIIZILJ(PopupWindow.OnDismissListener onDismissListener) {
        this.LJLLILLLL = onDismissListener;
    }

    @Override // X.AbstractC37391dP
    public final void LJIJ(boolean z) {
        this.LL = z;
    }

    @Override // X.AbstractC37391dP
    public final void LJIJI(int i) {
        this.LJLJLLL.LJI(i);
    }

    @Override // X.C02O
    public final void LIZ(C281318n c281318n, boolean z) {
        if (c281318n != this.LJLJI) {
            return;
        }
        dismiss();
        C02N c02n = this.LJLLLL;
        if (c02n != null) {
            c02n.LIZ(c281318n, z);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    public ViewOnKeyListenerC39841hM(int i, int i2, Context context, View view, C281318n c281318n, boolean z) {
        this.LJLILLLLZI = context;
        this.LJLJI = c281318n;
        this.LJLJJL = z;
        this.LJLJJI = new C02I(c281318n, C16880lQ.LLZIL(context), z, R.layout.db);
        this.LJLJL = i;
        this.LJLJLJ = i2;
        Resources resources = context.getResources();
        this.LJLJJLL = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.bw));
        this.LJLLJ = view;
        this.LJLJLLL = new C39901hS(context, i, i2);
        c281318n.LIZIZ(this, context);
    }
}
