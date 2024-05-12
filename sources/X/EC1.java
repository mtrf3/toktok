package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.BasicInfo;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CountCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotUpdateParams;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.IconCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.repo.MallReddotApi;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM$handleShopTabClick$2", f = "CustomDotVM.kt", l = {467}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EC1 extends AbstractC65782Prm implements InterfaceC88471Ynr<Boolean, InterfaceC67352kd<? super Response<CustomDotResponse>>, Object> {
    public int LJLIL;
    public final /* synthetic */ CustomDotResponse LJLILLLLZI;
    public final /* synthetic */ CustomDotVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EC1(CustomDotResponse customDotResponse, CustomDotVM customDotVM, InterfaceC67352kd<? super EC1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = customDotResponse;
        this.LJLJI = customDotVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EC1(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<BasicInfo> basicInfoList;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ArrayList LJFF = C1JX.LJFF(obj);
            CountCfg countConfig = this.LJLILLLLZI.getCountConfig();
            List<BasicInfo> list = null;
            if (countConfig != null) {
                list = countConfig.getBasicInfoList();
            }
            IconCfg iconConfig = this.LJLILLLLZI.getIconConfig();
            if (iconConfig != null && (basicInfoList = iconConfig.getBasicInfoList()) != null) {
                LJFF.addAll(basicInfoList);
            }
            if (list != null) {
                LJFF.addAll(list);
            }
            MallReddotApi.LIZ.getClass();
            MallReddotApi mallReddotApi = EC3.LIZIZ;
            CustomDotUpdateParams customDotUpdateParams = new CustomDotUpdateParams(2, this.LJLJI.gv0(LJFF), 1, 1, this.LJLJI.LJLLJ);
            this.LJLIL = 1;
            obj = mallReddotApi.updateUserMsg(customDotUpdateParams, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        T t = ((C64797Pbt) obj).LIZIZ;
        o.LJIIIIZZ(t, "MallReddotApi.mallReddot…  ),\n            ).body()");
        return t;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Boolean bool, InterfaceC67352kd<? super Response<CustomDotResponse>> interfaceC67352kd) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
