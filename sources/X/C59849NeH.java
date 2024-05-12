package X;

import com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProviderOutService;
import com.ss.android.ugc.aweme.commercialize.service.ChallengeDetailProviderOutService;

/* renamed from: X.NeH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59849NeH extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC59852NeK> {
    public static final C59849NeH LJLIL = new C59849NeH();

    public C59849NeH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC59852NeK invoke() {
        IChallengeDetailProviderOutService challengeDetailProviderOutService;
        Object LIZ = C58096Mr6.LIZ(IChallengeDetailProviderOutService.class, false);
        if (LIZ != null) {
            challengeDetailProviderOutService = (IChallengeDetailProviderOutService) LIZ;
        } else {
            challengeDetailProviderOutService = new ChallengeDetailProviderOutService();
        }
        return challengeDetailProviderOutService.LIZ();
    }
}
