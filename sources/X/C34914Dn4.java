package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dn4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34914Dn4 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34914Dn4 LJLIL = new C34914Dn4();

    public C34914Dn4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("key_binder_cache_1", 0));
    }
}
