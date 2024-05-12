package X;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: X.GRp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41529GRp {
    public int LIZ;
    public int LIZIZ;
    public String LIZJ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LIZ), Integer.valueOf(this.LIZIZ), this.LIZJ});
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(");
        LIZ.append(this.LIZJ);
        LIZ.append(": ");
        LIZ.append(this.LIZ);
        LIZ.append(", ");
        return C08380Uo.LIZ(LIZ, this.LIZIZ, ")", LIZ);
    }

    public C41529GRp() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C41529GRp.class != obj.getClass()) {
            return false;
        }
        C41529GRp c41529GRp = (C41529GRp) obj;
        if (this.LIZ == c41529GRp.LIZ && this.LIZIZ == c41529GRp.LIZIZ && Objects.equals(this.LIZJ, c41529GRp.LIZJ)) {
            return true;
        }
        return false;
    }

    public C41529GRp(String str, int i, int i2) {
        this.LIZJ = str;
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
