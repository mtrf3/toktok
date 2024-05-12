package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.12I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C12I {
    public final Drawable LIZ;
    public final ColorStateList LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12I)) {
            return false;
        }
        C12I c12i = (C12I) obj;
        return o.LJ(this.LIZ, c12i.LIZ) && o.LJ(this.LIZIZ, c12i.LIZIZ);
    }

    public final int hashCode() {
        Drawable drawable = this.LIZ;
        int hashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
        ColorStateList colorStateList = this.LIZIZ;
        return hashCode + (colorStateList != null ? colorStateList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DrawableData(drawable=");
        LIZ.append(this.LIZ);
        LIZ.append(", tintList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C12I(Drawable drawable, ColorStateList colorStateList) {
        this.LIZ = drawable;
        this.LIZIZ = colorStateList;
    }
}
