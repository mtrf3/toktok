package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dp5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35039Dp5 {
    public static final String LIZ;

    static {
        boolean z;
        String str;
        try {
            z = C35820E4a.LIZIZ(FKM.LIZ(), "isInTikTokRegionForAbTestInit", false);
        } catch (Throwable unused) {
            z = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("isInTikTokRegionForAbTestInit", false);
        }
        if (z) {
            str = "https://libra-sg.tiktokv.com/common";
        } else {
            str = "https://libra-va.tiktokv.com/common";
        }
        LIZ = str;
    }
}
