package com.ss.android.ugc.aweme.account.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class VerificationDetails extends F9E {

    @InterfaceC65349Pkn("account_id")
    public final String accountId;

    @InterfaceC65349Pkn("masked_account")
    public final String maskedAccount;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.accountId, this.maskedAccount};
    }

    public VerificationDetails(String accountId, String maskedAccount) {
        o.LJIIIZ(accountId, "accountId");
        o.LJIIIZ(maskedAccount, "maskedAccount");
        this.accountId = accountId;
        this.maskedAccount = maskedAccount;
    }
}
