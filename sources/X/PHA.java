package X;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes12.dex */
public final class PHA implements InterfaceC64217PIf {
    @Override // X.InterfaceC64217PIf
    public final void LIZLLL(Activity activity) {
    }

    @Override // X.InterfaceC64217PIf
    public final void LJFF(Activity activity) {
    }

    @Override // X.InterfaceC64217PIf
    public final void LJI(Activity activity) {
    }

    @Override // X.InterfaceC64217PIf
    public final void LJII(Activity activity) {
    }

    @Override // X.InterfaceC64217PIf
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // X.InterfaceC64217PIf
    public final void onActivityStarted(Activity activity) {
    }

    @Override // X.InterfaceC64217PIf
    public final void LIZJ(Activity activity) {
        boolean z;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        float refreshRate = activity.getWindowManager().getDefaultDisplay().getRefreshRate();
        PH9.LIZ(refreshRate);
        if (!C09970aH.LJIJ) {
            return;
        }
        int LIZ = PH9.LIZ(refreshRate);
        PH9.LIZIZ = LIZ;
        if (LIZ == PH9.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        PH9.LIZLLL = z;
        PH9.LIZ = 1000.0f / LIZ;
    }
}
