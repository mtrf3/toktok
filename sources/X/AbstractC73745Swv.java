package X;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Swv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73745Swv<T> implements InterfaceC73650SvO<T> {
    public static final int LJLIL = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public abstract void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq);

    public static CallableC73731Swh LIZLLL(Callable callable) {
        return new CallableC73731Swh(callable);
    }

    public static C73742Sws LJFF(Object obj) {
        C73320Sq4.LIZ(obj, "item is null");
        return new C73742Sws(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> AbstractC73745Swv<R> LIZJ(InterfaceC48038ItG<? super T, ? extends InterfaceC73650SvO<? extends R>> interfaceC48038ItG) {
        int i = LJLIL;
        C73320Sq4.LIZ(interfaceC48038ItG, "mapper is null");
        C73320Sq4.LIZIZ(i, "maxConcurrency");
        C73320Sq4.LIZIZ(i, "bufferSize");
        if (this instanceof I97) {
            Object call = ((I97) this).call();
            if (call == null) {
                return C73751Sx1.LJLILLLLZI;
            }
            return new C73744Swu(interfaceC48038ItG, call);
        }
        return new C73746Sww(this, interfaceC48038ItG, i, i);
    }

    public final C73804Sxs LJI(InterfaceC48038ItG interfaceC48038ItG) {
        return new C73804Sxs(this, interfaceC48038ItG);
    }

    public final C73800Sxo LJII(AbstractC73946T0k abstractC73946T0k) {
        int i = LJLIL;
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        C73320Sq4.LIZIZ(i, "bufferSize");
        return new C73800Sxo(this, abstractC73946T0k, i);
    }

    public final InterfaceC92693kP LJIIIZ(InterfaceC64592gB<? super T> interfaceC64592gB) {
        return LJIIJJI(interfaceC64592gB, C73674Svm.LJFF, C73674Svm.LIZJ, EnumC73750Sx0.INSTANCE);
    }

    public final void LJIIL(InterfaceC73812Sy0<? super T> interfaceC73812Sy0) {
        C73320Sq4.LIZ(interfaceC73812Sy0, "s is null");
        try {
            LJIILIIL(interfaceC73812Sy0);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            V0N.LJJIL(th);
            C73548Stk.LIZIZ(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final C73748Swy LJIILJJIL(AbstractC73946T0k abstractC73946T0k) {
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73748Swy(this, abstractC73946T0k, !(this instanceof C73724Swa));
    }

    @Override // X.InterfaceC73650SvO
    public final void subscribe(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        if (interfaceC73740Swq instanceof InterfaceC73812Sy0) {
            LJIIL((InterfaceC73812Sy0) interfaceC73740Swq);
        } else {
            C73320Sq4.LIZ(interfaceC73740Swq, "s is null");
            LJIIL(new C73752Sx2(interfaceC73740Swq));
        }
    }

    public final C73780SxU LIZIZ(InterfaceC64592gB interfaceC64592gB, InterfaceC64592gB interfaceC64592gB2) {
        return new C73780SxU(this, interfaceC64592gB, interfaceC64592gB2);
    }

    public final C73781SxV LJIIIIZZ(long j, InterfaceC73592SuS interfaceC73592SuS) {
        if (j >= 0) {
            return new C73781SxV(this, j, interfaceC73592SuS);
        }
        throw new IllegalArgumentException(C61845OOz.LIZ("times >= 0 required but it was ", j));
    }

    public final InterfaceC92693kP LJIIJ(InterfaceC64592gB<? super T> interfaceC64592gB, InterfaceC64592gB<? super Throwable> interfaceC64592gB2) {
        return LJIIJJI(interfaceC64592gB, interfaceC64592gB2, C73674Svm.LIZJ, EnumC73750Sx0.INSTANCE);
    }

    public static C73749Swz LJ(long j, long j2, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k) {
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73749Swz(Math.max(0L, j), Math.max(0L, j2), timeUnit, abstractC73946T0k);
    }

    public final InterfaceC92693kP LJIIJJI(InterfaceC64592gB<? super T> interfaceC64592gB, InterfaceC64592gB<? super Throwable> interfaceC64592gB2, InterfaceC29937Boz interfaceC29937Boz, InterfaceC64592gB<? super InterfaceC73651SvP> interfaceC64592gB3) {
        C73320Sq4.LIZ(interfaceC64592gB3, "onSubscribe is null");
        C73666Sve c73666Sve = new C73666Sve(interfaceC64592gB, interfaceC64592gB2, interfaceC29937Boz, interfaceC64592gB3);
        LJIIL(c73666Sve);
        return c73666Sve;
    }
}
