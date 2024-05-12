package X;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.0k0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16000k0 {
    public static final C44021o6 LIZ = C24410xZ.LIZJ(AnonymousClass222.LJLIL);

    public static C18I LIZ(InterfaceC24520xk interfaceC24520xk) {
        interfaceC24520xk.LJJIIJ(1680121376);
        C18I c18i = (C18I) interfaceC24520xk.LJIILLIIL(LIZ);
        if (c18i == null) {
            interfaceC24520xk.LJJIIJ(1680121441);
            Object obj = (Context) interfaceC24520xk.LJIILLIIL(C04Q.LIZJ);
            while (true) {
                if (obj instanceof ContextWrapper) {
                    if (obj instanceof C18I) {
                        break;
                    }
                    obj = ((ContextWrapper) obj).getBaseContext();
                    o.LJIIIIZZ(obj, "innerContext.baseContext");
                } else {
                    obj = null;
                    break;
                }
            }
            c18i = (C18I) obj;
            interfaceC24520xk.LJJIJIIJIL();
        } else {
            interfaceC24520xk.LJJIIJ(1680121384);
            interfaceC24520xk.LJJIJIIJIL();
        }
        interfaceC24520xk.LJJIJIIJIL();
        return c18i;
    }
}
