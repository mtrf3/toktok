package X;

import android.os.Bundle;
import com.bytedance.keva.Keva;
import yq4.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class OUA implements OUM {
    public final /* synthetic */ Bundle LIZ;

    public /* synthetic */ OUA(Bundle bundle) {
        this.LIZ = bundle;
    }

    @Override // X.OUM
    public final void LIZ(Bundle bundle) {
        Bundle bundle2 = this.LIZ;
        if (bundle == null) {
            bundle = bundle2;
        }
        Keva.getRepo("used_app_duration_and_times").storeLong("login_time", System.currentTimeMillis());
        a.LJIIZILJ().LJIIIIZZ(new OU9(bundle), HG3.LJIILL().isNewUser() ? 1 : 0);
    }
}
