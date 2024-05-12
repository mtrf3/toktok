package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.0OW, reason: invalid class name */
/* loaded from: classes.dex */
public class C0OW {
    public static Drawable LIZ(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    public static Drawable LIZIZ(Resources resources, int i, int i2, Resources.Theme theme) {
        return resources.getDrawableForDensity(i, i2, theme);
    }
}
