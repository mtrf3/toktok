package X;

/* renamed from: X.MLh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56653MLh {
    public boolean LIZIZ;
    public long LIZ = System.currentTimeMillis();
    public long LIZJ = System.currentTimeMillis();
    public long LIZLLL = System.currentTimeMillis();
    public long LJ = System.currentTimeMillis();
    public long LJFF = System.currentTimeMillis();
    public String LJI = "from_request";

    public final void LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis() - this.LJFF;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("state", "show");
        c188727au.LJIIIZ("state_from", this.LJI);
        c188727au.LJ(currentTimeMillis, "duration");
        FMX.LJIIL("inbox_skylight_lifecycle", c188727au.LIZ);
    }

    public final void LIZJ() {
        this.LJFF = System.currentTimeMillis();
    }

    public final void LIZ(boolean z) {
        long currentTimeMillis = System.currentTimeMillis() - this.LJ;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("state", "handle");
        c188727au.LJ(currentTimeMillis, "duration");
        c188727au.LIZLLL(z ? 1 : 0, "status");
        FMX.LJIIL("inbox_skylight_lifecycle", c188727au.LIZ);
    }
}
