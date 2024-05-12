package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: X.1M6, reason: invalid class name */
/* loaded from: classes.dex */
public class C1M6 extends Drawable implements Drawable.Callback, InterfaceC07870Sp, InterfaceC07860So {
    public static final PorterDuff.Mode LJLJL = PorterDuff.Mode.SRC_IN;
    public int LJLIL;
    public PorterDuff.Mode LJLILLLLZI;
    public boolean LJLJI;
    public C07880Sq LJLJJI;
    public boolean LJLJJL;
    public Drawable LJLJJLL;

    public boolean LIZJ() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C07880Sq c07880Sq = this.LJLJJI;
        if (c07880Sq != null && c07880Sq.LIZIZ != null) {
            c07880Sq.LIZ = getChangingConfigurations();
            return this.LJLJJI;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.LJLJJLL.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LJLJJLL.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LJLJJLL.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return C07840Sm.LIZIZ(this.LJLJJLL);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.LJLJJLL.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.LJLJJLL.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.LJLJJLL.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.LJLJJLL.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.LJLJJLL.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return C07810Sj.LIZLLL(this.LJLJJLL);
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.LJLJJLL.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.LJLJJL && super.mutate() == this) {
            this.LJLJJI = new C07880Sq(this.LJLJJI);
            Drawable drawable = this.LJLJJLL;
            if (drawable != null) {
                drawable.mutate();
            }
            C07880Sq c07880Sq = this.LJLJJI;
            if (c07880Sq != null) {
                Drawable drawable2 = this.LJLJJLL;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                c07880Sq.LIZIZ = constantState;
            }
            this.LJLJJL = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        C07880Sq c07880Sq = this.LJLJJI;
        if (c07880Sq != null) {
            i = c07880Sq.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.LJLJJLL.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C07880Sq c07880Sq;
        ColorStateList colorStateList;
        if ((LIZJ() && (c07880Sq = this.LJLJJI) != null && (colorStateList = c07880Sq.LIZJ) != null && colorStateList.isStateful()) || this.LJLJJLL.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC07870Sp
    public final Drawable LIZIZ() {
        return this.LJLJJLL;
    }

    public C1M6(Drawable drawable) {
        this.LJLJJI = new C07880Sq(this.LJLJJI);
        LIZ(drawable);
    }

    @Override // X.InterfaceC07870Sp
    public final void LIZ(Drawable drawable) {
        Drawable drawable2 = this.LJLJJLL;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.LJLJJLL = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C07880Sq c07880Sq = this.LJLJJI;
            if (c07880Sq != null) {
                c07880Sq.LIZIZ = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean LIZLLL(int[] iArr) {
        if (!LIZJ()) {
            return false;
        }
        C07880Sq c07880Sq = this.LJLJJI;
        ColorStateList colorStateList = c07880Sq.LIZJ;
        PorterDuff.Mode mode = c07880Sq.LIZLLL;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.LJLJI || colorForState != this.LJLIL || mode != this.LJLILLLLZI) {
                setColorFilter(colorForState, mode);
                this.LJLIL = colorForState;
                this.LJLILLLLZI = mode;
                this.LJLJI = true;
                return true;
            }
        } else {
            this.LJLJI = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.LJLJJLL.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.LJLJJLL.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.LJLJJLL;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return C07840Sm.LIZJ(this.LJLJJLL, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.LJLJJLL.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJLJJLL.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        C07810Sj.LJ(this.LJLJJLL, z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.LJLJJLL.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJLJJLL.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.LJLJJLL.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.LJLJJLL.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.LJLJJLL.setState(iArr);
        if (LIZLLL(iArr) || state) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.LJLJJI.LIZJ = colorStateList;
        LIZLLL(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.LJLJJI.LIZLLL = mode;
        LIZLLL(getState());
    }

    public C1M6(C07880Sq c07880Sq, Resources resources) {
        Drawable.ConstantState constantState;
        this.LJLJJI = c07880Sq;
        if (c07880Sq != null && (constantState = c07880Sq.LIZIZ) != null) {
            LIZ(constantState.newDrawable(resources));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.LJLJJLL.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
