package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.common.BaseShareContext;
import com.ss.android.ugc.aweme.openshare.Share$Request;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.HDz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43723HDz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ() {
        Activity[] activities = ActivityStack.getActivityStack();
        o.LJIIIIZZ(activities, "activities");
        for (Activity activity : activities) {
            activity.finish();
        }
    }

    public static String LIZIZ(String str) {
        int LJJLIIIJLLLLLLLZ;
        if (str != null && str.length() > 0 && (LJJLIIIJLLLLLLLZ = s.LJJLIIIJLLLLLLLZ(str, '.', 0, 6)) > -1 && LJJLIIIJLLLLLLLZ < str.length() - 1) {
            String substring = str.substring(LJJLIIIJLLLLLLLZ + 1);
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    public static final C43722HDy LIZJ(BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext == null) {
            return null;
        }
        return AVExternalServiceImpl.LIZ().infoService().shareContextInfo(baseShortVideoContext);
    }

    public static Share$Request LIZLLL(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Share$Request share$Request = new Share$Request();
        share$Request.fromBundle(bundle);
        return share$Request;
    }

    public static final boolean LJ(BaseShareContext baseShareContext) {
        if (baseShareContext != null && !TextUtils.isEmpty(baseShareContext.mClientKey) && baseShareContext.mNeedShowDialog) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(String str) {
        if (o.LJ("lv_sync", str) || o.LJ("sdk", str) || o.LJ("sdk_direct_post", str) || o.LJ("green_screen_kit", str) || o.LJ("l8_import", str)) {
            return true;
        }
        return false;
    }

    public static final boolean LJI(String str) {
        if (o.LJ("system_share", str) || LJFF(str)) {
            return true;
        }
        return false;
    }
}
