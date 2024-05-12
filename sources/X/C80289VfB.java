package X;

import Y.IDLListenerS199S0100000_14;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.navigation.NavigationView$SavedState;
import o3.h0;

/* renamed from: X.VfB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80289VfB extends C80248VeW {
    public static final int[] LJLLILLLL = {R.attr.state_checked};
    public static final int[] LJLLJ = {-16842910};
    public final C80278Vf0 LJLJJLL;
    public final C80290VfC LJLJL;
    public final int LJLJLJ;
    public final int[] LJLJLLL;
    public C25650zZ LJLL;
    public IDLListenerS199S0100000_14 LJLLI;

    public void setNavigationItemSelectedListener(InterfaceC80304VfQ interfaceC80304VfQ) {
    }

    private MenuInflater getMenuInflater() {
        if (this.LJLL == null) {
            this.LJLL = new C25650zZ(getContext());
        }
        return this.LJLL;
    }

    public MenuItem getCheckedItem() {
        return this.LJLJL.LJLJJL.LJLILLLLZI;
    }

    public int getHeaderCount() {
        return this.LJLJL.LJLILLLLZI.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.LJLJL.LJLLI;
    }

    public int getItemHorizontalPadding() {
        return this.LJLJL.LJLLILLLL;
    }

    public int getItemIconPadding() {
        return this.LJLJL.LJLLJ;
    }

    public ColorStateList getItemIconTintList() {
        return this.LJLJL.LJLL;
    }

    public int getItemMaxLines() {
        return this.LJLJL.LJLZ;
    }

    public ColorStateList getItemTextColor() {
        return this.LJLJL.LJLJLLL;
    }

    @Override // X.C80248VeW, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        V1B.LJLLILLLL(this);
    }

    @Override // X.C80248VeW, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.LJLLI);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        NavigationView$SavedState navigationView$SavedState = new NavigationView$SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        navigationView$SavedState.menuState = bundle;
        this.LJLJJLL.LJIJJLI(bundle);
        return navigationView$SavedState;
    }

    public Menu getMenu() {
        return this.LJLJJLL;
    }

    @Override // X.C80248VeW
    public final void LIZ(C16800lI c16800lI) {
        int i;
        C80290VfC c80290VfC = this.LJLJL;
        c80290VfC.getClass();
        int LJ = c16800lI.LJ();
        if (c80290VfC.LJZ != LJ) {
            c80290VfC.LJZ = LJ;
            if (c80290VfC.LJLILLLLZI.getChildCount() == 0 && c80290VfC.LJLLLLLL) {
                i = c80290VfC.LJZ;
            } else {
                i = 0;
            }
            C72418SbW c72418SbW = c80290VfC.LJLIL;
            c72418SbW.setPadding(0, i, 0, c72418SbW.getPaddingBottom());
        }
        C72418SbW c72418SbW2 = c80290VfC.LJLIL;
        c72418SbW2.setPadding(0, c72418SbW2.getPaddingTop(), 0, c16800lI.LIZIZ());
        h0.LIZIZ(c80290VfC.LJLILLLLZI, c16800lI);
    }

    public final ColorStateList LIZIZ(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList LIZJ = C04330Ez.LIZJ(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(com.zhiliaoapp.musically.R.attr.a4r, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = LIZJ.getDefaultColor();
        int[] iArr = LJLLJ;
        return new ColorStateList(new int[][]{iArr, LJLLILLLL, FrameLayout.EMPTY_STATE_SET}, new int[]{LIZJ.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof NavigationView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        NavigationView$SavedState navigationView$SavedState = (NavigationView$SavedState) parcelable;
        super.onRestoreInstanceState(navigationView$SavedState.mSuperState);
        this.LJLJJLL.LJIJI(navigationView$SavedState.menuState);
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.LJLJJLL.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.LJLJL.LJLJJL.LJLZ((C281618q) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        V1B.LJLJL(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        C80290VfC c80290VfC = this.LJLJL;
        c80290VfC.LJLLI = drawable;
        c80290VfC.LIZJ(false);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C04270Et.LIZIZ(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        C80290VfC c80290VfC = this.LJLJL;
        c80290VfC.LJLLILLLL = i;
        c80290VfC.LIZJ(false);
    }

    public void setItemHorizontalPaddingResource(int i) {
        C80290VfC c80290VfC = this.LJLJL;
        c80290VfC.LJLLILLLL = getResources().getDimensionPixelSize(i);
        c80290VfC.LIZJ(false);
    }

    public void setItemIconPadding(int i) {
        C80290VfC c80290VfC = this.LJLJL;
        c80290VfC.LJLLJ = i;
        c80290VfC.LIZJ(false);
    }

    public void setItemIconPaddingResource(int i) {
        C80290VfC c80290VfC = this.LJLJL;
        c80290VfC.LJLLJ = getResources().getDimensionPixelSize(i);
        c80290VfC.LIZJ(false);
    }

    public void setItemIconSize(int i) {
        C80290VfC c80290VfC = this.LJLJL;
        if (c80290VfC.LJLLL != i) {
            c80290VfC.LJLLL = i;
            c80290VfC.LJLLLL = true;
            c80290VfC.LIZJ(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        C80290VfC c80290VfC = this.LJLJL;
        c80290VfC.LJLL = colorStateList;
        c80290VfC.LIZJ(false);
    }

    public void setItemMaxLines(int i) {
        C80290VfC c80290VfC = this.LJLJL;
        c80290VfC.LJLZ = i;
        c80290VfC.LIZJ(false);
    }

    public void setItemTextAppearance(int i) {
        C80290VfC c80290VfC = this.LJLJL;
        c80290VfC.LJLJL = i;
        c80290VfC.LJLJLJ = true;
        c80290VfC.LIZJ(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        C80290VfC c80290VfC = this.LJLJL;
        c80290VfC.LJLJLLL = colorStateList;
        c80290VfC.LIZJ(false);
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C80290VfC c80290VfC = this.LJLJL;
        if (c80290VfC != null) {
            c80290VfC.LJZL = i;
            C72418SbW c72418SbW = c80290VfC.LJLIL;
            if (c72418SbW != null) {
                c72418SbW.setOverScrollMode(i);
            }
        }
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.LJLJJLL.findItem(i);
        if (findItem != null) {
            this.LJLJL.LJLJJL.LJLZ((C281618q) findItem);
        }
    }

    public C80289VfB(Context context, AttributeSet attributeSet) {
        super(C78865UxJ.LIZ(context, attributeSet, com.zhiliaoapp.musically.R.attr.b1v, com.zhiliaoapp.musically.R.style.y7), attributeSet, com.zhiliaoapp.musically.R.attr.b1v);
        ColorStateList LIZIZ;
        int i;
        boolean z;
        ColorStateList colorStateList;
        C80290VfC c80290VfC = new C80290VfC();
        this.LJLJL = c80290VfC;
        this.LJLJLLL = new int[2];
        Context context2 = getContext();
        C80278Vf0 c80278Vf0 = new C80278Vf0(context2);
        this.LJLJJLL = c80278Vf0;
        int[] iArr = {R.attr.background, R.attr.fitsSystemWindows, R.attr.maxWidth, com.zhiliaoapp.musically.R.attr.ab6, com.zhiliaoapp.musically.R.attr.aff, com.zhiliaoapp.musically.R.attr.air, com.zhiliaoapp.musically.R.attr.aiu, com.zhiliaoapp.musically.R.attr.aiw, com.zhiliaoapp.musically.R.attr.aix, com.zhiliaoapp.musically.R.attr.aiy, com.zhiliaoapp.musically.R.attr.aj2, com.zhiliaoapp.musically.R.attr.aj5, com.zhiliaoapp.musically.R.attr.aj6, com.zhiliaoapp.musically.R.attr.aj7, com.zhiliaoapp.musically.R.attr.aj8, com.zhiliaoapp.musically.R.attr.aj9, com.zhiliaoapp.musically.R.attr.aj_, com.zhiliaoapp.musically.R.attr.aja, com.zhiliaoapp.musically.R.attr.ajg, com.zhiliaoapp.musically.R.attr.ajj, com.zhiliaoapp.musically.R.attr.b0r, com.zhiliaoapp.musically.R.attr.ba5, com.zhiliaoapp.musically.R.attr.ba8};
        C80244VeS.LIZ(context2, attributeSet, com.zhiliaoapp.musically.R.attr.b1v, com.zhiliaoapp.musically.R.style.y7);
        C80244VeS.LIZIZ(context2, attributeSet, iArr, com.zhiliaoapp.musically.R.attr.b1v, com.zhiliaoapp.musically.R.style.y7, new int[0]);
        AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(context2, attributeSet, iArr, com.zhiliaoapp.musically.R.attr.b1v, com.zhiliaoapp.musically.R.style.y7);
        if (LJIILIIL.LJIIJJI(0)) {
            C16300kU.LJIILLIIL(this, LJIILIIL.LJ(0));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C80416VhE c80416VhE = new C80416VhE(C80416VhE.LIZIZ(context2, attributeSet, com.zhiliaoapp.musically.R.attr.b1v, com.zhiliaoapp.musically.R.style.y7));
            Drawable background = getBackground();
            C80418VhG c80418VhG = new C80418VhG(c80416VhE);
            if (background instanceof ColorDrawable) {
                c80418VhG.LJIIJJI(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            c80418VhG.LJIIIIZZ(context2);
            C16300kU.LJIILLIIL(this, c80418VhG);
        }
        if (LJIILIIL.LJIIJJI(3)) {
            setElevation(LJIILIIL.LIZLLL(3, 0));
        }
        setFitsSystemWindows(LJIILIIL.LIZ(1, false));
        this.LJLJLJ = LJIILIIL.LIZLLL(2, 0);
        if (LJIILIIL.LJIIJJI(9)) {
            LIZIZ = LJIILIIL.LIZIZ(9);
        } else {
            LIZIZ = LIZIZ(R.attr.textColorSecondary);
        }
        if (LJIILIIL.LJIIJJI(18)) {
            i = LJIILIIL.LJIIIIZZ(18, 0);
            z = true;
        } else {
            i = 0;
            z = false;
        }
        if (LJIILIIL.LJIIJJI(8)) {
            setItemIconSize(LJIILIIL.LIZLLL(8, 0));
        }
        if (LJIILIIL.LJIIJJI(19)) {
            colorStateList = LJIILIIL.LIZIZ(19);
        } else {
            colorStateList = null;
        }
        if (!z && colorStateList == null) {
            colorStateList = LIZIZ(R.attr.textColorPrimary);
        }
        Drawable LJ = LJIILIIL.LJ(5);
        if (LJ == null && (LJIILIIL.LJIIJJI(11) || LJIILIIL.LJIIJJI(12))) {
            C80418VhG c80418VhG2 = new C80418VhG(new C80416VhE(C80416VhE.LIZ(getContext(), LJIILIIL.LJIIIIZZ(11, 0), LJIILIIL.LJIIIIZZ(12, 0), new C80323Vfj(0))));
            c80418VhG2.LJIIJJI(C80285Vf7.LIZIZ(getContext(), LJIILIIL, 13));
            LJ = new InsetDrawable((Drawable) c80418VhG2, LJIILIIL.LIZLLL(16, 0), LJIILIIL.LIZLLL(17, 0), LJIILIIL.LIZLLL(15, 0), LJIILIIL.LIZLLL(14, 0));
        }
        if (LJIILIIL.LJIIJJI(6)) {
            c80290VfC.LJLLILLLL = LJIILIIL.LIZLLL(6, 0);
            c80290VfC.LIZJ(false);
        }
        int LIZLLL = LJIILIIL.LIZLLL(7, 0);
        setItemMaxLines(LJIILIIL.LJII(10, 1));
        c80278Vf0.LJ = new C80298VfK(this);
        c80290VfC.LJLJJI = 1;
        c80290VfC.LJIIIIZZ(context2, c80278Vf0);
        c80290VfC.LJLL = LIZIZ;
        c80290VfC.LIZJ(false);
        int overScrollMode = getOverScrollMode();
        c80290VfC.LJZL = overScrollMode;
        C72418SbW c72418SbW = c80290VfC.LJLIL;
        if (c72418SbW != null) {
            c72418SbW.setOverScrollMode(overScrollMode);
        }
        if (z) {
            c80290VfC.LJLJL = i;
            c80290VfC.LJLJLJ = true;
            c80290VfC.LIZJ(false);
        }
        c80290VfC.LJLJLLL = colorStateList;
        c80290VfC.LIZJ(false);
        c80290VfC.LJLLI = LJ;
        c80290VfC.LIZJ(false);
        c80290VfC.LJLLJ = LIZLLL;
        c80290VfC.LIZJ(false);
        c80278Vf0.LIZIZ(c80290VfC, c80278Vf0.LIZ);
        if (c80290VfC.LJLIL == null) {
            C72418SbW c72418SbW2 = (C72418SbW) C16880lQ.LLLLIILL(c80290VfC.LJLJJLL, com.zhiliaoapp.musically.R.layout.akd, this, false);
            c80290VfC.LJLIL = c72418SbW2;
            c72418SbW2.setAccessibilityDelegateCompat(new C80291VfD(c80290VfC, c80290VfC.LJLIL));
            if (c80290VfC.LJLJJL == null) {
                c80290VfC.LJLJJL = new C80288VfA(c80290VfC);
            }
            int i2 = c80290VfC.LJZL;
            if (i2 != -1) {
                c80290VfC.LJLIL.setOverScrollMode(i2);
            }
            c80290VfC.LJLILLLLZI = (LinearLayout) C16880lQ.LLLLIILL(c80290VfC.LJLJJLL, com.zhiliaoapp.musically.R.layout.aka, c80290VfC.LJLIL, false);
            c80290VfC.LJLIL.setAdapter(c80290VfC.LJLJJL);
        }
        addView(c80290VfC.LJLIL);
        if (LJIILIIL.LJIIJJI(20)) {
            int LJIIIIZZ = LJIILIIL.LJIIIIZZ(20, 0);
            C80288VfA c80288VfA = c80290VfC.LJLJJL;
            if (c80288VfA != null) {
                c80288VfA.LJLJI = true;
            }
            getMenuInflater().inflate(LJIIIIZZ, c80278Vf0);
            C80288VfA c80288VfA2 = c80290VfC.LJLJJL;
            if (c80288VfA2 != null) {
                c80288VfA2.LJLJI = false;
            }
            c80290VfC.LIZJ(false);
        }
        if (LJIILIIL.LJIIJJI(4)) {
            c80290VfC.LJLILLLLZI.addView(C16880lQ.LLLLIILL(c80290VfC.LJLJJLL, LJIILIIL.LJIIIIZZ(4, 0), c80290VfC.LJLILLLLZI, false));
            C72418SbW c72418SbW3 = c80290VfC.LJLIL;
            c72418SbW3.setPadding(0, 0, 0, c72418SbW3.getPaddingBottom());
        }
        LJIILIIL.LJIILJJIL();
        this.LJLLI = new IDLListenerS199S0100000_14(this, 8);
        getViewTreeObserver().addOnGlobalLayoutListener(this.LJLLI);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i = View.MeasureSpec.makeMeasureSpec(this.LJLJLJ, 1073741824);
            }
        } else {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.LJLJLJ), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
