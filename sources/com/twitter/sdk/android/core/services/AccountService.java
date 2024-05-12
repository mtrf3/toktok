package com.twitter.sdk.android.core.services;

import X.E4Q;
import X.InterfaceC64989Pez;
import X.InterfaceC65079PgR;

/* loaded from: classes12.dex */
public interface AccountService {
    @E4Q("/1.1/account/verify_credentials.json")
    InterfaceC65079PgR<Object> verifyCredentials(@InterfaceC64989Pez("include_entities") Boolean bool, @InterfaceC64989Pez("skip_status") Boolean bool2, @InterfaceC64989Pez("include_email") Boolean bool3);
}
