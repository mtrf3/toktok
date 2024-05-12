package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M14 {
    public final Bitmap LIZ;
    public final M1C LIZIZ;

    public M14() {
        this((M1C) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M14)) {
            return false;
        }
        M14 m14 = (M14) obj;
        return o.LJ(this.LIZ, m14.LIZ) && this.LIZIZ == m14.LIZIZ;
    }

    public final int hashCode() {
        Bitmap bitmap = this.LIZ;
        return this.LIZIZ.hashCode() + ((bitmap == null ? 0 : bitmap.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IconConfig(bitmap=");
        LIZ.append(this.LIZ);
        LIZ.append(", iconState=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public M14(Bitmap bitmap, M1C iconState) {
        o.LJIIIZ(iconState, "iconState");
        this.LIZ = bitmap;
        this.LIZIZ = iconState;
    }

    public /* synthetic */ M14(M1C m1c, int i) {
        this((Bitmap) null, (i & 2) != 0 ? M1C.HIDDEN : m1c);
    }
}
