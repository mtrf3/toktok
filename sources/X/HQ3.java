package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.app.PushLoginActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HQ3 extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "login");
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            if (C61017Nx7.LIZ().LIZIZ()) {
                C16880lQ.LIZIZ(activity, new Intent(activity, (Class<?>) PushLoginActivity.class));
                return;
            }
            Intent LJIJI = C51029K0z.LJIJI(activity);
            LJIJI.putExtra("extra_from_deeplink", true);
            activity.startActivities(new Intent[]{LJIJI, new Intent(activity, (Class<?>) PushLoginActivity.class)});
            return;
        }
        Intent LJIJI2 = C51029K0z.LJIJI(activity);
        LJIJI2.putExtra("extra_from_deeplink", true);
        C16880lQ.LIZIZ(activity, LJIJI2);
    }
}
