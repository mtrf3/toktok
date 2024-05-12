package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C76800UCe;
import X.C92054a4Y;
import X.C92083a51;
import X.EnumC58928NAu;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import fjb.a;
import java.util.Map;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$requestStarling$1", f = "BaseViewModel.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class BaseViewModel$requestStarling$1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String $lang;
    public int label;
    public final /* synthetic */ BaseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$requestStarling$1(BaseViewModel baseViewModel, String str, InterfaceC67352kd<? super BaseViewModel$requestStarling$1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.this$0 = baseViewModel;
        this.$lang = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new BaseViewModel$requestStarling$1(this.this$0, this.$lang, interfaceC67352kd);
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
                C92083a51 apiService = this.this$0.getApiService();
                String str = this.$lang;
                this.label = 1;
                obj = apiService.LIZIZ(str, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C92054a4Y.LJI(this.$lang, (Map) obj);
        } catch (Throwable unused) {
        }
        return C76800UCe.LIZ;
    }
}
