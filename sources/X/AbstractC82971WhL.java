package X;

import Y.IDCListenerS165S0100000_14;
import Y.IDCListenerS288S0100000_14;
import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.DialogBuilder;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.WhL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82971WhL extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PROTECT;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.showModal";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C82972WhM> LIZ() {
        return C82972WhM.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C79501VIb> LIZLLL() {
        return C79501VIb.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        String str;
        String str2;
        IDCListenerS165S0100000_14 iDCListenerS165S0100000_14;
        IDCListenerS288S0100000_14 iDCListenerS288S0100000_14;
        C86291Xtn c86291Xtn;
        IHostStyleUIDepend iHostStyleUIDepend;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "title", "");
        String LJJIJIL2 = u.LJJIJIL(params, "content", "");
        boolean LJJIIZI = u.LJJIIZI(params, "showCancel", false);
        String LJJIJIL3 = u.LJJIJIL(params, "cancelText", "");
        String LJJIJIL4 = u.LJJIJIL(params, "confirmText", "");
        boolean LJJIIZI2 = u.LJJIIZI(params, "tapMaskToDismiss", false);
        C82972WhM c82972WhM = new C82972WhM();
        o.LJIIJ(LJJIJIL, "<set-?>");
        c82972WhM.LIZ = LJJIJIL;
        o.LJIIJ(LJJIJIL2, "<set-?>");
        c82972WhM.LIZIZ = LJJIJIL2;
        c82972WhM.LIZJ = LJJIIZI;
        o.LJIIJ(LJJIJIL3, "<set-?>");
        c82972WhM.LIZLLL = LJJIJIL3;
        o.LJIIJ(LJJIJIL4, "<set-?>");
        c82972WhM.LJ = LJJIJIL4;
        c82972WhM.LJFF = LJJIIZI2;
        C82968WhI c82968WhI = new C82968WhI(this, interfaceC31943CgF);
        Activity LIZ = HT4.LIZ((Context) LJII(Context.class));
        if (LIZ != null) {
            boolean z = c82972WhM.LJFF;
            String str3 = c82972WhM.LJ;
            Boolean bool = null;
            if (str3 != null) {
                if (str3.length() > 0) {
                    str = c82972WhM.LJ;
                    if (str == null) {
                        o.LJIJI("confirmText");
                        throw null;
                    }
                } else {
                    str = "confirm";
                }
                String str4 = c82972WhM.LIZIZ;
                if (str4 != null) {
                    String str5 = c82972WhM.LIZ;
                    if (str5 != null) {
                        IDCListenerS165S0100000_14 iDCListenerS165S0100000_142 = new IDCListenerS165S0100000_14(c82968WhI, 7);
                        if (c82972WhM.LIZJ) {
                            String str6 = c82972WhM.LIZLLL;
                            if (str6 != null) {
                                if (str6.length() > 0) {
                                    str2 = c82972WhM.LIZLLL;
                                    if (str2 == null) {
                                        o.LJIJI("cancelText");
                                        throw null;
                                    }
                                } else {
                                    str2 = "cancel";
                                }
                                iDCListenerS165S0100000_14 = new IDCListenerS165S0100000_14(c82968WhI, 6);
                            } else {
                                o.LJIJI("cancelText");
                                throw null;
                            }
                        } else {
                            str2 = null;
                            iDCListenerS165S0100000_14 = null;
                        }
                        if (z) {
                            iDCListenerS288S0100000_14 = new IDCListenerS288S0100000_14(c82968WhI, 1);
                        } else {
                            iDCListenerS288S0100000_14 = null;
                        }
                        DialogBuilder dialogBuilder = new DialogBuilder(LIZ, str5, str4, str, iDCListenerS165S0100000_142, str2, iDCListenerS165S0100000_14, iDCListenerS288S0100000_14, z);
                        C86291Xtn c86291Xtn2 = (C86291Xtn) LJII(C86291Xtn.class);
                        if ((c86291Xtn2 != null && (iHostStyleUIDepend = c86291Xtn2.LJFF) != null) || ((c86291Xtn = C86291Xtn.LJIIL) != null && (iHostStyleUIDepend = c86291Xtn.LJFF) != null)) {
                            bool = iHostStyleUIDepend.showDialog(dialogBuilder);
                        }
                        boolean z2 = !o.LJ(bool, Boolean.TRUE);
                        return;
                    }
                    o.LJIJI("title");
                    throw null;
                }
                o.LJIJI("content");
                throw null;
            }
            o.LJIJI("confirmText");
            throw null;
        }
        c82968WhI.LIZIZ();
    }
}
