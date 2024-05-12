package X;

import java.util.List;

/* renamed from: X.Qcu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67408Qcu extends AbstractC67417Qd3 {
    public final List<AbstractC67503QeR> LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BatchedLogRequest{logRequests=");
        LIZ.append(this.LIZ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC67417Qd3
    public final List<AbstractC67503QeR> LIZ() {
        return this.LIZ;
    }

    public C67408Qcu(List<AbstractC67503QeR> list) {
        this.LIZ = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC67417Qd3) {
            return this.LIZ.equals(((AbstractC67417Qd3) obj).LIZ());
        }
        return false;
    }
}
