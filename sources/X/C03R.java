package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.03R, reason: invalid class name */
/* loaded from: classes.dex */
public final class C03R {
    public static final PorterDuff.Mode LIZIZ = PorterDuff.Mode.SRC_IN;
    public static C03R LIZJ;
    public C012803g LIZ;

    public static synchronized C03R LIZ() {
        C03R c03r;
        synchronized (C03R.class) {
            if (LIZJ == null) {
                LIZLLL();
            }
            c03r = LIZJ;
        }
        return c03r;
    }

    public static synchronized void LIZLLL() {
        synchronized (C03R.class) {
            if (LIZJ == null) {
                C03R c03r = new C03R();
                LIZJ = c03r;
                c03r.LIZ = C012803g.LJ();
                LIZJ.LIZ.LJIIL(new C19I());
            }
        }
    }

    public static synchronized PorterDuffColorFilter LIZJ(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter LJIIIIZZ;
        synchronized (C03R.class) {
            LJIIIIZZ = C012803g.LJIIIIZZ(i, mode);
        }
        return LJIIIIZZ;
    }

    public final synchronized Drawable LIZIZ(Context context, int i) {
        return this.LIZ.LJI(context, i);
    }

    public static void LJ(Drawable drawable, C012102z c012102z, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        if (C03D.LIZ(drawable) && drawable.mutate() != drawable) {
            return;
        }
        boolean z = c012102z.LIZLLL;
        if (z || c012102z.LIZJ) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z) {
                colorStateList = c012102z.LIZ;
            } else {
                colorStateList = null;
            }
            if (c012102z.LIZJ) {
                mode = c012102z.LIZIZ;
            } else {
                mode = C012803g.LJII;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = C012803g.LJIIIIZZ(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT > 23) {
            return;
        }
        drawable.invalidateSelf();
    }
}
