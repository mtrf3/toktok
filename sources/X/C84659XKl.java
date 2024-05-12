package X;

import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupport;

/* renamed from: X.XKl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84659XKl<T> extends XKS<T> {
    public final JobSupport LJLJLLL;

    @Override // X.XKS
    public final String LJIIZILJ() {
        return "AwaitContinuation";
    }

    @Override // X.XKS
    public final Throwable LJIIJ(JobSupport jobSupport) {
        Throwable rootCause;
        Object LJJJLIIL = this.LJLJLLL.LJJJLIIL();
        if (!(LJJJLIIL instanceof JobSupport.Finishing) || (rootCause = ((JobSupport.Finishing) LJJJLIIL).getRootCause()) == null) {
            if (LJJJLIIL instanceof CompletedExceptionally) {
                return ((CompletedExceptionally) LJJJLIIL).cause;
            }
            return jobSupport.LJJIIJ();
        }
        return rootCause;
    }

    public C84659XKl(InterfaceC67352kd<? super T> interfaceC67352kd, JobSupport jobSupport) {
        super(1, interfaceC67352kd);
        this.LJLJLLL = jobSupport;
    }
}
