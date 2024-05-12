package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aXK, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93838aXK {
    public final String LIZ;
    public final String LIZIZ;
    public final List<C93839aXL> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93838aXK)) {
            return false;
        }
        C93838aXK c93838aXK = (C93838aXK) obj;
        return o.LJ(this.LIZ, c93838aXK.LIZ) && o.LJ(this.LIZIZ, c93838aXK.LIZIZ) && o.LJ(this.LIZJ, c93838aXK.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<C93839aXL> list = this.LIZJ;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CategoryBean(name=");
        LIZ.append(this.LIZ);
        LIZ.append(", extra=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", effects=");
        LIZ.append(this.LIZJ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C93838aXK(String name, String str, List<C93839aXL> list) {
        o.LJIIIZ(name, "name");
        this.LIZ = name;
        this.LIZIZ = str;
        this.LIZJ = list;
    }
}
