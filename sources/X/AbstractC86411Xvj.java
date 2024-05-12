package X;

import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.Xvj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86411Xvj extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PROTECT;

    public abstract void LJIIIIZZ(C86415Xvn c86415Xvn, C86410Xvi c86410Xvi, EnumC37847EtH enumC37847EtH);

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.vibrate";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C86415Xvn> LIZ() {
        return C86415Xvn.class;
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
        String LJJIJIL;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        AbstractC37843EtD.Companion.getClass();
        int LIZ = C77893Uhd.LIZ(params, "duration", 15);
        if (u.LJJIJIL(params, "style", "").length() == 0) {
            LJJIJIL = "light";
        } else {
            LJJIJIL = u.LJJIJIL(params, "style", "");
        }
        C86415Xvn c86415Xvn = new C86415Xvn();
        c86415Xvn.LIZ = LIZ;
        o.LJIIJ(LJJIJIL, "<set-?>");
        c86415Xvn.LIZIZ = LJJIJIL;
        LJIIIIZZ(c86415Xvn, new C86410Xvi(this, interfaceC31943CgF), type);
    }
}
