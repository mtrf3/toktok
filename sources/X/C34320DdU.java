package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DdU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34320DdU extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34320DdU LJLIL = new C34320DdU();

    public C34320DdU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = -100;
        try {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("set_main_thread_priority", -100);
        } catch (Throwable unused) {
        }
        return Integer.valueOf(i);
    }
}
