package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.O5n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61339O5n extends AbstractC37780EsC {
    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.showLoading";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C61341O5p> LIZ() {
        return C61341O5p.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C61335O5j> LIZLLL() {
        return C61335O5j.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return EnumC38005Evp.PRIVATE;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        boolean z;
        C86291Xtn c86291Xtn;
        IHostStyleUIDepend iHostStyleUIDepend;
        Boolean showLoading;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        if (u.LJJIJIL(params, "text", "").length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            u.LJJIJIL(params, "text", "");
        }
        new C61341O5p();
        C61340O5o c61340O5o = new C61340O5o(this, interfaceC31943CgF);
        C61338O5m c61338O5m = new C61338O5m();
        C86291Xtn c86291Xtn2 = (C86291Xtn) LJII(C86291Xtn.class);
        if (((c86291Xtn2 != null && (iHostStyleUIDepend = c86291Xtn2.LJFF) != null) || ((c86291Xtn = C86291Xtn.LJIIL) != null && (iHostStyleUIDepend = c86291Xtn.LJFF) != null)) && (showLoading = iHostStyleUIDepend.showLoading(c61338O5m, this.LIZ)) != null) {
            showLoading.booleanValue();
            c61340O5o.LIZIZ(new C61335O5j(), "");
        } else {
            c61340O5o.LIZ("");
        }
    }
}
