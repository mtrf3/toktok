package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LX6 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public String LJ;
    public final Integer LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public final C61878OQg LJIIIZ;

    public final C54394LWk LIZ() {
        return new C54394LWk(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ);
    }

    public LX6(int i, int i2, int i3, String impressionIds) {
        o.LJIIIZ(impressionIds, "impressionIds");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = impressionIds;
        this.LJ = "";
        this.LJFF = 0;
        this.LJI = "";
        this.LJII = "";
        this.LJIIIIZZ = "";
        this.LJIIIZ = C61878OQg.INSTANCE;
    }

    public static final LX6 LIZIZ(int i, int i2, int i3, String impressionIds) {
        o.LJIIIZ(impressionIds, "impressionIds");
        return new LX6(i, i2, i3, impressionIds);
    }
}
