package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3lA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93163lA {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93163lA)) {
            return false;
        }
        C93163lA c93163lA = (C93163lA) obj;
        return o.LJ(this.LIZ, c93163lA.LIZ) && this.LIZIZ == c93163lA.LIZIZ;
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
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MentionPanelUpdateResult(searchKey=");
        LIZ.append(this.LIZ);
        LIZ.append(", hidePanel=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C93163lA(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
