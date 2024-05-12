package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.RecommendApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WriteImpressionRequest;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.utils.ImpressionUtil$save$1", f = "ImpressionUtil.kt", l = {C61447O9r.LJIIJ}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ECS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ECT LJLILLLLZI;
    public final /* synthetic */ List<Feed> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECS(ECT ect, List<Feed> list, InterfaceC67352kd<? super ECS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = ect;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ECS(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C36043ECp c36043ECp = RecommendApi.LIZ;
            WriteImpressionRequest writeImpressionRequest = new WriteImpressionRequest(this.LJLILLLLZI.LIZ, this.LJLJI);
            this.LJLIL = 1;
            if (c36043ECp.LIZIZ(writeImpressionRequest, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
