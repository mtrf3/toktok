package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DXq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34042DXq extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34042DXq LJLIL = new C34042DXq();

    public C34042DXq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("key_gson_get_adapter_1", 0));
    }
}
