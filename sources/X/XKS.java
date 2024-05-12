package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupport;

/* loaded from: classes16.dex */
public class XKS<T> extends XKU<T> implements XJL<T>, XLE {
    public static final /* synthetic */ AtomicIntegerFieldUpdater LJLJL = AtomicIntegerFieldUpdater.newUpdater(XKS.class, "_decision");
    public static final /* synthetic */ AtomicReferenceFieldUpdater LJLJLJ = AtomicReferenceFieldUpdater.newUpdater(XKS.class, Object.class, "_state");
    public final InterfaceC67352kd<T> LJLJJI;
    public final MBA LJLJJL;
    public T2N LJLJJLL;
    public volatile /* synthetic */ int _decision;
    public volatile /* synthetic */ Object _state;

    public String LJIIZILJ() {
        return "CancellableContinuation";
    }

    public final void LJIIIIZZ() {
        T2N t2n = this.LJLJJLL;
        if (t2n == null) {
            return;
        }
        t2n.dispose();
        this.LJLJJLL = C77433UaD.LJLIL;
    }

    public final T2N LJIILJJIL() {
        InterfaceC79150V4o interfaceC79150V4o = (InterfaceC79150V4o) this.LJLJJL.get(InterfaceC79150V4o.LJJJJJ);
        if (interfaceC79150V4o == null) {
            return null;
        }
        T2N LIZ = V87.LIZ(interfaceC79150V4o, true, new C84660XKm(this), 2);
        this.LJLJJLL = LIZ;
        return LIZ;
    }

    public final boolean LJIILL() {
        if (this.LJLJI == 2 && ((XKT) this.LJLJJI).LJIIIZ()) {
            return true;
        }
        return false;
    }

    public final boolean LJIJI() {
        Object obj = this._state;
        if ((obj instanceof X9S) && ((X9S) obj).LIZLLL != null) {
            LJIIIIZZ();
            return false;
        }
        this._decision = 0;
        this._state = XLC.LJLIL;
        return true;
    }

    @Override // X.XJL
    public final void LJJIJIIJIL() {
        LJIIIZ(this.LJLJI);
    }

    @Override // X.XLE
    public final XLE getCallerFrame() {
        InterfaceC67352kd<T> interfaceC67352kd = this.LJLJJI;
        if (interfaceC67352kd instanceof XLE) {
            return (XLE) interfaceC67352kd;
        }
        return null;
    }

    @Override // X.XJL
    public final boolean isActive() {
        return this._state instanceof InterfaceC30550Bys;
    }

    @Override // X.XJL
    public final boolean isCancelled() {
        return this._state instanceof C3CO;
    }

    @Override // X.XJL
    public final boolean isCompleted() {
        return !(this._state instanceof InterfaceC30550Bys);
    }

