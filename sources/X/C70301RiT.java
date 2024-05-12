package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductInfoBizExtra;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import fjb.a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel$openSku$1", f = "PdpMainViewModel.kt", l = {262}, m = "invokeSuspend")
/* renamed from: X.RiT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70301RiT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PdpMainViewModel LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70301RiT(PdpMainViewModel pdpMainViewModel, View view, int i, InterfaceC67352kd<? super C70301RiT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = pdpMainViewModel;
        this.LJLJI = view;
        this.LJLJJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70301RiT(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        java.util.Set<String> keySet;
        Object obj2;
        InterfaceC71003Rtn interfaceC71003Rtn;
        Object obj3 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj3);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj3);
            if (this.LJLILLLLZI.hv0().getVmDispatcher().getState().LJLJI == 1) {
                str = "product_review";
            } else if (this.LJLILLLLZI.hv0().getVmDispatcher().getState().LJLJI == 2) {
                str = "shop_review";
            } else {
                str = "product_detail";
            }
            HashMap hashMap = new HashMap();
            java.util.Map<String, ? extends Object> map = this.LJLILLLLZI.iv0().LJLJJI;
            if (map != null && (keySet = map.keySet()) != null) {
                PdpMainViewModel pdpMainViewModel = this.LJLILLLLZI;
                for (String str3 : keySet) {
                    java.util.Map<String, ? extends Object> map2 = pdpMainViewModel.iv0().LJLJJI;
                    if (map2 != null && (obj2 = map2.get(str3)) != null) {
                        hashMap.put(str3, obj2);
                    }
                }
            }
            Object value = this.LJLILLLLZI.iv0().LJLJJL.getValue();
            if (value != null) {
                hashMap.put("entrance_info", value);
            }
            int LIZ = this.LJLILLLLZI.iv0().LIZ();
            EnumC27447Apv enumC27447Apv = EnumC27447Apv.SEMI_PDP;
            if (LIZ == enumC27447Apv.getValue()) {
                hashMap.remove("product_id");
                hashMap.put("ad_product_id", this.LJLILLLLZI.iv0().LIZIZ());
                ProductInfoBizExtra LIZJ = this.LJLILLLLZI.iv0().LIZJ();
                if (LIZJ == null || (str2 = LIZJ.oecProductId) == null) {
                    str2 = "";
                }
                hashMap.put("product_id", str2);
            }
            Context context = this.LJLJI.getContext();
            o.LJIIIIZZ(context, "view.context");
            SkuPanelStarter.SkuEnterParams skuEnterParams = new SkuPanelStarter.SkuEnterParams(this.LJLILLLLZI.iv0().LIZIZ(), Boolean.valueOf(this.LJLILLLLZI.iv0().LJ()), false, this.LJLJJI, str, null, null, hashMap, null, null, null, null, null, null, null, null, null, null, new Integer(enumC27447Apv.getValue()), null, null, null, null, null, null, null, 66846560, null);
            InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL(this.LJLJI);
            this.LJLIL = 1;
            obj3 = SkuPanelStarter.LJ(context, skuEnterParams, str, LJIILIIL, this);
            if (obj3 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        SkuPanelState skuPanelState = (SkuPanelState) obj3;
        if (skuPanelState != null && skuPanelState.getProductId() != null) {
            this.LJLILLLLZI.hv0().jv0(skuPanelState);
            if (o.LJ(skuPanelState.getNeedOpenThirdApp(), Boolean.TRUE)) {
                PdpMainViewModel pdpMainViewModel2 = this.LJLILLLLZI;
                String link = skuPanelState.getLink();
                pdpMainViewModel2.getClass();
                if (link != null && (ujb.o.LJJJLIIL(link, "aweme", false) || ujb.o.LJJJLIIL(link, "sslocal", false) || (link = new Uri.Builder().scheme("aweme").authority("echybrid").appendQueryParameter("url", link).build().toString()) != null)) {
                    PdpMainViewModel pdpMainViewModel3 = this.LJLILLLLZI;
                    View view = this.LJLJI;
                    pdpMainViewModel3.iv0().LJLLLLLL = true;
                    InterfaceC36571c5 LJIIIZ = C79234V7u.LJIIIZ(view);
                    if ((LJIIIZ instanceof InterfaceC71003Rtn) && (interfaceC71003Rtn = (InterfaceC71003Rtn) LJIIIZ) != null) {
                        C78946Uyc.LJJII(interfaceC71003Rtn, new C70922RsU(), C70302RiU.LJLIL);
                    }
                    Context context2 = view.getContext();
                    o.LJIIIIZZ(context2, "view.context");
                    C26867AgZ.LIZIZ(context2, link, new LinkedHashMap(), false).open();
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
