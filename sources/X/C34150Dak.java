package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dak, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34150Dak extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34150Dak LJLIL = new C34150Dak();

    public C34150Dak() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("load_more_opt_low_network_speed", LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
    }
}
