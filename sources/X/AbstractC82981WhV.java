package X;

import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend;
import kotlin.jvm.internal.o;

/* renamed from: X.WhV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82981WhV extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PRIVATE;

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.getStorageInfo";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C82966WhG> LIZ() {
        return C82966WhG.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C82983WhX> LIZLLL() {
        return C82983WhX.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        C86291Xtn c86291Xtn;
        IHostContextDepend iHostContextDepend;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        C82963WhD.LIZ(params);
        C82982WhW c82982WhW = new C82982WhW(this, interfaceC31943CgF);
        Context context = (Context) LJII(Context.class);
        if (context != null || ((c86291Xtn = C86291Xtn.LJIIL) != null && (iHostContextDepend = c86291Xtn.LJ) != null && (context = iHostContextDepend.getApplication()) != null)) {
            java.util.Set<String> LJII = C78524Uro.LIZ(context).LJII();
            C82983WhX c82983WhX = new C82983WhX();
            c82983WhX.LIZ = ORZ.LLJI(LJII);
            c82982WhW.LIZIZ(c82983WhX, "");
            return;
        }
        c82982WhW.LIZ();
    }
}
