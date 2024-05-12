package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class O03 extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PRIVATE;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.getGeckoInfo";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<? extends AbstractC37843EtD> LIZ() {
        return O04.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<? extends AbstractC37839Et9> LIZLLL() {
        return C61195Nzz.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        boolean z;
        C86291Xtn c86291Xtn;
        IHostOpenDepend iHostOpenDepend;
        C86291Xtn c86291Xtn2;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "channel", "");
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String LJJIJIL2 = u.LJJIJIL(params, "accessKey", "");
            if (LJJIJIL2.length() != 0) {
                O04 o04 = new O04();
                o04.LIZIZ = LJJIJIL;
                o04.LIZ = LJJIJIL2;
                O00 o00 = new O00(this, interfaceC31943CgF);
                String str = o04.LIZIZ;
                if (str != null) {
                    String str2 = o04.LIZ;
                    if (str2 != null) {
                        C31926Cfy c31926Cfy = this.LIZ;
                        if (((c31926Cfy == null || (c86291Xtn2 = (C86291Xtn) c31926Cfy.LIZ(C86291Xtn.class)) == null || (iHostOpenDepend = c86291Xtn2.LIZLLL) == null) && ((c86291Xtn = C86291Xtn.LJIIL) == null || (iHostOpenDepend = c86291Xtn.LIZLLL) == null)) || iHostOpenDepend.getGeckoInfo(str2, str, new C61194Nzy(o00)) == null) {
                            o00.LIZIZ();
                            return;
                        }
                        return;
                    }
                    o.LJIJI("accessKey");
                    throw null;
                }
                o.LJIJI("channel");
                throw null;
            }
        }
        AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
    }
}
