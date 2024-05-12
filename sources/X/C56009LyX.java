package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.ShopMainResponse;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS0S0010100_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel$loadData$2", f = "ShopMainViewModel.kt", l = {277}, m = "invokeSuspend")
/* renamed from: X.LyX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56009LyX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ShopMainViewModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ EnumC56007LyV LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56009LyX(ShopMainViewModel shopMainViewModel, boolean z, EnumC56007LyV enumC56007LyV, InterfaceC67352kd<? super C56009LyX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = shopMainViewModel;
        this.LJLJI = z;
        this.LJLJJI = enumC56007LyV;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C56009LyX(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C76800UCe c76800UCe;
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLILLLLZI.setStateImmediate(new AqS175S0100000_9(this.LJLJJI, 40));
            if (this.LJLJI) {
                ShopMainViewModel shopMainViewModel = this.LJLILLLLZI;
                shopMainViewModel.getClass();
                ShopMainResponse kv0 = ShopMainViewModel.kv0();
                String string = C56023Lyl.LIZIZ().getString("ec_shop_main_cache_data_log_id", "");
                o.LJIIIIZZ(string, "REPO.getString(KEY_SHOP_…IN_CACHE_DATA_LOG_ID, \"\")");
                if (kv0 != null) {
                    if (shopMainViewModel.lv0().LJLLLLLL != ILR.COMPLETED) {
                        C56045Lz7.LJIILIIL(C56045Lz7.LIZ, EnumC56081Lzh.STAGE_LOAD_DATA.getStage(), shopMainViewModel.lv0().LJZ, System.currentTimeMillis() - C56090Lzq.LIZ, false, E2C.LIZJ("is_data_cache", "1"), 8);
                    }
                    c76800UCe = C76800UCe.LIZ;
                } else {
                    c76800UCe = null;
                }
                if (c76800UCe == null && shopMainViewModel.lv0().LJLLLLLL != ILR.COMPLETED) {
                    C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
                    String stage = EnumC56081Lzh.STAGE_LOAD_DATA.getStage();
                    String str = shopMainViewModel.lv0().LJZ;
                    long currentTimeMillis = System.currentTimeMillis() - C56090Lzq.LIZ;
                    java.util.Map LJJL = C113554cx.LJJL(new OSZ("is_data_cache", "1"), new OSZ("err_msg", EnumC56120M0u.NO_CACHE.getErrMsg()));
                    c56045Lz7.getClass();
                    C56045Lz7.LJIIL(stage, str, currentTimeMillis, false, true, LJJL);
                }
                if (kv0 != null && !(shopMainViewModel.getState().LJLILLLLZI instanceof C72912tb)) {
                    if (shopMainViewModel.LJLJJL) {
                        shopMainViewModel.LJLJJL = false;
                        C56045Lz7 c56045Lz72 = C56045Lz7.LIZ;
                        long currentTimeMillis2 = System.currentTimeMillis() - shopMainViewModel.lv0().LJLIL;
                        c56045Lz72.getClass();
                        C76542zS.LIZJ("rd_tiktokec_mall_data_load_dur", new AqS0S0010100_9(currentTimeMillis2, true, 0));
                    }
                    shopMainViewModel.tv0(kv0, false, string, null);
                    shopMainViewModel.lv0().LJLLILLLL = true;
                }
            }
            ShopMainViewModel shopMainViewModel2 = this.LJLILLLLZI;
            EnumC56007LyV enumC56007LyV = this.LJLJJI;
            this.LJLIL = 1;
            shopMainViewModel2.getClass();
            Object LJI = C48841JEv.LJI(new C56011LyZ(enumC56007LyV, shopMainViewModel2, null), this);
            if (LJI != obj2) {
                LJI = C76800UCe.LIZ;
            }
            if (LJI == obj2) {
                return obj2;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
