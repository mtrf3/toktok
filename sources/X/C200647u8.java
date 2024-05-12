package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7u8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200647u8 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C200647u8)) {
            return false;
        }
        C200647u8 c200647u8 = (C200647u8) obj;
        return o.LJ(this.LIZ, c200647u8.LIZ) && this.LIZIZ == c200647u8.LIZIZ && this.LIZJ == c200647u8.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + (this.LIZJ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoDisplayState(displayCount=");
        LIZ.append(this.LIZ);
        LIZ.append(", selected=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", displayVisible=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C200647u8(String str, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
