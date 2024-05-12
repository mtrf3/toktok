package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVP {
    public final long LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final String LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append('@');
        LIZ.append(this.LIZIZ);
        LIZ.append('@');
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    public RVP(int i, long j, String currency) {
        o.LJIIIZ(currency, "currency");
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = currency;
    }
}
