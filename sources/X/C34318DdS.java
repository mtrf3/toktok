package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DdS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34318DdS extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34318DdS LJLIL = new C34318DdS();

    public C34318DdS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("init_webview_opt", 0));
    }
}
