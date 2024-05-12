package X;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: X.Uz2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78972Uz2 {
    public static TypedValue LIZ(int i, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int LIZIZ(Context context, int i, String str) {
        TypedValue LIZ = LIZ(i, context);
        if (LIZ != null) {
            return LIZ.data;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }
}
