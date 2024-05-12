package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Di4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34604Di4 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34604Di4 LJLIL = new C34604Di4();

    public C34604Di4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("lego_bootfinish_task_downgrade", 0));
    }
}
