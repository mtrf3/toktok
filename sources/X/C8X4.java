package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8X4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8X4 {
    public final C8X3 LIZ;
    public final ReusedAssem<? extends C3C8> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8X4)) {
            return false;
        }
        C8X4 c8x4 = (C8X4) obj;
        return this.LIZ == c8x4.LIZ && o.LJ(this.LIZIZ, c8x4.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        ReusedAssem<? extends C3C8> reusedAssem = this.LIZIZ;
        return hashCode + (reusedAssem == null ? 0 : reusedAssem.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FireReason(case=");
        LIZ.append(this.LIZ);
        LIZ.append(", host=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C8X4(C8X3 c8x3, ReusedAssem<? extends C3C8> reusedAssem) {
        o.LJIIIZ(c8x3, "case");
        this.LIZ = c8x3;
        this.LIZIZ = reusedAssem;
    }
}
