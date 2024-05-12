package X;

import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import yq4.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class OU4 implements OUM {
    public final /* synthetic */ Bundle LIZ;

    public /* synthetic */ OU4(Bundle bundle) {
        this.LIZ = bundle;
    }

    @Override // X.OUM
    public final void LIZ(Bundle bundle) {
        Bundle bundle2 = this.LIZ;
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle.getBoolean("kids_mode_restart", false)) {
            FMX.onEventV3("kids_log_in");
            Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ == null) {
                LJIIIIZZ = EF7.LIZIZ();
            }
            a.LJI().LJIILJJIL(LJIIIIZZ);
            return;
        }
        if (bundle.getBoolean("need_restart", false)) {
            new Handler().postDelayed(new IDRunnableS6S0101000(3, bundle, 23), 500L);
        } else {
            OUG.LIZ(bundle);
        }
    }
}
