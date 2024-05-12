package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dn2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34912Dn2 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34912Dn2 LJLIL = new C34912Dn2();

    public C34912Dn2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("key_idle_loadso", 0));
    }
}
