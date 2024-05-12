package X;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class LSM {
    public static String LIZ = "click_tab";

    public static void LIZ(ActivityC45651qj activityC45651qj, String str) {
        LQ7 lq7 = new LQ7("enter_homepage_hot");
        if (str == null) {
            str = "";
        }
        lq7.LIZLLL = str;
        lq7.LJIILLIIL = "click_to_fyp_button";
        lq7.LJIILIIL();
        com.bytedance.hox.Hox LIZ2 = com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj);
        Bundle bundle = new Bundle();
        bundle.putString("fromStart", "MainPage");
        LIZ = "click_switch_to_fyp_button";
        LIZ2.Cv0(bundle, "For You");
    }
}
