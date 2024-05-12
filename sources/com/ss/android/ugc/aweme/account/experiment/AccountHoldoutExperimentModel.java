package com.ss.android.ugc.aweme.account.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class AccountHoldoutExperimentModel extends F9E {

    @InterfaceC65349Pkn("account_holdout_allow_access_features")
    public final boolean allowAccessFeatures;

    @InterfaceC65349Pkn("account_holdout_allow_security_features")
    public final boolean allowSecurityFeatures;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AccountHoldoutExperimentModel() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.experiment.AccountHoldoutExperimentModel.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.allowAccessFeatures), Boolean.valueOf(this.allowSecurityFeatures)};
    }

    public AccountHoldoutExperimentModel(boolean z, boolean z2) {
        this.allowAccessFeatures = z;
        this.allowSecurityFeatures = z2;
    }

    public /* synthetic */ AccountHoldoutExperimentModel(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }
}
