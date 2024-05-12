package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9wO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253009wO {
    public final String LIZ;
    public final EnumC253019wP LIZIZ;
    public final boolean LIZJ;

    public C253009wO() {
        this(null, null, false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C253009wO)) {
            return false;
        }
        C253009wO c253009wO = (C253009wO) obj;
        return o.LJ(this.LIZ, c253009wO.LIZ) && this.LIZIZ == c253009wO.LIZIZ && this.LIZJ == c253009wO.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (this.LIZIZ.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VerifyResult(text=");
        LIZ.append(this.LIZ);
        LIZ.append(", type=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isConcatenateRuleCheck=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C253009wO(String str, EnumC253019wP type, boolean z, int i) {
        str = (i & 1) != 0 ? null : str;
        type = (i & 2) != 0 ? EnumC253019wP.Error : type;
        z = (i & 4) != 0 ? false : z;
        o.LJIIIZ(type, "type");
        this.LIZ = str;
        this.LIZIZ = type;
        this.LIZJ = z;
    }
}
