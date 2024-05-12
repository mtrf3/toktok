package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Ddg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34332Ddg extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34332Ddg LJLIL = new C34332Ddg();

    public C34332Ddg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("xjl_tux_auto_size_cache_exp", 0) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
