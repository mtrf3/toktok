package X;

import android.graphics.Point;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N5U {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        boolean z;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("enable_ad_playfun_monitor_log", true);
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            z = true;
        }
        return true ^ z;
    }

    public static void LIZIZ(Aweme aweme, String str, boolean z) {
        AwemeRawAd awemeRawAd;
        AwemePlayFunModel playFunModel;
        ExecutorService executorService;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (playFunModel = awemeRawAd.getPlayFunModel()) == null) {
            return;
        }
        CallableC58732N3g callableC58732N3g = new CallableC58732N3g(z, playFunModel, awemeRawAd, aweme, str);
        IAppLogDepend LIZ2 = C59835Ne3.LIZ();
        if (LIZ2 != null) {
            executorService = LIZ2.getLogThreadPool();
        } else {
            executorService = null;
        }
        C10K.LIZIZ(callableC58732N3g, executorService, null);
    }

    public static void LIZJ(Aweme aweme, boolean z, String str, Point point, Point point2) {
        AwemeRawAd awemeRawAd;
        if (!LIZ() && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            int i = !z ? 1 : 0;
            HashMap<String, String> LIZJ = C03660Ck.LIZJ("state", str);
            if (point != null) {
                LIZJ.put("egg_coordinate_x", String.valueOf(point.x));
                LIZJ.put("egg_coordinate_y", String.valueOf(point.y));
            }
            if (point2 != null) {
                LIZJ.put("text_coordinate_x", String.valueOf(point2.x));
                LIZJ.put("text_coordinate_y", String.valueOf(point2.y));
            }
            N5V n5v = new N5V("playfun", "show_result", i, System.currentTimeMillis());
            n5v.LJ = aweme.getAid();
            n5v.LJFF = awemeRawAd.getCreativeIdStr();
            n5v.LJI = awemeRawAd.getLogExtra();
            n5v.LJIIIIZZ = LIZJ;
            N5T.LJFF(n5v);
            if (o.LJ(str, "display")) {
                LIZIZ(aweme, "aweme_ad_play_fun_show_error_rate", z);
            }
        }
    }
}
