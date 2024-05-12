package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TgP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75269TgP {
    public final boolean LIZ;
    public final C75271TgR LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75269TgP)) {
            return false;
        }
        C75269TgP c75269TgP = (C75269TgP) obj;
        return this.LIZ == c75269TgP.LIZ && o.LJ(this.LIZIZ, c75269TgP.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        C75271TgR c75271TgR = this.LIZIZ;
        return i + (c75271TgR == null ? 0 : c75271TgR.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MaskOrderEventData(isShow=");
        LIZ.append(this.LIZ);
        LIZ.append(", liveShowUserListData=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C75269TgP(boolean z, C75271TgR c75271TgR) {
        this.LIZ = z;
        this.LIZIZ = c75271TgR;
    }
}
