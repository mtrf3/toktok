package X;

/* renamed from: X.OqO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63148OqO implements Cloneable {
    public String LJLIL;
    public long LJLILLLLZI;
    public long LJLJJI;
    public long LJLJI = Long.MIN_VALUE;
    public long LJLJJL = -1;

    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C63148OqO clone() {
        C63148OqO c63148OqO = new C63148OqO();
        c63148OqO.LJLIL = this.LJLIL;
        c63148OqO.LJLILLLLZI = this.LJLILLLLZI;
        c63148OqO.LIZIZ(this.LJLJI);
        c63148OqO.LIZJ(this.LJLJJI);
        c63148OqO.LIZLLL(this.LJLJJL);
        return c63148OqO;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ParticipantIndexInfo{conversationId='");
        Q89.LIZIZ(LIZ, this.LJLIL, '\'', ", uid=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", minIndex=");
        LIZ.append(this.LJLJI);
        LIZ.append(", readIndex=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", readOrder=");
        return C47135Ieh.LIZIZ(LIZ, this.LJLJJL, '}', LIZ);
    }

    public final void LIZIZ(long j) {
        if (this.LJLJI < j) {
            this.LJLJI = j;
        }
    }

    public final void LIZJ(long j) {
        if (this.LJLJJI < j) {
            this.LJLJJI = j;
        }
    }

    public final void LIZLLL(long j) {
        if (this.LJLJJL < j) {
            this.LJLJJL = j;
        }
    }
}
