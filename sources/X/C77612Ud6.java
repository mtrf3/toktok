package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Ud6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77612Ud6 {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C77612Ud6() {
        /*
            r3 = this;
            r2 = 0
            r1 = 15
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77612Ud6.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77612Ud6)) {
            return false;
        }
        C77612Ud6 c77612Ud6 = (C77612Ud6) obj;
        return o.LJ(this.LIZ, c77612Ud6.LIZ) && o.LJ(this.LIZIZ, c77612Ud6.LIZIZ) && this.LIZJ == c77612Ud6.LIZJ && o.LJ(this.LIZLLL, c77612Ud6.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LIZJ) * 31;
        String str3 = this.LIZLLL;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PayResultInfo(productId=");
        LIZ.append(this.LIZ);
        LIZ.append(", orderId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", quantity=");
        LIZ.append(this.LIZJ);
        LIZ.append(", userId=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public /* synthetic */ C77612Ud6(String str, String str2, int i, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : i, (String) null);
    }

    public C77612Ud6(String str, String str2, int i, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
    }
}
