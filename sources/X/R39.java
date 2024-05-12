package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R39 implements InterfaceC39805Fjl, InterfaceC48038ItG, InterfaceC46111I7v {
    public static final R39 LJLIL = new R39();
    public static final R39 LJLILLLLZI = new R39();
    public static final R39 LJLJI = new R39();

    @Override // X.InterfaceC46111I7v
    public void LIZ() {
        C3Z.LIZ.getClass();
        C3Z.LIZJ();
    }

    @Override // X.InterfaceC39805Fjl
    public void LIZIZ(String[] strArr) {
        C45275Hpn.LIZIZ = strArr;
        if (C45275Hpn.LIZ.getBoolean("key_ve_hook_switch", false)) {
            C45275Hpn.LIZ();
        }
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        OSZ it = (OSZ) obj;
        o.LJIIJ(it, "it");
        return C1XY.LJJIIJ(it.getSecond());
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        if (QSB.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onEventV3, eventName: ");
            LIZ.append(str);
            LIZ.append(", params: ");
            LIZ.append(jSONObject);
            X1D.LIZIZ(LIZ);
        }
        FMX.LJIILJJIL(str, jSONObject);
    }

    public static /* synthetic */ AbstractC73672Svk LIZLLL(TC4 tc4, String str, String str2, long j, int i, int i2, int i3, String str3, String str4, int i4) {
        String str5 = str3;
        String str6 = null;
        if ((i4 & 128) != 0) {
            str5 = null;
        }
        if ((i4 & 256) == 0) {
            str6 = str4;
        }
        return tc4.LLLLZ(str, str2, j, i, i2, i3, str5, str6);
    }
}
