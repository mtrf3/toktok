package X;

import com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionData;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.Notice;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.DiversionTargetData;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel;
import fjb.a;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel$handleDiversionTargetData$1", f = "ShopMainLynxViewModel.kt", l = {341, 341}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class M09 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ShopMainLynxViewModel LJLILLLLZI;
    public final /* synthetic */ DiversionTargetData LJLJI;
    public final /* synthetic */ Notice LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M09(ShopMainLynxViewModel shopMainLynxViewModel, DiversionTargetData diversionTargetData, Notice notice, InterfaceC67352kd<? super M09> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = shopMainLynxViewModel;
        this.LJLJI = diversionTargetData;
        this.LJLJJI = notice;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new M09(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        DiversionData diversionData;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
                return C76800UCe.LIZ;
            }
        } else {
            C141335gf.LIZJ(obj);
            ShopMainLynxViewModel shopMainLynxViewModel = this.LJLILLLLZI;
            DiversionTargetData diversionTargetData = this.LJLJI;
            Notice notice = this.LJLJJI;
            shopMainLynxViewModel.getClass();
            if (diversionTargetData == null) {
                str = null;
            } else {
                try {
                    str = diversionTargetData.getReachCfgData();
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    C78983UzD.LJIIZILJ(th2);
                    C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                }
            }
            JSONObject jSONObject = new JSONObject();
            if (str != null) {
                jSONObject.put("diversion_config", str);
            }
            if (notice != null) {
                jSONObject.put("msg_tooltip_data", C27739Aud.LJI(notice));
            }
            if (str != null || notice != null) {
                shopMainLynxViewModel.hv0().LIZ(jSONObject, EnumC56110M0k.LYNX_ON_PAGE_START);
                if (str != null) {
                    C56092Lzs c56092Lzs = C56092Lzs.LIZ;
                    String str3 = "";
                    if (diversionTargetData == null || (diversionData = diversionTargetData.getDiversionData()) == null || (str2 = diversionData.getDiversionId()) == null) {
                        str2 = "";
                    }
                    ShopMainFragment.LJZ.getClass();
                    String str4 = ShopMainFragment.LJZI;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    c56092Lzs.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("page_name", "mall");
                    hashMap.put("enter_from", C56092Lzs.LIZJ());
                    hashMap.put("previous_page", str3);
                    hashMap.put("rd_page_type", "native");
                    hashMap.put("diversion_id", str2);
                    hashMap.put("stage", "send_to_target");
                    C56092Lzs.LJIILJJIL("rd_tiktokec_diversion", hashMap);
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
            this.LJLIL = 2;
            if (shopMainLynxViewModel.iv0(diversionTargetData, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
