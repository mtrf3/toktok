package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class DNN extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final DNN LJLIL = new DNN();

    public DNN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("lego_request_idle_trigger_delay", 2000L));
    }
}
