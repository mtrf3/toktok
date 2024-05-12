package X;

import java.util.Objects;

/* loaded from: classes12.dex */
public final class Q24 extends Q20 {
    public final Object LIZJ;

    public final int hashCode() {
        Object obj = this.LIZJ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public Q24() {
    }

    public Q24(Object obj) {
        this.LIZJ = obj;
    }

    @Override // X.Q20
    public final Object LIZLLL(C66343Q1z c66343Q1z) {
        return this.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q24.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.LIZJ, ((Q24) obj).LIZJ);
    }
}
