package X;

import android.os.Build;
import android.view.View;
import o3.h0;

/* renamed from: X.0kS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16280kS<T> {
    public final int LIZ;
    public final Class<T> LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public abstract T LIZIZ(View view);

    public abstract void LIZJ(View view, T t);

    public abstract boolean LJFF(T t, T t2);

    public final T LIZLLL(View view) {
        if (Build.VERSION.SDK_INT >= this.LIZJ) {
            return LIZIZ(view);
        }
        T t = (T) view.getTag(this.LIZ);
        if (this.LIZIZ.isInstance(t)) {
            return t;
        }
        return null;
    }

    public static boolean LIZ(Boolean bool, Boolean bool2) {
        boolean z;
        boolean z2;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (bool2 != null && bool2.booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final void LJ(View view, T t) {
        if (Build.VERSION.SDK_INT >= this.LIZJ) {
            LIZJ(view, t);
        } else {
            if (!LJFF(LIZLLL(view), t)) {
                return;
            }
            h0.LIZLLL(view);
            view.setTag(this.LIZ, t);
            h0.LJIIJ(this.LIZLLL, view);
        }
    }

    public AbstractC16280kS(int i, Class<T> cls, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = cls;
        this.LIZLLL = i2;
        this.LIZJ = i3;
    }
}
