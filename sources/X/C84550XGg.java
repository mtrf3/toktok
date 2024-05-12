package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XGg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84550XGg implements InterfaceC84544XGa {
    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC57357MfB LIZ(XGS xgs) {
        InterfaceC57357MfB interfaceC57357MfB;
        XH8 xh8 = xgs.LJLILLLLZI;
        o.LJIIIZ(xh8, "<this>");
        C84569XGz c84569XGz = (C84569XGz) xh8.LIZ(C84569XGz.LIZJ);
        C57354Mf8 c57354Mf8 = null;
        if (c84569XGz != null) {
            c57354Mf8 = c84569XGz.LIZIZ;
        }
        if ((c57354Mf8 instanceof C57354Mf8) && c57354Mf8 != null) {
            Object obj = c57354Mf8.LIZ.get(xgs.LJLJJI.getValue());
            InterfaceC88471Ynr<Q, PO, DTO> interfaceC88471Ynr = c57354Mf8.LIZIZ;
            if (interfaceC88471Ynr != 0 && (interfaceC57357MfB = (InterfaceC57357MfB) interfaceC88471Ynr.invoke(xgs.LJLIL, obj)) != null) {
                return interfaceC57357MfB;
            }
            if (obj != null) {
                if (c57354Mf8.LIZLLL.isInstance(obj)) {
                    return (InterfaceC57357MfB) obj;
                }
                "Check failed.".toString();
                throw new IllegalStateException("Check failed.");
            }
            throw new RuntimeException("Cache Content Empty!!!");
        }
        throw new RuntimeException("Cache Instance Empty!!!");
    }

    @Override // X.InterfaceC84544XGa
    public final <D extends InterfaceC57357MfB> InterfaceC65462ha<XGX<D>> LIZIZ(XGS request, XGZ runner) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(runner, "runner");
        if (!(request.LJLIL instanceof InterfaceC57356MfA)) {
            return runner.LIZ(request);
        }
        return new C3C3(new C84549XGf(request, this, new XGY(request), runner, null));
    }
}
