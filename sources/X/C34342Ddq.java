package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Ddq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34342Ddq extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C34342Ddq LJLIL = new C34342Ddq();

    public C34342Ddq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("lego_boot_finish_trigger_delay", 1000L));
    }
}
