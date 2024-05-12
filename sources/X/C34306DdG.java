package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DdG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34306DdG extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34306DdG LJLIL = new C34306DdG();

    public C34306DdG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 0;
        try {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("io_thread_cpu_boost_v2620", 0);
        } catch (Throwable unused) {
        }
        return Integer.valueOf(i);
    }
}
