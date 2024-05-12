package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.O5s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61344O5s extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PUBLIC;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.hideLoading";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C61346O5u> LIZ() {
        return C61346O5u.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C61335O5j> LIZLLL() {
        return C61335O5j.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        IHostStyleUIDepend iHostStyleUIDepend;
        Boolean hideLoading;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        boolean LJJIIZI = u.LJJIIZI(params, "forContainer", false);
        new C61346O5u();
        C61345O5t c61345O5t = new C61345O5t(this, interfaceC31943CgF);
        C60991Nwh c60991Nwh = new C60991Nwh();
        c60991Nwh.LIZ = LJJIIZI;
        C86291Xtn c86291Xtn = (C86291Xtn) LJII(C86291Xtn.class);
        if (c86291Xtn == null || (iHostStyleUIDepend = c86291Xtn.LJFF) == null) {
            C86291Xtn c86291Xtn2 = C86291Xtn.LJIIL;
            if (c86291Xtn2 != null) {
                iHostStyleUIDepend = c86291Xtn2.LJFF;
            } else {
                iHostStyleUIDepend = null;
            }
        }
        if (iHostStyleUIDepend != null && (hideLoading = iHostStyleUIDepend.hideLoading(c60991Nwh, this.LIZ)) != null) {
            hideLoading.booleanValue();
            c61345O5t.LIZIZ(new C61335O5j(), "");
        } else {
            c61345O5t.LIZ("");
        }
    }
}
