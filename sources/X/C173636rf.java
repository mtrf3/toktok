package X;

import android.content.Context;
import android.content.res.TypedArray;

/* renamed from: X.6rf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173636rf {
    public static boolean LIZIZ(Context context) {
        if (context == null || C012403c.LIZ(context) != 1) {
            return false;
        }
        return true;
    }

    public static int LIZ(int i, Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }
}
