package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleBrief;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleDealRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import fjb.a;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$fetchBundleDealData$1", f = "PdpViewModel.kt", l = {4738}, m = "invokeSuspend")
/* renamed from: X.RcL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69921RcL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public PdpViewModel LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ PdpViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69921RcL(PdpViewModel pdpViewModel, InterfaceC67352kd<? super C69921RcL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = pdpViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69921RcL(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        String str2;
        HashMap<String, Object> hashMap;
        List list;
        PdpViewModel pdpViewModel;
        List<String> list2;
        String str3;
        BundleBrief bundleBrief;
        HashMap<String, Object> trackParams;
        SellerInfo sellerInfo;
        Object obj3 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                pdpViewModel = this.LJLIL;
                C141335gf.LIZJ(obj3);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj3);
            PdpViewModel pdpViewModel2 = this.LJLJI;
            ProductPackStruct productPackStruct = pdpViewModel2.LJLJLLL;
            String str4 = null;
            if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null) {
                str = sellerInfo.sellerId;
            } else {
                str = null;
            }
            IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModel2.LJLJJLL;
            if (pdpEnterParam != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                obj2 = trackParams.get("author_id");
            } else {
                obj2 = null;
            }
            String str5 = (String) obj2;
            C70101RfF c70101RfF = IPdpStarter.LIZ;
            IPdpStarter.PdpEnterParam pdpEnterParam2 = this.LJLJI.LJLJJLL;
            c70101RfF.getClass();
            int LIZIZ = C70101RfF.LIZIZ(pdpEnterParam2);
            IPdpStarter.PdpEnterParam pdpEnterParam3 = this.LJLJI.LJLJJLL;
            if (pdpEnterParam3 != null) {
                str2 = pdpEnterParam3.getChainKey();
            } else {
                str2 = null;
            }
            IPdpStarter.PdpEnterParam pdpEnterParam4 = this.LJLJI.LJLJJLL;
            if (pdpEnterParam4 == null || (hashMap = pdpEnterParam4.getTrackParams()) == null) {
                hashMap = new HashMap<>();
            }
            int[] LJFF = M2T.LJFF(hashMap);
            if (LJFF == null || (list = ORY.LJJZ(LJFF)) == null) {
                list = C61878OQg.INSTANCE;
            }
            pdpViewModel = this.LJLJI;
            C70091Rf5 c70091Rf5 = PdpApi.LIZ;
            ProductPackStruct productPackStruct2 = pdpViewModel.LJLJLLL;
            if (productPackStruct2 != null && (bundleBrief = productPackStruct2.bundleBrief) != null) {
                list2 = bundleBrief.bundleIdList;
            } else {
                list2 = null;
            }
            Integer num = new Integer(LIZIZ);
            ProductPackStruct productPackStruct3 = this.LJLJI.LJLJLLL;
            if (productPackStruct3 != null) {
                str3 = productPackStruct3.defaultAddressId;
                str4 = productPackStruct3.productId;
            } else {
                str3 = null;
            }
            BundleDealRequest bundleDealRequest = new BundleDealRequest(list2, str, str2, str5, num, list, str3, str4);
            this.LJLIL = pdpViewModel;
            this.LJLILLLLZI = 1;
            obj3 = c70091Rf5.LIZIZ(bundleDealRequest, this);
            if (obj3 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        pdpViewModel.LLLIIIL = (BundleInfoResponse) obj3;
        PdpViewModel pdpViewModel3 = this.LJLJI;
        pdpViewModel3.LLLIILIL = true;
        pdpViewModel3.setState(new AqS178S0100000_12(pdpViewModel3, 68));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
