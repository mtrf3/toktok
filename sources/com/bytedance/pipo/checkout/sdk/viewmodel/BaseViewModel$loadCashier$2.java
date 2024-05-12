package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C47261Igj;
import X.C76800UCe;
import X.C78555UsJ;
import X.C84654XKg;
import X.C92082a50;
import X.C92083a51;
import X.C92097a5F;
import X.C92297a8T;
import X.EnumC58928NAu;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import com.bytedance.pipo.checkout.api.network.model.request.CashierBasicInfo;
import com.bytedance.pipo.checkout.api.network.model.request.CashierBasicInfoRequest;
import com.bytedance.pipo.checkout.api.network.model.response.CashierBasicInfoResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.BaseViewModel$loadCashier$2", f = "BaseViewModel.kt", l = {130}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class BaseViewModel$loadCashier$2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C92082a50<CashierBasicInfoResponse>>, Object> {
    public final /* synthetic */ String $nonceValue;
    public int label;
    public final /* synthetic */ BaseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$loadCashier$2(BaseViewModel baseViewModel, String str, InterfaceC67352kd<? super BaseViewModel$loadCashier$2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.this$0 = baseViewModel;
        this.$nonceValue = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new BaseViewModel$loadCashier$2(this.this$0, this.$nonceValue, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C92082a50<CashierBasicInfoResponse>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            CashierBasicInfo cashierBasicInfo = new CashierBasicInfo(null, null, null, null, null, null, null, 127, null);
            BaseViewModel baseViewModel = this.this$0;
            String str = this.$nonceValue;
            cashierBasicInfo.setPmsParams(baseViewModel.getPMSConfig());
            cashierBasicInfo.setMerchantUserId(baseViewModel.getOrderInfo().LJLILLLLZI);
            cashierBasicInfo.setNonce(str);
            cashierBasicInfo.setConfigModelCode(C47261Igj.LJJIJ("cyber"));
            cashierBasicInfo.setCountryOrRegion(baseViewModel.getOrderInfo().LJLJJL);
            cashierBasicInfo.setProductCode("PC_CL_Checkout");
            CashierBasicInfoRequest cashierBasicInfoRequest = new CashierBasicInfoRequest(cashierBasicInfo);
            cashierBasicInfoRequest.setMerchantId(this.this$0.getOrderInfo().LJLIL);
            C92083a51 apiService = this.this$0.getApiService();
            this.label = 1;
            String LIZ = apiService.LIZIZ.LIZ("/payment/v1/cashier_basic_info");
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            C92097a5F.LIZIZ(LIZ, cashierBasicInfoRequest.buildParamsMap(), new C92297a8T(c84654XKg));
            obj2 = c84654XKg.LIZ();
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj2;
    }
}
