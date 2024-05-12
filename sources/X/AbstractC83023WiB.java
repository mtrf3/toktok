package X;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.WiB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83023WiB extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PROTECT;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.makePhoneCall";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C83025WiD> LIZ() {
        return C83025WiD.class;
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
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        if (!params.isNull("phoneNumber") && params.getType("phoneNumber") == EnumC78522Urm.String) {
            String LJJIJIL = u.LJJIJIL(params, "phoneNumber", "");
            if (LJJIJIL.length() != 0) {
                C83025WiD c83025WiD = new C83025WiD();
                c83025WiD.LIZ = LJJIJIL;
                C83024WiC c83024WiC = new C83024WiC(this, interfaceC31943CgF);
                String str = c83025WiD.LIZ;
                if (str != null) {
                    Intent intent = new Intent("android.intent.action.DIAL", android.net.Uri.fromParts("tel", str, null));
                    Context context = (Context) LJII(Context.class);
                    if (context == null) {
                        c83024WiC.LIZ();
                        return;
                    } else {
                        C16880lQ.LIZJ(context, intent);
                        c83024WiC.LIZIZ(new C61335O5j(), "");
                        return;
                    }
                }
                o.LJIJI("phoneNumber");
                throw null;
            }
        }
        AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
    }
}
