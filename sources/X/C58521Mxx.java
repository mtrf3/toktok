package X;

import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.AudienceWidgetLazyLoadSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LazyLoadBlockList;

/* renamed from: X.Mxx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58521Mxx {
    public static boolean LIZ(String str) {
        if (AudienceWidgetLazyLoadSetting.INSTANCE.getSettingValue() && LazyLoadBlockList.INSTANCE.enable(str)) {
            return true;
        }
        return false;
    }
}
