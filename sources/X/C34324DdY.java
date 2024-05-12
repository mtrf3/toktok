package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DdY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34324DdY extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34324DdY LJLIL = new C34324DdY();

    public C34324DdY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("key_jato_hwui_opt", 0) > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
