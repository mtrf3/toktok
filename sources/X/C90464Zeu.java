package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: X.Zeu, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90464Zeu {
    static {
        new C90469Zez("WidgetUtil");
    }

    public static Drawable LIZ(int i, int i2, Context context) {
        ColorStateList colorStateList;
        Drawable LJFF = C07840Sm.LJFF(context.getResources().getDrawable(i2).mutate());
        C07820Sk.LJIIIIZZ(LJFF, PorterDuff.Mode.SRC_IN);
        if (i != 0) {
            colorStateList = C04330Ez.LIZJ(i, context);
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.colorForeground});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{color, C07290Qj.LJIIL(color, 128)});
        }
        C07820Sk.LJII(LJFF, colorStateList);
        return LJFF;
    }
}
