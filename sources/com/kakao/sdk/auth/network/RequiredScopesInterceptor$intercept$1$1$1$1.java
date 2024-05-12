package com.kakao.sdk.auth.network;

import X.AbstractC65781Prl;
import X.C68322mC;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import com.kakao.sdk.auth.model.OAuthToken;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes12.dex */
public final class RequiredScopesInterceptor$intercept$1$1$1$1 extends AbstractC65781Prl implements InterfaceC88471Ynr<OAuthToken, Throwable, C76800UCe> {
    public final /* synthetic */ C68322mC<Throwable> $err;
    public final /* synthetic */ CountDownLatch $latch;
    public final /* synthetic */ C68322mC<OAuthToken> $token;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequiredScopesInterceptor$intercept$1$1$1$1(C68322mC<OAuthToken> c68322mC, C68322mC<Throwable> c68322mC2, CountDownLatch countDownLatch) {
        super(2);
        this.$token = c68322mC;
        this.$err = c68322mC2;
        this.$latch = countDownLatch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OAuthToken oAuthToken, Throwable th) {
        this.$token.element = oAuthToken;
        this.$err.element = th;
        this.$latch.countDown();
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(OAuthToken oAuthToken, Throwable th) {
        invoke2(oAuthToken, th);
        return C76800UCe.LIZ;
    }
}
