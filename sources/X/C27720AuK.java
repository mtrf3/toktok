package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS29S0100100_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$preloadRecommendData$1$1", f = "PdpViewModel.kt", l = {4328}, m = "invokeSuspend")
/* renamed from: X.AuK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27720AuK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ InterfaceC71003Rtn LJLJI;
    public final /* synthetic */ PdpViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27720AuK(InterfaceC71003Rtn interfaceC71003Rtn, PdpViewModel pdpViewModel, InterfaceC67352kd<? super C27720AuK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC71003Rtn;
        this.LJLJJI = pdpViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27720AuK(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        LaneParams LJIILJJIL;
        String str;
        String str2;
        String str3;
        Integer num;
        List<Integer> list;
        long elapsedRealtime;
        String str4;
        List<BrickInfo> list2;
        BrickInfo brickInfo;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        ProductPackStruct productPackStruct = null;
        if (i != 0) {
            if (i == 1) {
                elapsedRealtime = this.LJLIL;
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            LJIILJJIL = C78948Uye.LJIILJJIL(this.LJLJI, "lib_track_builtin_lane_business");
            Object obj3 = LJIILJJIL.get((Object) "first_source_page");
            if (obj3 instanceof String) {
                str = (String) obj3;
            } else {
                str = null;
            }
            Object obj4 = LJIILJJIL.get((Object) "enter_from_info");
            if (obj4 instanceof String) {
                str2 = (String) obj4;
            } else {
                str2 = null;
            }
            Object obj5 = LJIILJJIL.get((Object) "author_id");
            if (obj5 instanceof String) {
                str3 = (String) obj5;
            } else {
                str3 = null;
            }
            Object obj6 = LJIILJJIL.get((Object) "traffic_source");
            if (obj6 instanceof Integer) {
                num = (Integer) obj6;
            } else {
                num = null;
            }
            Object obj7 = LJIILJJIL.get((Object) "traffic_source_list");
            if (obj7 instanceof List) {
                list = (List) obj7;
            } else {
                list = null;
            }
            elapsedRealtime = SystemClock.elapsedRealtime();
            C70091Rf5 c70091Rf5 = PdpApi.LIZ;
            String jw0 = this.LJLJJI.jw0();
            java.util.Map<String, ? extends Object> LJJIIZI = C51029K0z.LJJIIZI(new OSZ("is_add_cart", new Integer(this.LJLJJI.LLILLL ? 1 : 0)));
            Integer Wv0 = this.LJLJJI.Wv0();
            if (Wv0 != null) {
                str4 = Wv0.toString();
            } else {
                str4 = null;
            }
            this.LJLIL = elapsedRealtime;
            this.LJLILLLLZI = 1;
            obj2 = c70091Rf5.LIZLLL(jw0, str, str2, str3, num, list, LJJIIZI, str4, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        PdpRecommendPreloadResponse pdpRecommendPreloadResponse = (PdpRecommendPreloadResponse) obj2;
        String LJI = C27739Aud.LJI(pdpRecommendPreloadResponse);
        C78946Uyc.LJJII(this.LJLJI, new C70994Rte(), new AqS29S0100100_4(elapsedRealtime, pdpRecommendPreloadResponse, 0));
        ProductPackStruct productPackStruct2 = this.LJLJJI.LJLJLLL;
        if (productPackStruct2 != null && (list2 = productPackStruct2.bricks) != null) {
            Iterator<BrickInfo> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    brickInfo = it.next();
                    if (brickInfo.brickName == EnumC27721AuL.RECOMMENDATION.getValue()) {
                        break;
                    }
                } else {
                    brickInfo = null;
                    break;
                }
            }
            BrickInfo brickInfo2 = brickInfo;
            if (brickInfo2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list2.subList(0, list2.indexOf(brickInfo2)));
                arrayList.add(new BrickInfo(LJI, brickInfo2.brickBizExtra, brickInfo2.brickLynxSchema, brickInfo2.brickName, brickInfo2.brickOption, brickInfo2.brickType, brickInfo2.brickVersion, brickInfo2.brickStyle));
                PdpViewModel pdpViewModel = this.LJLJJI;
                ProductPackStruct productPackStruct3 = pdpViewModel.LJLJLLL;
                if (productPackStruct3 != null) {
                    productPackStruct = ProductPackStruct.LIZ(productPackStruct3, null, null, null, null, arrayList, null, null, null, -1, -262145);
                }
                pdpViewModel.LJLJLLL = productPackStruct;
                PdpViewModel pdpViewModel2 = this.LJLJJI;
                C70414RkI c70414RkI = pdpViewModel2.LLFII;
                if (c70414RkI != null) {
                    c70414RkI.LJJLIL(pdpViewModel2.LJLJLLL);
                }
            }
        }
        PdpViewModel pdpViewModel3 = this.LJLJJI;
        pdpViewModel3.setState(new AqS178S0100000_12(pdpViewModel3, 66));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
