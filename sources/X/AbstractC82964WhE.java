package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.WhE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82964WhE extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PRIVATE;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.updateGecko";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<? extends AbstractC37843EtD> LIZ() {
        return C82965WhF.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<? extends AbstractC37839Et9> LIZLLL() {
        return C79510VIk.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        boolean z;
        Boolean bool;
        IHostOpenDepend iHostOpenDepend;
        C86291Xtn c86291Xtn;
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
                boolean LJJIIZI = u.LJJIIZI(params, "isLazy", true);
                InterfaceC78505UrV interfaceC78505UrV = params.get("enableDownloadAutoRetry");
                if (interfaceC78505UrV.getType() == EnumC78522Urm.Boolean) {
                    bool = Boolean.valueOf(interfaceC78505UrV.asBoolean());
                } else {
                    bool = null;
                }
                C82965WhF c82965WhF = new C82965WhF();
                c82965WhF.LIZ = LJJIJIL;
                c82965WhF.LIZIZ = LJJIJIL2;
                c82965WhF.LIZJ = LJJIIZI;
                if (bool != null) {
                    c82965WhF.LIZLLL = bool.booleanValue();
                }
                C82956Wh6 c82956Wh6 = new C82956Wh6(this, interfaceC31943CgF);
                String str = c82965WhF.LIZ;
                if (str != null) {
                    String str2 = c82965WhF.LIZIZ;
                    if (str2 != null) {
                        boolean z2 = c82965WhF.LIZLLL;
                        C31926Cfy c31926Cfy = this.LIZ;
                        if (c31926Cfy == null || (c86291Xtn = (C86291Xtn) c31926Cfy.LIZ(C86291Xtn.class)) == null || (iHostOpenDepend = c86291Xtn.LIZLLL) == null) {
                            C86291Xtn c86291Xtn2 = C86291Xtn.LJIIL;
                            if (c86291Xtn2 != null) {
                                iHostOpenDepend = c86291Xtn2.LIZLLL;
                            }
                            c82956Wh6.LJIILL("updateGecko ability is not implemented");
                            return;
                        }
                        if (iHostOpenDepend != null && iHostOpenDepend.updateGecko(str2, str, c82965WhF.LIZJ, new C79512VIm(c82956Wh6), z2) != null) {
                            return;
                        }
                        c82956Wh6.LJIILL("updateGecko ability is not implemented");
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
