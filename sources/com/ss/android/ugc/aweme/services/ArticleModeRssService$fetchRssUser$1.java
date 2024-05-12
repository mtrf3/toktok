package com.ss.android.ugc.aweme.services;

import X.AJY;
import X.AbstractC65782Prm;
import X.AbstractC78621UtN;
import X.C141335gf;
import X.C36636EZk;
import X.C3C5;
import X.C76800UCe;
import X.C9G2;
import X.EnumC58928NAu;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.XKX;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.services.ArticleModeRssService$fetchRssUser$1", f = "ArticleModeRssService.kt", l = {57, 59}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ArticleModeRssService$fetchRssUser$1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88472Yns<C9G2, C76800UCe> $onSuccess;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ArticleModeRssService$fetchRssUser$1(InterfaceC88472Yns<? super C9G2, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super ArticleModeRssService$fetchRssUser$1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.$onSuccess = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        ArticleModeRssService$fetchRssUser$1 articleModeRssService$fetchRssUser$1 = new ArticleModeRssService$fetchRssUser$1(this.$onSuccess, interfaceC67352kd);
        articleModeRssService$fetchRssUser$1.L$0 = obj;
        return articleModeRssService$fetchRssUser$1;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    LIZ = this.L$0;
                    C141335gf.LIZJ(obj);
                    C3C5.m10exceptionOrNullimpl(LIZ);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            AJY ajy = AJY.LIZIZ;
            this.label = 1;
            obj = ajy.LIZ.LIZIZ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        LIZ = (C9G2) obj;
        C3C5.m7constructorimpl(LIZ);
        InterfaceC88472Yns<C9G2, C76800UCe> interfaceC88472Yns = this.$onSuccess;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            ArticleModeRssService$fetchRssUser$1$2$1 articleModeRssService$fetchRssUser$1$2$1 = new ArticleModeRssService$fetchRssUser$1$2$1(interfaceC88472Yns, (C9G2) LIZ, null);
            this.L$0 = LIZ;
            this.label = 2;
            if (XKX.LJI(abstractC78621UtN, articleModeRssService$fetchRssUser$1$2$1, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        return C76800UCe.LIZ;
    }
}
