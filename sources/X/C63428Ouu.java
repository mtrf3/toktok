package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ouu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63428Ouu extends AbstractC63432Ouy {
    public final C63424Ouq LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C63428Ouu) && o.LJ(this.LIZ, ((C63428Ouu) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OnGetByUserRequested(getByUserBufferItem=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C63428Ouu(C63424Ouq c63424Ouq) {
        this.LIZ = c63424Ouq;
    }
}
