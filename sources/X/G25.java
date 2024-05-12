package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.deeplink.RequireLoginActivity;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.Random;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G25 implements R47 {
    public final /* synthetic */ RequireLoginActivity LIZ;

    public G25(RequireLoginActivity requireLoginActivity) {
        this.LIZ = requireLoginActivity;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        Class<? extends Activity> deepLinkHandlerActivityClass;
        String str;
        if (i == 1 && i2 == 1) {
            RequireLoginActivity activity = this.LIZ;
            Intent intent = activity.LJLILLLLZI;
            String str2 = activity.LJLIL;
            boolean z = activity.LJLJI;
            o.LJIIIZ(activity, "activity");
            if (intent != null && intent.getData() != null) {
                if (o.LJ(str2, "from_app_link")) {
                    deepLinkHandlerActivityClass = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAppLinkHandlerActivityClass(z);
                } else {
                    deepLinkHandlerActivityClass = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getDeepLinkHandlerActivityClass(z);
                }
                Intent intent2 = new Intent(activity, deepLinkHandlerActivityClass);
                android.net.Uri data = intent.getData();
                if (data != null) {
                    str = data.toString();
                } else {
                    str = null;
                }
                C38281F0r c38281F0r = new C38281F0r(str);
                c38281F0r.LIZLLL("random", new Random(1000L).toString());
                intent2.setData(UriProtector.parse(c38281F0r.LJ()));
                intent2.putExtras(intent);
                intent2.putExtra("inner_from", "require_login");
                C16880lQ.LIZIZ(activity, intent2);
            }
        } else {
            Intent intent3 = this.LIZ.getIntent();
            if (intent3 == null) {
                intent3 = new Intent();
            }
            RequireLoginActivity requireLoginActivity = this.LIZ;
            Class<? extends Activity> mainActivityClass = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityClass();
            o.LJI(mainActivityClass);
            intent3.setClass(requireLoginActivity, mainActivityClass);
            intent3.putExtra("from_require_login", true);
            intent3.setFlags(335544320);
            RequireLoginActivity requireLoginActivity2 = this.LIZ;
            C78598Ut0.LJIJJ(intent3, requireLoginActivity2);
            requireLoginActivity2.startActivity(intent3);
        }
        this.LIZ.finish();
    }
}
