package X;

/* renamed from: X.4eP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114454eP {
    public final long LIZ;
    public final int LIZIZ;
    public final long LIZJ;

    public C114454eP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C114454eP)) {
            return false;
        }
        C114454eP c114454eP = (C114454eP) obj;
        return this.LIZ == c114454eP.LIZ && this.LIZIZ == c114454eP.LIZIZ && this.LIZJ == c114454eP.LIZJ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZJ) + (((C16880lQ.LLJIJIL(this.LIZ) * 31) + this.LIZIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QueueConfig(delayBeforeResettingNetworkStatus=");
        LIZ.append(this.LIZ);
        LIZ.append(", exponentialBackoffMaxCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", delayBeforeTryingToSendWithBadNetwork=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C114454eP(int i) {
        this.LIZ = 5000L;
        this.LIZIZ = 3;
        this.LIZJ = 3000L;
    }
}
