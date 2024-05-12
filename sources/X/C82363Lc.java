package X;

import defpackage.b0;

/* renamed from: X.3Lc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82363Lc {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82363Lc)) {
            return false;
        }
        C82363Lc c82363Lc = (C82363Lc) obj;
        return this.LIZ == c82363Lc.LIZ && this.LIZIZ == c82363Lc.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SessionListCount(totalChatCount=");
        LIZ.append(this.LIZ);
        LIZ.append(", showChatCount=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C82363Lc(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
