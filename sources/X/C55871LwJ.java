package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.app.PushLoginActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.LwJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55871LwJ {
    public static Intent LIZ(Activity activity, Intent intent, String str) {
        o.LJIIIZ(activity, "activity");
        if (!C84763XOl.LJIIL) {
            Intent intent2 = new Intent();
            if (EF7.LJII == 5) {
                intent2.setClassName(activity, "com.bytedance.android.aweme.lite.home.HomeActivity");
            } else {
                intent2.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            }
            C16880lQ.LIZIZ(activity, intent2);
        }
        Intent intent3 = new Intent(activity, (Class<?>) PushLoginActivity.class);
        if (intent != null) {
            intent3.putExtra("next_step", intent);
        }
        intent3.putExtra("multi_account_push_uid", str);
        return intent3;
    }
}
