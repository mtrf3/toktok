package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CompletedExceptionally;

/* loaded from: classes16.dex */
public final class XKT<T> extends XKU<T> implements XLE, InterfaceC67352kd<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater LJLJLJ = AtomicReferenceFieldUpdater.newUpdater(XKT.class, Object.class, "_reusableCancellableContinuation");
    public final XKW LJLJJI;
    public final InterfaceC67352kd<T> LJLJJL;
    public Object LJLJJLL;
    public final Object LJLJL;
    public volatile /* synthetic */ Object _reusableCancellableContinuation;

    @Override // X.XKU
    public final InterfaceC67352kd<T> LIZIZ() {
        return this;
    }

    @Override // X.InterfaceC67352kd
    public final MBA getContext() {
        return this.LJLJJL.getContext();
    }

    @Override // X.XKU
    public final Object LJII() {
        Object obj = this.LJLJJLL;
        this.LJLJJLL = XKV.LIZ;
        return obj;
    }

    public final XKS<T> LJIIIIZZ() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = XKV.LIZIZ;
                return null;
            }
            if (obj instanceof XKS) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLJLJ;
                C3BS c3bs = XKV.LIZIZ;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3bs)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return (XKS) obj;
            }
            if (obj != XKV.LIZIZ && !(obj instanceof Throwable)) {
                String LJIILLIIL = o.LJIILLIIL(obj, "Inconsistent state ");
                LJIILLIIL.toString();
                throw new IllegalStateException(LJIILLIIL);
            }
        }
    }

    public final boolean LJIIIZ() {
        if (this._reusableCancellableContinuation != null) {
            return true;
        }
        return false;
    }

    public final void LJIIJJI() {
        XKS xks;
        do {
        } while (this._reusableCancellableContinuation == XKV.LIZIZ);
        Object obj = this._reusableCancellableContinuation;
        if (!(obj instanceof XKS) || (xks = (XKS) obj) == null) {
            return;
        }
        xks.LJIIIIZZ();
    }

    @Override // X.XLE
    public final XLE getCallerFrame() {
        InterfaceC67352kd<T> interfaceC67352kd = this.LJLJJL;
        if (interfaceC67352kd instanceof XLE) {
            return (XLE) interfaceC67352kd;
        }
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DispatchedContinuation[");
        LIZ.append(this.LJLJJI);
        LIZ.append(", ");
        LIZ.append(C65314PkE.LJIIL(this.LJLJJL));
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean LJIIJ(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C3BS c3bs = XKV.LIZIZ;
            if (o.LJ(obj, c3bs)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLJLJ;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c3bs, th)) {
                    if (atomicReferenceFieldUpdater.get(this) != c3bs) {
                        break;
                    }
                }
                return true;
            }
            if (obj instanceof Throwable) {
                return true;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LJLJLJ;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    break;
                }
            }
            return false;
        }
    }

    public final Throwable LJIIL(XJL<?> xjl) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C3BS c3bs = XKV.LIZIZ;
            if (obj == c3bs) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLJLJ;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c3bs, xjl)) {
                    if (atomicReferenceFieldUpdater.get(this) != c3bs) {
                        break;
                    }
                }
                return null;
            }
            if (obj instanceof Throwable) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LJLJLJ;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        "Failed requirement.".toString();
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                return (Throwable) obj;
            }
            String LJIILLIIL = o.LJIILLIIL(obj, "Inconsistent state ");
            LJIILLIIL.toString();
            throw new IllegalStateException(LJIILLIIL);
        }
    }

    @Override // X.InterfaceC67352kd
    public final void resumeWith(Object obj) {
        Object completedExceptionally;
        MBA context = this.LJLJJL.getContext();
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(obj);
        if (m10exceptionOrNullimpl == null) {
            completedExceptionally = obj;
        } else {
            completedExceptionally = new CompletedExceptionally(m10exceptionOrNullimpl, false, 2, null);
        }
        if (this.LJLJJI.isDispatchNeeded(context)) {
            this.LJLJJLL = completedExceptionally;
            this.LJLJI = 0;
            this.LJLJJI.dispatch(context, this);
            return;
        }
        AbstractC78624UtQ LIZ = XJG.LIZ();
        if (LIZ.isUnconfinedLoopActive()) {
            this.LJLJJLL = completedExceptionally;
            this.LJLJI = 0;
            LIZ.dispatchUnconfined(this);
            return;
        }
        LIZ.incrementUseCount(true);
        try {
            MBA context2 = getContext();
            Object LIZJ = XLG.LIZJ(this.LJLJL, context2);
            try {
                this.LJLJJL.resumeWith(obj);
                do {
                } while (LIZ.processUnconfinedEvent());
            } finally {
                XLG.LIZ(LIZJ, context2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public XKT(XKW xkw, InterfaceC67352kd<? super T> interfaceC67352kd) {
        super(-1);
        this.LJLJJI = xkw;
        this.LJLJJL = interfaceC67352kd;
        this.LJLJJLL = XKV.LIZ;
        this.LJLJL = XLG.LIZIZ(getContext());
        this._reusableCancellableContinuation = null;
    }

    @Override // X.XKU
    public final void LIZ(Object obj, Throwable th) {
        if (obj instanceof C42161Ggf) {
            ((C42161Ggf) obj).LIZIZ.invoke(th);
        }
    }
}
