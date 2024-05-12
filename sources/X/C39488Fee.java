package X;

import com.bytedance.pumbaa.common.interfaces.ILogger;
import com.bytedance.pumbaa.hybrid.base.NavigationConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fee, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39488Fee {
    public static ILogger LIZ;
    public static NavigationConfig LIZIZ;
    public static final List<InterfaceC39487Fed> LIZJ = new ArrayList();
    public static C39504Feu LIZLLL;

    public static void LIZ(VNU vnu, String str) {
        Object LIZ2;
        VNS LJI;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        List<InterfaceC39487Fed> list;
        if (vnu != null) {
            try {
                LJI = vnu.LJI();
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            if (LJI != null) {
                NavigationConfig navigationConfig = LIZIZ;
                if (navigationConfig != null && navigationConfig.enable && (interfaceC65784Pro = navigationConfig.LJLIL) != null && interfaceC65784Pro.invoke().booleanValue() && (list = LIZJ) != null) {
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC39487Fed) it.next()).LIZIZ(LJI, str, "LYNX");
                    }
                }
                LIZ2 = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ2);
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
                if (m10exceptionOrNullimpl != null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("error occur. ");
                    LIZ3.append(C38386F4s.LIZJ(m10exceptionOrNullimpl, false));
                    X1D.LIZIZ(LIZ3);
                }
            }
        }
    }
}
