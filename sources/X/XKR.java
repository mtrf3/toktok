package X;

import Y.ARunnableS34S0200000_15;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CompletedExceptionally;

/* loaded from: classes16.dex */
public final class XKR<R> extends XJT implements XKG<R>, InterfaceC67352kd<R>, XLE {
    public static final /* synthetic */ AtomicReferenceFieldUpdater LJLJJL = AtomicReferenceFieldUpdater.newUpdater(XKR.class, Object.class, "_state");
    public static final /* synthetic */ AtomicReferenceFieldUpdater LJLJJLL = AtomicReferenceFieldUpdater.newUpdater(XKR.class, Object.class, "_result");
    public final InterfaceC67352kd<R> LJLJJI;
    public volatile /* synthetic */ Object _state = C84636XJo.LIZ;
    public volatile /* synthetic */ Object _result = C84636XJo.LIZJ;
    public volatile /* synthetic */ Object _parentHandle = null;

    @Override // X.XKG
    public final InterfaceC67352kd<R> LJIIJJI() {
        return this;
    }

    @Override // X.XKG
    public final boolean LIZ() {
        while (true) {
            Object obj = this._state;
            if (obj == C84636XJo.LIZ) {
                return false;
            }
            if (obj instanceof XJU) {
                ((XJU) obj).LIZJ(this);
            } else {
                return true;
            }
        }
    }

