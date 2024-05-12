package X;

/* renamed from: X.Ua0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77420Ua0 {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final long LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77420Ua0)) {
            return false;
        }
        C77420Ua0 c77420Ua0 = (C77420Ua0) obj;
        return this.LIZ == c77420Ua0.LIZ && this.LIZIZ == c77420Ua0.LIZIZ && this.LIZJ == c77420Ua0.LIZJ && this.LIZLLL == c77420Ua0.LIZLLL && this.LJ == c77420Ua0.LJ && this.LJFF == c77420Ua0.LJFF && this.LJI == c77420Ua0.LJI && this.LJII == c77420Ua0.LJII;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LJII) + JBR.LIZJ(this.LJI, JBR.LIZJ(this.LJFF, JBR.LIZJ(this.LJ, JBR.LIZJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DurationCommonResult(sendTs=");
        LIZ.append(this.LIZ);
        LIZ.append(", receiveTs=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", dequeueTs=");
        LIZ.append(this.LIZJ);
        LIZ.append(", sendReceivedDuration=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", createReceivedDuration=");
        LIZ.append(this.LJ);
        LIZ.append(", sendEnqueueDuration=");
        LIZ.append(this.LJFF);
        LIZ.append(", receivedEnqueueDuration=");
        LIZ.append(this.LJI);
        LIZ.append(", enqueueDequeueDuration=");
        return C47135Ieh.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public C77420Ua0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = j5;
        this.LJFF = j6;
        this.LJI = j7;
        this.LJII = j8;
    }
}
