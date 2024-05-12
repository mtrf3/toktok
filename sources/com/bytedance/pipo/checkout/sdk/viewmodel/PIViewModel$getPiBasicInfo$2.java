package com.bytedance.pipo.checkout.sdk.viewmodel;

import X.AbstractC65782Prm;
import X.C141335gf;
import X.C76800UCe;
import X.C78555UsJ;
import X.C84654XKg;
import X.C92082a50;
import X.C92083a51;
import X.C92097a5F;
import X.C92307a8d;
import X.EnumC58928NAu;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import com.bytedance.pipo.checkout.api.network.model.request.PIBasicInfo;
import com.bytedance.pipo.checkout.api.network.model.request.PIBasicInfoRequest;
import com.bytedance.pipo.checkout.api.network.model.request.PmsParams;
import com.bytedance.pipo.checkout.api.network.model.response.PIBasicInfoResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel$getPiBasicInfo$2", f = "PIViewModel.kt", l = {174}, m = "invokeSuspend")
/* loaded from: classes20.dex */
public final class PIViewModel$getPiBasicInfo$2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C92082a50<PIBasicInfoResponse>>, Object> {
    public final /* synthetic */ String $nonceValue;
    public int label;
    public final /* synthetic */ PIViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PIViewModel$getPiBasicInfo$2(PIViewModel pIViewModel, String str, InterfaceC67352kd<? super PIViewModel$getPiBasicInfo$2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.this$0 = pIViewModel;
        this.$nonceValue = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new PIViewModel$getPiBasicInfo$2(this.this$0, this.$nonceValue, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C92082a50<PIBasicInfoResponse>> interfaceC67352kd) {
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
            PmsParams pMSConfig = this.this$0.getPMSConfig();
            PIBasicInfo pIBasicInfo = new PIBasicInfo(null, null, null, null, null, null, null, null, 255, null);
            PIViewModel pIViewModel = this.this$0;
            String str = this.$nonceValue;
            pIBasicInfo.setSdkType(pMSConfig.getSdkType());
            pIBasicInfo.setSdkVersion(pMSConfig.getSdkVersion());
            pIBasicInfo.setCurrency(pMSConfig.getCurrency());
            pIBasicInfo.setMerchantUserId(pIViewModel.getOrderInfo().LJLILLLLZI);
            pIBasicInfo.setNonce(str);
            pIBasicInfo.setCountryOrRegion(pIViewModel.getOrderInfo().LJLJJL);
            pIBasicInfo.setProductCode("PC_CL_Checkout");
            PIBasicInfoRequest pIBasicInfoRequest = new PIBasicInfoRequest(pIBasicInfo);
            pIBasicInfoRequest.setMerchantId(this.this$0.getOrderInfo().LJLIL);
            C92083a51 apiService = this.this$0.getApiService();
            this.label = 1;
            String LIZ = apiService.LIZIZ.LIZ("/payment/v1/pi_basic_info");
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            C92097a5F.LIZIZ(LIZ, pIBasicInfoRequest.buildParamsMap(), new C92307a8d(c84654XKg));
            obj2 = c84654XKg.LIZ();
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj2;
    }
}
