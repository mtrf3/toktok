package X;

import android.content.Context;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.Whj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82995Whj extends AbstractC37780EsC {
    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.closeSocket";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C82997Whl> LIZ() {
        return C82997Whl.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C61335O5j> LIZLLL() {
        return C61335O5j.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return EnumC38005Evp.PROTECT;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        boolean z;
        InterfaceC37790EsM interfaceC37790EsM;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "containerID", "");
        String LJJIJIL2 = u.LJJIJIL(params, "socketTaskID", "");
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && LJJIJIL2.length() == 0) {
            AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
            return;
        }
        C82997Whl c82997Whl = new C82997Whl();
        if (LJJIJIL.length() > 0) {
            c82997Whl.LIZ = LJJIJIL;
        }
        if (LJJIJIL2.length() > 0) {
            c82997Whl.LIZIZ = LJJIJIL2;
        }
        C82994Whi c82994Whi = new C82994Whi(this, interfaceC31943CgF);
        C82998Whm c82998Whm = (C82998Whm) this;
        InterfaceC40311Frv interfaceC40311Frv = (InterfaceC40311Frv) c82998Whm.LJII(InterfaceC40311Frv.class);
        if (interfaceC40311Frv != null) {
            Context context = (Context) c82998Whm.LJII(Context.class);
            if (context != null) {
                String str = c82997Whl.LIZ;
                if ((str == null && ((interfaceC37790EsM = (InterfaceC37790EsM) c82998Whm.LJII(InterfaceC37790EsM.class)) == null || (str = interfaceC37790EsM.LIZ()) == null)) || str.length() == 0) {
                    c82994Whi.LJIILL("ContainerID not provided in host");
                    return;
                } else {
                    C79522VIw.LIZ(context, str, c82997Whl.LIZIZ, new C82996Whk(c82998Whm, c82994Whi, interfaceC40311Frv, c82997Whl));
                    return;
                }
            }
            c82994Whi.LJIILL("Context not provided in host");
            return;
        }
        c82994Whi.LJIILL("JsEventDelegate not provided in host");
    }
}
