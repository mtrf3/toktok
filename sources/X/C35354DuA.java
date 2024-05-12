package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DuA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35354DuA extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35354DuA LJLIL = new C35354DuA();

    public C35354DuA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        int i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("network_speed_mode_precise", 0);
        if (i == 3 || i == 4) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
