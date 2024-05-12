package X;

import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostStyleUIDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.ToastBuilder;
import com.google.android.play.core.appupdate.u;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.O5g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC61332O5g extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PROTECT;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.showToast";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<O07> LIZ() {
        return O07.class;
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
        boolean z;
        String str;
        C86291Xtn c86291Xtn;
        IHostStyleUIDepend iHostStyleUIDepend;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "message", "");
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = null;
        if (!z) {
            if (params.hasKey("icon")) {
                str = u.LJJIJIL(params, "icon", "");
                if (str != null) {
                    try {
                        Locale locale = Locale.US;
                        o.LJFF(locale, "Locale.US");
                        String upperCase = str.toUpperCase(locale);
                        o.LJFF(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                        EnumC60990Nwg.valueOf(upperCase);
                    } catch (Exception unused) {
                    }
                }
            } else {
                str = null;
            }
            String LJJIJIL2 = u.LJJIJIL(params, "type", "");
            String LJJIJIL3 = u.LJJIJIL(params, "customIcon", "");
            if (LJJIJIL3.length() <= 0) {
                LJJIJIL3 = null;
            }
            int i = 3000;
            if (params.hasKey("duration")) {
                if (params.get("duration").getType() == EnumC78522Urm.Int) {
                    i = u.LJJIJIIJI(params, "duration", 3000);
                } else if (params.get("duration").getType() == EnumC78522Urm.Number) {
                    i = (int) u.LJJIJ(params, "duration", 3000.0d);
                }
            }
            O07 o07 = new O07();
            o07.LIZ = LJJIJIL;
            o.LJIIJ(LJJIJIL2, "<set-?>");
            o07.LIZIZ = LJJIJIL2;
            o07.LIZJ = str;
            o07.LIZLLL = LJJIJIL3;
            o07.LJ = Integer.valueOf(i);
            C61333O5h c61333O5h = new C61333O5h(this, interfaceC31943CgF);
            Context context = (Context) LJII(Context.class);
            if (context == null) {
                c61333O5h.LIZ();
                return;
            }
            String str2 = o07.LIZ;
            if (str2 != null) {
                String str3 = o07.LIZJ;
                if (str3 != null || (str3 = o07.LIZIZ) != null) {
                    ToastBuilder toastBuilder = new ToastBuilder(context, str2, str3, o07.LIZLLL, o07.LJ);
                    C86291Xtn c86291Xtn2 = (C86291Xtn) LJII(C86291Xtn.class);
                    if ((c86291Xtn2 != null && (iHostStyleUIDepend = c86291Xtn2.LJFF) != null) || ((c86291Xtn = C86291Xtn.LJIIL) != null && (iHostStyleUIDepend = c86291Xtn.LJFF) != null)) {
                        bool = iHostStyleUIDepend.showToast(toastBuilder, this.LIZ);
                    }
                    if (!o.LJ(bool, Boolean.TRUE)) {
                        new C61337O5l().showToast(toastBuilder, this.LIZ);
                    }
                    c61333O5h.LIZIZ(new C61335O5j(), "");
                    return;
                }
                o.LJIJI("type");
                throw null;
            }
            o.LJIJI("message");
            throw null;
        }
        AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
    }
}
