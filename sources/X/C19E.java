package X;

import Y.IDCListenerS83S0200000;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import o3.h0;

/* renamed from: X.19E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C19E implements AnonymousClass039 {
    public final C011902x LIZ;
    public int LIZIZ;
    public C013503n LIZJ;
    public View LIZLLL;
    public Drawable LJ;
    public Drawable LJFF;
    public Drawable LJI;
    public boolean LJII;
    public CharSequence LJIIIIZZ;
    public CharSequence LJIIIZ;
    public CharSequence LJIIJ;
    public Window.Callback LJIIJJI;
    public boolean LJIIL;
    public ActionMenuPresenter LJIILIIL;
    public int LJIILJJIL;
    public Drawable LJIILL;

    @Override // X.AnonymousClass039
    public final void LJI() {
        this.LJIIL = true;
    }

    @Override // X.AnonymousClass039
    public final void LJIIIIZZ() {
    }

    @Override // X.AnonymousClass039
    public final void LJIIIZ() {
    }

    @Override // X.AnonymousClass039
    public final void LJIILLIIL() {
    }

    @Override // X.AnonymousClass039
    public final void LJIIZILJ() {
    }

    @Override // X.AnonymousClass039
    public final boolean LIZ() {
        ActionMenuPresenter actionMenuPresenter;
        AnonymousClass191 anonymousClass191 = this.LIZ.LJLIL;
        if (anonymousClass191 == null || (actionMenuPresenter = anonymousClass191.LJZL) == null || !actionMenuPresenter.LJIIJJI()) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass039
    public final boolean LIZIZ() {
        ActionMenuPresenter actionMenuPresenter;
        AnonymousClass191 anonymousClass191 = this.LIZ.LJLIL;
        if (anonymousClass191 == null || (actionMenuPresenter = anonymousClass191.LJZL) == null) {
            return false;
        }
        if (actionMenuPresenter.LLD == null && !actionMenuPresenter.LJIIL()) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass039
    public final boolean LIZJ() {
        AnonymousClass191 anonymousClass191;
        C011902x c011902x = this.LIZ;
        if (c011902x.getVisibility() == 0 && (anonymousClass191 = c011902x.LJLIL) != null && anonymousClass191.LJZI) {
            return true;
        }
        return false;
    }

    @Override // X.AnonymousClass039
    public final boolean LJ() {
        ActionMenuPresenter actionMenuPresenter;
        AnonymousClass191 anonymousClass191 = this.LIZ.LJLIL;
        if (anonymousClass191 == null || (actionMenuPresenter = anonymousClass191.LJZL) == null || !actionMenuPresenter.LJIILIIL()) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass039
    public final boolean LJFF() {
        ActionMenuPresenter actionMenuPresenter;
        AnonymousClass191 anonymousClass191 = this.LIZ.LJLIL;
        if (anonymousClass191 == null || (actionMenuPresenter = anonymousClass191.LJZL) == null || !actionMenuPresenter.LJIIL()) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass039
    public final void LJIIJJI() {
        ActionMenuPresenter actionMenuPresenter;
        AnonymousClass191 anonymousClass191 = this.LIZ.LJLIL;
        if (anonymousClass191 != null && (actionMenuPresenter = anonymousClass191.LJZL) != null) {
            actionMenuPresenter.LJIIJJI();
            C281818s c281818s = actionMenuPresenter.LL;
            if (c281818s != null && c281818s.LIZIZ()) {
                c281818s.LJIIIZ.dismiss();
            }
        }
    }

    @Override // X.AnonymousClass039
    public final void LJIIL() {
        C013503n c013503n = this.LIZJ;
        if (c013503n != null) {
            ViewParent parent = c013503n.getParent();
            C011902x c011902x = this.LIZ;
            if (parent == c011902x) {
                C16880lQ.LJZL(c011902x, this.LIZJ);
            }
        }
        this.LIZJ = null;
    }

    @Override // X.AnonymousClass039
    public final boolean LJIILL() {
        AnonymousClass198 anonymousClass198 = this.LIZ.LLIILII;
        if (anonymousClass198 != null && anonymousClass198.LJLILLLLZI != null) {
            return true;
        }
        return false;
    }

    public final void LJIJI() {
        if ((this.LIZIZ & 4) != 0) {
            if (TextUtils.isEmpty(this.LJIIJ)) {
                this.LIZ.setNavigationContentDescription(this.LJIILJJIL);
            } else {
                this.LIZ.setNavigationContentDescription(this.LJIIJ);
            }
        }
    }

    public final void LJIJJ() {
        Drawable drawable;
        int i = this.LIZIZ;
        if ((i & 2) != 0) {
            if ((i & 1) != 0) {
                drawable = this.LJFF;
                if (drawable == null) {
                    drawable = this.LJ;
                }
            } else {
                drawable = this.LJ;
            }
        } else {
            drawable = null;
        }
        this.LIZ.setLogo(drawable);
    }

    @Override // X.AnonymousClass039
    public final void collapseActionView() {
        C281618q c281618q;
        AnonymousClass198 anonymousClass198 = this.LIZ.LLIILII;
        if (anonymousClass198 == null || (c281618q = anonymousClass198.LJLILLLLZI) == null) {
            return;
        }
        c281618q.collapseActionView();
    }

    @Override // X.AnonymousClass039
    public final Context getContext() {
        return this.LIZ.getContext();
    }

    @Override // X.AnonymousClass039
    public final CharSequence getTitle() {
        return this.LIZ.getTitle();
    }

    @Override // X.AnonymousClass039
    public final int LJIILIIL() {
        return this.LIZIZ;
    }

    @Override // X.AnonymousClass039
    public final void LJII(int i) {
        View view;
        int i2 = this.LIZIZ ^ i;
        this.LIZIZ = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    LJIJI();
                }
                if ((this.LIZIZ & 4) != 0) {
                    C011902x c011902x = this.LIZ;
                    Drawable drawable = this.LJI;
                    if (drawable == null) {
                        drawable = this.LJIILL;
                    }
                    c011902x.setNavigationIcon(drawable);
                } else {
                    this.LIZ.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                LJIJJ();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.LIZ.setTitle(this.LJIIIIZZ);
                    this.LIZ.setSubtitle(this.LJIIIZ);
                } else {
                    this.LIZ.setTitle((CharSequence) null);
                    this.LIZ.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.LIZLLL) != null) {
                if ((i & 16) != 0) {
                    this.LIZ.addView(view);
                } else {
                    C16880lQ.LJZL(this.LIZ, view);
                }
            }
        }
    }

    @Override // X.AnonymousClass039
    public final void LJIIJ(boolean z) {
        this.LIZ.setCollapsible(z);
    }

    @Override // X.AnonymousClass039
    public final void LJIJ(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C20110qd.LIZ(getContext(), i);
        } else {
            drawable = null;
        }
        this.LJFF = drawable;
        LJIJJ();
    }

    @Override // X.AnonymousClass039
    public final void setIcon(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C20110qd.LIZ(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    @Override // X.AnonymousClass039
    public final void setVisibility(int i) {
        this.LIZ.setVisibility(i);
    }

    @Override // X.AnonymousClass039
    public final void setWindowCallback(Window.Callback callback) {
        this.LJIIJJI = callback;
    }

    @Override // X.AnonymousClass039
    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.LJII) {
            this.LJIIIIZZ = charSequence;
            if ((this.LIZIZ & 8) != 0) {
                this.LIZ.setTitle(charSequence);
                if (this.LJII) {
                    h0.LJIJJLI(this.LIZ.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // X.AnonymousClass039
    public final void setIcon(Drawable drawable) {
        this.LJ = drawable;
        LJIJJ();
    }

    public C19E(C011902x c011902x, boolean z) {
        boolean z2;
        Drawable drawable;
        this.LIZ = c011902x;
        this.LJIIIIZZ = c011902x.getTitle();
        this.LJIIIZ = c011902x.getSubtitle();
        if (this.LJIIIIZZ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJII = z2;
        this.LJI = c011902x.getNavigationIcon();
        AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(c011902x.getContext(), null, new int[]{R.attr.x8, R.attr.xi, R.attr.xj, R.attr.a70, R.attr.a71, R.attr.a72, R.attr.a73, R.attr.a74, R.attr.a75, R.attr.a8z, R.attr.a_9, R.attr.a_b, R.attr.ab6, R.attr.afg, R.attr.afo, R.attr.ag1, R.attr.ag2, R.attr.ag7, R.attr.ahg, R.attr.aj3, R.attr.ay3, R.attr.b1u, R.attr.b52, R.attr.b5w, R.attr.b5x, R.attr.bfi, R.attr.bfl, R.attr.bje, R.attr.bjt}, R.attr.u3, 0);
        int i = 15;
        this.LJIILL = LJIILIIL.LJ(15);
        if (z) {
            CharSequence LJIIJ = LJIILIIL.LJIIJ(27);
            if (!TextUtils.isEmpty(LJIIJ)) {
                this.LJII = true;
                this.LJIIIIZZ = LJIIJ;
                if ((this.LIZIZ & 8) != 0) {
                    c011902x.setTitle(LJIIJ);
                    if (this.LJII) {
                        h0.LJIJJLI(c011902x.getRootView(), LJIIJ);
                    }
                }
            }
            CharSequence LJIIJ2 = LJIILIIL.LJIIJ(25);
            if (!TextUtils.isEmpty(LJIIJ2)) {
                this.LJIIIZ = LJIIJ2;
                if ((this.LIZIZ & 8) != 0) {
                    c011902x.setSubtitle(LJIIJ2);
                }
            }
            Drawable LJ = LJIILIIL.LJ(20);
            if (LJ != null) {
                this.LJFF = LJ;
                LJIJJ();
            }
            Drawable LJ2 = LJIILIIL.LJ(17);
            if (LJ2 != null) {
                setIcon(LJ2);
            }
            if (this.LJI == null && (drawable = this.LJIILL) != null) {
                this.LJI = drawable;
                if ((this.LIZIZ & 4) != 0) {
                    c011902x.setNavigationIcon(drawable);
                } else {
                    c011902x.setNavigationIcon((Drawable) null);
                }
            }
            LJII(LJIILIIL.LJII(10, 0));
            int LJIIIIZZ = LJIILIIL.LJIIIIZZ(9, 0);
            if (LJIIIIZZ != 0) {
                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c011902x.getContext()), LJIIIIZZ, c011902x, false);
                View view = this.LIZLLL;
                if (view != null && (this.LIZIZ & 16) != 0) {
                    C16880lQ.LJZL(c011902x, view);
                }
                this.LIZLLL = LLLLIILL;
                if (LLLLIILL != null && (this.LIZIZ & 16) != 0) {
                    c011902x.addView(LLLLIILL);
                }
                LJII(this.LIZIZ | 16);
            }
            int layoutDimension = LJIILIIL.LIZIZ.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = c011902x.getLayoutParams();
                layoutParams.height = layoutDimension;
                c011902x.setLayoutParams(layoutParams);
            }
            int LIZJ = LJIILIIL.LIZJ(7, -1);
            int LIZJ2 = LJIILIIL.LIZJ(3, -1);
            if (LIZJ >= 0 || LIZJ2 >= 0) {
                int max = Math.max(LIZJ, 0);
                int max2 = Math.max(LIZJ2, 0);
                if (c011902x.LJZL == null) {
                    c011902x.LJZL = new C013203k();
                }
                c011902x.LJZL.LIZ(max, max2);
            }
            int LJIIIIZZ2 = LJIILIIL.LJIIIIZZ(28, 0);
            if (LJIIIIZZ2 != 0) {
                Context context = c011902x.getContext();
                c011902x.LJLLILLLL = LJIIIIZZ2;
                AppCompatTextView appCompatTextView = c011902x.LJLILLLLZI;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, LJIIIIZZ2);
                }
            }
            int LJIIIIZZ3 = LJIILIIL.LJIIIIZZ(26, 0);
            if (LJIIIIZZ3 != 0) {
                Context context2 = c011902x.getContext();
                c011902x.LJLLJ = LJIIIIZZ3;
                AppCompatTextView appCompatTextView2 = c011902x.LJLJI;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, LJIIIIZZ3);
                }
            }
            int LJIIIIZZ4 = LJIILIIL.LJIIIIZZ(22, 0);
            if (LJIIIIZZ4 != 0) {
                c011902x.setPopupTheme(LJIIIIZZ4);
            }
        } else {
            if (c011902x.getNavigationIcon() != null) {
                this.LJIILL = c011902x.getNavigationIcon();
            } else {
                i = 11;
            }
            this.LIZIZ = i;
        }
        LJIILIIL.LJIILJJIL();
        if (R.string.a6p != this.LJIILJJIL) {
            this.LJIILJJIL = R.string.a6p;
            if (TextUtils.isEmpty(c011902x.getNavigationContentDescription())) {
                int i2 = this.LJIILJJIL;
                this.LJIIJ = i2 != 0 ? getContext().getString(i2) : null;
                LJIJI();
            }
        }
        this.LJIIJ = c011902x.getNavigationContentDescription();
        c011902x.setNavigationOnClickListener(new IDCListenerS83S0200000(this, 0));
    }

    @Override // X.AnonymousClass039
    public final void LIZLLL(C281318n c281318n, C18M c18m) {
        if (this.LJIILIIL == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.LIZ.getContext());
            this.LJIILIIL = actionMenuPresenter;
            actionMenuPresenter.LJLJLLL = R.id.oh;
        }
        ActionMenuPresenter actionMenuPresenter2 = this.LJIILIIL;
        actionMenuPresenter2.LJLJJL = c18m;
        C011902x c011902x = this.LIZ;
        if (c281318n == null && c011902x.LJLIL == null) {
            return;
        }
        c011902x.LJ();
        C281318n c281318n2 = c011902x.LJLIL.LJLLLLLL;
        if (c281318n2 == c281318n) {
            return;
        }
        if (c281318n2 != null) {
            c281318n2.LJIIZILJ(c011902x.LLIIL);
            c281318n2.LJIIZILJ(c011902x.LLIILII);
        }
        if (c011902x.LLIILII == null) {
            c011902x.LLIILII = new AnonymousClass198(c011902x);
        }
        actionMenuPresenter2.LJZ = true;
        if (c281318n != null) {
            c281318n.LIZIZ(actionMenuPresenter2, c011902x.LJLL);
            c281318n.LIZIZ(c011902x.LLIILII, c011902x.LJLL);
        } else {
            actionMenuPresenter2.LJIIIIZZ(c011902x.LJLL, null);
            c011902x.LLIILII.LJIIIIZZ(c011902x.LJLL, null);
            actionMenuPresenter2.LIZJ(true);
            c011902x.LLIILII.LIZJ(true);
        }
        c011902x.LJLIL.setPopupTheme(c011902x.LJLLI);
        c011902x.LJLIL.setPresenter(actionMenuPresenter2);
        c011902x.LLIIL = actionMenuPresenter2;
    }

    @Override // X.AnonymousClass039
    public final C16650l3 LJIILJJIL(final int i, long j) {
        float f;
        C16650l3 LIZ = h0.LIZ(this.LIZ);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        LIZ.LIZ(f);
        LIZ.LIZJ(j);
        LIZ.LIZLLL(new C31309CQn() { // from class: X.1hR
            public boolean LJLILLLLZI;

            @Override // X.InterfaceC16660l4
            public final void LIZ() {
                if (!this.LJLILLLLZI) {
                    C19E.this.LIZ.setVisibility(i);
                }
            }

            @Override // X.C31309CQn, X.InterfaceC16660l4
            public final void LJIIJ() {
                C19E.this.LIZ.setVisibility(0);
            }

            @Override // X.C31309CQn, X.InterfaceC16660l4
            public final void LJIIIIZZ(View view) {
                this.LJLILLLLZI = true;
            }
        });
        return LIZ;
    }
}
