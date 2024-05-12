package X;

import android.webkit.WebView;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.WiH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83029WiH extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PUBLIC;
    public final String LIZJ = "x.subscribeEvent";

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C83033WiL> LIZ() {
        return C83033WiL.class;
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
    public final String getName() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        boolean z;
        long asDouble;
        String str;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "eventName", "");
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        WebView webView = null;
        if (!z && params.hasKey("timestamp")) {
            InterfaceC78505UrV interfaceC78505UrV = params.get("timestamp");
            int i = C77899Uhj.LIZ[interfaceC78505UrV.getType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    asDouble = interfaceC78505UrV.asInt();
                }
            } else {
                asDouble = (long) interfaceC78505UrV.asDouble();
            }
            C83033WiL c83033WiL = new C83033WiL();
            c83033WiL.LIZ = LJJIJIL;
            c83033WiL.LIZIZ = asDouble;
            C83031WiJ c83031WiJ = new C83031WiJ(this, interfaceC31943CgF);
            InterfaceC37790EsM interfaceC37790EsM = (InterfaceC37790EsM) LJII(InterfaceC37790EsM.class);
            if (interfaceC37790EsM == null || (str = interfaceC37790EsM.LIZ()) == null) {
                str = "";
            }
            String str2 = c83033WiL.LIZ;
            if (str2 != null) {
                long j = c83033WiL.LIZIZ;
                InterfaceC40311Frv interfaceC40311Frv = (InterfaceC40311Frv) LJII(InterfaceC40311Frv.class);
                C38049EwX c38049EwX = (C38049EwX) LJII(C38049EwX.class);
                if (c38049EwX != null) {
                    webView = c38049EwX.LIZ;
                }
                C72818Shy.LJI(new C72820Si0(str, j, interfaceC40311Frv, webView), str2);
                c83031WiJ.LIZ(new C61335O5j(), "");
                return;
            }
            o.LJIJI("eventName");
            throw null;
        }
        AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
    }
}
