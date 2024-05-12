package X;

import com.google.android.play.core.appupdate.u;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EsL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37789EsL extends AbstractC37780EsC {
    public static final java.util.Map<String, Boolean> LIZIZ = new LinkedHashMap();

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "enableBlockBackPress";
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        Object LIZ;
        Object LIZ2;
        InterfaceC37790EsM interfaceC37790EsM;
        String LIZ3;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        try {
            LIZ = u.LJJIJIL(params, "status", "");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        String str = (String) LIZ;
        boolean z = false;
        if (str != null && str.length() != 0) {
            z = o.LJ(str, "1");
        } else {
            try {
                LIZ2 = Boolean.valueOf(u.LJJIIZI(params, "status", false));
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th2) {
                LIZ2 = C141335gf.LIZ(th2);
                C3C5.m7constructorimpl(LIZ2);
            }
            if (C3C5.m12isFailureimpl(LIZ2)) {
                LIZ2 = null;
            }
            Boolean bool = (Boolean) LIZ2;
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        C31926Cfy c31926Cfy = this.LIZ;
        if (c31926Cfy != null && (interfaceC37790EsM = (InterfaceC37790EsM) c31926Cfy.LIZ(InterfaceC37790EsM.class)) != null && (LIZ3 = interfaceC37790EsM.LIZ()) != null) {
            LIZIZ.put(LIZ3, Boolean.valueOf(z));
        }
        AbstractC37780EsC.LJI(interfaceC31943CgF, "", new LinkedHashMap());
    }
}
