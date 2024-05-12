package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainResponse;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel$loadRemoteData$2$mainDataSsResponse$1", f = "ShopMainViewModel.kt", l = {439, 446}, m = "invokeSuspend")
/* renamed from: X.Lye, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56016Lye extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C64797Pbt<Response<ShopMainResponse>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ EnumC56007LyV LJLILLLLZI;
    public final /* synthetic */ ShopMainViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56016Lye(EnumC56007LyV enumC56007LyV, ShopMainViewModel shopMainViewModel, InterfaceC67352kd<? super C56016Lye> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = enumC56007LyV;
        this.LJLJI = shopMainViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C56016Lye(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C64797Pbt<Response<ShopMainResponse>>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
            }
        } else {
            C141335gf.LIZJ(obj);
            String str3 = "";
            if (this.LJLILLLLZI == EnumC56007LyV.REFRESH) {
                InterfaceC56027Lyp interfaceC56027Lyp = (InterfaceC56027Lyp) this.LJLJI.LJLJI.getValue().getOperator();
                int parseInt = CastIntegerProtector.parseInt(this.LJLJI.LJLJJLL);
                String str4 = this.LJLJI.lv0().LJLJJLL;
                if (str4 == null) {
                    str4 = "";
                }
                java.util.Map<String, String> map = this.LJLJI.LJLJL;
                if (map == null || (str = map.get("recommend_tab_channel_tag")) == null) {
                    str = "";
                }
                java.util.Map<String, String> map2 = this.LJLJI.LJLJL;
                if (map2 != null && (str2 = map2.get("personal_tab_pool_id")) != null) {
                    str3 = str2;
                }
                this.LJLIL = 1;
                obj = interfaceC56027Lyp.LJJJJZ(parseInt, str4, str, str3, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                InterfaceC56027Lyp interfaceC56027Lyp2 = (InterfaceC56027Lyp) this.LJLJI.LJLJI.getValue().getOperator();
                int parseInt2 = CastIntegerProtector.parseInt(this.LJLJI.LJLJJLL);
                String str5 = this.LJLJI.lv0().LJLJJLL;
                if (str5 != null) {
                    str3 = str5;
                }
                this.LJLIL = 2;
                obj = interfaceC56027Lyp2.LIZ(str3, parseInt2, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return obj;
    }
}
