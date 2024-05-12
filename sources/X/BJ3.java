package X;

import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class BJ3 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        switch (i) {
            case 1:
                return "comment_setting";
            case 2:
                return "mute";
            case 3:
                return "block";
            case 4:
                return "pin_comment";
            case 5:
                return "product_management";
            case 6:
                return "promotion";
            case 7:
                return "realtime_data";
            case 8:
                return "multi_guest";
            case 9:
                return "star_comment";
            case 10:
                return "subscription_pin_card";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return "sub_only_live_access";
            default:
                return "";
        }
    }
}
