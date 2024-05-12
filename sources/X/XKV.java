package X;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletedExceptionally;

/* loaded from: classes16.dex */
public final class XKV {
    public static final C3BS LIZ = new C3BS("UNDEFINED");
    public static final C3BS LIZIZ = new C3BS("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    public static final void LIZ(Object obj, InterfaceC67352kd interfaceC67352kd, InterfaceC88472Yns interfaceC88472Yns) {
        Object completedExceptionally;
        C84653XKf<?> c84653XKf;
        if (interfaceC67352kd instanceof XKT) {
            XKT xkt = (XKT) interfaceC67352kd;
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(obj);
            if (m10exceptionOrNullimpl == null) {
                if (interfaceC88472Yns != null) {
                    completedExceptionally = new C42161Ggf(obj, interfaceC88472Yns);
                } else {
                    completedExceptionally = obj;
                }
            } else {
                completedExceptionally = new CompletedExceptionally(m10exceptionOrNullimpl, false, 2, null);
            }
            if (xkt.LJLJJI.isDispatchNeeded(xkt.getContext())) {
                xkt.LJLJJLL = completedExceptionally;
                xkt.LJLJI = 1;
                xkt.LJLJJI.dispatch(xkt.getContext(), xkt);
                return;
            }
            AbstractC78624UtQ LIZ2 = XJG.LIZ();
            if (LIZ2.isUnconfinedLoopActive()) {
                xkt.LJLJJLL = completedExceptionally;
                xkt.LJLJI = 1;
                LIZ2.dispatchUnconfined(xkt);
                return;
            }
            LIZ2.incrementUseCount(true);
            try {
                InterfaceC79150V4o interfaceC79150V4o = (InterfaceC79150V4o) xkt.getContext().get(InterfaceC79150V4o.LJJJJJ);
                if (interfaceC79150V4o != null && !interfaceC79150V4o.isActive()) {
                    CancellationException LJJIIJ = interfaceC79150V4o.LJJIIJ();
                    xkt.LIZ(completedExceptionally, LJJIIJ);
                    C3C4 LIZ3 = C141335gf.LIZ(LJJIIJ);
                    C3C5.m7constructorimpl(LIZ3);
                    xkt.resumeWith(LIZ3);
                } else {
                    InterfaceC67352kd<T> interfaceC67352kd2 = xkt.LJLJJL;
                    Object obj2 = xkt.LJLJL;
                    MBA context = interfaceC67352kd2.getContext();
                    Object LIZJ = XLG.LIZJ(obj2, context);
                    if (LIZJ != XLG.LIZ) {
                        c84653XKf = C84648XKa.LIZIZ(interfaceC67352kd2, context, LIZJ);
                    } else {
                        c84653XKf = null;
                    }
                    try {
                        xkt.LJLJJL.resumeWith(obj);
                        if (c84653XKf == null || c84653XKf.LJJZZIII()) {
                            XLG.LIZ(LIZJ, context);
                        }
                    } catch (Throwable th) {
                        if (c84653XKf == null || c84653XKf.LJJZZIII()) {
                            XLG.LIZ(LIZJ, context);
                        }
                        throw th;
                    }
                }
                do {
                } while (LIZ2.processUnconfinedEvent());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        interfaceC67352kd.resumeWith(obj);
    }
}
