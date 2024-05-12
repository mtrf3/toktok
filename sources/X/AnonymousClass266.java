package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;

/* renamed from: X.266, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass266 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final AnonymousClass266 LJLIL = new AnonymousClass266();

    public AnonymousClass266() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        boolean z2 = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("passive_gecko_clean_enbled_v7", false);
        if (!((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).isGeckoExperienceOptClose()) {
            z = z2;
        }
        return Boolean.valueOf(z);
    }
}
