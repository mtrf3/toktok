package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DdW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34322DdW extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34322DdW LJLIL = new C34322DdW();

    public C34322DdW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("content_capture_opt", 0));
    }
}
