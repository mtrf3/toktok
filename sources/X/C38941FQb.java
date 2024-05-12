package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.FQb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38941FQb extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C38941FQb LJLIL = new C38941FQb();

    public C38941FQb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (!C48236IwS.LJIIJ() && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("first_feed_ok", 0) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
