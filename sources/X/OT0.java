package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OT0 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Bundle bundle) {
        String str;
        String str2 = null;
        if (bundle != null) {
            str2 = bundle.getString("_aweme_params_caller_open_sdk_name");
        }
        if (!o.LJ("TikTok-Open-Android-SDK-Auth", str2)) {
            return "";
        }
        if (bundle == null || (str = bundle.getString("_aweme_params_caller_open_sdk_version")) == null) {
            str = "";
        }
        if (str.length() == 0 || str.compareTo("1.4.0") <= 0) {
            return "";
        }
        return "tiktok_sdk_auth";
    }
}
