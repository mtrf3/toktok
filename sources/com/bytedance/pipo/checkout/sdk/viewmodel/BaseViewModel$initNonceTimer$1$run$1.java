package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C76800UCe;
import X.C91964a36;
import X.C91965a37;
import X.EnumC58928NAu;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$initNonceTimer$1$run$1", f = "BaseViewModel.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class BaseViewModel$initNonceTimer$1$run$1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int label;
    public final /* synthetic */ BaseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$initNonceTimer$1$run$1(BaseViewModel baseViewModel, InterfaceC67352kd<? super BaseViewModel$initNonceTimer$1$run$1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.this$0 = baseViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new BaseViewModel$initNonceTimer$1$run$1(this.this$0, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                InterfaceC88472Yns<InterfaceC67352kd<? super String>, Object> interfaceC88472Yns = this.this$0.getConfiguration().LIZJ;
                this.label = 1;
                obj = interfaceC88472Yns.invoke(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            String str = (String) obj;
            if (str != null) {
                C91964a36 c91964a36 = this.this$0.nonceContainer;
                c91964a36.getClass();
                c91964a36.LIZLLL = Long.valueOf(System.currentTimeMillis() + c91964a36.LIZIZ);
                c91964a36.LIZJ = str;
                C91965a37.LIZ = str;
            }
        } catch (Throwable unused) {
        }
        return C76800UCe.LIZ;
    }
}
