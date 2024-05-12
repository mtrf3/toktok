package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class Y8M extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PRIVATE;
    public final String LIZJ = "x.getDebugInfo";

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C82966WhG> LIZ() {
        return C82966WhG.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<Y8R> LIZLLL() {
        return Y8R.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        IHostContextDepend iHostContextDepend;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        C82963WhD.LIZ(params);
        Y8P y8p = new Y8P(this, interfaceC31943CgF);
        C86291Xtn c86291Xtn = (C86291Xtn) LJII(C86291Xtn.class);
        if (c86291Xtn == null || (iHostContextDepend = c86291Xtn.LJ) == null) {
            C86291Xtn c86291Xtn2 = C86291Xtn.LJIIL;
            if (c86291Xtn2 != null) {
                iHostContextDepend = c86291Xtn2.LJ;
            } else {
                iHostContextDepend = null;
            }
        }
        if (iHostContextDepend == null) {
            AbstractC37780EsC.LJFF(this, interfaceC31943CgF, 0, "hostContextDepend not implemented", 8);
            return;
        }
        if (iHostContextDepend.isDebuggable()) {
            Y8R y8r = new Y8R();
            y8r.LIZ = Boolean.valueOf(iHostContextDepend.isBoeEnable());
            y8r.LIZJ = Boolean.valueOf(iHostContextDepend.isPPEEnable());
            y8r.LIZIZ = iHostContextDepend.getBoeChannel();
            y8r.LIZLLL = iHostContextDepend.getPPEChannel();
            y8p.LIZ(y8r, "");
            return;
        }
        AbstractC37780EsC.LJFF(this, interfaceC31943CgF, 0, "x.getDebugInfo is not allowed in non-debuggable env", 8);
    }
}
