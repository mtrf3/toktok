package X;

import kotlin.jvm.internal.o;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupport;

/* loaded from: classes16.dex */
public abstract class XKZ<T> extends JobSupport implements InterfaceC67352kd<T>, InterfaceC70422pa {
    public final MBA LJLILLLLZI;

    @Override // kotlinx.coroutines.JobSupport
    public String LJJLIIIJ() {
        return super.LJJLIIIJ();
    }

    public void LJJZ(Throwable th, boolean z) {
    }

    public void LJJZZI(T t) {
    }

    @Override // kotlinx.coroutines.JobSupport
    public final String LJJJ() {
        return o.LJIILLIIL(" was cancelled", C16880lQ.LJLLJ(getClass()));
    }

    @Override // kotlinx.coroutines.JobSupport, X.InterfaceC79150V4o
    public boolean isActive() {
        return super.isActive();
    }

    @Override // X.InterfaceC67352kd
    public final MBA getContext() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLILLLLZI;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void LJJJLZIJ(XL6 xl6) {
        C78540Us4.LJIIJ(this.LJLILLLLZI, xl6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    public final void LJJLIIIJJIZ(Object obj) {
        if (obj instanceof CompletedExceptionally) {
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
            LJJZ(completedExceptionally.cause, completedExceptionally.getHandled());
        } else {
            LJJZZI(obj);
        }
    }

    public void LJJLL(Object obj) {
        LJJII(obj);
    }

    @Override // X.InterfaceC67352kd
    public final void resumeWith(Object obj) {
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(obj);
        if (m10exceptionOrNullimpl != null) {
            obj = new CompletedExceptionally(m10exceptionOrNullimpl, false, 2, null);
        }
        Object LJJLIIIIJ = LJJLIIIIJ(obj);
        if (LJJLIIIIJ == C84667XKt.LIZIZ) {
            return;
        }
        LJJLL(LJJLIIIIJ);
    }

    public XKZ(MBA mba, boolean z) {
        super(z);
        LJJJZ((InterfaceC79150V4o) mba.get(InterfaceC79150V4o.LJJJJJ));
        this.LJLILLLLZI = mba.plus(this);
    }
}
