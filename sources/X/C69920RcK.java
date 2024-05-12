package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecallBoxRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecallBox;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$requestRecallBox$1", f = "PdpViewModel.kt", l = {659}, m = "invokeSuspend")
/* renamed from: X.RcK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69920RcK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IPdpStarter.PdpEnterParam LJLILLLLZI;
    public final /* synthetic */ List<String> LJLJI;
    public final /* synthetic */ PdpViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69920RcK(IPdpStarter.PdpEnterParam pdpEnterParam, List<String> list, PdpViewModel pdpViewModel, InterfaceC67352kd<? super C69920RcK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpEnterParam;
        this.LJLJI = list;
        this.LJLJJI = pdpViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69920RcK(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        RecallBox recallBox;
        List<Announcement> list;
        String str;
        Integer num;
        Announcement announcement;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            C69995RdX c69995RdX = C69995RdX.LJLILLLLZI;
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LJLILLLLZI;
            List<String> list2 = this.LJLJI;
            this.LJLIL = 1;
            c69995RdX.getClass();
            Object clone = pdpEnterParam.getRequestParams().clone();
            o.LJII(clone, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
            Object clone2 = pdpEnterParam.getPdpPreParam().clone();
            o.LJII(clone2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
            IPdpStarter.PdpEnterParam copy$default = IPdpStarter.PdpEnterParam.copy$default(pdpEnterParam, (HashMap) clone, null, null, null, false, null, 0.0f, null, false, false, false, null, null, (HashMap) clone2, null, null, null, null, 253950, null);
            C69995RdX.LLLLZ(copy$default);
            obj2 = PdpApi.LIZ.LIZJ(new PdpRecallBoxRequest("tt_pdp_delay", list2, copy$default.getRequestParams().get("traffic_source_list")), this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ProductPackStruct productPackStruct = (ProductPackStruct) obj2;
        ProductPackStruct productPackStruct2 = null;
        if (productPackStruct != null) {
            recallBox = productPackStruct.recallBox;
            list = productPackStruct.announcements;
        } else {
            recallBox = null;
            list = null;
        }
        PdpViewModel pdpViewModel = this.LJLJJI;
        if (list != null && (announcement = (Announcement) ORZ.LJLLLL(list)) != null) {
            str = announcement.getDaInfo();
        } else {
            str = null;
        }
        pdpViewModel.LLJJL = str;
        PdpViewModel pdpViewModel2 = this.LJLJJI;
        ProductPackStruct productPackStruct3 = pdpViewModel2.LJLJLLL;
        if (productPackStruct3 != null) {
            productPackStruct2 = ProductPackStruct.LIZ(productPackStruct3, null, null, null, null, null, null, list, recallBox, -1, -50331649);
        }
        pdpViewModel2.LJLJLLL = productPackStruct2;
        if (recallBox != null && (num = recallBox.boxType) != null && num.intValue() == 1) {
            this.LJLJJI.setState(new AqS178S0100000_12(recallBox, 69));
        }
        if (list != null && ORZ.LJLLLL(list) != null) {
            PdpViewModel pdpViewModel3 = this.LJLJJI;
            pdpViewModel3.setState(new AqS143S0200000_12(pdpViewModel3, (PdpViewModel) list, (List<Announcement>) 11));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
