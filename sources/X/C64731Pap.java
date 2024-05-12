package X;

import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import ee1.l;
import org.json.JSONObject;

/* renamed from: X.Pap, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64731Pap implements InterfaceC64706PaQ {
    public final /* synthetic */ ICronetAppProvider LIZ;

    public C64731Pap(ICronetAppProvider iCronetAppProvider) {
        this.LIZ = iCronetAppProvider;
    }

    public final boolean LIZ(String str, JSONObject jSONObject, String str2, boolean z) {
        boolean z2;
        C64728Pam LJFF = C64728Pam.LJFF();
        LJFF.getClass();
        Logger.debug();
        if (jSONObject != null) {
            C64733Par c64733Par = LJFF.LJIIL;
            if (c64733Par != null) {
                c64733Par.LIZLLL = "";
                l.LJ().LJIIJJI = "";
                z2 = LJFF.LJIIL.LIZ(jSONObject, EnumC64748Pb6.TTSERVER, str, System.currentTimeMillis());
                if (z2) {
                    C64704PaO.LJFF().LJII();
                }
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (!z || z2) {
            return false;
        }
        LJFF.LIZLLL(EnumC64748Pb6.TTREGION, true);
        return true;
    }
}
