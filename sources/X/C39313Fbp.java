package X;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.o;

/* renamed from: X.Fbp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39313Fbp implements InterfaceC39320Fbw {
    public final String LIZ = "preinsatll_appflyer";
    public final String LIZIZ = "preinsatll_channel";
    public final String LIZJ = "preinsatll_campaign";
    public final String LIZLLL = "preinsatll_site_id";
    public final Context LJ;

    @Override // X.InterfaceC39320Fbw
    public final boolean LIZIZ() {
        return false;
    }

    public C39313Fbp(Context context) {
        this.LJ = context;
    }

    @Override // X.InterfaceC39320Fbw
    public final C39316Fbs LIZ(C39316Fbs preInstallResult) {
        o.LJIIIZ(preInstallResult, "preInstallResult");
        C39310Fbm c39310Fbm = preInstallResult.LIZ;
        SharedPreferences LIZIZ = F9J.LIZIZ(this.LJ, 0, this.LIZ);
        o.LJIIIIZZ(LIZIZ, "context.getSharedPrefere…ER, Context.MODE_PRIVATE)");
        String str = "";
        String string = LIZIZ.getString(this.LIZIZ, "");
        if (string == null) {
            string = "";
        }
        if (string.length() > 0) {
            c39310Fbm.LJLLILLLL = 4;
            preInstallResult.LJ = true;
            String string2 = LIZIZ.getString(this.LIZJ, "");
            if (string2 == null) {
                string2 = "";
            }
            c39310Fbm.LJLILLLLZI = string2;
            String string3 = LIZIZ.getString(this.LIZLLL, "");
            if (string3 != null) {
                str = string3;
            }
            c39310Fbm.LJLJI = str;
            c39310Fbm.LJLLI = false;
        }
        c39310Fbm.getClass();
        c39310Fbm.LJLIL = string;
        return preInstallResult;
    }
}
