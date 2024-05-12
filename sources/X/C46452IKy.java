package X;

import com.ss.android.ugc.aweme.account.experiment.AccountHoldoutExperimentModel;

/* renamed from: X.IKy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46452IKy extends AbstractC65781Prl implements InterfaceC65784Pro<AccountHoldoutExperimentModel> {
    public static final C46452IKy LJLIL = new C46452IKy();

    public C46452IKy() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.account.experiment.AccountHoldoutExperimentModel, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final AccountHoldoutExperimentModel invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        AccountHoldoutExperimentModel accountHoldoutExperimentModel = C46451IKx.LIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "account_longterm_holdout", 31744, AccountHoldoutExperimentModel.class, accountHoldoutExperimentModel);
        if (LJIJ == 0) {
            return accountHoldoutExperimentModel;
        }
        return LJIJ;
    }
}
