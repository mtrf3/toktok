package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.WjA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83084WjA extends AbstractC37780EsC {
    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.close";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C78152Ulo> LIZ() {
        return C78152Ulo.class;
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
        C86291Xtn c86291Xtn;
        IHostRouterDepend iHostRouterDepend;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "containerID", "");
        boolean LJJIIZI = u.LJJIIZI(params, "animated", false);
        C78152Ulo c78152Ulo = new C78152Ulo();
        if (LJJIJIL.length() > 0) {
            c78152Ulo.LIZ = LJJIJIL;
        }
        C83085WjB c83085WjB = new C83085WjB(this, interfaceC31943CgF);
        String str = c78152Ulo.LIZ;
        C86291Xtn c86291Xtn2 = (C86291Xtn) LJII(C86291Xtn.class);
        if ((c86291Xtn2 != null && (iHostRouterDepend = c86291Xtn2.LJI) != null) || ((c86291Xtn = C86291Xtn.LJIIL) != null && (iHostRouterDepend = c86291Xtn.LJI) != null)) {
            iHostRouterDepend.closeView(this.LIZ, type, str, LJJIIZI);
        }
        c83085WjB.LIZ(new C61335O5j(), "");
    }
}
