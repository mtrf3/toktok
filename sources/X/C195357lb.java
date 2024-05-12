package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195357lb {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C195357lb)) {
            return false;
        }
        C195357lb c195357lb = (C195357lb) obj;
        return o.LJ(this.LIZ, c195357lb.LIZ) && this.LIZIZ == c195357lb.LIZIZ;
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
        LIZ.append("UnSelectedState(aid=");
        LIZ.append(this.LIZ);
        LIZ.append(", isPageDown=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C195357lb(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
