package X;

import com.ss.android.ugc.aweme.account.experiment.AccountFeatureFlagService;

/* loaded from: classes12.dex */
public final class RA8 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final RA8 LJLIL = new RA8();

    public RA8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(AccountFeatureFlagService.LJI().LIZ());
    }
}
