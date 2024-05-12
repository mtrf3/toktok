package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.LxR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55941LxR {
    public final boolean LIZ;
    public final EnumC55946LxW LIZIZ;
    public final Integer LIZJ;

    public C55941LxR() {
        this(false, (EnumC55946LxW) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55941LxR)) {
            return false;
        }
        C55941LxR c55941LxR = (C55941LxR) obj;
        return this.LIZ == c55941LxR.LIZ && this.LIZIZ == c55941LxR.LIZIZ && o.LJ(this.LIZJ, c55941LxR.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        EnumC55946LxW enumC55946LxW = this.LIZIZ;
        int hashCode = (i + (enumC55946LxW == null ? 0 : enumC55946LxW.hashCode())) * 31;
        Integer num = this.LIZJ;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DotConfig(visible=");
        LIZ.append(this.LIZ);
        LIZ.append(", style=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", count=");
        return s0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ C55941LxR(boolean z, EnumC55946LxW enumC55946LxW, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : enumC55946LxW, (Integer) null);
    }

    public C55941LxR(boolean z, EnumC55946LxW enumC55946LxW, Integer num) {
        this.LIZ = z;
        this.LIZIZ = enumC55946LxW;
        this.LIZJ = num;
    }
}
