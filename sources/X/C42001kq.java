package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: X.1kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42001kq extends C1M6 {
    public static Method LJLJLJ;

    @Override // X.C1M6
    public final boolean LIZJ() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.LJLJJLL;
        if (!(drawable instanceof GradientDrawable) && !(drawable instanceof DrawableContainer) && !(drawable instanceof InsetDrawable) && !(drawable instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.LJLJJLL.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.LJLJJLL;
        if (drawable != null && (method = LJLJLJ) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public C42001kq(Drawable drawable) {
        super(drawable);
        if (LJLJLJ == null) {
            try {
                LJLJLJ = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.LJLJJLL.getOutline(outline);
    }

    @Override // X.C1M6, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // X.C1M6, android.graphics.drawable.Drawable
    public final void setTint(int i) {
        if (LIZJ()) {
            super.setTint(i);
        } else {
            this.LJLJJLL.setTint(i);
        }
    }

    @Override // X.C1M6, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (LIZJ()) {
            super.setTintList(colorStateList);
        } else {
            this.LJLJJLL.setTintList(colorStateList);
        }
    }

    @Override // X.C1M6, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (LIZJ()) {
            super.setTintMode(mode);
        } else {
            this.LJLJJLL.setTintMode(mode);
        }
    }

    public C42001kq(C07880Sq c07880Sq, Resources resources) {
        super(c07880Sq, resources);
        if (LJLJLJ == null) {
            try {
                LJLJLJ = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.LJLJJLL.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.LJLJJLL.setHotspotBounds(i, i2, i3, i4);
    }
}
