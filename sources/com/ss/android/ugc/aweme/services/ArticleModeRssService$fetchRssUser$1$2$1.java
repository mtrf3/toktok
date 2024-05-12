package com.ss.android.ugc.aweme.services;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C76800UCe;
import X.C9G2;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.services.ArticleModeRssService$fetchRssUser$1$2$1", f = "ArticleModeRssService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ArticleModeRssService$fetchRssUser$1$2$1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88472Yns<C9G2, C76800UCe> $onSuccess;
    public final /* synthetic */ C9G2 $rssUser;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ArticleModeRssService$fetchRssUser$1$2$1(InterfaceC88472Yns<? super C9G2, C76800UCe> interfaceC88472Yns, C9G2 c9g2, InterfaceC67352kd<? super ArticleModeRssService$fetchRssUser$1$2$1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.$onSuccess = interfaceC88472Yns;
        this.$rssUser = c9g2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ArticleModeRssService$fetchRssUser$1$2$1(this.$onSuccess, this.$rssUser, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C141335gf.LIZJ(obj);
            this.$onSuccess.invoke(this.$rssUser);
            return C76800UCe.LIZ;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
