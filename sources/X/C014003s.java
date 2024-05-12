package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;

/* renamed from: X.03s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C014003s {
    public static final ThreadLocal<TypedValue> LIZ = new ThreadLocal<>();
    public static final int[] LIZIZ = {-16842910};
    public static final int[] LIZJ = {R.attr.state_focused};
    public static final int[] LIZLLL = {R.attr.state_pressed};
    public static final int[] LJ = {R.attr.state_checked};
    public static final int[] LJFF = new int[0];
    public static final int[] LJI = new int[1];

    public static int LIZ(int i, Context context) {
        ColorStateList LIZJ2 = LIZJ(i, context);
        if (LIZJ2 != null && LIZJ2.isStateful()) {
            return LIZJ2.getColorForState(LIZIZ, LIZJ2.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = LIZ;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return C07290Qj.LJIIL(LIZIZ(i, context), Math.round(Color.alpha(r1) * f));
    }

    public static int LIZIZ(int i, Context context) {
        int[] iArr = LJI;
        iArr[0] = i;
        AnonymousClass033 LJIIL = AnonymousClass033.LJIIL(context, null, iArr);
        try {
            return LJIIL.LIZIZ.getColor(0, 0);
        } finally {
            LJIIL.LJIILJJIL();
        }
    }

    public static ColorStateList LIZJ(int i, Context context) {
        int[] iArr = LJI;
        iArr[0] = i;
        AnonymousClass033 LJIIL = AnonymousClass033.LJIIL(context, null, iArr);
        try {
            return LJIIL.LIZIZ(0);
        } finally {
            LJIIL.LJIILJJIL();
        }
    }
}
