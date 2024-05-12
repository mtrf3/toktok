package X;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobSupport;

/* renamed from: X.V4o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC79150V4o extends MBD {
    public static final C3T3 LJJJJJ = C3T3.LJLIL;

    InterfaceC1039145z<InterfaceC79150V4o> LIZ();

    void LIZIZ(CancellationException cancellationException);

    boolean LJIILL();

    T2N LJIJI(boolean z, boolean z2, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns);

    T2N LJJIII(InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns);

    CancellationException LJJIIJ();

    InterfaceC77431UaB LJJIIJZLJL(JobSupport jobSupport);

    Object LJJJJ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();
}
