package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Sv9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73635Sv9<T> implements InterfaceC73504St2<T> {
    public abstract void LJIJI(InterfaceC73509St7<? super T> interfaceC73509St7);

    public final T LIZLLL() {
        C73665Svd c73665Svd = new C73665Svd();
        LIZ(c73665Svd);
        return (T) c73665Svd.LIZ();
    }

    public final InterfaceC92693kP LJIILL() {
        return LJIJ(C73674Svm.LIZLLL, C73674Svm.LJFF, C73674Svm.LIZJ);
    }

    public static C73517StF LJ(InterfaceC73518StG interfaceC73518StG) {
        return new C73517StF(interfaceC73518StG);
    }

    @Override // X.InterfaceC73504St2
    public final void LIZ(InterfaceC73509St7<? super T> interfaceC73509St7) {
        C73320Sq4.LIZ(interfaceC73509St7, "observer is null");
        try {
            LJIJI(interfaceC73509St7);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            V0N.LJJIL(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final C73525StN LJFF(InterfaceC29937Boz interfaceC29937Boz) {
        return new C73525StN(this, interfaceC29937Boz);
    }

    public final C73626Sv0 LJI(InterfaceC29937Boz interfaceC29937Boz) {
        C42222Ghe c42222Ghe = C73674Svm.LIZLLL;
        return new C73626Sv0(this, c42222Ghe, c42222Ghe, c42222Ghe, interfaceC29937Boz, C73674Svm.LIZJ);
    }

    public final C73626Sv0 LJII(InterfaceC29937Boz interfaceC29937Boz) {
        C42222Ghe c42222Ghe = C73674Svm.LIZLLL;
        return new C73626Sv0(this, c42222Ghe, c42222Ghe, c42222Ghe, C73674Svm.LIZJ, interfaceC29937Boz);
    }

    public final C73626Sv0 LJIIIIZZ(InterfaceC64592gB interfaceC64592gB) {
        C42222Ghe c42222Ghe = C73674Svm.LIZLLL;
        IMU imu = C73674Svm.LIZJ;
        return new C73626Sv0(this, c42222Ghe, c42222Ghe, interfaceC64592gB, imu, imu);
    }

    public final C73626Sv0 LJIIIZ(InterfaceC64592gB interfaceC64592gB) {
        C42222Ghe c42222Ghe = C73674Svm.LIZLLL;
        IMU imu = C73674Svm.LIZJ;
        return new C73626Sv0(this, c42222Ghe, interfaceC64592gB, c42222Ghe, imu, imu);
    }

    public final C73533StV LJIIJ(InterfaceC48038ItG interfaceC48038ItG) {
        return new C73533StV(this, interfaceC48038ItG);
    }

    public final C73627Sv1 LJIIJJI(InterfaceC48038ItG interfaceC48038ItG) {
        return new C73627Sv1(this, interfaceC48038ItG);
    }

    public final C73526StO LJIIL(AbstractC73946T0k abstractC73946T0k) {
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73526StO(this, abstractC73946T0k);
    }

    public final C73523StL LJIILIIL(InterfaceC48038ItG interfaceC48038ItG) {
        return new C73523StL(this, interfaceC48038ItG);
    }

    public final InterfaceC92693kP LJIILLIIL(InterfaceC64592gB<? super T> interfaceC64592gB) {
        return LJIJ(interfaceC64592gB, C73674Svm.LJFF, C73674Svm.LIZJ);
    }

    public final C73608Sui LJIJJ(AbstractC73946T0k abstractC73946T0k) {
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73608Sui(this, abstractC73946T0k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C73645SvJ LJIILJJIL(long j, InterfaceC73592SuS interfaceC73592SuS) {
        AbstractC73745Swv c73649SvN;
        if (this instanceof InterfaceC31876CfA) {
            c73649SvN = ((InterfaceC31876CfA) this).LIZJ();
        } else {
            c73649SvN = new C73649SvN(this);
        }
        return new C73645SvJ(c73649SvN.LJIIIIZZ(j, interfaceC73592SuS));
    }

    public final InterfaceC92693kP LJIIZILJ(InterfaceC64592gB<? super T> interfaceC64592gB, InterfaceC64592gB<? super Throwable> interfaceC64592gB2) {
        return LJIJ(interfaceC64592gB, interfaceC64592gB2, C73674Svm.LIZJ);
    }

    public final C73584SuK LJIJJLI(long j, TimeUnit timeUnit) {
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73584SuK(this, new C73520StI(Math.max(0L, j), timeUnit, abstractC73946T0k), null);
    }

    public final InterfaceC92693kP LJIJ(InterfaceC64592gB<? super T> interfaceC64592gB, InterfaceC64592gB<? super Throwable> interfaceC64592gB2, InterfaceC29937Boz interfaceC29937Boz) {
        C73320Sq4.LIZ(interfaceC64592gB, "onSuccess is null");
        C73320Sq4.LIZ(interfaceC64592gB2, "onError is null");
        C73320Sq4.LIZ(interfaceC29937Boz, "onComplete is null");
        C73514StC c73514StC = new C73514StC(interfaceC64592gB, interfaceC64592gB2, interfaceC29937Boz);
        LIZ(c73514StC);
        return c73514StC;
    }
}
