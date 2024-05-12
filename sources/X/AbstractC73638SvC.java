package X;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SvC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73638SvC<T> implements InterfaceC73471SsV<T> {
    public abstract void LJJIII(InterfaceC73463SsN<? super T> interfaceC73463SsN);

    public final T LJ() {
        C73665Svd c73665Svd = new C73665Svd();
        LIZ(c73665Svd);
        return (T) c73665Svd.LIZ();
    }

    public final InterfaceC92693kP LJJI() {
        return LJJII(C73674Svm.LIZLLL, C73674Svm.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC73672Svk<T> LJJIIJZLJL() {
        if (this instanceof L7V) {
            return ((L7V) this).LIZIZ();
        }
        return new C73563Stz(this);
    }

    public static C73579SuF LJI(InterfaceC66992k3 interfaceC66992k3) {
        return new C73579SuF(interfaceC66992k3);
    }

    public static C73475SsZ LJIILJJIL(Throwable th) {
        C73320Sq4.LIZ(th, "error is null");
        return new C73475SsZ(new CallableC73721SwX(th));
    }

    public static C73656SvU LJIILLIIL(Callable callable) {
        return new C73656SvU(callable);
    }

    public static C73460SsK LJIIZILJ(AbstractC73672Svk abstractC73672Svk) {
        C73320Sq4.LIZ(abstractC73672Svk, "observableSource is null");
        return new C73460SsK(abstractC73672Svk);
    }

    public static C73465SsP LJIJ(Object obj) {
        C73320Sq4.LIZ(obj, "value is null");
        return new C73465SsP(obj);
    }

    @Override // X.InterfaceC73471SsV
    public final void LIZ(InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        C73320Sq4.LIZ(interfaceC73463SsN, "subscriber is null");
        try {
            LJJIII(interfaceC73463SsN);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            V0N.LJJIL(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final <R> R LIZLLL(BZB<T, ? extends R> bzb) {
        C73320Sq4.LIZ(bzb, "converter is null");
        return bzb.LIZJ(this);
    }

    public final <R> AbstractC73638SvC<R> LJFF(InterfaceC73822SyA<? super T, ? extends R> interfaceC73822SyA) {
        C73320Sq4.LIZ(interfaceC73822SyA, "transformer is null");
        InterfaceC73471SsV<? extends R> LIZJ = interfaceC73822SyA.LIZJ(this);
        C73320Sq4.LIZ(LIZJ, "source is null");
        if (LIZJ instanceof AbstractC73638SvC) {
            return (AbstractC73638SvC) LIZJ;
        }
        return new C73489Ssn(LIZJ);
    }

    public final C73482Ssg LJIIIIZZ(InterfaceC64592gB interfaceC64592gB) {
        return new C73482Ssg(this, interfaceC64592gB);
    }

    public final C73480Sse LJIIIZ(InterfaceC29937Boz interfaceC29937Boz) {
        return new C73480Sse(this, interfaceC29937Boz);
    }

    public final C73641SvF LJIIJ(InterfaceC64592gB interfaceC64592gB) {
        return new C73641SvF(this, interfaceC64592gB);
    }

    public final C73639SvD LJIIJJI(InterfaceC73459SsJ interfaceC73459SsJ) {
        return new C73639SvD(this, interfaceC73459SsJ);
    }

    public final C73474SsY LJIIL(InterfaceC64592gB interfaceC64592gB) {
        return new C73474SsY(this, interfaceC64592gB);
    }

    public final C73643SvH LJIILIIL(InterfaceC64592gB interfaceC64592gB) {
        return new C73643SvH(this, interfaceC64592gB);
    }

    public final C73491Ssp LJIILL(InterfaceC48038ItG interfaceC48038ItG) {
        return new C73491Ssp(this, interfaceC48038ItG);
    }

    public final C73634Sv8 LJIJI(InterfaceC48038ItG interfaceC48038ItG) {
        return new C73634Sv8(this, interfaceC48038ItG);
    }

    public final C73470SsU LJIJJ(AbstractC73946T0k abstractC73946T0k) {
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73470SsU(this, abstractC73946T0k);
    }

    public final C73477Ssb LJIJJLI(InterfaceC48038ItG interfaceC48038ItG) {
        return new C73477Ssb(this, interfaceC48038ItG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C73648SvM LJIL(long j) {
        AbstractC73745Swv c73652SvQ;
        if (this instanceof InterfaceC31876CfA) {
            c73652SvQ = ((InterfaceC31876CfA) this).LIZJ();
        } else {
            c73652SvQ = new C73652SvQ(this);
        }
        c73652SvQ.getClass();
        return new C73648SvM(c73652SvQ.LJIIIIZZ(j, C73674Svm.LJI));
    }

    public final C73458SsI LJJ(InterfaceC73459SsJ interfaceC73459SsJ) {
        C73458SsI c73458SsI = new C73458SsI(interfaceC73459SsJ);
        LIZ(c73458SsI);
        return c73458SsI;
    }

    public final InterfaceC92693kP LJJIFFI(InterfaceC64592gB<? super T> interfaceC64592gB) {
        return LJJII(interfaceC64592gB, C73674Svm.LJFF);
    }

    public final C73613Sun LJJIIJ(AbstractC73946T0k abstractC73946T0k) {
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73613Sun(this, abstractC73946T0k);
    }

    public final C73823SyB LJII(long j, TimeUnit timeUnit) {
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73823SyB(this, j, timeUnit, abstractC73946T0k);
    }

    public final InterfaceC92693kP LJJII(InterfaceC64592gB<? super T> interfaceC64592gB, InterfaceC64592gB<? super Throwable> interfaceC64592gB2) {
        C73320Sq4.LIZ(interfaceC64592gB, "onSuccess is null");
        C73320Sq4.LIZ(interfaceC64592gB2, "onError is null");
        C73495Sst c73495Sst = new C73495Sst(interfaceC64592gB, interfaceC64592gB2);
        LIZ(c73495Sst);
        return c73495Sst;
    }

    public static C73898SzO LJJIIZ(AbstractC73638SvC abstractC73638SvC, AbstractC73638SvC abstractC73638SvC2, RTU rtu) {
        return new C73898SzO(new C73337SqL(rtu), new InterfaceC73471SsV[]{abstractC73638SvC, abstractC73638SvC2});
    }
}
