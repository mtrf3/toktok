package X;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes12.dex */
public class R1D implements InterfaceC61117Nyj {
    @Override // X.InterfaceC61117Nyj
    public final void LIZ(Activity activity, String[] strArr, InterfaceC61118Nyk interfaceC61118Nyk) {
        if (activity.getFragmentManager().findFragmentByTag(OHQ.LIZIZ) == null) {
            R1E r1e = new R1E();
            Bundle bundle = new Bundle();
            bundle.putStringArray(OHQ.LIZIZ, strArr);
            r1e.setArguments(bundle);
            r1e.LJLIL = interfaceC61118Nyk;
            activity.getFragmentManager().beginTransaction().add(r1e, OHQ.LIZIZ).commitAllowingStateLoss();
        }
    }
}
