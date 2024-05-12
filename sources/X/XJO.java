package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XJO implements InterfaceC75422xe {
    public static final /* synthetic */ AtomicReferenceFieldUpdater LIZ = AtomicReferenceFieldUpdater.newUpdater(XJO.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state;

    public final String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof XJS) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Mutex[");
                return U26.LIZJ(LIZ2, ((XJS) obj).LIZ, ']', LIZ2);
            }
            if (obj instanceof XJU) {
                ((XJU) obj).LIZJ(this);
            } else {
                if (obj instanceof XJQ) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Mutex[");
                    return U26.LIZJ(LIZ3, ((XJQ) obj).LJLJJI, ']', LIZ3);
                }
                String LJIILLIIL = o.LJIILLIIL(obj, "Illegal state ");
                LJIILLIIL.toString();
                throw new IllegalStateException(LJIILLIIL);
            }
        }
    }

    public XJO(boolean z) {
        XJS xjs;
        if (z) {
            xjs = XJR.LIZLLL;
        } else {
            xjs = XJR.LJ;
        }
        this._state = xjs;
    }

    @Override // X.InterfaceC75422xe
    public final void LIZIZ(Object obj) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof XJS) {
                if (obj == null) {
                    if (((XJS) obj2).LIZ == XJR.LIZJ) {
                        "Mutex is not locked".toString();
                        throw new IllegalStateException("Mutex is not locked");
                    }
                } else {
                    XJS xjs = (XJS) obj2;
                    if (xjs.LIZ != obj) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Mutex is locked by ");
                        LIZ2.append(xjs.LIZ);
                        LIZ2.append(" but expected ");
                        LIZ2.append(obj);
                        String LIZIZ = X1D.LIZIZ(LIZ2);
                        LIZIZ.toString();
                        throw new IllegalStateException(LIZIZ);
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LIZ;
                XJS xjs2 = XJR.LJ;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, xjs2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            if (obj2 instanceof XJU) {
                ((XJU) obj2).LIZJ(this);
            } else if (obj2 instanceof XJQ) {
                if (obj != null) {
                    XJQ xjq = (XJQ) obj2;
                    if (xjq.LJLJJI != obj) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("Mutex is locked by ");
                        LIZ3.append(xjq.LJLJJI);
                        LIZ3.append(" but expected ");
                        LIZ3.append(obj);
                        String LIZIZ2 = X1D.LIZIZ(LIZ3);
                        LIZIZ2.toString();
                        throw new IllegalStateException(LIZIZ2);
                    }
                }
                XJQ xjq2 = (XJQ) obj2;
                while (true) {
                    C84629XJh c84629XJh = (C84629XJh) xjq2.LJIILLIIL();
                    if (c84629XJh == xjq2) {
                        XJP xjp = new XJP(xjq2);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LIZ;
                        while (true) {
                            if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, xjp)) {
                                if (xjp.LIZJ(this) == null) {
                                    return;
                                }
                            } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                break;
                            }
                        }
                    } else if (c84629XJh.LJIL()) {
                        XJN xjn = (XJN) c84629XJh;
                        if (xjn.LJJIII()) {
                            Object obj3 = xjn.LJLJJI;
                            if (obj3 == null) {
                                obj3 = XJR.LIZIZ;
                            }
                            xjq2.LJLJJI = obj3;
                            xjn.LJJII();
                            return;
                        }
                    } else {
                        ((X9N) c84629XJh.LJIILLIIL()).LIZ.LJIJI();
                    }
                }
            } else {
                String LJIILLIIL = o.LJIILLIIL(obj2, "Illegal state ");
                LJIILLIIL.toString();
                throw new IllegalStateException(LJIILLIIL);
            }
        }
    }

    public final boolean LIZJ(Object obj) {
        XJS xjs;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof XJS) {
                if (((XJS) obj2).LIZ != XJR.LIZJ) {
                    return false;
                }
                if (obj == null) {
                    xjs = XJR.LIZLLL;
                } else {
                    xjs = new XJS(obj);
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LIZ;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, xjs)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return true;
            }
            if (obj2 instanceof XJQ) {
                if (((XJQ) obj2).LJLJJI != obj) {
                    return false;
                }
                String LJIILLIIL = o.LJIILLIIL(obj, "Already locked by ");
                LJIILLIIL.toString();
                throw new IllegalStateException(LJIILLIIL);
            }
            if (obj2 instanceof XJU) {
                ((XJU) obj2).LIZJ(this);
            } else {
                String LJIILLIIL2 = o.LJIILLIIL(obj2, "Illegal state ");
                LJIILLIIL2.toString();
                throw new IllegalStateException(LJIILLIIL2);
            }
        }
    }

    @Override // X.InterfaceC75422xe
    public final Object LIZ(Object obj, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        XJS xjs;
        if (LIZJ(obj)) {
            return C76800UCe.LIZ;
        }
        XKS LJIILIIL = C78929UyL.LJIILIIL(C78555UsJ.LJJII(interfaceC67352kd));
        XJM xjm = new XJM(this, obj, LJIILIIL);
        loop0: while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof XJS) {
                XJS xjs2 = (XJS) obj2;
                if (xjs2.LIZ != XJR.LIZJ) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LIZ;
                    XJQ xjq = new XJQ(xjs2.LIZ);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, xjq) && atomicReferenceFieldUpdater.get(this) == obj2) {
                    }
                } else {
                    if (obj == null) {
                        xjs = XJR.LIZLLL;
                    } else {
                        xjs = new XJS(obj);
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LIZ;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, xjs)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    }
                    LJIILIIL.LJJIIZ(C76800UCe.LIZ, new AqS146S0200000_15(this, obj, 55));
                    break loop0;
                }
            } else if (obj2 instanceof XJQ) {
                XJQ xjq2 = (XJQ) obj2;
                if (xjq2.LJLJJI == obj) {
                    String LJIILLIIL = o.LJIILLIIL(obj, "Already locked by ");
                    LJIILLIIL.toString();
                    throw new IllegalStateException(LJIILLIIL);
                }
                do {
                } while (!xjq2.LJIJ().LJIIL(xjm, xjq2));
                if (this._state == obj2) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = XJN.LJLJJL;
                Boolean bool = Boolean.FALSE;
                Boolean bool2 = Boolean.TRUE;
                while (!atomicReferenceFieldUpdater3.compareAndSet(xjm, bool, bool2)) {
                    if (atomicReferenceFieldUpdater3.get(xjm) != bool) {
                        break loop0;
                    }
                }
                xjm = new XJM(this, obj, LJIILIIL);
            } else if (obj2 instanceof XJU) {
                ((XJU) obj2).LIZJ(this);
            } else {
                String LJIILLIIL2 = o.LJIILLIIL(obj2, "Illegal state ");
                LJIILLIIL2.toString();
                throw new IllegalStateException(LJIILLIIL2);
            }
        }
        LJIILIIL.LJIILIIL(new X9L(xjm));
        Object LJIIJJI = LJIILIIL.LJIIJJI();
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        if (LJIIJJI != enumC58928NAu) {
            LJIIJJI = C76800UCe.LIZ;
        }
        if (LJIIJJI == enumC58928NAu) {
            return LJIIJJI;
        }
        return C76800UCe.LIZ;
    }
}
