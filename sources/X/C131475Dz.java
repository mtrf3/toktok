package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.5Dz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131475Dz {
    public int LIZ = 1;
    public Bitmap LIZIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C131475Dz)) {
            return false;
        }
        C131475Dz c131475Dz = (C131475Dz) obj;
        return this.LIZ == c131475Dz.LIZ && o.LJ(this.LIZIZ, c131475Dz.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Bitmap bitmap = this.LIZIZ;
        return i + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BitmapCache(referenceCount=");
        LIZ.append(this.LIZ);
        LIZ.append(", bitmap=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }
}
