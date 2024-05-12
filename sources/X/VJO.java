package X;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes15.dex */
public abstract class VJO implements Runnable {
    public static final java.util.Map<Integer, Integer> LJLJJL = new LinkedHashMap();
    public static volatile int LJLJJLL;
    public final AtomicInteger LJLIL = new AtomicInteger(VJP.Waiting.ordinal());
    public volatile int LJLILLLLZI;
    public volatile int LJLJI;
    public final int LJLJJI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('(');
        LIZ.append(VJP.values()[this.LJLIL.get()].name());
        LIZ.append('-');
        LIZ.append(this.LJLILLLLZI);
        LIZ.append('-');
        LIZ.append(this.LJLJI);
        LIZ.append('-');
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        LIZ.append(super.toString());
        return X1D.LIZIZ(LIZ);
    }

    public VJO(int i) {
        this.LJLJJI = i;
    }
}
