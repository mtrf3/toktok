package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.SJq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71898SJq extends AppCompatImageView {
    public static final EnumC71803SFz[] LJLILLLLZI = {EnumC71803SFz.VERTICAL, EnumC71803SFz.HORIZONTAL, EnumC71803SFz.RADIAL};
    public static final EnumC71900SJs[] LJLJI = {EnumC71900SJs.LINEAR, EnumC71900SJs.EASE_IN, EnumC71900SJs.EASE_OUT, EnumC71900SJs.EASE_IN_OUT};
    public C71902SJu LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C71898SJq(Context context) {
        this(context, null, 6, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C71898SJq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final void setBeginShadeOpacity(float f) {
        C71902SJu c71902SJu = this.LJLIL;
        if (c71902SJu.LJIIJJI == f) {
            return;
        }
        c71902SJu.LJIIIIZZ = null;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        c71902SJu.LJIIJJI = f;
        c71902SJu.invalidateSelf();
    }

    public final void setEndShadeOpacity(float f) {
        C71902SJu c71902SJu = this.LJLIL;
        if (c71902SJu.LJIIL == f) {
            return;
        }
        c71902SJu.LJIIIIZZ = null;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        c71902SJu.LJIIL = f;
        c71902SJu.invalidateSelf();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable instanceof C71902SJu) {
            this.LJLIL = (C71902SJu) drawable;
        }
    }

    public final void setLayerHeight(int i) {
        C71902SJu c71902SJu = this.LJLIL;
        if (c71902SJu.LIZ() != i) {
            c71902SJu.LJIIIIZZ = null;
            c71902SJu.LJIILJJIL = i;
            c71902SJu.LIZJ = i;
            c71902SJu.invalidateSelf();
        }
        C71902SJu c71902SJu2 = this.LJLIL;
        if (Build.VERSION.SDK_INT >= 23) {
            requestLayout();
        } else {
            setImageDrawable(null);
            setImageDrawable(c71902SJu2);
        }
    }

    public final void setLayerWidth(int i) {
        C71902SJu c71902SJu = this.LJLIL;
        if (c71902SJu.LIZIZ() != i) {
            c71902SJu.LJIIIIZZ = null;
            c71902SJu.LJIILIIL = i;
            c71902SJu.LIZIZ = i;
            c71902SJu.invalidateSelf();
        }
        C71902SJu c71902SJu2 = this.LJLIL;
        if (Build.VERSION.SDK_INT >= 23) {
            requestLayout();
        } else {
            setImageDrawable(null);
            setImageDrawable(c71902SJu2);
        }
    }

    public final void setShadeColor(int i) {
        this.LJLIL.LIZLLL(i);
    }

    public final void setShadeColorRes(int i) {
        C71902SJu c71902SJu = this.LJLIL;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        c71902SJu.getClass();
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            c71902SJu.LIZLLL(LJI.intValue());
            c71902SJu.invalidateSelf();
        }
    }

    public final void setShader(EnumC71900SJs shader) {
        o.LJIIIZ(shader, "shader");
        this.LJLIL.LJ(shader);
    }

    public final void setStyle(EnumC71803SFz shadeStyle) {
        o.LJIIIZ(shadeStyle, "shadeStyle");
        C71902SJu c71902SJu = this.LJLIL;
        c71902SJu.getClass();
        if (c71902SJu.LJIIJ != shadeStyle) {
            c71902SJu.LJIIIIZZ = null;
            c71902SJu.LJIIJ = shadeStyle;
            c71902SJu.invalidateSelf();
        }
    }

    public final void setTuxDarkLayer(C71899SJr c71899SJr) {
        if (c71899SJr == null) {
            setImageDrawable(null);
            return;
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        setImageDrawable(c71899SJr.LIZ(context));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71898SJq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bq7, R.attr.bqv, R.attr.bs8, R.attr.bs9, R.attr.btd, R.attr.bte, R.attr.btu}, i, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…yerView, defStyleAttr, 0)");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        int color = obtainStyledAttributes.getColor(4, 0);
        float f = obtainStyledAttributes.getFloat(0, 0.0f);
        float f2 = obtainStyledAttributes.getFloat(1, 1.0f);
        EnumC71803SFz enumC71803SFz = LJLILLLLZI[obtainStyledAttributes.getInt(6, 0)];
        EnumC71900SJs enumC71900SJs = LJLJI[obtainStyledAttributes.getInt(5, 0)];
        obtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.FIT_XY);
        C71899SJr c71899SJr = new C71899SJr();
        c71899SJr.LIZ = dimensionPixelSize;
        c71899SJr.LIZIZ = dimensionPixelSize2;
        c71899SJr.LIZJ = Integer.valueOf(color);
        c71899SJr.LJ = Float.valueOf(f);
        c71899SJr.LJFF = Float.valueOf(f2);
        c71899SJr.LJI = enumC71803SFz;
        c71899SJr.LJII = enumC71900SJs;
        C71902SJu LIZ = c71899SJr.LIZ(context);
        this.LJLIL = LIZ;
        setImageDrawable(LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C71898SJq(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r0 = r4 & 4
            if (r0 == 0) goto L10
            r0 = 2130968875(0x7f04012b, float:1.7546416E38)
        Lc:
            r1.<init>(r2, r3, r0)
            return
        L10:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71898SJq.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
