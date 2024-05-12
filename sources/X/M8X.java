package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.net.URLEncoder;

/* loaded from: classes10.dex */
public final class M8X {
    public static final M8Z LIZ;

    static {
        try {
            LIZ = (M8Z) C63081OpJ.LJJJJJ(EF7.LIZIZ(), M8Z.class);
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Get show xmas tree SP failed.");
            LIZ2.append(th.getMessage());
            C36922EeM.LJ(X1D.LIZIZ(LIZ2));
        }
    }

    public static void LIZ(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!str.startsWith("https://") && !str.startsWith("http://")) {
            sb.append(str);
            C61200O0e.LIZLLL().LJII(sb.toString());
            return;
        }
        try {
            sb.append("aweme://ame/webview/");
            sb.append("?url=");
            sb.append(URLEncoder.encode(str, "ISO-8859-1"));
        } catch (Exception unused) {
        }
        Intent LJI = AbstractC57425MgH.LJI(context, UriProtector.parse(sb.toString()));
        LJI.setClass(context, CrossPlatformActivity.class);
        LJI.putExtra("hide_more", false);
        LJI.putExtra("bundle_auto_play_audio", true);
        C16880lQ.LIZJ(context, LJI);
    }
}
