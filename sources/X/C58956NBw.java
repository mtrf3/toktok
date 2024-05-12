package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NBw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58956NBw extends NC2 {
    public final C76512zP LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C58956NBw) && o.LJ(this.LIZ, ((C58956NBw) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BusinessComponentAppear(componentAppearModel=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C58956NBw(C76512zP c76512zP) {
        this.LIZ = c76512zP;
    }
}
