package X;

import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;

/* loaded from: classes10.dex */
public final class L77 extends AbstractC65781Prl implements InterfaceC65784Pro<FriendsTabTopExperiment.FriendsTabTopConfig> {
    public static final L77 LJLIL = new L77();

    public L77() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment$FriendsTabTopConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final FriendsTabTopExperiment.FriendsTabTopConfig invoke() {
        LQA lqa = LQA.LIZIZ;
        if (lqa.LJI()) {
            Integer LJIILIIL = lqa.LJIILIIL();
            if (LJIILIIL != null) {
                return new FriendsTabTopExperiment.FriendsTabTopConfig(LJIILIIL.intValue());
            }
        } else {
            FFL LJIIIZ = FFL.LJIIIZ();
            FriendsTabTopExperiment.FriendsTabTopConfig friendsTabTopConfig = FriendsTabTopExperiment.LIZ;
            LJIIIZ.getClass();
            ?? LJIJ = FFL.LJIJ(true, "tt_friends_top_tab_experiment", 31744, FriendsTabTopExperiment.FriendsTabTopConfig.class, friendsTabTopConfig);
            if (LJIJ != 0) {
                return LJIJ;
            }
        }
        return FriendsTabTopExperiment.LIZ;
    }
}
