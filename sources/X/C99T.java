package X;

import android.os.Build;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.99T, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C99T extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C99T LJLIL = new C99T();

    public C99T() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Build.VERSION.SDK_INT != 28 && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("optimize_preloadplayerso", false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
