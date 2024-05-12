package X;

import android.content.Context;
import android.view.Window;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$openOrderSubmit$1$1", f = "PdpViewModel.kt", l = {3005}, m = "invokeSuspend")
/* renamed from: X.AwS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27852AwS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ PdpViewModel LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ SkuPanelState LJLJJL;
    public final /* synthetic */ List<String> LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27852AwS(PdpViewModel pdpViewModel, Context context, SkuPanelState skuPanelState, List<String> list, String str, String str2, InterfaceC67352kd<? super C27852AwS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = pdpViewModel;
        this.LJLJJI = context;
        this.LJLJJL = skuPanelState;
        this.LJLJJLL = list;
        this.LJLJL = str;
        this.LJLJLJ = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C27852AwS c27852AwS = new C27852AwS(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
        c27852AwS.LJLILLLLZI = obj;
        return c27852AwS;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        DialogC136315Wp dialogC136315Wp;
        DialogC136315Wp dialogC136315Wp2;
        DialogC136315Wp dialogC136315Wp3;
        DialogC136315Wp dialogC136315Wp4;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            PdpViewModel pdpViewModel = this.LJLJI;
            Context context = this.LJLJJI;
            if ((pdpViewModel.LLJZIJLIL == null || !PdpViewModel.Bx0(context) || (dialogC136315Wp3 = pdpViewModel.LLJZIJLIL) == null || !dialogC136315Wp3.isShowing()) && context != null) {
                DialogC136315Wp dialogC136315Wp5 = new DialogC136315Wp(context);
                pdpViewModel.LLJZIJLIL = dialogC136315Wp5;
                Window window = dialogC136315Wp5.getWindow();
                if (window != null) {
                    window.addFlags(8);
                }
                if (PdpViewModel.Bx0(context) && (dialogC136315Wp = pdpViewModel.LLJZIJLIL) != null && !dialogC136315Wp.isShowing() && (dialogC136315Wp2 = pdpViewModel.LLJZIJLIL) != null && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/ecommerce/core/view/PdpLoadingDialog", "show", dialogC136315Wp2, new Object[0], "void", new C65300Pk0(false, "()V", "-689033695176892443")).LIZ) {
                    dialogC136315Wp2.show();
                }
            }
            C70313Rif c70313Rif = C70313Rif.LIZ;
            Context context2 = this.LJLJJI;
            PdpViewModel pdpViewModel2 = this.LJLJI;
            DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = pdpViewModel2.LJLLJ;
            ProductPackStruct productPackStruct = pdpViewModel2.LJLJLLL;
            SkuPanelState skuPanelState = this.LJLJJL;
            IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModel2.LJLJJLL;
            List<String> list = this.LJLJJLL;
            boolean z = pdpViewModel2.LJLJL;
            String str = this.LJLJL;
            Integer Wv0 = pdpViewModel2.Wv0();
            String str2 = this.LJLJLJ;
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLIL = 1;
            if (c70313Rif.LIZIZ(interfaceC70422pa, context2, packedDeliverySelectResult, productPackStruct, skuPanelState, pdpEnterParam, list, z, str, Wv0, "buy_now", str2, null, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (C48841JEv.LJIILLIIL(interfaceC70422pa)) {
            PdpViewModel pdpViewModel3 = this.LJLJI;
            Context context3 = this.LJLJJI;
            pdpViewModel3.getClass();
            if (PdpViewModel.Bx0(context3) && (dialogC136315Wp4 = pdpViewModel3.LLJZIJLIL) != null && dialogC136315Wp4.isShowing()) {
                try {
                    DialogC136315Wp dialogC136315Wp6 = pdpViewModel3.LLJZIJLIL;
                    if (dialogC136315Wp6 != null) {
                        dialogC136315Wp6.dismiss();
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
