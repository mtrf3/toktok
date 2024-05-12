package X;

import android.app.Application;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HYY {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        int i2;
        Application application = C60903NvH.LJ;
        if (HYZ.LIZ() == 1 && i > 180000) {
            i2 = R.string.pw0;
        } else if (C43465H4b.LIZ() != 0 && i > 60000) {
            i2 = R.string.pvz;
        } else if (C44531Hdn.LIZ() > LivePlayEnforceIntervalSetting.DEFAULT && i > LivePlayEnforceIntervalSetting.DEFAULT) {
            i2 = R.string.pw1;
        } else {
            i2 = R.string.pvy;
        }
        String string = application.getString(i2);
        o.LJIIIIZZ(string, "getApplication().getStri…\n            },\n        )");
        return string;
    }

    public static boolean LIZIZ(ShortVideoContext shortVideoContext) {
        ShootExtraData shootExtraData;
        String shootEnterFrom;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (!o.LJ("single_song", shortVideoContext.shootWay) || (shootExtraData = shortVideoContext.creativeFlowData.getShootExtraData()) == null || (shootEnterFrom = shootExtraData.getShootEnterFrom()) == null) {
            return false;
        }
        if (!o.LJ(shootEnterFrom, "homepage_hot") && !o.LJ(shootEnterFrom, "homepage_follow")) {
            return false;
        }
        return true;
    }
}
