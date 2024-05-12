package X;

import java.util.List;

/* renamed from: X.F2j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38325F2j extends AbstractC38326F2k {
    public final String LIZ;
    public final List<String> LIZIZ;

    public final int hashCode() {
        return ((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HeartBeatResult{userAgent=");
        LIZ.append(this.LIZ);
        LIZ.append(", usedDates=");
        LIZ.append(this.LIZIZ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC38326F2k
    public final List<String> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC38326F2k
    public final String LIZIZ() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC38326F2k)) {
            return false;
        }
        AbstractC38326F2k abstractC38326F2k = (AbstractC38326F2k) obj;
        if (this.LIZ.equals(abstractC38326F2k.LIZIZ()) && this.LIZIZ.equals(abstractC38326F2k.LIZ())) {
            return true;
        }
        return false;
    }

    public C38325F2j(String str, List<String> list) {
        if (str != null) {
            this.LIZ = str;
            this.LIZIZ = list;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }
}
