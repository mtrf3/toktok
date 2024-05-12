package X;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Stj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73547Stj implements InterfaceC73445Ss5 {
    public abstract void LJIIL(InterfaceC73442Ss2 interfaceC73442Ss2);

    public final C73605Suf LJIIIIZZ() {
        return new C73605Suf(this);
    }

    public final InterfaceC92693kP LJIIJJI() {
        C73546Sti c73546Sti = new C73546Sti();
        LIZ(c73546Sti);
        return c73546Sti;
    }

    public static C73658SvW LJFF(InterfaceC29937Boz interfaceC29937Boz) {
        return new C73658SvW(interfaceC29937Boz);
    }

    public static C73657SvV LJI(Callable callable) {
        return new C73657SvV(callable);
    }

    @Override // X.InterfaceC73445Ss5
    public final void LIZ(InterfaceC73442Ss2 interfaceC73442Ss2) {
        C73320Sq4.LIZ(interfaceC73442Ss2, "s is null");
        try {
            LJIIL(interfaceC73442Ss2);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            V0N.LJJIL(th);
            C73548Stk.LIZIZ(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final C73444Ss4 LIZLLL(InterfaceC29937Boz interfaceC29937Boz) {
        return new C73444Ss4(this, interfaceC29937Boz);
    }

    public final C73451SsB LJII(AbstractC73946T0k abstractC73946T0k) {
        return new C73451SsB(this, abstractC73946T0k);
    }

    public final C73543Stf LJIIIZ(InterfaceC29937Boz interfaceC29937Boz) {
        C73543Stf c73543Stf = new C73543Stf(interfaceC29937Boz);
        LIZ(c73543Stf);
        return c73543Stf;
    }

    public final C73610Suk LJIILIIL(AbstractC73946T0k abstractC73946T0k) {
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73610Suk(this, abstractC73946T0k);
    }

    public static C73447Ss7 LJIILJJIL(long j, TimeUnit timeUnit) {
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73447Ss7(j, timeUnit, abstractC73946T0k);
    }

    public final C73449Ss9 LIZJ(long j, TimeUnit timeUnit) {
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        return new C73449Ss9(this, j, timeUnit, abstractC73946T0k);
    }

    public final C73543Stf LJIIJ(InterfaceC64592gB interfaceC64592gB, InterfaceC29937Boz interfaceC29937Boz) {
        C73320Sq4.LIZ(interfaceC29937Boz, "onComplete is null");
        C73543Stf c73543Stf = new C73543Stf(interfaceC64592gB, interfaceC29937Boz);
        LIZ(c73543Stf);
        return c73543Stf;
    }

    public final C73668Svg LJ(InterfaceC64592gB interfaceC64592gB, InterfaceC29937Boz interfaceC29937Boz, InterfaceC29937Boz interfaceC29937Boz2) {
        return new C73668Svg(this, interfaceC64592gB, interfaceC29937Boz, interfaceC29937Boz2);
    }
}
