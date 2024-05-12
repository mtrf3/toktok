package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DWd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34003DWd extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34003DWd LJLIL = new C34003DWd();

    public C34003DWd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("cold_boot_cpu_monitor", 0));
    }
}
