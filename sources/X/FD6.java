package X;

import Y.ARunnableS42S0100000_6;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FD6 {
    public static final ExecutorService LIZ = C16880lQ.LLLLZLLIL();

    public static void LIZ(InterfaceC65784Pro action) {
        o.LJIIJ(action, "action");
        LIZ.execute(new ARunnableS42S0100000_6(action, 123));
    }
}
