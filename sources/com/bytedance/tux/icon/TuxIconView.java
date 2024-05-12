package com.bytedance.tux.icon;

import X.C2068389v;
import X.C54339LUh;
import X.SY9;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TuxIconView extends AppCompatImageView {
    public SY9 LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TuxIconView(Context context) {
        this(context, null, 0, 6, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TuxIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        o.LJIIIZ(context, "context");
    }

    public final void LIZ() {
        SY9 sy9 = this.LJLIL;
        sy9.LJIILJJIL = null;
        Drawable drawable = sy9.LIZ;
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(null);
        drawable.setAlpha(255);
        sy9.invalidateSelf();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final void LIZIZ(boolean z) {
        this.LJLIL.LIZJ(z);
    }

    public final void setIconHeight(int i) {
        this.LJLIL.LIZLLL(i);
        SY9 sy9 = this.LJLIL;
        if (Build.VERSION.SDK_INT >= 23) {
            requestLayout();
        } else {
            setImageDrawable(null);
            setImageDrawable(sy9);
        }
    }

    public final void setIconRes(int i) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        SY9 sy9 = this.LJLIL;
        c2068389v.LIZLLL = sy9.LJIILJJIL;
        c2068389v.LIZIZ = sy9.LJI;
        c2068389v.LIZJ = sy9.LJII;
        c2068389v.LJFF = sy9.LJIILIIL;
        c2068389v.LJI = sy9.LJIILL;
        setTuxIcon(c2068389v);
    }

    public final void setIconWidth(int i) {
        this.LJLIL.LJI(i);
        SY9 sy9 = this.LJLIL;
        if (Build.VERSION.SDK_INT >= 23) {
            requestLayout();
        } else {
            setImageDrawable(null);
            setImageDrawable(sy9);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable instanceof SY9) {
            SY9 sy9 = (SY9) drawable;
            this.LJLIL = sy9;
            CharSequence charSequence = sy9.LJIILL;
            if (charSequence != null) {
                setContentDescription(charSequence);
            }
        }
    }

    public final void setLabel(CharSequence charSequence) {
        this.LJLIL.LJIILL = charSequence;
        setContentDescription(charSequence);
    }

    public final void setTintColor(int i) {
        this.LJLIL.LJ(i);
    }

    public final void setTintColorRes(int i) {
        SY9 sy9 = this.LJLIL;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        sy9.LJFF(i, context);
    }

    public final void setTintColorStateList$tux_theme_release(ColorStateList colorStateList) {
        o.LJIIIZ(colorStateList, "colorStateList");
        SY9 sy9 = this.LJLIL;
        sy9.getClass();
        sy9.LJIIIIZZ = colorStateList;
        sy9.invalidateSelf();
    }

    public final void setTuxIcon(C2068389v c2068389v) {
        if (c2068389v == null) {
            setImageDrawable(null);
            return;
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        SY9 LIZ = c2068389v.LIZ(context);
        setImageDrawable(LIZ);
        this.LJLIL = LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuxIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Integer num;
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.brm, R.attr.brp, R.attr.brv, R.attr.bs2, R.attr.bue}, i, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…conView, defStyleAttr, 0)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (obtainStyledAttributes.hasValue(4)) {
            num = Integer.valueOf(obtainStyledAttributes.getColor(4, 0));
        } else {
            num = null;
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        boolean z = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.FIT_XY);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = resourceId;
        c2068389v.LIZLLL = num;
        c2068389v.LIZIZ = dimensionPixelSize;
        c2068389v.LIZJ = dimensionPixelSize2;
        c2068389v.LJFF = z;
        SY9 LIZ = c2068389v.LIZ(context);
        this.LJLIL = LIZ;
        setImageDrawable(LIZ);
    }

    public /* synthetic */ TuxIconView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.k3 : i);
    }
}
