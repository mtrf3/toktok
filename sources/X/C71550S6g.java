package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.BillboardSetting;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.BillboardSettingsData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS16S0010000_12;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel$init$2", f = "BillboardGlobalViewModel.kt", l = {93}, m = "invokeSuspend")
/* renamed from: X.S6g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71550S6g extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BillboardGlobalViewModel LJLILLLLZI;
    public final /* synthetic */ RootData LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71550S6g(BillboardGlobalViewModel billboardGlobalViewModel, RootData rootData, InterfaceC67352kd<? super C71550S6g> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = billboardGlobalViewModel;
        this.LJLJI = rootData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71550S6g(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        BillboardSettingsData billboardSettingsData;
        BillboardSetting billboardSetting;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                C71534S5q c71534S5q = this.LJLILLLLZI.LJLILLLLZI.LIZIZ;
                String str = this.LJLJI.authorId;
                this.LJLIL = 1;
                obj = c71534S5q.LJLIL.LIZ.getBillboardSettings(str, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            billboardSettingsData = (BillboardSettingsData) ((Response) ((C64797Pbt) obj).LIZIZ).data;
        } catch (Throwable unused) {
        }
        if (billboardSettingsData != null && (billboardSetting = billboardSettingsData.setting) != null) {
            z = billboardSetting.isAutoDisplay;
            this.LJLILLLLZI.setStateImmediate(new AqS16S0010000_12(z, 18));
            return C76800UCe.LIZ;
        }
        z = false;
        this.LJLILLLLZI.setStateImmediate(new AqS16S0010000_12(z, 18));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