    public final Object LJIIJJI() {
        boolean z;
        InterfaceC79150V4o interfaceC79150V4o;
        XKT xkt;
        Throwable LJIIL;
        XKT xkt2;
        Throwable LJIIL2;
        boolean LJIILL = LJIILL();
        while (true) {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    z = false;
                } else {
                    "Already suspended".toString();
                    throw new IllegalStateException("Already suspended");
                }
            } else if (LJLJL.compareAndSet(this, 0, 1)) {
                z = true;
                break;
            }
        }
        if (z) {
            if (this.LJLJJLL == null) {
                LJIILJJIL();
            }
            if (LJIILL) {
                InterfaceC67352kd<T> interfaceC67352kd = this.LJLJJI;
                if ((interfaceC67352kd instanceof XKT) && (xkt2 = (XKT) interfaceC67352kd) != null && (LJIIL2 = xkt2.LJIIL(this)) != null) {
                    LJIIIIZZ();
                    LJJIJIL(LJIIL2);
                }
            }
            return EnumC58928NAu.COROUTINE_SUSPENDED;
        }
        if (LJIILL) {
            InterfaceC67352kd<T> interfaceC67352kd2 = this.LJLJJI;
            if ((interfaceC67352kd2 instanceof XKT) && (xkt = (XKT) interfaceC67352kd2) != null && (LJIIL = xkt.LJIIL(this)) != null) {
                LJIIIIZZ();
                LJJIJIL(LJIIL);
            }
        }
        Object obj = this._state;
        if (!(obj instanceof CompletedExceptionally)) {
            int i2 = this.LJLJI;
            if ((i2 != 1 && i2 != 2) || (interfaceC79150V4o = (InterfaceC79150V4o) this.LJLJJL.get(InterfaceC79150V4o.LJJJJJ)) == null || interfaceC79150V4o.isActive()) {
                return LJ(obj);
            }
            CancellationException LJJIIJ = interfaceC79150V4o.LJJIIJ();
            LIZ(obj, LJJIIJ);
            throw LJJIIJ;
        }
        throw ((CompletedExceptionally) obj).cause;
    }

    public final void LJIIL() {
        T2N LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null && isCompleted()) {
            LJIILJJIL.dispose();
            this.LJLJJLL = C77433UaD.LJLIL;
        }
    }

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIIZILJ());
        LIZ.append('(');
        LIZ.append(C65314PkE.LJIIL(this.LJLJJI));
        LIZ.append("){");
        Object obj = this._state;
        if (obj instanceof InterfaceC30550Bys) {
            str = "Active";
        } else if (obj instanceof C3CO) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        LIZ.append(str);
        LIZ.append("}@");
        LIZ.append(C65314PkE.LJI(this));
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.XKU
    public final InterfaceC67352kd<T> LIZIZ() {
        return this.LJLJJI;
    }

    @Override // X.XKU
    public final Object LJII() {
        return this._state;
    }

    @Override // X.InterfaceC67352kd
    public final MBA getContext() {
        return this.LJLJJL;
    }

    @Override // X.XKU
    public final Throwable LIZJ(Object obj) {
        Throwable LIZJ = super.LIZJ(obj);
        if (LIZJ == null) {
            return null;
        }
        return LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XKU
    public final <T> T LJ(Object obj) {
        if (obj instanceof X9S) {
            return (T) ((X9S) obj).LIZ;
        }
        return obj;
    }

    /* JADX WARN: Finally extract failed */
    public final void LJIIIZ(int i) {
        boolean z;
        boolean z2;
        do {
            int i2 = this._decision;
            boolean z3 = false;
            if (i2 != 0) {
                if (i2 == 1) {
                    InterfaceC67352kd<T> interfaceC67352kd = this.LJLJJI;
                    if (i == 4) {
                        z = true;
                    } else {
                        z = false;
                        if (interfaceC67352kd instanceof XKT) {
                            if (i == 1 || i == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int i3 = this.LJLJI;
                            if (i3 == 1 || i3 == 2) {
                                z3 = true;
                            }
                            if (z2 == z3) {
                                XKW xkw = ((XKT) interfaceC67352kd).LJLJJI;
                                MBA context = interfaceC67352kd.getContext();
                                if (xkw.isDispatchNeeded(context)) {
                                    xkw.dispatch(context, this);
                                    return;
                                }
                                AbstractC78624UtQ LIZ = XJG.LIZ();
                                if (LIZ.isUnconfinedLoopActive()) {
                                    LIZ.dispatchUnconfined(this);
                                    return;
                                }
                                LIZ.incrementUseCount(true);
                                try {
                                    C1E5.LJIIJ(this, this.LJLJJI, true);
                                    do {
                                    } while (LIZ.processUnconfinedEvent());
                                } catch (Throwable th) {
                                    try {
                                        LJFF(th, null);
                                    } finally {
                                        LIZ.decrementUseCount(true);
                                    }
                                }
                                return;
                            }
                        }
                    }
                    C1E5.LJIIJ(this, interfaceC67352kd, z);
                    return;
                }
                "Already resumed".toString();
                throw new IllegalStateException("Already resumed");
            }
        } while (!LJLJL.compareAndSet(this, 0, 2));
    }

    public Throwable LJIIJ(JobSupport jobSupport) {
        return jobSupport.LJJIIJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XJL
    public final void LJIILIIL(InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        X9H x9i;
        if (interfaceC88472Yns instanceof X9H) {
            x9i = (X9H) interfaceC88472Yns;
        } else {
            x9i = new X9I(interfaceC88472Yns);
        }
        while (true) {
            Object obj = this._state;
            if (obj instanceof XLC) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLJLJ;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x9i)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof X9H)) {
                if (obj instanceof CompletedExceptionally) {
                    CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
                    if (completedExceptionally.makeHandled()) {
                        if (obj instanceof C3CO) {
                            try {
                                interfaceC88472Yns.invoke(completedExceptionally.cause);
                                return;
                            } catch (Throwable th) {
                                C78540Us4.LJIIJ(this.LJLJJL, new XL6(o.LJIILLIIL(this, "Exception in invokeOnCancellation handler for "), th));
                                return;
                            }
                        }
                        return;
                    }
                    LJIILLIIL(obj, interfaceC88472Yns);
                    throw null;
                }
                if (obj instanceof X9S) {
                    X9S x9s = (X9S) obj;
                    if (x9s.LIZIZ == null) {
                        if (x9i instanceof X9K) {
                            return;
                        }
                        Throwable th2 = x9s.LJ;
                        if (th2 == null) {
                            X9S LIZ = X9S.LIZ(x9s, x9i, null, 29);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LJLJLJ;
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, LIZ)) {
                                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                    break;
                                }
                            }
                            return;
                        }
                        try {
                            interfaceC88472Yns.invoke(th2);
                            return;
                        } catch (Throwable th3) {
                            C78540Us4.LJIIJ(this.LJLJJL, new XL6(o.LJIILLIIL(this, "Exception in invokeOnCancellation handler for "), th3));
                            return;
                        }
                    }
                    LJIILLIIL(obj, interfaceC88472Yns);
                    throw null;
                }
                if (x9i instanceof X9K) {
                    return;
                }
                X9S x9s2 = new X9S(obj, x9i, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 28);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = LJLJLJ;
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, x9s2)) {
                    if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            LJIILLIIL(obj, interfaceC88472Yns);
            throw null;
        }
    }

    @Override // X.XJL
    public final boolean LJJIJIL(Throwable th) {
        X9G x9g;
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof InterfaceC30550Bys)) {
                return false;
            }
            boolean z = obj instanceof X9H;
            C3CO c3co = new C3CO(this, th, z);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLJLJ;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3co)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (z && (x9g = (X9G) obj) != null) {
                try {
                    x9g.LIZ(th);
                } catch (Throwable th2) {
                    C78540Us4.LJIIJ(this.LJLJJL, new XL6(o.LJIILLIIL(this, "Exception in invokeOnCancellation handler for "), th2));
                }
            }
            if (!LJIILL()) {
                LJIIIIZZ();
            }
            LJIIIZ(this.LJLJI);
            return true;
        }
    }

    @Override // X.XJL
    public final C3BS LJJJI(Throwable th) {
        return LJJ(new CompletedExceptionally(th, false, 2, null), null, null);
    }

    @Override // X.InterfaceC67352kd
    public final void resumeWith(Object obj) {
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(obj);
        if (m10exceptionOrNullimpl != null) {
            obj = new CompletedExceptionally(m10exceptionOrNullimpl, false, 2, null);
        }
        LJIJJLI(this.LJLJI, obj, null);
    }

    public XKS(int i, InterfaceC67352kd interfaceC67352kd) {
        super(i);
        this.LJLJJI = interfaceC67352kd;
        this.LJLJJL = interfaceC67352kd.getContext();
        this._decision = 0;
        this._state = XLC.LJLIL;
    }

    public static void LJIILLIIL(Object obj, InterfaceC88472Yns interfaceC88472Yns) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("It's prohibited to register multiple handlers, tried to register ");
        LIZ.append(interfaceC88472Yns);
        LIZ.append(", already has ");
        LIZ.append(obj);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }

    @Override // X.XKU
    public final void LIZ(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof InterfaceC30550Bys)) {
                if (obj2 instanceof CompletedExceptionally) {
                    return;
                }
                if (obj2 instanceof X9S) {
                    X9S x9s = (X9S) obj2;
                    if (x9s.LJ != null) {
                        "Must be called at most once".toString();
                        throw new IllegalStateException("Must be called at most once");
                    }
                    X9S LIZ = X9S.LIZ(x9s, null, th, 15);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLJLJ;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, LIZ)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    X9H x9h = x9s.LIZIZ;
                    if (x9h != null) {
                        try {
                            x9h.LIZ(th);
                        } catch (Throwable th2) {
                            C78540Us4.LJIIJ(this.LJLJJL, new XL6(o.LJIILLIIL(this, "Exception in invokeOnCancellation handler for "), th2));
                        }
                    }
                    InterfaceC88472Yns<Throwable, C76800UCe> interfaceC88472Yns = x9s.LIZJ;
                    if (interfaceC88472Yns == null) {
                        return;
                    }
                    try {
                        interfaceC88472Yns.invoke(th);
                        return;
                    } catch (Throwable th3) {
                        C78540Us4.LJIIJ(this.LJLJJL, new XL6(o.LJIILLIIL(this, "Exception in resume onCancellation handler for "), th3));
                        return;
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LJLJLJ;
                X9H x9h2 = null;
                X9S x9s2 = new X9S(obj2, x9h2, x9h2, x9h2, th, 14);
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, x9s2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            "Not completed".toString();
            throw new IllegalStateException("Not completed");
        }
    }

    @Override // X.XJL
    public final void LJIJJ(XKW xkw, C76800UCe c76800UCe) {
        XKW xkw2;
        int i;
        XKT xkt;
        InterfaceC67352kd<T> interfaceC67352kd = this.LJLJJI;
        if (!(interfaceC67352kd instanceof XKT) || (xkt = (XKT) interfaceC67352kd) == null) {
            xkw2 = null;
        } else {
            xkw2 = xkt.LJLJJI;
        }
        if (xkw2 == xkw) {
            i = 4;
        } else {
            i = this.LJLJI;
        }
        LJIJJLI(i, c76800UCe, null);
    }

    @Override // X.XJL
    public final void LJJIIZ(T t, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        LJIJJLI(this.LJLJI, t, interfaceC88472Yns);
    }

    @Override // X.XJL
    public final C3BS LJJIZ(Object obj, Object obj2) {
        return LJJ(obj, obj2, null);
    }

    @Override // X.XJL
    public final C3BS LIZLLL(Object obj, AbstractC84633XJl abstractC84633XJl, InterfaceC88472Yns interfaceC88472Yns) {
        return LJJ(obj, abstractC84633XJl, interfaceC88472Yns);
    }

    public final void LJIJJLI(int i, Object obj, InterfaceC88472Yns interfaceC88472Yns) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof InterfaceC30550Bys) {
                Object LJIL = LJIL((InterfaceC30550Bys) obj2, obj, i, interfaceC88472Yns, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLJLJ;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, LJIL)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!LJIILL()) {
                    LJIIIIZZ();
                }
                LJIIIZ(i);
                return;
            }
            if (obj2 instanceof C3CO) {
                CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj2;
                completedExceptionally.getClass();
                if (C3CO.LIZ.compareAndSet(completedExceptionally, 0, 1)) {
                    if (interfaceC88472Yns == null) {
                        return;
                    }
                    try {
                        interfaceC88472Yns.invoke(completedExceptionally.cause);
                        return;
                    } catch (Throwable th) {
                        C78540Us4.LJIIJ(this.LJLJJL, new XL6(o.LJIILLIIL(this, "Exception in resume onCancellation handler for "), th));
                        return;
                    }
                }
            }
            String LJIILLIIL = o.LJIILLIIL(obj, "Already resumed, but proposed with update ");
            LJIILLIIL.toString();
            throw new IllegalStateException(LJIILLIIL);
        }
    }

    public final C3BS LJJ(Object obj, Object obj2, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        while (true) {
            Object obj3 = this._state;
            if (obj3 instanceof InterfaceC30550Bys) {
                Object LJIL = LJIL((InterfaceC30550Bys) obj3, obj, this.LJLJI, interfaceC88472Yns, obj2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLJLJ;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, LJIL)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                if (!LJIILL()) {
                    LJIIIIZZ();
                }
                return C84646XJy.LIZ;
            }
            if ((obj3 instanceof X9S) && obj2 != null && ((X9S) obj3).LIZLLL == obj2) {
                return C84646XJy.LIZ;
            }
            return null;
        }
    }

    public static Object LJIL(InterfaceC30550Bys interfaceC30550Bys, Object obj, int i, InterfaceC88472Yns interfaceC88472Yns, Object obj2) {
        X9H x9h;
        if (obj instanceof CompletedExceptionally) {
            return obj;
        }
        if (i != 1 && i != 2 && obj2 == null) {
            return obj;
        }
        if (interfaceC88472Yns == null && ((!(interfaceC30550Bys instanceof X9H) || (interfaceC30550Bys instanceof X9K)) && obj2 == null)) {
            return obj;
        }
        if (interfaceC30550Bys instanceof X9H) {
            x9h = (X9H) interfaceC30550Bys;
        } else {
            x9h = null;
        }
        return new X9S(obj, x9h, interfaceC88472Yns, obj2, null, 16);
    }
}
