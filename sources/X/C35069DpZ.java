package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DpZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35069DpZ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35069DpZ LJLIL = new C35069DpZ();

    public C35069DpZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("xjl_feed_scrap_view_clear_ext", 0) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
