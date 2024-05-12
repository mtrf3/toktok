package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.ad.model.AdLandingPageConfig;
import java.util.List;

/* loaded from: classes7.dex */
public final class G3X {
    public static final List<String> LIZ(String str) {
        if (TextUtils.equals(str, "splash") || TextUtils.equals(str, "topview")) {
            AdLandingPageConfig LIZ = C59445NUr.LIZ();
            if (LIZ == null) {
                return null;
            }
            return LIZ.getSplashAdAutoJumpAllowList();
        }
        AdLandingPageConfig LIZ2 = C59445NUr.LIZ();
        if (LIZ2 == null) {
            return null;
        }
        return LIZ2.autoJumpAllowList;
    }
}
