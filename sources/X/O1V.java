package X;

import defpackage.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O1V extends O1M {
    public List<String> LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public int LJIJJLI;
    public boolean LJIL;
    public int LJJ;

    public O1V() {
        this("");
    }

    @Override // X.O1M
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        LIZ.append("\n [fallbackDomains=");
        LIZ.append(this.LJIJ);
        LIZ.append(",shuffle = ");
        LIZ.append(this.LJIJI);
        LIZ.append(",cdnNoCache=");
        LIZ.append(this.LJIJJ);
        LIZ.append("，maxAttempt=");
        LIZ.append(this.LJIJJLI);
        LIZ.append("，isRemote=");
        LIZ.append(this.LJIL);
        LIZ.append(",useInteraction = ");
        return b0.LIZJ(LIZ, this.LJJ, ']', LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1V(String accessKey) {
        super(accessKey);
        o.LJIIJ(accessKey, "accessKey");
        this.LJIJ = new ArrayList();
    }

    public final O1M LIZ(O1M config) {
        o.LJIIJ(config, "config");
        if (config instanceof O1V) {
            O1V o1v = (O1V) config;
            this.LJIJ = o1v.LJIJ;
            this.LJIJI = o1v.LJIJI;
            this.LJIJJ = o1v.LJIJJ;
            this.LJIJJLI = o1v.LJIJJLI;
            this.LJJ = o1v.LJJ;
        }
        this.LIZ = config.LIZ;
        this.LIZJ = config.LIZJ;
        this.LIZLLL = config.LIZLLL;
        this.LJ = config.LJ;
        this.LJFF = config.LJFF;
        this.LJI = config.LJI;
        this.LJII = config.LJII;
        this.LJIIIIZZ = config.LJIIIIZZ;
        this.LJIIIZ = config.LJIIIZ;
        this.LJIIJ = config.LJIIJ;
        this.LJIIJJI = config.LJIIJJI;
        this.LJIILIIL = config.LJIILIIL;
        this.LJIILJJIL = config.LJIILJJIL;
        this.LJIIL = config.LJIIL;
        return this;
    }
}
