package X;

import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.io.File;

/* renamed from: X.8O0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8O0 {
    public static String LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAnywhereChannelPath("tiktok_social_friends_interaction_res"));
        return JBR.LJFF(LIZ, File.separator, "story/gestures_tap_tux_lottie.json", LIZ);
    }
}
