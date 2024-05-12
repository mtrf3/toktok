package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.legoImp.LoginProxyImpl;

/* loaded from: classes9.dex */
public final class J9P {
    public static J9O LIZ;
    public static boolean LIZIZ;

    public static J9O LIZ() {
        if (LIZ == null && !LIZIZ) {
            synchronized (J9P.class) {
                if (!LIZIZ) {
                    LIZ = LoginProxyImpl.LIZIZ().LIZ();
                    LIZIZ = true;
                }
            }
        }
        return LIZ;
    }

    public static void LIZIZ(Activity activity, String str, String str2, Bundle bundle, JJ4 jj4) {
        if (LIZ() != null) {
            if (activity != null && !activity.isFinishing()) {
                LIZ().LIZIZ(activity, str, str2, bundle, jj4);
                return;
            }
            return;
        }
        throw new RuntimeException("ILoginActivityComponent stub can't be null");
    }

    public static void LIZJ(Fragment fragment, String str, String str2, Bundle bundle, JJ4 jj4) {
        if (LIZ() != null) {
            if (fragment != null && fragment.mo49getActivity() != null && !fragment.mo49getActivity().isFinishing()) {
                LIZ().LIZ(fragment, str, str2, bundle, jj4);
                return;
            }
            return;
        }
        throw new RuntimeException("ILoginActivityComponent stub can't be null");
    }
}
