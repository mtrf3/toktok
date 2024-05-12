package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.8vg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227088vg extends View {
    public Drawable LJLIL;
    public Drawable LJLILLLLZI;
    public float LJLJI;
    public int LJLJJI;
    public int LJLJJL;

    public final int getRatingDivide() {
        return this.LJLJJL;
    }

    public final Drawable getRatingImage() {
        return this.LJLILLLLZI;
    }

    public final float getRatingProgress() {
        return this.LJLJI;
    }

    public final int getRatingStarNumber() {
        return this.LJLJJI;
    }

    public final Drawable getRatingUnImage() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (canvas == null) {
            return;
        }
        int intrinsicHeight = this.LJLIL.getIntrinsicHeight() * ((int) this.LJLJI);
        float intrinsicWidth = ((this.LJLJI - ((int) r5)) * this.LJLIL.getIntrinsicWidth()) + (((int) r5) * this.LJLJJL) + intrinsicHeight;
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, intrinsicWidth, this.LJLILLLLZI.getIntrinsicHeight());
        int i = this.LJLJJI;
        for (int i2 = 0; i2 < i; i2++) {
            int intrinsicWidth2 = (this.LJLJJL * i2) + (this.LJLILLLLZI.getIntrinsicWidth() * i2);
            Drawable drawable = this.LJLILLLLZI;
            drawable.setBounds(intrinsicWidth2, 0, drawable.getIntrinsicWidth() + intrinsicWidth2, this.LJLILLLLZI.getIntrinsicHeight());
            this.LJLILLLLZI.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        canvas.clipRect(intrinsicWidth, 0.0f, getWidth(), this.LJLIL.getIntrinsicHeight());
        int i3 = this.LJLJJI;
        for (int i4 = 0; i4 < i3; i4++) {
            int intrinsicWidth3 = (this.LJLJJL * i4) + (this.LJLIL.getIntrinsicWidth() * i4);
            Drawable drawable2 = this.LJLIL;
            drawable2.setBounds(intrinsicWidth3, 0, drawable2.getIntrinsicWidth() + intrinsicWidth3, this.LJLIL.getIntrinsicHeight());
            this.LJLIL.draw(canvas);
        }
        canvas.restore();
    }

    public final void setRatingDivide(int i) {
        this.LJLJJL = i;
        invalidate();
    }

    public final void setRatingImage(Drawable value) {
        o.LJIIIZ(value, "value");
        this.LJLILLLLZI = value;
        invalidate();
    }

    public final void setRatingProgress(float f) {
        this.LJLJI = f;
        invalidate();
    }

    public final void setRatingStarNumber(int i) {
        this.LJLJJI = i;
        invalidate();
    }

    public final void setRatingUnImage(Drawable value) {
        o.LJIIIZ(value, "value");
        this.LJLIL = value;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C227088vg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        Drawable drawable = context.getResources().getDrawable(R.drawable.boo, null);
        o.LJIIIIZZ(drawable, "context.resources.getDra…cy_star_un_shining, null)");
        this.LJLIL = drawable;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.c6p, null);
        o.LJIIIIZZ(drawable2, "context.resources.getDra…wable.star_shining, null)");
        this.LJLILLLLZI = drawable2;
        this.LJLJJI = 5;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b6s, R.attr.b6w, R.attr.b6x, R.attr.b6y, R.attr.b6z, R.attr.b70});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…R.styleable.AdRatingView)");
            Drawable drawable3 = obtainStyledAttributes.getDrawable(2);
            if (drawable3 != null) {
                setRatingImage(drawable3);
            }
            Drawable drawable4 = obtainStyledAttributes.getDrawable(5);
            if (drawable4 != null) {
                setRatingUnImage(drawable4);
            }
            setRatingProgress(obtainStyledAttributes.getFloat(3, this.LJLJI));
            setRatingStarNumber(obtainStyledAttributes.getInt(4, this.LJLJJI));
            setRatingDivide(obtainStyledAttributes.getDimensionPixelSize(1, this.LJLJJL));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int i4 = 0;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i3 = 0;
                } else {
                    i3 = View.MeasureSpec.getSize(i);
                }
            } else {
                i3 = View.MeasureSpec.getSize(i);
            }
        } else {
            int intrinsicWidth = this.LJLIL.getIntrinsicWidth();
            int i5 = this.LJLJJI;
            i3 = (intrinsicWidth * i5) + ((i5 - 1) * this.LJLJJL);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    i4 = View.MeasureSpec.getSize(i2);
                }
            } else {
                i4 = View.MeasureSpec.getSize(i2);
            }
        } else {
            i4 = this.LJLIL.getIntrinsicHeight();
        }
        setMeasuredDimension(i3, i4);
    }
}
