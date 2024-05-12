package X;

import android.webkit.WebView;
import com.google.android.play.core.appupdate.u;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.WiI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83030WiI extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PUBLIC;
    public final String LIZJ = "x.unsubscribeEvent";

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C83034WiM> LIZ() {
        return C83034WiM.class;
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
        String str;
        C38049EwX c38049EwX;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "eventName", "");
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        WebView webView = null;
        if (z) {
            AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
            return;
        }
        C83034WiM c83034WiM = new C83034WiM();
        c83034WiM.LIZ = LJJIJIL;
        C83032WiK c83032WiK = new C83032WiK(this, interfaceC31943CgF);
        String str2 = c83034WiM.LIZ;
        if (str2 != null) {
            InterfaceC37790EsM interfaceC37790EsM = (InterfaceC37790EsM) LJII(InterfaceC37790EsM.class);
            if (interfaceC37790EsM == null || (str = interfaceC37790EsM.LIZ()) == null) {
                str = "";
            }
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC40311Frv interfaceC40311Frv = (InterfaceC40311Frv) LJII(InterfaceC40311Frv.class);
            if (str.length() == 0 && (c38049EwX = (C38049EwX) LJII(C38049EwX.class)) != null) {
                webView = c38049EwX.LIZ;
            }
            C72820Si0 c72820Si0 = new C72820Si0(str, currentTimeMillis, interfaceC40311Frv, webView);
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C72818Shy.LIZIZ().get(str2);
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(c72820Si0);
            }
            c83032WiK.LIZ(new C61335O5j(), "");
            return;
        }
        o.LJIJI("eventName");
        throw null;
    }
}
