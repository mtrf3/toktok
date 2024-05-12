package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.EvK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37974EvK implements InterfaceC37978EvO {
    public static final C37974EvK LIZ = new C37974EvK();

    @Override // X.InterfaceC37978EvO
    public final C37961Ev7 LIZJ() {
        return new C37961Ev7(this);
    }

    @Override // X.InterfaceC37978EvO
    public final String LIZ() {
        return C38943FQd.LIZ();
    }

    @Override // X.InterfaceC37978EvO
    public final Executor LIZIZ() {
        ExecutorService LIZJ = C38995FSd.LIZJ();
        o.LJIIIIZZ(LIZJ, "getDefaultExecutor()");
        return LIZJ;
    }
}
