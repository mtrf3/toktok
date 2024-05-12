package X;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PV8 implements F67 {
    public static final PV8 LJLIL = new PV8();

    @Override // X.F67
    public final void onChanged() {
        ExecutorService LIZJ = C38995FSd.LIZJ();
        o.LJIIIIZZ(LIZJ, "getDefaultExecutor()");
        LIZJ.execute(PV7.LJLIL);
    }
}
