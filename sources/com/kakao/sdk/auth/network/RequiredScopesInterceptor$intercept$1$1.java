package com.kakao.sdk.auth.network;

import X.AbstractC65781Prl;
import X.C68322mC;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import com.kakao.sdk.auth.AuthCodeClient;
import com.kakao.sdk.auth.model.OAuthToken;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AqS44S1300000_11;

/* loaded from: classes12.dex */
public final class RequiredScopesInterceptor$intercept$1$1 extends AbstractC65781Prl implements InterfaceC88471Ynr<String, Throwable, C76800UCe> {
    public final /* synthetic */ C68322mC<Throwable> $err;
    public final /* synthetic */ CountDownLatch $latch;
    public final /* synthetic */ List<String> $requiredScopes;
    public final /* synthetic */ C68322mC<OAuthToken> $token;
    public final /* synthetic */ RequiredScopesInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequiredScopesInterceptor$intercept$1$1(C68322mC<Throwable> c68322mC, CountDownLatch countDownLatch, RequiredScopesInterceptor requiredScopesInterceptor, List<String> list, C68322mC<OAuthToken> c68322mC2) {
        super(2);
        this.$err = c68322mC;
        this.$latch = countDownLatch;
        this.this$0 = requiredScopesInterceptor;
        this.$requiredScopes = list;
        this.$token = c68322mC2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, Throwable th) {
        if (th != 0) {
            this.$err.element = th;
            this.$latch.countDown();
        } else {
            AuthCodeClient.Companion companion = AuthCodeClient.Companion;
            String codeVerifier = companion.codeVerifier();
            AuthCodeClient.authorizeWithKakaoAccount$default(companion.getInstance(), this.this$0.contextInfo.getApplicationContext(), null, null, this.$requiredScopes, null, str, null, null, false, null, null, codeVerifier, null, null, new AqS44S1300000_11((C68322mC) this.$err, (C68322mC<Throwable>) this.$latch, (CountDownLatch) codeVerifier, (String) this.$token, (C68322mC<OAuthToken>) 0), 14294, null);
        }
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(String str, Throwable th) {
        invoke2(str, th);
        return C76800UCe.LIZ;
    }
}
