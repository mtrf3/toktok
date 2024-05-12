package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DpX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35067DpX extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35067DpX LJLIL = new C35067DpX();

    public C35067DpX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("can_switch_paging_duration", false));
    }
}
