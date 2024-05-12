package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60682Zs {
    public final int LIZ;
    public final C39492Fei LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60682Zs)) {
            return false;
        }
        C60682Zs c60682Zs = (C60682Zs) obj;
        return this.LIZ == c60682Zs.LIZ && o.LJ(this.LIZIZ, c60682Zs.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        C39492Fei c39492Fei = this.LIZIZ;
        return i + (c39492Fei != null ? c39492Fei.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UrlRecord(jumpTimes=");
        LIZ.append(this.LIZ);
        LIZ.append(", formatSchema=");
        LIZ.append(this.LIZIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C60682Zs(int i, C39492Fei c39492Fei) {
        this.LIZ = i;
        this.LIZIZ = c39492Fei;
    }
}
