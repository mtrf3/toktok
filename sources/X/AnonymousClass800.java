package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.800, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass800 {
    public final Drawable LIZ;
    public final ViewGroup.LayoutParams LIZIZ;

    public AnonymousClass800() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass800)) {
            return false;
        }
        AnonymousClass800 anonymousClass800 = (AnonymousClass800) obj;
        return o.LJ(this.LIZ, anonymousClass800.LIZ) && o.LJ(this.LIZIZ, anonymousClass800.LIZIZ);
    }

    public final int hashCode() {
        Drawable drawable = this.LIZ;
        int hashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
        ViewGroup.LayoutParams layoutParams = this.LIZIZ;
        return hashCode + (layoutParams != null ? layoutParams.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareIconState(drawable=");
        LIZ.append(this.LIZ);
        LIZ.append(", layoutParams=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AnonymousClass800(Drawable drawable, ViewGroup.LayoutParams layoutParams) {
        this.LIZ = drawable;
        this.LIZIZ = layoutParams;
    }

    public static AnonymousClass800 LIZ(AnonymousClass800 anonymousClass800, Drawable drawable, ViewGroup.LayoutParams layoutParams, int i) {
        if ((i & 1) != 0) {
            drawable = anonymousClass800.LIZ;
        }
        if ((i & 2) != 0) {
            layoutParams = anonymousClass800.LIZIZ;
        }
        return new AnonymousClass800(drawable, layoutParams);
    }
}
