package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter;
import com.google.android.material.bottomnavigation.BottomNavigationView$SavedState;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vex, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80275Vex extends FrameLayout {
    public final C80277Vez LJLIL;
    public final C80274Vew LJLILLLLZI;
    public final BottomNavigationPresenter LJLJI;
    public ColorStateList LJLJJI;
    public C25650zZ LJLJJL;

    public int getMaxItemCount() {
        return 5;
    }

    public void setOnNavigationItemReselectedListener(InterfaceC80282Vf4 interfaceC80282Vf4) {
    }

    public void setOnNavigationItemSelectedListener(InterfaceC80283Vf5 interfaceC80283Vf5) {
    }

    private MenuInflater getMenuInflater() {
        if (this.LJLJJL == null) {
            this.LJLJJL = new C25650zZ(getContext());
        }
        return this.LJLJJL;
    }

    public Drawable getItemBackground() {
        return this.LJLILLLLZI.getItemBackground();
    }

    public int getItemBackgroundResource() {
        return this.LJLILLLLZI.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.LJLILLLLZI.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.LJLILLLLZI.getIconTintList();
    }

    public int getItemTextAppearanceActive() {
        return this.LJLILLLLZI.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.LJLILLLLZI.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.LJLILLLLZI.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.LJLILLLLZI.getLabelVisibilityMode();
    }

    public int getSelectedItemId() {
        return this.LJLILLLLZI.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        V1B.LJLLILLLL(this);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        BottomNavigationView$SavedState bottomNavigationView$SavedState = new BottomNavigationView$SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        bottomNavigationView$SavedState.LJLIL = bundle;
        this.LJLIL.LJIJJLI(bundle);
        return bottomNavigationView$SavedState;
    }

    public ColorStateList getItemRippleColor() {
        return this.LJLJJI;
    }

    public Menu getMenu() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof BottomNavigationView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        BottomNavigationView$SavedState bottomNavigationView$SavedState = (BottomNavigationView$SavedState) parcelable;
        super.onRestoreInstanceState(bottomNavigationView$SavedState.mSuperState);
        this.LJLIL.LJIJI(bottomNavigationView$SavedState.LJLIL);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        V1B.LJLJL(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.LJLILLLLZI.setItemBackground(drawable);
        this.LJLJJI = null;
    }

    public void setItemBackgroundResource(int i) {
        this.LJLILLLLZI.setItemBackgroundRes(i);
        this.LJLJJI = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C80274Vew c80274Vew = this.LJLILLLLZI;
        if (c80274Vew.LJLL != z) {
            c80274Vew.setItemHorizontalTranslationEnabled(z);
            this.LJLJI.LIZJ(false);
        }
    }

    public void setItemIconSize(int i) {
        this.LJLILLLLZI.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.LJLILLLLZI.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.LJLJJI == colorStateList) {
            if (colorStateList == null && this.LJLILLLLZI.getItemBackground() != null) {
                this.LJLILLLLZI.setItemBackground(null);
                return;
            }
            return;
        }
        this.LJLJJI = colorStateList;
        if (colorStateList == null) {
            this.LJLILLLLZI.setItemBackground(null);
        } else {
            this.LJLILLLLZI.setItemBackground(new RippleDrawable(C80270Ves.LIZ(colorStateList), null, null));
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.LJLILLLLZI.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.LJLILLLLZI.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.LJLILLLLZI.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.LJLILLLLZI.getLabelVisibilityMode() != i) {
            this.LJLILLLLZI.setLabelVisibilityMode(i);
            this.LJLJI.LIZJ(false);
        }
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.LJLIL.findItem(i);
        if (findItem != null && !this.LJLIL.LJIILLIIL(findItem, this.LJLJI, 0)) {
            findItem.setChecked(true);
        }
    }

    public C80275Vex(Context context, AttributeSet attributeSet) {
        super(C78865UxJ.LIZ(context, attributeSet, R.attr.z_, R.style.y3), attributeSet, R.attr.z_);
        BottomNavigationPresenter bottomNavigationPresenter = new BottomNavigationPresenter();
        this.LJLJI = bottomNavigationPresenter;
        Context context2 = getContext();
        C80277Vez c80277Vez = new C80277Vez(context2);
        this.LJLIL = c80277Vez;
        C80274Vew c80274Vew = new C80274Vew(context2);
        this.LJLILLLLZI = c80274Vew;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        c80274Vew.setLayoutParams(layoutParams);
        bottomNavigationPresenter.LJLIL = c80274Vew;
        bottomNavigationPresenter.LJLJI = 1;
        c80274Vew.setPresenter(bottomNavigationPresenter);
        c80277Vez.LIZIZ(bottomNavigationPresenter, c80277Vez.LIZ);
        getContext();
        bottomNavigationPresenter.LJLIL.LLFII = c80277Vez;
        int[] iArr = {R.attr.xk, R.attr.ab6, R.attr.air, R.attr.aiv, R.attr.aix, R.attr.aiy, R.attr.aj4, R.attr.ajh, R.attr.aji, R.attr.ajj, R.attr.ako, R.attr.b0r};
        C80244VeS.LIZ(context2, attributeSet, R.attr.z_, R.style.y3);
        C80244VeS.LIZIZ(context2, attributeSet, iArr, R.attr.z_, R.style.y3, 8, 7);
        AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(context2, attributeSet, iArr, R.attr.z_, R.style.y3);
        if (LJIILIIL.LJIIJJI(5)) {
            c80274Vew.setIconTintList(LJIILIIL.LIZIZ(5));
        } else {
            c80274Vew.setIconTintList(c80274Vew.LIZJ());
        }
        setItemIconSize(LJIILIIL.LIZLLL(4, getResources().getDimensionPixelSize(R.dimen.lx)));
        if (LJIILIIL.LJIIJJI(8)) {
            setItemTextAppearanceInactive(LJIILIIL.LJIIIIZZ(8, 0));
        }
        if (LJIILIIL.LJIIJJI(7)) {
            setItemTextAppearanceActive(LJIILIIL.LJIIIIZZ(7, 0));
        }
        if (LJIILIIL.LJIIJJI(9)) {
            setItemTextColor(LJIILIIL.LIZIZ(9));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C80418VhG c80418VhG = new C80418VhG();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                c80418VhG.LJIIJJI(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            c80418VhG.LJIIIIZZ(context2);
            C16300kU.LJIILLIIL(this, c80418VhG);
        }
        if (LJIILIIL.LJIIJJI(1)) {
            setElevation(LJIILIIL.LIZLLL(1, 0));
        }
        C07820Sk.LJII(getBackground().mutate(), C80285Vf7.LIZIZ(context2, LJIILIIL, 0));
        setLabelVisibilityMode(LJIILIIL.LIZIZ.getInteger(10, -1));
        setItemHorizontalTranslationEnabled(LJIILIIL.LIZ(3, true));
        int LJIIIIZZ = LJIILIIL.LJIIIIZZ(2, 0);
        if (LJIIIIZZ != 0) {
            c80274Vew.setItemBackgroundRes(LJIIIIZZ);
        } else {
            setItemRippleColor(C80285Vf7.LIZIZ(context2, LJIILIIL, 6));
        }
        if (LJIILIIL.LJIIJJI(11)) {
            int LJIIIIZZ2 = LJIILIIL.LJIIIIZZ(11, 0);
            bottomNavigationPresenter.LJLILLLLZI = true;
            getMenuInflater().inflate(LJIIIIZZ2, c80277Vez);
            bottomNavigationPresenter.LJLILLLLZI = false;
            bottomNavigationPresenter.LIZJ(true);
        }
        LJIILIIL.LJIILJJIL();
        addView(c80274Vew, layoutParams);
        c80277Vez.LJ = new C80280Vf2(this);
        C80250VeY.LIZ(this, new C80255Ved());
    }
}
