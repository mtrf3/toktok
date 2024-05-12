package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitStarter$openOrderSubmitReal$1", f = "OrderSubmitStarter.kt", l = {224}, m = "invokeSuspend")
/* renamed from: X.AwM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27846AwM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ DeliveryPanelStarter.PackedDeliverySelectResult LJLJJI;
    public final /* synthetic */ ProductPackStruct LJLJJL;
    public final /* synthetic */ SkuPanelState LJLJJLL;
    public final /* synthetic */ IPdpStarter.PdpEnterParam LJLJL;
    public final /* synthetic */ List<String> LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ Integer LJLLI;
    public final /* synthetic */ String LJLLILLLL;
    public final /* synthetic */ String LJLLJ;
    public final /* synthetic */ Integer LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27846AwM(Context context, DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult, ProductPackStruct productPackStruct, SkuPanelState skuPanelState, IPdpStarter.PdpEnterParam pdpEnterParam, List<String> list, boolean z, String str, Integer num, String str2, String str3, Integer num2, InterfaceC67352kd<? super C27846AwM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = context;
        this.LJLJJI = packedDeliverySelectResult;
        this.LJLJJL = productPackStruct;
        this.LJLJJLL = skuPanelState;
        this.LJLJL = pdpEnterParam;
        this.LJLJLJ = list;
        this.LJLJLLL = z;
        this.LJLL = str;
        this.LJLLI = num;
        this.LJLLILLLL = str2;
        this.LJLLJ = str3;
        this.LJLLL = num2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C27846AwM c27846AwM = new C27846AwM(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, interfaceC67352kd);
        c27846AwM.LJLILLLLZI = obj;
        return c27846AwM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C70313Rif c70313Rif = C70313Rif.LIZ;
            Context context = this.LJLJI;
            DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = this.LJLJJI;
            ProductPackStruct productPackStruct = this.LJLJJL;
            SkuPanelState skuPanelState = this.LJLJJLL;
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LJLJL;
            List<String> list = this.LJLJLJ;
            boolean z = this.LJLJLLL;
            String str = this.LJLL;
            Integer num = this.LJLLI;
            String str2 = this.LJLLILLLL;
            String str3 = this.LJLLJ;
            Integer num2 = this.LJLLL;
            this.LJLIL = 1;
            if (c70313Rif.LIZIZ(interfaceC70422pa, context, packedDeliverySelectResult, productPackStruct, skuPanelState, pdpEnterParam, list, z, str, num, str2, str3, num2, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
