package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.4bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112834bn implements InterfaceC112844bo {
    public final Drawable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C112834bn) && o.LJ(this.LIZ, ((C112834bn) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DrawableType(drawable=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C112834bn(SY9 sy9) {
        this.LIZ = sy9;
    }
}
