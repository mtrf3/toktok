package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.utils.ImpressionUtil$push$1", f = "ImpressionUtil.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ECR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ECT LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECR(ECT ect, InterfaceC67352kd<? super ECR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = ect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ECR(this.LJLILLLLZI, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(1000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ECT ect = this.LJLILLLLZI;
        ((ArrayList) ect.LIZIZ).addAll(ect.LIZJ);
        if (((ArrayList) ect.LIZJ).size() > 0) {
            List<String> list = ect.LIZJ;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                arrayList.add(new Feed((String) it.next(), null, null, null, 14, null));
            }
            XKX.LIZLLL(C780334l.LJLIL, null, null, new ECS(ect, arrayList, null), 3);
        }
        ((ArrayList) ect.LIZJ).clear();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