    @Override // X.XKG
    public final Object LIZJ() {
        while (true) {
            Object obj = this._state;
            C3BS c3bs = C84636XJo.LIZ;
            if (obj == c3bs) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLJJL;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c3bs, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != c3bs) {
                        break;
                    }
                }
                LJJII();
                return C84646XJy.LIZ;
            }
            if (!(obj instanceof XJU)) {
                return null;
            }
            ((XJU) obj).LIZJ(this);
        }
    }

    public final void LJJII() {
        T2N t2n = (T2N) this._parentHandle;
        if (t2n != null) {
            t2n.dispose();
        }
        for (C84629XJh c84629XJh = (C84629XJh) LJIILLIIL(); !o.LJ(c84629XJh, this); c84629XJh = c84629XJh.LJIIZILJ()) {
            if (c84629XJh instanceof XL3) {
                ((XL3) c84629XJh).LJLJJI.dispose();
            }
        }
    }

    @Override // X.XLE
    public final XLE getCallerFrame() {
        InterfaceC67352kd<R> interfaceC67352kd = this.LJLJJI;
        if (interfaceC67352kd instanceof XLE) {
            return (XLE) interfaceC67352kd;
        }
        return null;
    }

    @Override // X.InterfaceC67352kd
    public final MBA getContext() {
        return this.LJLJJI.getContext();
    }

    @Override // X.XKG
    public final boolean LJ() {
        Object LIZJ = LIZJ();
        if (LIZJ == C84646XJy.LIZ) {
            return true;
        }
        if (LIZJ == null) {
            return false;
        }
        String LJIILLIIL = o.LJIILLIIL(LIZJ, "Unexpected trySelectIdempotent result ");
        LJIILLIIL.toString();
        throw new IllegalStateException(LJIILLIIL);
    }

    public final Object LJJIII() {
        InterfaceC79150V4o interfaceC79150V4o;
        if (!LIZ() && (interfaceC79150V4o = (InterfaceC79150V4o) getContext().get(InterfaceC79150V4o.LJJJJJ)) != null) {
            T2N LIZ = V87.LIZ(interfaceC79150V4o, true, new C84663XKp(this), 2);
            this._parentHandle = LIZ;
            if (LIZ()) {
                LIZ.dispose();
            }
        }
        Object obj = this._result;
        C3BS c3bs = C84636XJo.LIZJ;
        if (obj == c3bs) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLJJLL;
            EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c3bs, enumC58928NAu)) {
                if (atomicReferenceFieldUpdater.get(this) != c3bs) {
                    obj = this._result;
                }
            }
            return EnumC58928NAu.COROUTINE_SUSPENDED;
        }
        if (obj != C84636XJo.LIZLLL) {
            if (!(obj instanceof CompletedExceptionally)) {
                return obj;
            }
            throw ((CompletedExceptionally) obj).cause;
        }
        throw new IllegalStateException("Already resumed");
    }

    @Override // X.C84629XJh
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectInstance(state=");
        LIZ.append(this._state);
        LIZ.append(", result=");
        return U26.LIZJ(LIZ, this._result, ')', LIZ);
    }

    public XKR(C3CC c3cc) {
        this.LJLJJI = c3cc;
    }

    @Override // X.XKG
    public final void LJFF(Throwable th) {
        while (true) {
            Object obj = this._result;
            C3BS c3bs = C84636XJo.LIZJ;
            if (obj == c3bs) {
                CompletedExceptionally completedExceptionally = new CompletedExceptionally(th, false, 2, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLJJLL;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c3bs, completedExceptionally)) {
                    if (atomicReferenceFieldUpdater.get(this) != c3bs) {
                        break;
                    }
                }
                return;
            }
            EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
            if (obj == enumC58928NAu) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LJLJJLL;
                C3BS c3bs2 = C84636XJo.LIZLLL;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC58928NAu, c3bs2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != enumC58928NAu) {
                        break;
                    }
                }
                OUR.LJ(th, C78555UsJ.LJJII(this.LJLJJI));
                return;
            }
            throw new IllegalStateException("Already resumed");
        }
    }

    @Override // X.XKG
    public final Object LJIIIZ(C84643XJv c84643XJv) {
        return new C84635XJn(this, c84643XJv).LIZJ(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r3.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0009, code lost:
    
        if (LIZ() == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (LJIJ().LJIIL(r1, r2) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (LIZ() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        return;
     */
    @Override // X.XKG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(X.T2N r3) {
        /*
            r2 = this;
            X.XL3 r1 = new X.XL3
            r1.<init>(r3)
            boolean r0 = r2.LIZ()
            if (r0 != 0) goto L1c
        Lb:
            X.XJh r0 = r2.LJIJ()
            boolean r0 = r0.LJIIL(r1, r2)
            if (r0 == 0) goto Lb
            boolean r0 = r2.LIZ()
            if (r0 != 0) goto L1c
            return
        L1c:
            r3.dispose()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XKR.LJIIJ(X.T2N):void");
    }

    @Override // X.InterfaceC67352kd
    public final void resumeWith(Object obj) {
        Object completedExceptionally;
        while (true) {
            Object obj2 = this._result;
            C3BS c3bs = C84636XJo.LIZJ;
            if (obj2 == c3bs) {
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(obj);
                if (m10exceptionOrNullimpl == null) {
                    completedExceptionally = obj;
                } else {
                    completedExceptionally = new CompletedExceptionally(m10exceptionOrNullimpl, false, 2, null);
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLJJLL;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c3bs, completedExceptionally)) {
                    if (atomicReferenceFieldUpdater.get(this) != c3bs) {
                        break;
                    }
                }
                return;
            }
            EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
            if (obj2 == enumC58928NAu) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LJLJJLL;
                C3BS c3bs2 = C84636XJo.LIZLLL;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC58928NAu, c3bs2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != enumC58928NAu) {
                        break;
                    }
                }
                if (C3C5.m12isFailureimpl(obj)) {
                    InterfaceC67352kd<R> interfaceC67352kd = this.LJLJJI;
                    Throwable m10exceptionOrNullimpl2 = C3C5.m10exceptionOrNullimpl(obj);
                    o.LJI(m10exceptionOrNullimpl2);
                    C3C4 LIZ = C141335gf.LIZ(m10exceptionOrNullimpl2);
                    C3C5.m7constructorimpl(LIZ);
                    interfaceC67352kd.resumeWith(LIZ);
                    return;
                }
                this.LJLJJI.resumeWith(obj);
                return;
            }
            throw new IllegalStateException("Already resumed");
        }
    }

    public final void LJJIIJ(long j, C3CA c3ca) {
        if (j <= 0) {
            if (LJ()) {
                try {
                    C65777Prh.LJ(1, c3ca);
                    Object invoke = c3ca.invoke(this);
                    if (invoke != EnumC58928NAu.COROUTINE_SUSPENDED) {
                        C3C5.m7constructorimpl(invoke);
                        resumeWith(invoke);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    C3C4 LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                    resumeWith(LIZ);
                    return;
                }
            }
            return;
        }
        LJIIJ(C1JD.LJFF(getContext()).invokeOnTimeout(j, new ARunnableS34S0200000_15(this, c3ca, 37), getContext()));
    }
}
