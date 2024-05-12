package X;

import com.bytedance.ies.bullet.service.popup.BulletPopUpFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.NnP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60415NnP {
    public static BulletPopUpFragment LIZIZ(String containerID) {
        Object obj;
        o.LJIIJ(containerID, "containerID");
        Iterator it = ((ArrayList) BulletPopUpFragment.LLFFF).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((BulletPopUpFragment) obj).wl(), containerID)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (BulletPopUpFragment) obj;
    }

    public static BulletPopUpFragment LIZ(ActivityC45651qj activityC45651qj, InterfaceC59504NWy interfaceC59504NWy, InterfaceC60443Nnr interfaceC60443Nnr, C60556Npg c60556Npg) {
        BulletPopUpFragment bulletPopUpFragment = new BulletPopUpFragment();
        bulletPopUpFragment.LJLLLLLL = activityC45651qj;
        bulletPopUpFragment.LJZ = c60556Npg;
        bulletPopUpFragment.LJZI = interfaceC60443Nnr;
        bulletPopUpFragment.LJLZ = interfaceC59504NWy;
        C60218NkE c60218NkE = (C60218NkE) interfaceC59504NWy.LIZ().LLIIIILZ().LIZJ(C60218NkE.class);
        if (c60218NkE != null) {
            bulletPopUpFragment.LJZL = c60218NkE.LIZ;
        }
        return bulletPopUpFragment;
    }
}
