package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.Ud7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77613Ud7 {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public C77613Ud7() {
        this(0, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77613Ud7)) {
            return false;
        }
        C77613Ud7 c77613Ud7 = (C77613Ud7) obj;
        return o.LJ(this.LIZ, c77613Ud7.LIZ) && o.LJ(this.LIZIZ, c77613Ud7.LIZIZ) && this.LIZJ == c77613Ud7.LIZJ && this.LIZLLL == c77613Ud7.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckOrderResultInfo(productId=");
        LIZ.append(this.LIZ);
        LIZ.append(", orderId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", quantity=");
        LIZ.append(this.LIZJ);
        LIZ.append(", retryCount=");
        return b0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C77613Ud7(int i, String str, String str2, int i2) {
        str = (i2 & 1) != 0 ? null : str;
        str2 = (i2 & 2) != 0 ? null : str2;
        i = (i2 & 4) != 0 ? 0 : i;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = 0;
    }
}
