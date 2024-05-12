package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dr2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35160Dr2 extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final C35160Dr2 LJLIL = new C35160Dr2();

    public C35160Dr2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        return Float.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getFloat("xjl_feed_apm_sampling_opt", -1.0f));
    }
}
