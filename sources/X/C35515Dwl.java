package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Dwl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35515Dwl {
    public final String LIZ;
    public final Integer LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35515Dwl)) {
            return false;
        }
        C35515Dwl c35515Dwl = (C35515Dwl) obj;
        return o.LJ(this.LIZ, c35515Dwl.LIZ) && o.LJ(this.LIZIZ, c35515Dwl.LIZIZ) && o.LJ(this.LIZJ, c35515Dwl.LIZJ);
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
        LIZ.append("NetworkExtraInfo(requestLog=");
        LIZ.append(this.LIZ);
        LIZ.append(", retryTimes=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", url=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C35515Dwl(String str, Integer num, String str2) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = str2;
    }
}
