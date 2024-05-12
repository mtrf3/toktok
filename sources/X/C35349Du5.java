package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Du5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35349Du5 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35349Du5 LJLIL = new C35349Du5();

    public C35349Du5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("network_speed_mode_precise", 0) == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
