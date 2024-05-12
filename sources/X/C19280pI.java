package X;

/* renamed from: X.0pI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19280pI {
    public final String LIZ;
    public final Long LIZIZ;

    public final int hashCode() {
        int i;
        int hashCode = this.LIZ.hashCode() * 31;
        Long l = this.LIZIZ;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19280pI)) {
            return false;
        }
        C19280pI c19280pI = (C19280pI) obj;
        if (!this.LIZ.equals(c19280pI.LIZ)) {
            return false;
        }
        Long l = this.LIZIZ;
        Long l2 = c19280pI.LIZIZ;
        if (l != null) {
            return l.equals(l2);
        }
        if (l2 == null) {
            return true;
        }
        return false;
    }

    public C19280pI(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = Long.valueOf(j);
    }
}
