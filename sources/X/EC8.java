package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.BasicInfo;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CountCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotUpdateParams;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.IconCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.repository.CustomDotApi;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM$handleShopTabClick$1$2", f = "CustomDotVM.kt", l = {938}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EC8 extends AbstractC65782Prm implements InterfaceC88471Ynr<Boolean, InterfaceC67352kd<? super Response<CustomDotResponse>>, Object> {
    public int LJLIL;
    public final /* synthetic */ CustomDotResponse LJLILLLLZI;
    public final /* synthetic */ CustomDotVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EC8(CustomDotResponse customDotResponse, CustomDotVM customDotVM, InterfaceC67352kd<? super EC8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = customDotResponse;
        this.LJLJI = customDotVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EC8(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<BasicInfo> list;
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
            ArrayList LJFF = C1JX.LJFF(obj2);
            ArrayList arrayList = new ArrayList();
            ReachCfg LJIIIIZZ = V3N.LJIIIIZZ(this.LJLILLLLZI);
            CountCfg countConfig = this.LJLILLLLZI.getCountConfig();
            List<BasicInfo> list2 = null;
            if (countConfig != null) {
                list = countConfig.getBasicInfoList();
            } else {
                list = null;
            }
            IconCfg iconConfig = this.LJLILLLLZI.getIconConfig();
            if (iconConfig != null) {
                list2 = iconConfig.getBasicInfoList();
            }
            if (LJIIIIZZ != null) {
                LJFF.add(ReachCfg.copy$default(LJIIIIZZ, null, null, null, 5, null));
            }
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            if (list != null) {
                arrayList.addAll(list);
            }
            CustomDotApi.LIZ.getClass();
            CustomDotApi customDotApi = EC4.LIZIZ;
            CustomDotUpdateParams customDotUpdateParams = new CustomDotUpdateParams(2, this.LJLJI.gv0(arrayList), 1, 1, this.LJLJI.LJLJLLL, LJFF);
            this.LJLIL = 1;
            obj2 = customDotApi.shopReachUpdate(customDotUpdateParams, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        T t = ((C64797Pbt) obj2).LIZIZ;
        o.LJIIIIZZ(t, "CustomDotApi.mallPreload…\n                ).body()");
        return t;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Boolean bool, InterfaceC67352kd<? super Response<CustomDotResponse>> interfaceC67352kd) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
