package X;

import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.Wha, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82986Wha extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PRIVATE;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.removeStorageItem";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C82988Whc> LIZ() {
        return C82988Whc.class;
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
        C86291Xtn c86291Xtn;
        IHostContextDepend iHostContextDepend;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "key", "");
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
            return;
        }
        String LJJIJIL2 = u.LJJIJIL(params, "biz", "");
        C82988Whc c82988Whc = new C82988Whc();
        c82988Whc.LIZ = LJJIJIL;
        c82988Whc.LIZIZ = LJJIJIL2;
        C82987Whb c82987Whb = new C82987Whb(this, interfaceC31943CgF);
        Context context = (Context) LJII(Context.class);
        if (context != null || ((c86291Xtn = C86291Xtn.LJIIL) != null && (iHostContextDepend = c86291Xtn.LJ) != null && (context = iHostContextDepend.getApplication()) != null)) {
            String str = c82988Whc.LIZ;
            if (str != null) {
                C82978WhS.LIZ(context, c82988Whc.LIZIZ, str);
                c82987Whb.LIZIZ(new C61335O5j(), "");
                return;
            } else {
                o.LJIJI("key");
                throw null;
            }
        }
        c82987Whb.LIZ();
    }
}
