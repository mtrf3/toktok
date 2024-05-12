package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* renamed from: X.Vf7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80285Vf7 {
    public static boolean LJ(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static ColorStateList LIZ(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList LIZJ;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (LIZJ = C04330Ez.LIZJ(resourceId, context)) != null) {
            return LIZJ;
        }
        return typedArray.getColorStateList(i);
    }

    public static ColorStateList LIZIZ(Context context, AnonymousClass033 anonymousClass033, int i) {
        int LJIIIIZZ;
        ColorStateList LIZJ;
        if (anonymousClass033.LJIIJJI(i) && (LJIIIIZZ = anonymousClass033.LJIIIIZZ(i, 0)) != 0 && (LIZJ = C04330Ez.LIZJ(LJIIIIZZ, context)) != null) {
            return LIZJ;
        }
        return anonymousClass033.LIZIZ(i);
    }

    public static Drawable LIZLLL(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable LIZ;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (LIZ = C20110qd.LIZ(context, resourceId)) != null) {
            return LIZ;
        }
        return typedArray.getDrawable(i);
    }

    public static int LIZJ(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }
}
