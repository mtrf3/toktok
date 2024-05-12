package X;

import android.content.Intent;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F5X implements InterfaceC40402FtO {
    public final /* synthetic */ F5U LJLIL;
    public final /* synthetic */ ActivityC86117Xqz LJLILLLLZI;

    public F5X(F5U f5u, ActivityC86117Xqz activityC86117Xqz) {
        this.LJLIL = f5u;
        this.LJLILLLLZI = activityC86117Xqz;
    }

    @Override // X.InterfaceC40402FtO
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        if (i == this.LJLIL.LIZJ) {
            this.LJLILLLLZI.finish();
            AbstractC37134Ehm abstractC37134Ehm = this.LJLIL.LJII;
            if (abstractC37134Ehm == null) {
                return;
            }
            try {
                JSONObject LIZLLL = C37099EhD.LIZLLL(abstractC37134Ehm);
                LIZLLL.put("result_code", i2);
                FMX.LJIILLIIL("df_click_permission_dialog", LIZLLL);
                if (i2 == 0) {
                    i3 = 5;
                } else {
                    i3 = 6;
                }
                C09900aA.LJIIJJI("df_click_permission_dialog", i3, LIZLLL);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (i2 != -1) {
                F5V.LIZLLL().getClass();
                F5V.LIZ(abstractC37134Ehm);
            }
            FJX fjx = abstractC37134Ehm.LJI.LJIIJ;
            if (fjx == null) {
                return;
            }
            fjx.LIZJ(i2);
        }
    }
}
