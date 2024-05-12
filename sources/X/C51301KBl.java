package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchStartProxyFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.KBl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51301KBl {
    public static void LIZ(ActivityC45651qj activity, Intent intent, Bundle bundle, RouteIntent routeIntent) {
        o.LJIIIZ(activity, "activity");
        Fragment LJJJIL = activity.getSupportFragmentManager().LJJJIL("EcSearchStartProxyFragment");
        int i = 1;
        if (LJJJIL == null) {
            LJJJIL = new EcSearchStartProxyFragment();
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
            LIZ.LJIIIIZZ(0, 1, LJJJIL, "EcSearchStartProxyFragment");
            LIZ.LJII();
        }
        if (!LJJJIL.isAdded()) {
            return;
        }
        if (LJJJIL instanceof EcSearchStartProxyFragment) {
            ((EcSearchStartProxyFragment) LJJJIL).LJLIL = routeIntent;
            if (routeIntent != null && routeIntent.hasRequestCode()) {
                i = routeIntent.getRequestCode();
            }
        }
        if (bundle != null && Build.VERSION.SDK_INT < 30) {
            if (KBH.LIZ(intent)) {
                C16880lQ.LJII(LJJJIL, intent, i);
                return;
            } else {
                C78598Ut0.LJIJJ(intent, LJJJIL);
                LJJJIL.startActivityForResult(intent, i, bundle);
                return;
            }
        }
        C16880lQ.LJII(LJJJIL, intent, i);
    }
}
