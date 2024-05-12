package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.97L, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C97L {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ() {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        SettingsManager.LIZLLL().getClass();
        repo.storeBoolean("enable_vboost_settings", SettingsManager.LIZ("enable_vboost_settings", false));
    }
}
