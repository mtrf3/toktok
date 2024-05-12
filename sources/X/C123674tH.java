package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.4tH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123674tH {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;

    public C123674tH() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C123674tH)) {
            return false;
        }
        C123674tH c123674tH = (C123674tH) obj;
        return o.LJ(this.LIZ, c123674tH.LIZ) && o.LJ(this.LIZIZ, c123674tH.LIZIZ) && o.LJ(this.LIZJ, c123674tH.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LIZJ;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextProperty(width=");
        LIZ.append(this.LIZ);
        LIZ.append(", height=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", lineCount=");
        return s0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ C123674tH(int i) {
        this(-1, -1, -1);
    }

    public C123674tH(Integer num, Integer num2, Integer num3) {
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = num3;
    }
}
