package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.E3u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35814E3u extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35814E3u LJLIL = new C35814E3u();

    public C35814E3u() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (C38354F3m.LIZJ(EF7.LJIILIIL, "rhea")) {
            i = -1;
        } else {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("device_screen_info_cache_opt", 0);
        }
        return Integer.valueOf(i);
    }
}
