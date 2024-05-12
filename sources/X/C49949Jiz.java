package X;

/* renamed from: X.Jiz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49949Jiz extends C49952Jj2 {
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public boolean LJFF;
    public Long LJI;
    public Long LJII;

    public final void LIZIZ() {
        if (this.LIZLLL == -1) {
            long currentTimeMillis = System.currentTimeMillis();
            this.LIZLLL = currentTimeMillis;
            long j = currentTimeMillis - this.LIZJ;
            this.LJII = Long.valueOf(j);
            LIZ(Long.valueOf(j), "net_cost");
        }
    }

    public final void LIZJ() {
        Integer num;
        if (this.LIZLLL != -1 || (num = C49950Jj0.LJ.LIZJ) == null || num.intValue() != 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LIZLLL = currentTimeMillis;
        long j = currentTimeMillis - this.LIZJ;
        this.LJII = Long.valueOf(j);
        LIZ(Long.valueOf(j), "net_cost");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchChainWholeProgressCost(cost=");
        LIZ.append(this.LJI);
        LIZ.append(", triggerNetCost=");
        LIZ.append((Object) null);
        LIZ.append(", triggerRealRequstCost=");
        LIZ.append((Object) null);
        LIZ.append(", netCost=");
        LIZ.append(this.LJII);
        LIZ.append(", dataParseCost=");
        LIZ.append((Object) null);
        LIZ.append(", viewDrawCost=");
        return U26.LIZJ(LIZ, null, ')', LIZ);
    }
}
