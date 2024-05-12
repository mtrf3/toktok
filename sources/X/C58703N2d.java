package X;

import com.ss.android.ugc.aweme.social.experiment.FollowingListFreqParams;

/* renamed from: X.N2d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58703N2d extends AbstractC65781Prl implements InterfaceC65784Pro<FollowingListFreqParams> {
    public static final C58703N2d LJLIL = new C58703N2d();

    public C58703N2d() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.social.experiment.FollowingListFreqParams] */
    @Override // X.InterfaceC65784Pro
    public final FollowingListFreqParams invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        FollowingListFreqParams followingListFreqParams = C58701N2b.LIZIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "following_list_recommend_permission", 31744, FollowingListFreqParams.class, followingListFreqParams);
        if (LJIJ == 0) {
            C58701N2b.LIZ.getClass();
            return followingListFreqParams;
        }
        return LJIJ;
    }
}
