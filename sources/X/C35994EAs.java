package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EAs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35994EAs {
    public final String LIZ;
    public final String LIZIZ;
    public final java.util.Set<String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35994EAs)) {
            return false;
        }
        C35994EAs c35994EAs = (C35994EAs) obj;
        return o.LJ(this.LIZ, c35994EAs.LIZ) && o.LJ(this.LIZIZ, c35994EAs.LIZIZ) && o.LJ(this.LIZJ, c35994EAs.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return this.LIZJ.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return super.toString();
    }

    public C35994EAs(String schema, String str, java.util.Set<String> set) {
        o.LJIIIZ(schema, "schema");
        this.LIZ = schema;
        this.LIZIZ = str;
        this.LIZJ = set;
    }
}
