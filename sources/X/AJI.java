package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AJI {
    public final String LIZ;
    public final Integer LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AJI)) {
            return false;
        }
        AJI aji = (AJI) obj;
        return o.LJ(this.LIZ, aji.LIZ) && o.LJ(this.LIZIZ, aji.LIZIZ) && o.LJ(this.LIZJ, aji.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LIZIZ;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LIZJ;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RssLink(linkedRssUrl=");
        LIZ.append(this.LIZ);
        LIZ.append(", statusCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", statusMsg=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public AJI(String str, Integer num, String str2) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = str2;
    }
}
