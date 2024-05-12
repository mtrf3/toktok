package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;

/* renamed from: X.VeK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80236VeK extends LinearLayoutCompat {
    public Drawable LJLLLLLL;
    public final Rect LJLZ;
    public final Rect LJZ;
    public int LJZI;
    public final boolean LJZL;
    public boolean LL;

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LJLLLLLL;
        if (drawable != null && drawable.isStateful()) {
            this.LJLLLLLL.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.LJLLLLLL;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.LJLLLLLL;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.LJZI;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.LJLLLLLL;
        if (drawable != null) {
            if (this.LL) {
                this.LL = false;
                Rect rect = this.LJLZ;
                Rect rect2 = this.LJZ;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.LJZL) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.LJZI, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.LJLLLLLL;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.LJLLLLLL);
            }
            this.LJLLLLLL = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.LJZI == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.LJZI != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.LJZI = i;
            if (i == 119 && this.LJLLLLLL != null) {
                this.LJLLLLLL.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.LJLLLLLL) {
            return true;
        }
        return false;
    }

    public C80236VeK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.LJLLLLLL;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public C80236VeK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LJLZ = new Rect();
        this.LJZ = new Rect();
        this.LJZI = 119;
        this.LJZL = true;
        this.LL = false;
        TypedArray LIZLLL = C80244VeS.LIZLLL(context, attributeSet, new int[]{R.attr.foreground, R.attr.foregroundGravity, com.zhiliaoapp.musically.R.attr.aeo}, 0, 0, new int[0]);
        this.LJZI = LIZLLL.getInt(1, this.LJZI);
        Drawable drawable = LIZLLL.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.LJZL = LIZLLL.getBoolean(2, true);
        LIZLLL.recycle();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LL = true;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.LL = z | this.LL;
    }
}
