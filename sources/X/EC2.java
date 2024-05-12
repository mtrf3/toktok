package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.repo.MallReddotApi;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM$loadCustomDot$1", f = "CustomDotVM.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EC2 extends AbstractC65782Prm implements InterfaceC88471Ynr<Boolean, InterfaceC67352kd<? super Response<CustomDotResponse>>, Object> {
    public int LJLIL;
    public /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ CustomDotVM LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EC2(boolean z, CustomDotVM customDotVM, InterfaceC67352kd<? super EC2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = z;
        this.LJLJJI = customDotVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        EC2 ec2 = new EC2(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        ec2.LJLILLLLZI = ((Boolean) obj).booleanValue();
        return ec2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            boolean z = this.LJLILLLLZI;
            MallReddotApi.LIZ.getClass();
            MallReddotApi mallReddotApi = EC3.LIZIZ;
            boolean z2 = this.LJLJI;
            int i2 = this.LJLJJI.LJLLJ;
            CustomDotGetParams customDotGetParams = new CustomDotGetParams(z2 ? 1 : 0, z ? 1 : 0, i2);
            this.LJLIL = 1;
            obj = mallReddotApi.getShopRedDot(customDotGetParams, this);
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
