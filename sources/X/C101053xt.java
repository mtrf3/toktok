package X;

import android.graphics.drawable.Drawable;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.3xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101053xt {
    public final Drawable LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C101053xt)) {
            return false;
        }
        C101053xt c101053xt = (C101053xt) obj;
        return o.LJ(this.LIZ, c101053xt.LIZ) && this.LIZIZ == c101053xt.LIZIZ;
    }

    public final int hashCode() {
        Drawable drawable = this.LIZ;
        return ((drawable == null ? 0 : drawable.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TuxDrawableWithDesc(drawable=");
        LIZ.append(this.LIZ);
        LIZ.append(", descStringRes=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C101053xt(SY9 sy9, int i) {
        this.LIZ = sy9;
        this.LIZIZ = i;
    }
}
