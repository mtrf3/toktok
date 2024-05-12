package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EAp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35991EAp {
    public final String LIZ;
    public final String LIZIZ;
    public final java.util.Set<String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35991EAp)) {
            return false;
        }
        C35991EAp c35991EAp = (C35991EAp) obj;
        return o.LJ(this.LIZ, c35991EAp.LIZ) && o.LJ(this.LIZIZ, c35991EAp.LIZIZ) && o.LJ(this.LIZJ, c35991EAp.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return this.LIZJ.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FormatSchema(schema=");
        LIZ.append(this.LIZ);
        LIZ.append(", path=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", query=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C35991EAp(String schema, String str, java.util.Set<String> set) {
        o.LJIIIZ(schema, "schema");
        this.LIZ = schema;
        this.LIZIZ = str;
        this.LIZJ = set;
    }
}
