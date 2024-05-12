package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Du8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35352Du8 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35352Du8 LJLIL = new C35352Du8();

    public C35352Du8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        int i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("network_speed_mode_precise", 0);
        if (i == 2 || i == 4) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
