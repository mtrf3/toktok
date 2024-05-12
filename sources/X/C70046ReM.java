package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.ReM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70046ReM {
    public final EnumC70209Rgz LIZ;
    public final String LIZIZ;

    public C70046ReM() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70046ReM)) {
            return false;
        }
        C70046ReM c70046ReM = (C70046ReM) obj;
        return this.LIZ == c70046ReM.LIZ && o.LJ(this.LIZIZ, c70046ReM.LIZIZ);
    }

    public final int hashCode() {
        EnumC70209Rgz enumC70209Rgz = this.LIZ;
        int hashCode = (enumC70209Rgz == null ? 0 : enumC70209Rgz.hashCode()) * 31;
        String str = this.LIZIZ;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StockInfo(skuStockState=");
        LIZ.append(this.LIZ);
        LIZ.append(", noStockMsg=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C70046ReM(EnumC70209Rgz enumC70209Rgz, String str) {
        this.LIZ = enumC70209Rgz;
        this.LIZIZ = str;
    }
}
