package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dr0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35158Dr0 extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final C35158Dr0 LJLIL = new C35158Dr0();

    public C35158Dr0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        return Float.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getFloat("traffic_monitor_sampling_experiment", 1.0f));
    }
}
