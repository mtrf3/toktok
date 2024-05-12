package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* renamed from: X.Vfz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80339Vfz {
    public final Rect LIZ;
    public final ColorStateList LIZIZ;
    public final ColorStateList LIZJ;
    public final ColorStateList LIZLLL;
    public final int LJ;
    public final C80416VhE LJFF;

    public final void LIZIZ(TextView textView) {
        C80418VhG c80418VhG = new C80418VhG();
        C80418VhG c80418VhG2 = new C80418VhG();
        c80418VhG.setShapeAppearanceModel(this.LJFF);
        c80418VhG2.setShapeAppearanceModel(this.LJFF);
        c80418VhG.LJIIJJI(this.LIZJ);
        float f = this.LJ;
        ColorStateList colorStateList = this.LIZLLL;
        c80418VhG.LJLIL.LJIIJ = f;
        c80418VhG.invalidateSelf();
        C80421VhJ c80421VhJ = c80418VhG.LJLIL;
        if (c80421VhJ.LIZLLL != colorStateList) {
            c80421VhJ.LIZLLL = colorStateList;
            c80418VhG.onStateChange(c80418VhG.getState());
        }
        textView.setTextColor(this.LIZIZ);
        RippleDrawable rippleDrawable = new RippleDrawable(this.LIZIZ.withAlpha(30), c80418VhG, c80418VhG2);
        Rect rect = this.LIZ;
        C16300kU.LJIILLIIL(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    public static C80339Vfz LIZ(int i, Context context) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        TMC.LJI("Cannot create a CalendarItemStyle with a styleResId of 0", z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, com.zhiliaoapp.musically.R.attr.ait, com.zhiliaoapp.musically.R.attr.aj5, com.zhiliaoapp.musically.R.attr.aj6, com.zhiliaoapp.musically.R.attr.ajd, com.zhiliaoapp.musically.R.attr.aje, com.zhiliaoapp.musically.R.attr.ajj});
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList LIZ = C80285Vf7.LIZ(context, obtainStyledAttributes, 4);
        ColorStateList LIZ2 = C80285Vf7.LIZ(context, obtainStyledAttributes, 9);
        ColorStateList LIZ3 = C80285Vf7.LIZ(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        C80416VhE c80416VhE = new C80416VhE(C80416VhE.LIZ(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C80323Vfj(0)));
        obtainStyledAttributes.recycle();
        return new C80339Vfz(LIZ, LIZ2, LIZ3, dimensionPixelSize, c80416VhE, rect);
    }

    public C80339Vfz(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C80416VhE c80416VhE, Rect rect) {
        TMC.LJIIIIZZ(rect.left);
        TMC.LJIIIIZZ(rect.top);
        TMC.LJIIIIZZ(rect.right);
        TMC.LJIIIIZZ(rect.bottom);
        this.LIZ = rect;
        this.LIZIZ = colorStateList2;
        this.LIZJ = colorStateList;
        this.LIZLLL = colorStateList3;
        this.LJ = i;
        this.LJFF = c80416VhE;
    }
}
