package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService;
import com.ss.android.ugc.aweme.im.sdk.iescore.IMCoreDependProxyService;

/* renamed from: X.4ZL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ZL {
    public static final /* synthetic */ int LIZ = 0;

    public static final IIMCoreDependProxyService LJ() {
        Object LIZ2 = C58096Mr6.LIZ(IIMCoreDependProxyService.class, false);
        if (LIZ2 != null) {
            return (IIMCoreDependProxyService) LIZ2;
        }
        if (C58096Mr6.j1 == null) {
            synchronized (IIMCoreDependProxyService.class) {
                if (C58096Mr6.j1 == null) {
                    C58096Mr6.j1 = new IMCoreDependProxyService();
                }
            }
        }
        return C58096Mr6.j1;
    }

    public static QXX LIZ() {
        LJ().LIZIZ();
        return C4ZG.LJLIL;
    }

    public static InterfaceC114804ey LIZIZ() {
        LJ().LIZLLL();
        return C82873Nb.LIZ;
    }

    public static InterfaceC114794ex LIZJ() {
        LJ().LJII();
        return C114834f1.LIZ;
    }

    public static InterfaceC76502zO LIZLLL() {
        return LJ().LJFF();
    }

    public static C4ZP LJFF() {
        LJ().LIZJ();
        return new C4ZP() { // from class: X.4ZN
        };
    }

    public static InterfaceC106764Gy LJI() {
        LJ().LJI();
        return C115074fP.LJLIL;
    }
}
