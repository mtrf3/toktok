package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dou, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35028Dou extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35028Dou LJLIL = new C35028Dou();

    public C35028Dou() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("topview_splash_x2c_1_enable", false));
    }
}
