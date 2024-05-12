package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E0X {
    public final int LIZ;
    public final Drawable LIZIZ;
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0X)) {
            return false;
        }
        E0X e0x = (E0X) obj;
        return this.LIZ == e0x.LIZ && o.LJ(this.LIZIZ, e0x.LIZIZ) && Float.compare(this.LIZJ, e0x.LIZJ) == 0;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.LIZ * 31;
        Drawable drawable = this.LIZIZ;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        return Float.floatToIntBits(this.LIZJ) + ((i + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomButtonVariantAttr(textColorRes=");
        LIZ.append(this.LIZ);
        LIZ.append(", backgroundShape=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", alpha=");
        return C74221TAz.LIZLLL(LIZ, this.LIZJ, ')', LIZ);
    }

    public E0X(int i, Drawable drawable, float f) {
        this.LIZ = i;
        this.LIZIZ = drawable;
        this.LIZJ = f;
    }
}
