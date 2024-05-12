package X;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CompletedExceptionally;

/* loaded from: classes16.dex */
public final class XKX {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T LJ(MBA mba, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super T>, ? extends Object> interfaceC88471Ynr) {
        AbstractC78624UtQ abstractC78624UtQ;
        MBA LIZ;
        long processNextEvent;
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        C3CQ c3cq = (C3CQ) mba.get(C3CQ.LJJIJLIJ);
        CompletedExceptionally completedExceptionally = null;
        if (c3cq == null) {
            abstractC78624UtQ = XJG.LIZ();
            LIZ = C84648XKa.LIZ(C780334l.LJLIL, mba.plus(abstractC78624UtQ));
        } else {
            if (c3cq instanceof AbstractC78624UtQ) {
                abstractC78624UtQ = (AbstractC78624UtQ) c3cq;
            } else {
                abstractC78624UtQ = null;
            }
            if (abstractC78624UtQ == null || !abstractC78624UtQ.shouldBeProcessedFromContext()) {
                abstractC78624UtQ = null;
            }
            if (abstractC78624UtQ == null) {
                abstractC78624UtQ = XJG.LIZ.get();
            }
            LIZ = C84648XKa.LIZ(C780334l.LJLIL, mba);
        }
        XKP xkp = new XKP(LIZ, LLLLIIIILLL, abstractC78624UtQ);
        XKY.DEFAULT.invoke(interfaceC88471Ynr, xkp, xkp);
        AbstractC78624UtQ abstractC78624UtQ2 = xkp.LJLJJI;
        if (abstractC78624UtQ2 != null) {
            AbstractC78624UtQ.incrementUseCount$default(abstractC78624UtQ2, false, 1, null);
        }
        while (!Thread.interrupted()) {
            try {
                AbstractC78624UtQ abstractC78624UtQ3 = xkp.LJLJJI;
                if (abstractC78624UtQ3 == null) {
                    processNextEvent = Long.MAX_VALUE;
                } else {
                    processNextEvent = abstractC78624UtQ3.processNextEvent();
                }
                if (!xkp.isCompleted()) {
                    LockSupport.parkNanos(xkp, processNextEvent);
                } else {
                    AbstractC78624UtQ abstractC78624UtQ4 = xkp.LJLJJI;
                    if (abstractC78624UtQ4 != null) {
                        AbstractC78624UtQ.decrementUseCount$default(abstractC78624UtQ4, false, 1, null);
                    }
                    T t = (T) C84667XKt.LIZ(xkp.LJJJLIIL());
                    if (t instanceof CompletedExceptionally) {
                        completedExceptionally = (CompletedExceptionally) t;
                    }
                    if (completedExceptionally == null) {
                        return t;
                    }
                    throw completedExceptionally.cause;
                }
            } catch (Throwable th) {
                AbstractC78624UtQ abstractC78624UtQ5 = xkp.LJLJJI;
                if (abstractC78624UtQ5 != null) {
                    AbstractC78624UtQ.decrementUseCount$default(abstractC78624UtQ5, false, 1, null);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        xkp.LJJIJIIJI(interruptedException);
        throw interruptedException;
    }

    public static final <T> Object LJI(MBA mba, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super T>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super T> interfaceC67352kd) {
        MBA context = interfaceC67352kd.getContext();
        MBA plus = context.plus(mba);
        C79146V4k.LJJIIJ(plus);
        if (plus == context) {
            C84662XKo c84662XKo = new C84662XKo(interfaceC67352kd, plus);
            return C78555UsJ.LJJJIL(c84662XKo, c84662XKo, interfaceC88471Ynr);
        }
        C3CR c3cr = C3CQ.LJJIJLIJ;
        if (o.LJ(plus.get(c3cr), context.get(c3cr))) {
            C84653XKf c84653XKf = new C84653XKf(interfaceC67352kd, plus);
            Object LIZJ = XLG.LIZJ(null, plus);
            try {
                return C78555UsJ.LJJJIL(c84653XKf, c84653XKf, interfaceC88471Ynr);
            } finally {
                XLG.LIZ(LIZJ, plus);
            }
        }
        C84651XKd c84651XKd = new C84651XKd(interfaceC67352kd, plus);
        try {
            InterfaceC67352kd LJJII = C78555UsJ.LJJII(C78555UsJ.LJIILIIL(interfaceC88471Ynr, c84651XKd, c84651XKd));
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            XKV.LIZ(c76800UCe, LJJII, null);
            return c84651XKd.LJJZZIII();
        } catch (Throwable th) {
            C79000UzU.LIZJ(th, c84651XKd);
            throw null;
        }
    }

    public static final C84661XKn LIZ(InterfaceC70422pa interfaceC70422pa, MBA mba, XKY xky, InterfaceC88471Ynr interfaceC88471Ynr) {
        C84661XKn c84661XKn;
        MBA LIZ = C84648XKa.LIZ(interfaceC70422pa, mba);
        if (xky.isLazy()) {
            c84661XKn = new C84655XKh(LIZ, interfaceC88471Ynr);
        } else {
            c84661XKn = new C84661XKn(LIZ, true);
        }
        xky.invoke(interfaceC88471Ynr, c84661XKn, c84661XKn);
        return c84661XKn;
    }

    public static final XKQ LIZJ(InterfaceC70422pa interfaceC70422pa, MBA mba, XKY xky, InterfaceC88471Ynr interfaceC88471Ynr) {
        XKQ xkq;
        MBA LIZ = C84648XKa.LIZ(interfaceC70422pa, mba);
        if (xky.isLazy()) {
            xkq = new C84658XKk(LIZ, interfaceC88471Ynr);
        } else {
            xkq = new XKQ(LIZ, true);
        }
        xky.invoke(interfaceC88471Ynr, xkq, xkq);
        return xkq;
    }

    public static /* synthetic */ C84661XKn LIZIZ(InterfaceC70422pa interfaceC70422pa, MBD mbd, XKY xky, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        MBA mba = mbd;
        if ((i & 1) != 0) {
            mba = MBB.INSTANCE;
        }
        if ((i & 2) != 0) {
            xky = XKY.DEFAULT;
        }
        return LIZ(interfaceC70422pa, mba, xky, interfaceC88471Ynr);
    }

    public static /* synthetic */ XKQ LIZLLL(InterfaceC70422pa interfaceC70422pa, MBA mba, XKY xky, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        if ((i & 1) != 0) {
            mba = MBB.INSTANCE;
        }
        if ((i & 2) != 0) {
            xky = XKY.DEFAULT;
        }
        return LIZJ(interfaceC70422pa, mba, xky, interfaceC88471Ynr);
    }
}
