package X;

import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommerceChallengeOutService;

/* loaded from: classes11.dex */
public final class NTJ extends AbstractC65781Prl implements InterfaceC65784Pro<T58> {
    public static final NTJ LJLIL = new NTJ();

    public NTJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final T58 invoke() {
        ICommerceChallengeOutService commerceChallengeOutService;
        Object LIZ = C58096Mr6.LIZ(ICommerceChallengeOutService.class, false);
        if (LIZ != null) {
            commerceChallengeOutService = (ICommerceChallengeOutService) LIZ;
        } else {
            commerceChallengeOutService = new CommerceChallengeOutService();
        }
        return commerceChallengeOutService.LIZ();
    }
}
