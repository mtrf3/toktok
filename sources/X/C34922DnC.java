package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DnC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34922DnC extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C34922DnC LJLIL = new C34922DnC();

    public C34922DnC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("player_jato_boot_config", 0L));
    }
}
