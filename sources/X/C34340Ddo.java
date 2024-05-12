package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Ddo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34340Ddo extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34340Ddo LJLIL = new C34340Ddo();

    public C34340Ddo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("search_json_lazy_parse", true));
    }
}
