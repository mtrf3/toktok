package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuitReasonData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$checkNeedQuitReason$1", f = "OrderSubmitViewModel.kt", l = {1015}, m = "invokeSuspend")
/* renamed from: X.AwA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27834AwA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ OrderSubmitViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27834AwA(OrderSubmitViewModel orderSubmitViewModel, InterfaceC67352kd<? super C27834AwA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = orderSubmitViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27834AwA(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long j;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Throwable unused) {
            C78983UzD.LJIILL("Get quit reasons fail");
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            FFL.LJIIIZ().getClass();
            int LJIIJ = FFL.LJIIJ(31744, -1, "ecom_quit_checkout_reason_collection_config", true);
            if (LJIIJ >= 0) {
                String LJJIFFI = C79057V0z.LJJIFFI(C66822jm.LIZ, "ecom_last_quit_reason_time_stamp");
                if (LJJIFFI != null) {
                    j = CastLongProtector.parseLong(LJJIFFI);
                } else {
                    j = 0;
                }
                if ((System.currentTimeMillis() - j) / 86400000 >= LJIIJ && this.LJLILLLLZI.LLILL != null) {
                    this.LJLIL = 1;
                    obj = C27954Ay6.LLLZIL(this);
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
            return C76800UCe.LIZ;
        }
        Response response = (Response) obj;
        if (response != null && response.isCodeOK()) {
            this.LJLILLLLZI.LLFII = (QuitReasonData) response.data;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
