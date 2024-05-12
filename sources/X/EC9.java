package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponse;
import fjb.a;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM$handleShopTabClick$1", f = "CustomDotVM.kt", l = {906}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EC9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ CustomDotVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EC9(CustomDotVM customDotVM, InterfaceC67352kd<? super EC9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = customDotVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EC9(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            CustomDotVM customDotVM = this.LJLJI;
            customDotVM.withState(new AqS175S0100000_9(customDotVM, 559));
            C36268ELg c36268ELg = this.LJLJI.LJLJJL;
            if (c36268ELg != null) {
                obj2 = Boolean.valueOf(c36268ELg.LJIIJ);
                XKQ xkq = c36268ELg.LIZLLL;
                if (xkq != null) {
                    this.LJLIL = obj2;
                    this.LJLILLLLZI = 1;
                    if (C79146V4k.LJIJI(xkq, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            } else {
                obj2 = null;
            }
        }
        CustomDotResponse customDotResponse = this.LJLJI.LJLJJLL;
        if (customDotResponse == null || ((V3N.LJIIIIZZ(customDotResponse) == null || (customDotResponse != null && V3N.LJIIIIZZ(customDotResponse) != null && o.LJ(obj2, Boolean.TRUE))) && (customDotResponse == null || (customDotResponse.getIconConfig() == null && (customDotResponse == null || customDotResponse.getCountConfig() == null))))) {
            this.LJLJI.rv0(true);
            return C76800UCe.LIZ;
        }
        CustomDotVM customDotVM2 = this.LJLJI;
        customDotVM2.vv0(true, true, false, new EC8(customDotResponse, customDotVM2, null));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
