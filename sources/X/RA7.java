package X;

import com.ss.android.ugc.aweme.account.experiment.AccountFeatureFlagService;

/* loaded from: classes12.dex */
public final class RA7 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final RA7 LJLIL = new RA7();

    public RA7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(AccountFeatureFlagService.LJI().LIZ());
    }
}
