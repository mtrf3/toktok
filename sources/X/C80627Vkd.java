package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Vkd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80627Vkd extends Drawable implements Drawable.Callback, InterfaceC80626Vkc, InterfaceC80604VkG, InterfaceC79080V1w {
    public static final Matrix LJLJJI = new Matrix();
    public Drawable LJLIL;
    public final C80629Vkf LJLILLLLZI = new C80629Vkf();
    public InterfaceC80626Vkc LJLJI;

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.LJLIL;
        if (drawable == null) {
            return super.getConstantState();
        }
        return drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.LJLIL;
        if (drawable == null) {
            return super.getIntrinsicHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.LJLIL;
        if (drawable == null) {
            return super.getIntrinsicWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.LJLIL;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.LJLIL;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // X.InterfaceC79080V1w
    public final Drawable LJIIIIZZ() {
        return this.LJLIL;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.LJLIL;
    }

    public C80627Vkd(Drawable drawable) {
        this.LJLIL = drawable;
        C80603VkF.LIZJ(drawable, this, this);
    }

    @Override // X.InterfaceC80626Vkc
    public final void LIZLLL(RectF rectF) {
        InterfaceC80626Vkc interfaceC80626Vkc = this.LJLJI;
        if (interfaceC80626Vkc != null) {
            interfaceC80626Vkc.LIZLLL(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // X.InterfaceC79080V1w
    public final Drawable LJ(Drawable drawable) {
        return LJIILIIL(drawable);
    }

    public void LJIIIZ(Matrix matrix) {
        LJIIL(matrix);
    }

    @Override // X.InterfaceC80604VkG
    public final void LJIIJ(InterfaceC80626Vkc interfaceC80626Vkc) {
        this.LJLJI = interfaceC80626Vkc;
    }

    public final void LJIIL(Matrix matrix) {
        InterfaceC80626Vkc interfaceC80626Vkc = this.LJLJI;
        if (interfaceC80626Vkc != null) {
            interfaceC80626Vkc.LJIIIZ(matrix);
        } else {
            matrix.reset();
        }
    }

    public Drawable LJIILIIL(Drawable drawable) {
        Drawable drawable2 = this.LJLIL;
        C80603VkF.LIZJ(drawable2, null, null);
        C80603VkF.LIZJ(drawable, null, null);
        C80629Vkf c80629Vkf = this.LJLILLLLZI;
        if (drawable != null && c80629Vkf != null) {
            c80629Vkf.LIZ(drawable);
        }
        C80603VkF.LIZ(drawable, this);
        C80603VkF.LIZJ(drawable, this, this);
        this.LJLIL = drawable;
        invalidateSelf();
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.LJLIL;
        if (drawable == null) {
            return super.getPadding(rect);
        }
        return drawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.LJLIL;
        if (drawable == null) {
            return super.onLevelChange(i);
        }
        return drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.LJLIL;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        return drawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJLILLLLZI.LIZ = i;
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C80629Vkf c80629Vkf = this.LJLILLLLZI;
        c80629Vkf.LIZJ = colorFilter;
        c80629Vkf.LIZIZ = true;
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.LJLILLLLZI.LIZLLL = z ? 1 : 0;
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.LJLILLLLZI.LJ = z ? 1 : 0;
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.LJLIL;
        if (drawable == null) {
            return visible;
        }
        return drawable.setVisible(z, z2);
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
