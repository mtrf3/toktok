package X;

/* loaded from: classes9.dex */
public final class K03 {
    public final String LIZ;
    public final K04 LIZIZ;
    public final int LIZJ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K03.class != obj.getClass()) {
            return false;
        }
        K03 k03 = (K03) obj;
        if (this.LIZJ != k03.LIZJ) {
            return false;
        }
        return this.LIZ.equals(k03.LIZ);
    }

    public K03(String str, QXX qxx, int i) {
        this.LIZ = str;
        this.LIZIZ = qxx;
        this.LIZJ = i;
    }
}
