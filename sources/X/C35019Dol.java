package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import defpackage.e1;

/* renamed from: X.Dol, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35019Dol {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ() {
        return e1.LIZ(31744, "enable_launch_protect_drill", true, false);
    }

    public static final boolean LIZIZ() {
        return Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("should_crash", false);
    }

    public static final void LIZJ() {
        C35007DoZ.LIZ.LIZ().edit().putBoolean("enable_launch_protect", e1.LIZ(31744, "enable_launch_protect", true, false)).apply();
    }
}
