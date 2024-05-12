package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.Xvc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86404Xvc extends AbstractC37780EsC {
    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.reportADLog";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C86405Xvd> LIZ() {
        return C86405Xvd.class;
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
        IHostLogDepend iHostLogDepend;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "label", "");
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String LJJIJIL2 = u.LJJIJIL(params, "tag", "");
            if (LJJIJIL2.length() != 0) {
                String LJJIJIL3 = u.LJJIJIL(params, "refer", "");
                String LJJIJIL4 = u.LJJIJIL(params, "groupID", "");
                String LJJIJIL5 = u.LJJIJIL(params, "creativeID", "");
                String LJJIJIL6 = u.LJJIJIL(params, "logExtra", "");
                InterfaceC78280Uns LJJIJIIJIL = u.LJJIJIIJIL(params, "extraParams");
                C86405Xvd c86405Xvd = new C86405Xvd();
                c86405Xvd.LIZ = LJJIJIL;
                c86405Xvd.LIZIZ = LJJIJIL2;
                if (LJJIJIL3.length() > 0) {
                    c86405Xvd.LIZJ = LJJIJIL3;
                }
                if (LJJIJIL4.length() > 0) {
                    c86405Xvd.LIZLLL = LJJIJIL4;
                }
                if (LJJIJIL5.length() > 0) {
                    c86405Xvd.LJ = LJJIJIL5;
                }
                if (LJJIJIL6.length() > 0) {
                    c86405Xvd.LJFF = LJJIJIL6;
                }
                if (LJJIJIIJIL != null) {
                    c86405Xvd.LJI = LJJIJIIJIL;
                }
                C86403Xvb c86403Xvb = new C86403Xvb(this, interfaceC31943CgF);
                String str = c86405Xvd.LIZ;
                if (str != null) {
                    String str2 = c86405Xvd.LIZIZ;
                    if (str2 != null) {
                        C59963Ng7 c59963Ng7 = new C59963Ng7(str, str2, c86405Xvd.LIZJ, c86405Xvd.LIZLLL, c86405Xvd.LJ, c86405Xvd.LJFF, c86405Xvd.LJI);
                        C86291Xtn c86291Xtn = (C86291Xtn) LJII(C86291Xtn.class);
                        if (c86291Xtn == null || (iHostLogDepend = c86291Xtn.LIZIZ) == null) {
                            C86291Xtn c86291Xtn2 = C86291Xtn.LJIIL;
                            if (c86291Xtn2 == null) {
                                return;
                            } else {
                                iHostLogDepend = c86291Xtn2.LIZIZ;
                            }
                        }
                        if (iHostLogDepend != null) {
                            iHostLogDepend.handleReportADLog(this.LIZ, "x.reportADLog", c59963Ng7, new C86406Xve(c86403Xvb), type);
                            return;
                        }
                        return;
                    }
                    o.LJIJI("tag");
                    throw null;
                }
                o.LJIJI("label");
                throw null;
            }
        }
        AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
    }
}
