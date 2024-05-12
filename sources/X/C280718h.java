package X;

import Y.IDUListenerS170S0200000;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import o3.h0;

/* renamed from: X.18h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C280718h extends AnonymousClass021 implements C02S {
    public static final Interpolator LJJII = new AccelerateInterpolator();
    public static final Interpolator LJJIII = new DecelerateInterpolator();
    public Context LIZ;
    public Context LIZIZ;
    public C45161pw LIZJ;
    public C02R LIZLLL;
    public AnonymousClass039 LJ;
    public C281718r LJFF;
    public final View LJI;
    public boolean LJII;
    public C280618g LJIIIIZZ;
    public C280618g LJIIIZ;
    public InterfaceC25570zR LJIIJ;
    public boolean LJIIJJI;
    public final ArrayList<InterfaceC009501z> LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public C25660za LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public final C39801hI LJJ;
    public final C39811hJ LJJI;
    public final C280518f LJJIFFI;

    @Override // X.AnonymousClass021
    public final boolean LIZIZ() {
        AnonymousClass039 anonymousClass039 = this.LJ;
        if (anonymousClass039 != null && anonymousClass039.LJIILL()) {
            this.LJ.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // X.AnonymousClass021
    public final int LIZLLL() {
        return this.LJ.LJIILIIL();
    }

    @Override // X.AnonymousClass021
    public final Context LJ() {
        if (this.LIZIZ == null) {
            TypedValue typedValue = new TypedValue();
            this.LIZ.getTheme().resolveAttribute(R.attr.u8, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.LIZIZ = new ContextThemeWrapper(this.LIZ, i);
            } else {
                this.LIZIZ = this.LIZ;
            }
        }
        return this.LIZIZ;
    }

    @Override // X.AnonymousClass021
    public final void LJFF() {
        if (!this.LJIILLIIL) {
            this.LJIILLIIL = true;
            LJIJJLI(false);
        }
    }

    @Override // X.AnonymousClass021
    public final void LJII() {
        LJIJJ(this.LIZ.getResources().getBoolean(R.bool.b));
    }

    @Override // X.AnonymousClass021
    public final void LJIILJJIL() {
        this.LJ.LJII(this.LJ.LJIILIIL() & (-9));
    }

    public C280718h(Dialog dialog) {
        new ArrayList();
        this.LJIIL = new ArrayList<>();
        this.LJIILJJIL = 0;
        this.LJIILL = true;
        this.LJIJI = true;
        this.LJJ = new C39801hI(this);
        this.LJJI = new C39811hJ(this);
        this.LJJIFFI = new C280518f(this);
        LJIJI(dialog.getWindow().getDecorView());
    }

    @Override // X.AnonymousClass021
    public final void LIZJ(boolean z) {
        if (z == this.LJIIJJI) {
            return;
        }
        this.LJIIJJI = z;
        int size = this.LJIIL.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC009501z) ListProtector.get(this.LJIIL, i)).LIZ();
        }
    }

    @Override // X.AnonymousClass021
    public final void LJIIL(boolean z) {
        if (!this.LJII) {
            LJIILIIL(z);
        }
    }

    @Override // X.AnonymousClass021
    public final void LJIILIIL(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        int LJIILIIL = this.LJ.LJIILIIL();
        this.LJII = true;
        this.LJ.LJII((i & 4) | ((-5) & LJIILIIL));
    }

    @Override // X.AnonymousClass021
    public final void LJIILL(boolean z) {
        C25660za c25660za;
        this.LJIJJLI = z;
        if (!z && (c25660za = this.LJIJJ) != null) {
            c25660za.LIZ();
        }
    }

    @Override // X.AnonymousClass021
    public final void LJIILLIIL(CharSequence charSequence) {
        this.LJ.setWindowTitle(charSequence);
    }

    @Override // X.AnonymousClass021
    public final AbstractC25580zS LJIIZILJ(C18N c18n) {
        C280618g c280618g = this.LJIIIIZZ;
        if (c280618g != null) {
            c280618g.LIZJ();
        }
        this.LIZJ.setHideOnContentScrollEnabled(false);
        this.LJFF.LJII();
        C280618g c280618g2 = new C280618g(this, this.LJFF.getContext(), c18n);
        c280618g2.LJLJJI.LJJI();
        try {
            if (c280618g2.LJLJJL.LIZ(c280618g2, c280618g2.LJLJJI)) {
                this.LJIIIIZZ = c280618g2;
                c280618g2.LJIIIIZZ();
                this.LJFF.LJFF(c280618g2);
                LJIJ(true);
                return c280618g2;
            }
            return null;
        } finally {
            c280618g2.LJLJJI.LJJ();
        }
    }

    public final void LJIJ(boolean z) {
        C16650l3 LJIILJJIL;
        C16650l3 LJ;
        long j;
        if (z) {
            if (!this.LJIJ) {
                this.LJIJ = true;
                C45161pw c45161pw = this.LIZJ;
                if (c45161pw != null) {
                    c45161pw.setShowingForActionMode(true);
                }
                LJIJJLI(false);
            }
        } else if (this.LJIJ) {
            this.LJIJ = false;
            C45161pw c45161pw2 = this.LIZJ;
            if (c45161pw2 != null) {
                c45161pw2.setShowingForActionMode(false);
            }
            LJIJJLI(false);
        }
        if (C16330kX.LIZJ(this.LIZLLL)) {
            if (z) {
                LJ = this.LJ.LJIILJJIL(4, 100L);
                LJIILJJIL = this.LJFF.LJ(0, 200L);
            } else {
                LJIILJJIL = this.LJ.LJIILJJIL(0, 200L);
                LJ = this.LJFF.LJ(8, 100L);
            }
            C25660za c25660za = new C25660za();
            c25660za.LIZ.add(LJ);
            View view = LJ.LIZ.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = LJIILJJIL.LIZ.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            c25660za.LIZ.add(LJIILJJIL);
            c25660za.LIZIZ();
            return;
        }
        if (z) {
            this.LJ.setVisibility(4);
            this.LJFF.setVisibility(0);
        } else {
            this.LJ.setVisibility(0);
            this.LJFF.setVisibility(8);
        }
    }

    public final void LJIJI(View view) {
        String str;
        AnonymousClass039 wrapper;
        C45161pw c45161pw = (C45161pw) view.findViewById(R.id.c4j);
        this.LIZJ = c45161pw;
        if (c45161pw != null) {
            c45161pw.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(R.id.nk);
        if (findViewById instanceof AnonymousClass039) {
            wrapper = (AnonymousClass039) findViewById;
        } else if (findViewById instanceof C011902x) {
            wrapper = ((C011902x) findViewById).getWrapper();
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Can't make a decor toolbar out of ");
            if (findViewById != null) {
                str = C16880lQ.LJLLJ(findViewById.getClass());
            } else {
                str = "null";
            }
            LIZ.append(str);
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        this.LJ = wrapper;
        this.LJFF = (C281718r) view.findViewById(R.id.o6);
        C02R c02r = (C02R) view.findViewById(R.id.nn);
        this.LIZLLL = c02r;
        AnonymousClass039 anonymousClass039 = this.LJ;
        if (anonymousClass039 != null && this.LJFF != null && c02r != null) {
            this.LIZ = anonymousClass039.getContext();
            if ((this.LJ.LJIILIIL() & 4) != 0) {
                this.LJII = true;
            }
            Context context = this.LIZ;
            int i = context.getApplicationInfo().targetSdkVersion;
            this.LJ.LJIILLIIL();
            LJIJJ(context.getResources().getBoolean(R.bool.b));
            TypedArray obtainStyledAttributes = this.LIZ.obtainStyledAttributes(null, new int[]{R.attr.x8, R.attr.xi, R.attr.xj, R.attr.a70, R.attr.a71, R.attr.a72, R.attr.a73, R.attr.a74, R.attr.a75, R.attr.a8z, R.attr.a_9, R.attr.a_b, R.attr.ab6, R.attr.afg, R.attr.afo, R.attr.ag1, R.attr.ag2, R.attr.ag7, R.attr.ahg, R.attr.aj3, R.attr.ay3, R.attr.b1u, R.attr.b52, R.attr.b5w, R.attr.b5x, R.attr.bfi, R.attr.bfl, R.attr.bje, R.attr.bjt}, R.attr.u3, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                C45161pw c45161pw2 = this.LIZJ;
                if (c45161pw2.LJLJLJ) {
                    this.LJIL = true;
                    c45161pw2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                C16360ka.LJIJ(this.LIZLLL, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(C16880lQ.LJLLJ(C280718h.class).concat(" can only be used with a compatible window decor layout"));
    }

    public final void LJIJJ(boolean z) {
        this.LJIILIIL = z;
        if (!z) {
            this.LJ.LJIIL();
            this.LIZLLL.setTabContainer(null);
        } else {
            this.LIZLLL.setTabContainer(null);
            this.LJ.LJIIL();
        }
        this.LJ.LJIIIIZZ();
        this.LJ.LJIIJ(false);
        this.LIZJ.setHasNonEmbeddedTabs(false);
    }

    public final void LJIJJLI(boolean z) {
        boolean z2;
        View view;
        View view2;
        View view3;
        boolean z3 = this.LJIILLIIL;
        boolean z4 = this.LJIIZILJ;
        if (this.LJIJ || (!z3 && !z4)) {
            z2 = true;
        } else {
            z2 = false;
        }
        IDUListenerS170S0200000 iDUListenerS170S0200000 = null;
        if (z2) {
            if (!this.LJIJI) {
                this.LJIJI = true;
                C25660za c25660za = this.LJIJJ;
                if (c25660za != null) {
                    c25660za.LIZ();
                }
                this.LIZLLL.setVisibility(0);
                if (this.LJIILJJIL == 0 && (this.LJIJJLI || z)) {
                    this.LIZLLL.setTranslationY(0.0f);
                    float f = -this.LIZLLL.getHeight();
                    if (z) {
                        this.LIZLLL.getLocationInWindow(new int[]{0, 0});
                        f -= r1[1];
                    }
                    this.LIZLLL.setTranslationY(f);
                    C25660za c25660za2 = new C25660za();
                    C16650l3 LIZ = h0.LIZ(this.LIZLLL);
                    LIZ.LJFF(0.0f);
                    C280518f c280518f = this.LJJIFFI;
                    View view4 = LIZ.LIZ.get();
                    if (view4 != null) {
                        if (c280518f != null) {
                            iDUListenerS170S0200000 = new IDUListenerS170S0200000(c280518f, view4, 0);
                        }
                        C16640l2.LIZ(view4.animate(), iDUListenerS170S0200000);
                    }
                    if (!c25660za2.LJ) {
                        c25660za2.LIZ.add(LIZ);
                    }
                    if (this.LJIILL && (view3 = this.LJI) != null) {
                        view3.setTranslationY(f);
                        C16650l3 LIZ2 = h0.LIZ(this.LJI);
                        LIZ2.LJFF(0.0f);
                        if (!c25660za2.LJ) {
                            c25660za2.LIZ.add(LIZ2);
                        }
                    }
                    Interpolator interpolator = LJJIII;
                    boolean z5 = c25660za2.LJ;
                    if (!z5) {
                        c25660za2.LIZJ = interpolator;
                        c25660za2.LIZIZ = 250L;
                    }
                    C39811hJ c39811hJ = this.LJJI;
                    if (!z5) {
                        c25660za2.LIZLLL = c39811hJ;
                    }
                    this.LJIJJ = c25660za2;
                    c25660za2.LIZIZ();
                } else {
                    this.LIZLLL.setAlpha(1.0f);
                    this.LIZLLL.setTranslationY(0.0f);
                    if (this.LJIILL && (view2 = this.LJI) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.LJJI.LIZ();
                }
                C45161pw c45161pw = this.LIZJ;
                if (c45161pw != null) {
                    C16340kY.LIZJ(c45161pw);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.LJIJI) {
            return;
        }
        this.LJIJI = false;
        C25660za c25660za3 = this.LJIJJ;
        if (c25660za3 != null) {
            c25660za3.LIZ();
        }
        if (this.LJIILJJIL == 0 && (this.LJIJJLI || z)) {
            this.LIZLLL.setAlpha(1.0f);
            this.LIZLLL.setTransitioning(true);
            C25660za c25660za4 = new C25660za();
            float f2 = -this.LIZLLL.getHeight();
            if (z) {
                this.LIZLLL.getLocationInWindow(new int[]{0, 0});
                f2 -= r1[1];
            }
            C16650l3 LIZ3 = h0.LIZ(this.LIZLLL);
            LIZ3.LJFF(f2);
            C280518f c280518f2 = this.LJJIFFI;
            View view5 = LIZ3.LIZ.get();
            if (view5 != null) {
                if (c280518f2 != null) {
                    iDUListenerS170S0200000 = new IDUListenerS170S0200000(c280518f2, view5, 0);
                }
                C16640l2.LIZ(view5.animate(), iDUListenerS170S0200000);
            }
            if (!c25660za4.LJ) {
                c25660za4.LIZ.add(LIZ3);
            }
            if (this.LJIILL && (view = this.LJI) != null) {
                C16650l3 LIZ4 = h0.LIZ(view);
                LIZ4.LJFF(f2);
                if (!c25660za4.LJ) {
                    c25660za4.LIZ.add(LIZ4);
                }
            }
            Interpolator interpolator2 = LJJII;
            boolean z6 = c25660za4.LJ;
            if (!z6) {
                c25660za4.LIZJ = interpolator2;
                c25660za4.LIZIZ = 250L;
            }
            C39801hI c39801hI = this.LJJ;
            if (!z6) {
                c25660za4.LIZLLL = c39801hI;
            }
            this.LJIJJ = c25660za4;
            c25660za4.LIZIZ();
            return;
        }
        this.LJJ.LIZ();
    }

    public C280718h(Activity activity, boolean z) {
        new ArrayList();
        this.LJIIL = new ArrayList<>();
        this.LJIILJJIL = 0;
        this.LJIILL = true;
        this.LJIJI = true;
        this.LJJ = new C39801hI(this);
        this.LJJI = new C39811hJ(this);
        this.LJJIFFI = new C280518f(this);
        View decorView = activity.getWindow().getDecorView();
        LJIJI(decorView);
        if (!z) {
            this.LJI = decorView.findViewById(android.R.id.content);
        }
    }

    @Override // X.AnonymousClass021
    public final boolean LJIIIZ(int i, KeyEvent keyEvent) {
        C281318n c281318n;
        int i2;
        C280618g c280618g = this.LJIIIIZZ;
        if (c280618g == null || (c281318n = c280618g.LJLJJI) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        int keyboardType = KeyCharacterMap.load(i2).getKeyboardType();
        boolean z = true;
        if (keyboardType == 1) {
            z = false;
        }
        c281318n.setQwertyMode(z);
        return c281318n.performShortcut(i, keyEvent, 0);
    }
}
