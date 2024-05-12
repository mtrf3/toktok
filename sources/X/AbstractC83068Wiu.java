package X;

import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.Wiu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83068Wiu extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PUBLIC;
    public final String LIZJ = "x.publishEvent";

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C83070Wiw> LIZ() {
        return C83070Wiw.class;
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
        double asDouble;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "eventName", "");
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && params.hasKey("timestamp")) {
            InterfaceC78505UrV interfaceC78505UrV = params.get("timestamp");
            int i = C77898Uhi.LIZ[interfaceC78505UrV.getType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    asDouble = interfaceC78505UrV.asDouble();
                }
            } else {
                asDouble = interfaceC78505UrV.asDouble();
            }
            long j = (long) asDouble;
            InterfaceC78280Uns LJJIJIIJIL = u.LJJIJIIJIL(params, "params");
            C83070Wiw c83070Wiw = new C83070Wiw();
            c83070Wiw.LIZ = LJJIJIL;
            c83070Wiw.LIZIZ = j;
            c83070Wiw.LIZJ = LJJIJIIJIL;
            C83069Wiv c83069Wiv = new C83069Wiv(this, interfaceC31943CgF);
            String str = c83070Wiw.LIZ;
            if (str != null) {
                C72818Shy.LIZ(new C76052yf(c83070Wiw.LIZIZ, c83070Wiw.LIZJ, str));
                c83069Wiv.LIZ(new C61335O5j(), "");
                return;
            }
            o.LJIJI("eventName");
            throw null;
        }
        AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
    }
}
