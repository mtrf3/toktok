package X;

import kotlin.jvm.internal.o;

/* renamed from: X.DzI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35672DzI {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35672DzI)) {
            return false;
        }
        C35672DzI c35672DzI = (C35672DzI) obj;
        return o.LJ(this.LIZ, c35672DzI.LIZ) && o.LJ(this.LIZIZ, c35672DzI.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public C35672DzI() {
        this("", "");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RegexInput(url=");
        LIZ.append(this.LIZ);
        LIZ.append(", schema=");
        return JBR.LJFF(LIZ, this.LIZIZ, ")", LIZ);
    }

    public C35672DzI(String url, String schema) {
        o.LJIIJ(url, "url");
        o.LJIIJ(schema, "schema");
        this.LIZ = url;
        this.LIZIZ = schema;
    }
}
