package X;

import android.app.Activity;
import android.content.res.Configuration;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LFY implements InterfaceC40368Fsq {
    public static final LFY LIZ = new LFY();

    @Override // X.InterfaceC40368Fsq
    public final void LIZIZ() {
        C10K.LIZJ(CallableC53935LEt.LJLIL);
    }

    @Override // X.InterfaceC40368Fsq
    public final void LIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LFZ lfz = LFZ.LJLIL;
        if (LFZ.LJLILLLLZI) {
            return;
        }
        LFZ.LJLILLLLZI = true;
        AwemeHostApplication LIZ2 = FKM.LIZ();
        if (LIZ2 == null) {
            return;
        }
        LIZ2.registerActivityLifecycleCallbacks(lfz);
    }

    @Override // X.InterfaceC40368Fsq
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(newConfig, "newConfig");
        LFZ.LJLIL.onConfigurationChanged(activity, newConfig);
    }
}
