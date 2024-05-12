package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.WhB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82961WhB extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PRIVATE;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.getAPIParams";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C82966WhG> LIZ() {
        return C82966WhG.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C79502VIc> LIZLLL() {
        return C79502VIc.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        C86291Xtn c86291Xtn;
        IHostNetworkDepend iHostNetworkDepend;
        java.util.Map<String, ? extends Object> linkedHashMap;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        C82963WhD.LIZ(params);
        C82957Wh7 c82957Wh7 = new C82957Wh7(this, interfaceC31943CgF);
        C79502VIc c79502VIc = new C79502VIc();
        C86291Xtn c86291Xtn2 = (C86291Xtn) LJII(C86291Xtn.class);
        if (((c86291Xtn2 == null || (iHostNetworkDepend = c86291Xtn2.LJIIIIZZ) == null) && ((c86291Xtn = C86291Xtn.LJIIL) == null || (iHostNetworkDepend = c86291Xtn.LJIIIIZZ) == null)) || (linkedHashMap = iHostNetworkDepend.getAPIParams()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        c79502VIc.LIZ = linkedHashMap;
        c82957Wh7.LIZ(c79502VIc, "");
    }
}
