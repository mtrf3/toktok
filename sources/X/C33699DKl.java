package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DKl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33699DKl extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33699DKl LJLIL = new C33699DKl();

    public C33699DKl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 0;
        try {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("loading_experience_opt", 0);
        } catch (Exception unused) {
        }
        return Integer.valueOf(i);
    }
}
