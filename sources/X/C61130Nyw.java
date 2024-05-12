package X;

import com.ss.android.ugc.aweme.disneycentenary.DisneyCardExperiment;

/* renamed from: X.Nyw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61130Nyw extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C61130Nyw LJLIL = new C61130Nyw();

    public C61130Nyw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        DisneyCardExperiment.LIZ.getClass();
        boolean z = true;
        if (DisneyCardExperiment.LIZ()) {
            FFL LJIIIZ = FFL.LJIIIZ();
            DisneyCardExperiment.DisneyCardConfig disneyCardConfig = DisneyCardExperiment.LIZIZ;
            LJIIIZ.getClass();
            DisneyCardExperiment.DisneyCardConfig disneyCardConfig2 = (DisneyCardExperiment.DisneyCardConfig) FFL.LJIJ(false, "feed_disney_card_config", 31744, DisneyCardExperiment.DisneyCardConfig.class, disneyCardConfig);
            if (disneyCardConfig2 != null && disneyCardConfig2.checkOfflineResource) {
                C38943FQd.LIZLLL();
                z = C70657RoD.LJ(C38943FQd.LIZ(), "tiktok_creator_growth_big_event_disney_feed_card");
                if (!z) {
                    C61125Nyr.LIZ(-2);
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
