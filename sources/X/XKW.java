package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class XKW extends MB6 implements C3CQ {
    public static final C84672XKy Key = new C84672XKy();

    public abstract void dispatch(MBA mba, Runnable runnable);

    public boolean isDispatchNeeded(MBA mba) {
        return true;
    }

    public final XKW plus(XKW xkw) {
        return xkw;
    }

    public XKW() {
        super(C3CQ.LJJIJLIJ);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append('@');
        LIZ.append(C65314PkE.LJI(this));
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.MB6, X.MBD, X.MBA
    public <E extends MBD> E get(InterfaceC48698J9i<E> key) {
        o.LJIIIZ(key, "key");
        if (key instanceof AbstractC84670XKw) {
            AbstractC84670XKw abstractC84670XKw = (AbstractC84670XKw) key;
            InterfaceC48698J9i<?> key2 = getKey();
            o.LJIIIZ(key2, "key");
            if (key2 == abstractC84670XKw || abstractC84670XKw.LJLILLLLZI == key2) {
                E e = (E) abstractC84670XKw.LJLIL.invoke(this);
                if (e instanceof MBD) {
                    return e;
                }
            }
        } else if (C3CQ.LJJIJLIJ == key) {
            return this;
        }
        return null;
    }

    @Override // X.C3CQ
    public final <T> InterfaceC67352kd<T> interceptContinuation(InterfaceC67352kd<? super T> interfaceC67352kd) {
        return new XKT(this, interfaceC67352kd);
    }

    @Override // X.MB6, X.MBA
    public MBA minusKey(InterfaceC48698J9i<?> key) {
        o.LJIIIZ(key, "key");
        if (key instanceof AbstractC84670XKw) {
            AbstractC84670XKw abstractC84670XKw = (AbstractC84670XKw) key;
            InterfaceC48698J9i<?> key2 = getKey();
            o.LJIIIZ(key2, "key");
            if ((key2 == abstractC84670XKw || abstractC84670XKw.LJLILLLLZI == key2) && abstractC84670XKw.LJLIL.invoke(this) != null) {
                return MBB.INSTANCE;
            }
        } else if (C3CQ.LJJIJLIJ == key) {
            return MBB.INSTANCE;
        }
        return this;
    }

    @Override // X.C3CQ
    public final void releaseInterceptedContinuation(InterfaceC67352kd<?> interfaceC67352kd) {
        ((XKT) interfaceC67352kd).LJIIJJI();
    }

    public void dispatchYield(MBA mba, Runnable runnable) {
        dispatch(mba, runnable);
    }
}
