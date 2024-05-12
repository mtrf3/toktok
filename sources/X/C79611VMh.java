package X;

import kotlin.jvm.internal.o;

/* renamed from: X.VMh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79611VMh {
    public final long LIZ;
    public final long LIZIZ;
    public final C79608VMe LIZJ;

    public C79611VMh() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C79611VMh) {
                C79611VMh c79611VMh = (C79611VMh) obj;
                if (this.LIZ != c79611VMh.LIZ || this.LIZIZ != c79611VMh.LIZIZ || !o.LJ(this.LIZJ, c79611VMh.LIZJ)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.LIZ;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.LIZIZ;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        C79608VMe c79608VMe = this.LIZJ;
        return i2 + (c79608VMe != null ? c79608VMe.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BlankCheck(detectElapse=");
        LIZ.append(this.LIZ);
        LIZ.append(", checkElapse=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", checkResult=");
        LIZ.append(this.LIZJ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C79611VMh(int i) {
        this(0L, 0L, new C79608VMe(0));
    }

    public C79611VMh(long j, long j2, C79608VMe checkResult) {
        o.LJIIJ(checkResult, "checkResult");
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = checkResult;
    }
}
