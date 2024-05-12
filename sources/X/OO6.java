package X;

import com.ss.android.ugc.aweme.feed.experiment.FeedDescSeeMoreConfig;

/* loaded from: classes11.dex */
public final class OO6 extends AbstractC65781Prl implements InterfaceC65784Pro<FeedDescSeeMoreConfig> {
    public static final OO6 LJLIL = new OO6();

    public OO6() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.feed.experiment.FeedDescSeeMoreConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final FeedDescSeeMoreConfig invoke() {
        FFL.LJIIIZ().getClass();
        ?? LJIJ = FFL.LJIJ(true, "feed_desc_see_more_optimize", 31744, FeedDescSeeMoreConfig.class, null);
        if (LJIJ == 0) {
            return new FeedDescSeeMoreConfig(0, 0.18f);
        }
        return LJIJ;
    }
}
