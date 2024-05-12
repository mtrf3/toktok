package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DelayOperation;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS4S0600000_12;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$delayRequest$1", f = "PdpViewModel.kt", l = {805}, m = "invokeSuspend")
/* renamed from: X.RcU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69930RcU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DelayOperation LJLILLLLZI;
    public final /* synthetic */ PdpViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69930RcU(DelayOperation delayOperation, PdpViewModel pdpViewModel, InterfaceC67352kd<? super C69930RcU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = delayOperation;
        this.LJLJI = pdpViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69930RcU(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        String str2;
        Object obj3;
        List list;
        IPdpStarter.PdpEnterParam pdpEnterParam;
        HashMap<String, Object> requestParams;
        Long l;
        List<DelayOperation> list2;
        DelayOperation delayOperation;
        List<DelayOperation> list3;
        DelayOperation delayOperation2;
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
            Long l2 = this.LJLILLLLZI.afterSecond;
            if (l2 != null) {
                long longValue = l2.longValue() * 1000;
                this.LJLIL = 1;
                if (C1JD.LIZJ(longValue, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        PdpViewModel pdpViewModel = this.LJLJI;
        ProductPackStruct productPackStruct = pdpViewModel.LJLJLLL;
        Long l3 = null;
        if (productPackStruct != null) {
            str = productPackStruct.daInfo;
        } else {
            str = null;
        }
        HashMap<String, Object> LJII = C27739Aud.LJII(str);
        if (LJII != null) {
            obj2 = LJII.get("user_type");
        } else {
            obj2 = null;
        }
        if (pdpViewModel.LLJJIJIL) {
            if (pdpViewModel.LLJJJ) {
                str2 = "3";
            } else {
                if (!pdpViewModel.LLJJJ) {
                    str2 = "2";
                }
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
        } else {
            if (pdpViewModel.LLJJJ) {
                str2 = "1";
            }
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        if (pdpViewModel.vw0()) {
            C70414RkI c70414RkI = pdpViewModel.LLFII;
            if (c70414RkI != null) {
                Integer valueOf = Integer.valueOf(pdpViewModel.LLJJIJIIJIL ? 1 : 0);
                ProductPackStruct productPackStruct2 = pdpViewModel.LJLJLLL;
                if (productPackStruct2 != null && (list3 = productPackStruct2.delayOperation) != null && (delayOperation2 = (DelayOperation) ORZ.LJLLLL(list3)) != null) {
                    l3 = delayOperation2.afterSecond;
                }
                C76542zS.LIZJ("tiktokec_longstay_page", new AqS4S0600000_12(c70414RkI, (Integer) 0, (Object) str2, valueOf, l3, obj2, 2));
            }
        } else {
            C70414RkI c70414RkI2 = pdpViewModel.LLFII;
            if (c70414RkI2 != null) {
                Integer valueOf2 = Integer.valueOf(pdpViewModel.LLJJIJIIJIL ? 1 : 0);
                ProductPackStruct productPackStruct3 = pdpViewModel.LJLJLLL;
                if (productPackStruct3 != null && (list2 = productPackStruct3.delayOperation) != null && (delayOperation = (DelayOperation) ORZ.LJLLLL(list2)) != null) {
                    l = delayOperation.afterSecond;
                } else {
                    l = null;
                }
                C76542zS.LIZJ("tiktokec_longstay_page", new AqS4S0600000_12(c70414RkI2, (Integer) 1, (Object) str2, valueOf2, l, obj2, 2));
            }
            IPdpStarter.PdpEnterParam pdpEnterParam2 = pdpViewModel.LJLJJLL;
            if (pdpEnterParam2 != null && (requestParams = pdpEnterParam2.getRequestParams()) != null) {
                obj3 = requestParams.get("product_id");
            } else {
                obj3 = null;
            }
            if ((obj3 instanceof List) && (list = (List) obj3) != null && (pdpEnterParam = pdpViewModel.LJLJJLL) != null) {
                XKX.LIZLLL(pdpViewModel.LLJIJIL, C78613UtF.LIZJ, null, new C69920RcK(pdpEnterParam, list, pdpViewModel, null), 2);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
