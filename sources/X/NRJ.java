package X;

/* loaded from: classes11.dex */
public final class NRJ {
    public final NRK LIZ;
    public final NRK LIZIZ;
    public final boolean LIZJ;
    public final NQQ LIZLLL;
    public final NRB LJ;

    public NRJ(NQQ nqq, NRB nrb, NRK nrk, NRK nrk2) {
        this.LIZLLL = nqq;
        this.LJ = nrb;
        this.LIZ = nrk;
        if (nrk2 == null) {
            this.LIZIZ = NRK.NONE;
        } else {
            this.LIZIZ = nrk2;
        }
        this.LIZJ = false;
    }

    public static NRJ LIZ(NQQ nqq, NRB nrb, NRK nrk, NRK nrk2) {
        C38891fp.LJFF(nqq, "CreativeType is null");
        C38891fp.LJFF(nrb, "ImpressionType is null");
        C38891fp.LJFF(nrk, "Impression owner is null");
        if (nrk != NRK.NONE) {
            if (nqq != NQQ.DEFINED_BY_JAVASCRIPT || nrk != NRK.NATIVE) {
                if (nrb != NRB.DEFINED_BY_JAVASCRIPT || nrk != NRK.NATIVE) {
                    return new NRJ(nqq, nrb, nrk, nrk2);
                }
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        throw new IllegalArgumentException("Impression owner is none");
    }
}
