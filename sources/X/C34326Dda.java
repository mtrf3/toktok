package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dda, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34326Dda extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34326Dda LJLIL = new C34326Dda();

    public C34326Dda() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("feed_jato_queue_buffer_opt_on_startup", 0) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
