package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.RxR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71229RxR {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71229RxR)) {
            return false;
        }
        C71229RxR c71229RxR = (C71229RxR) obj;
        return o.LJ(this.LIZ, c71229RxR.LIZ) && o.LJ(this.LIZIZ, c71229RxR.LIZIZ) && o.LJ(this.LIZJ, c71229RxR.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ECWidgetFirstShowData(serviceName=");
        LIZ.append(this.LIZ);
        LIZ.append(", authorId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", roomId=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C71229RxR(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
