package X;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobSupport;

/* renamed from: X.UaC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77432UaC extends MB6 implements InterfaceC79150V4o {
    public static final C77432UaC LJLIL = new C77432UaC();

    @Override // X.InterfaceC79150V4o
    public final void LIZIZ(CancellationException cancellationException) {
    }

    @Override // X.InterfaceC79150V4o
    public final boolean LJIILL() {
        return false;
    }

    @Override // X.InterfaceC79150V4o
    public final boolean isActive() {
        return true;
    }

    @Override // X.InterfaceC79150V4o
    public final boolean isCancelled() {
        return false;
    }

    @Override // X.InterfaceC79150V4o
    public final boolean isCompleted() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    public C77432UaC() {
        super(InterfaceC79150V4o.LJJJJJ);
    }

    @Override // X.InterfaceC79150V4o
    public final CancellationException LJJIIJ() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // X.InterfaceC79150V4o
    public final InterfaceC1039145z<InterfaceC79150V4o> LIZ() {
        return OJA.LIZ;
    }

    @Override // X.InterfaceC79150V4o
    public final T2N LJJIII(InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        return C77433UaD.LJLIL;
    }

    @Override // X.InterfaceC79150V4o
    public final InterfaceC77431UaB LJJIIJZLJL(JobSupport jobSupport) {
        return C77433UaD.LJLIL;
    }

    @Override // X.InterfaceC79150V4o
    public final Object LJJJJ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // X.InterfaceC79150V4o
    public final T2N LJIJI(boolean z, boolean z2, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        return C77433UaD.LJLIL;
    }
}
