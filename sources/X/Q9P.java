package X;

/* loaded from: classes12.dex */
public final class Q9P {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        long j = this.LIZIZ;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.LIZJ;
        return this.LIZLLL.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalAccessToken{accessToken='#####', expiresInMillis=");
        sb.append(this.LIZIZ);
        sb.append(", issuedClientTimeMillis=");
        sb.append(this.LIZJ);
        sb.append(", refreshToken='");
        return AnonymousClass073.LIZIZ(sb, this.LIZLLL, "'}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q9P.class != obj.getClass()) {
            return false;
        }
        Q9P q9p = (Q9P) obj;
        if (this.LIZIZ != q9p.LIZIZ || this.LIZJ != q9p.LIZJ || !this.LIZ.equals(q9p.LIZ)) {
            return false;
        }
        return this.LIZLLL.equals(q9p.LIZLLL);
    }

    public Q9P(String str, long j, long j2, String str2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = str2;
    }
}
