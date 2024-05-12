package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostFrameworkDepend;
import kotlin.jvm.internal.o;

/* renamed from: X.WhC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82962WhC extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PUBLIC;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.getContainerID";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C82966WhG> LIZ() {
        return C82966WhG.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C79524VIy> LIZLLL() {
        return C79524VIy.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        C86291Xtn c86291Xtn;
        IHostFrameworkDepend iHostFrameworkDepend;
        String containerID;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        C82963WhD.LIZ(params);
        C82959Wh9 c82959Wh9 = new C82959Wh9(this, interfaceC31943CgF);
        C86291Xtn c86291Xtn2 = (C86291Xtn) LJII(C86291Xtn.class);
        if (((c86291Xtn2 != null && (iHostFrameworkDepend = c86291Xtn2.LIZ) != null) || ((c86291Xtn = C86291Xtn.LJIIL) != null && (iHostFrameworkDepend = c86291Xtn.LIZ) != null)) && (containerID = iHostFrameworkDepend.getContainerID(this.LIZ)) != null) {
            C79524VIy c79524VIy = new C79524VIy();
            c79524VIy.LIZ = containerID;
            c82959Wh9.LIZIZ(c79524VIy, "");
            return;
        }
        c82959Wh9.LIZ();
    }
}
