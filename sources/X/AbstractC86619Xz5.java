package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.Xz5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86619Xz5 extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PROTECT;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.scanCode";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C86626XzC> LIZ() {
        return C86626XzC.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C79508VIi> LIZLLL() {
        return C79508VIi.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        C86291Xtn c86291Xtn;
        IHostOpenDepend iHostOpenDepend;
        C86291Xtn c86291Xtn2;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        boolean z = false;
        if (!params.isNull("cameraOnly")) {
            if (params.getType("cameraOnly") == EnumC78522Urm.Boolean) {
                z = u.LJJIIZI(params, "cameraOnly", false);
            } else {
                AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
                return;
            }
        }
        C86626XzC c86626XzC = new C86626XzC();
        c86626XzC.LIZ = z;
        C86621Xz7 c86621Xz7 = new C86621Xz7(this, interfaceC31943CgF);
        boolean z2 = c86626XzC.LIZ;
        C31926Cfy c31926Cfy = this.LIZ;
        if ((c31926Cfy != null && (c86291Xtn2 = (C86291Xtn) c31926Cfy.LIZ(C86291Xtn.class)) != null && (iHostOpenDepend = c86291Xtn2.LIZLLL) != null) || ((c86291Xtn = C86291Xtn.LJIIL) != null && (iHostOpenDepend = c86291Xtn.LIZLLL) != null)) {
            iHostOpenDepend.scanCode(this.LIZ, z2, new C86627XzD(c86621Xz7));
        } else {
            c86621Xz7.LJIILL("openDepend not implemented in host");
        }
    }
}
