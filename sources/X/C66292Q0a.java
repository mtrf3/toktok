package X;

import com.bytedance.bpea.core.IBPEALazyInit;
import com.bytedance.pumbaa.pdp.api.IPolicyDecision;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.TTPSystemAPIInit;
import kotlin.jvm.internal.AqS115S0300000_11;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.Q0a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66292Q0a {
    public static final C66296Q0e LIZ;

    static {
        IBPEALazyInit iBPEALazyInit;
        Object LIZ2 = C58096Mr6.LIZ(IBPEALazyInit.class, false);
        if (LIZ2 != null) {
            iBPEALazyInit = (IBPEALazyInit) LIZ2;
        } else {
            if (C58096Mr6.n2 == null) {
                synchronized (IBPEALazyInit.class) {
                    if (C58096Mr6.n2 == null) {
                        C58096Mr6.n2 = new TTPSystemAPIInit();
                    }
                }
            }
            iBPEALazyInit = C58096Mr6.n2;
        }
        if (iBPEALazyInit != null) {
            iBPEALazyInit.LIZ();
        }
        LIZ = new C66296Q0e();
    }

    public static Object LIZ(OHW ohw, AqS158S0200000_11 aqS158S0200000_11) {
        IPolicyDecision iPolicyDecision = Q0O.LIZIZ;
        if (iPolicyDecision == null) {
            boolean z = Q0O.LIZ;
            C66293Q0b.LIZ(ohw);
            if (aqS158S0200000_11 == null) {
                return null;
            }
            return aqS158S0200000_11.invoke();
        }
        boolean z2 = Q0O.LIZ;
        return LIZIZ(ohw, "PDPCheck", null, new AqS115S0300000_11(ohw, iPolicyDecision, aqS158S0200000_11, 4));
    }

    public static Object LIZIZ(OHW context, String eventType, C66296Q0e c66296Q0e, InterfaceC88472Yns interfaceC88472Yns) {
        Object invoke;
        o.LJIIJ(context, "context");
        o.LJIIJ(eventType, "eventType");
        C66297Q0f.LJIIL.getClass();
        C66297Q0f LIZ2 = C66299Q0h.LIZ(context, eventType);
        try {
            try {
                try {
                    invoke = interfaceC88472Yns.invoke(LIZ2);
                } catch (Q0C e) {
                    if (Q0O.LIZ) {
                        C16880lQ.LLLLIIL(e);
                    }
                    LIZ2.LIZJ(EnumC66303Q0l.ERROR);
                    LIZ2.LIZJ = e.getErrorCode();
                    LIZ2.LIZLLL = e.getErrorMsg();
                    LIZ2.LJI = e;
                    throw e;
                }
            } catch (Throwable th) {
                if (c66296Q0e != null) {
                    invoke = c66296Q0e.invoke(th, LIZ2);
                } else {
                    throw th;
                }
            }
            LIZ2.LJ.LIZ();
            Q0Z.LIZ(LIZ2);
            return invoke;
        } catch (Throwable th2) {
            LIZ2.LJ.LIZ();
            Q0Z.LIZ(LIZ2);
            throw th2;
        }
    }
}
