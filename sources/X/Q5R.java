package X;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;

/* loaded from: classes12.dex */
public final class Q5R implements InterfaceC66438Q5q {
    public final C66426Q5e LIZ;
    public final Activity LIZIZ;

    @Override // X.InterfaceC66438Q5q
    public final Activity LIZ() {
        return this.LIZIZ;
    }

    public Q5R(C66426Q5e c66426Q5e) {
        Activity activity;
        this.LIZ = c66426Q5e;
        Fragment fragment = (Fragment) c66426Q5e.LIZ;
        if (fragment != null) {
            activity = fragment.mo49getActivity();
        } else {
            android.app.Fragment fragment2 = (android.app.Fragment) c66426Q5e.LIZIZ;
            if (fragment2 == null) {
                activity = null;
            } else {
                activity = fragment2.getActivity();
            }
        }
        this.LIZIZ = activity;
    }

    @Override // X.InterfaceC66438Q5q
    public final void startActivityForResult(Intent intent, int i) {
        C66426Q5e c66426Q5e = this.LIZ;
        Fragment fragment = (Fragment) c66426Q5e.LIZ;
        if (fragment != null) {
            C16880lQ.LJII(fragment, intent, i);
            return;
        }
        android.app.Fragment fragment2 = (android.app.Fragment) c66426Q5e.LIZIZ;
        if (fragment2 == null) {
            return;
        }
        C78598Ut0.LJIJJ(intent, fragment2);
        fragment2.startActivityForResult(intent, i);
    }
}
