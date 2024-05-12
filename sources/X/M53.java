package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;

/* loaded from: classes10.dex */
public final class M53 {
    public static final boolean LIZ(Context context, String str) {
        if (str == null) {
            return false;
        }
        Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://play.google.com/store/apps/details?id=");
        LIZ.append(str);
        intent.setData(UriProtector.parse(X1D.LIZIZ(LIZ)));
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("hide_status_bar", true);
        return NO5.LJIL(context, intent);
    }
}
