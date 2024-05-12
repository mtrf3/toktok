package com.ss.android.ugc.aweme.account.reactive;

import X.AbstractC73672Svk;
import X.C36291EMd;
import X.E8L;
import X.E8M;
import X.InterfaceC64986Pew;
import X.InterfaceC65002PfC;

/* loaded from: classes6.dex */
public interface ReactiveAccountApi {
    public static final C36291EMd LIZ = C36291EMd.LIZ;

    @E8M("/passport/deactivation/do/")
    AbstractC73672Svk<String> reactiveDeactivationAccount(@InterfaceC65002PfC("x-tt-passport-csrf-token") String str);

    @E8L("/passport/cancel/do/")
    AbstractC73672Svk<String> reactiveDeletedAccount(@InterfaceC64986Pew("type") int i);
}
