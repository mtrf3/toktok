package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.0Sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07810Sj {
    public static int LIZ(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static Drawable LIZJ(InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }

    public static boolean LIZLLL(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static Drawable LIZIZ(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
        return drawableContainerState.getChild(i);
    }

    public static void LJ(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }
}
