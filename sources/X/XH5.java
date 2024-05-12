package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XH5 implements InterfaceC84544XGa {
    public static XH8 LIZIZ;
    public static final XH5 LIZ = new XH5();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(VLN.LJLIL);
    public static final XJO LIZLLL = XJR.LIZ();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.XHX] */
    @Override // X.InterfaceC84544XGa
    public final InterfaceC65462ha LIZIZ(XGS request, XGZ runner) {
        Object obj;
        ?? r0;
        o.LJIIIZ(request, "request");
        o.LJIIIZ(runner, "runner");
        XH8 xh8 = request.LJLILLLLZI;
        o.LJIIIZ(xh8, "<this>");
        XHF xhf = XH4.LIZJ;
        XH4 xh4 = (XH4) xh8.LIZ(xhf);
        if (xh4 == null || (obj = xh4.LIZIZ) == null) {
            obj = XHX.LIZ;
        }
        C84570XHa c84570XHa = XHX.LIZ;
        if ((!o.LJ(obj, c84570XHa)) && obj != null) {
            LIZ.getClass();
            XH8 xh82 = request.LJLILLLLZI;
            o.LJIIIZ(xh82, "<this>");
            XH4 xh42 = (XH4) xh82.LIZ(xhf);
            if (xh42 != null && (r0 = xh42.LIZIZ) != 0) {
                c84570XHa = r0;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(c84570XHa.getClass());
            LIZ2.append('_');
            LIZ2.append(c84570XHa.LIZ());
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            C62822Ol8 c62822Ol8 = LIZJ;
            XHM xhm = (XHM) ((ConcurrentHashMap) c62822Ol8.getValue()).get(LIZIZ2);
            if (xhm == null) {
                xhm = new XHM(c84570XHa);
                ((ConcurrentHashMap) c62822Ol8.getValue()).put(LIZIZ2, xhm);
            }
            return new C3C3(new XHJ(request, xhm, runner, null));
        }
        return runner.LIZ(request);
    }
}
