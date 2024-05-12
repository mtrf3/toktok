package X;

/* renamed from: X.0pQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19360pQ {
    public String LIZ;
    public EnumC08510Vb LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19360pQ)) {
            return false;
        }
        C19360pQ c19360pQ = (C19360pQ) obj;
        if (this.LIZIZ != c19360pQ.LIZIZ) {
            return false;
        }
        return this.LIZ.equals(c19360pQ.LIZ);
    }
}
