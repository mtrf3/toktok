package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.BaseRelationModel$recentLoader$1$4", f = "BaseRelationModel.kt", l = {56}, m = "invokeSuspend")
/* renamed from: X.3HD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HD extends AbstractC65782Prm implements InterfaceC88471Ynr<List<? extends IMContact>, InterfaceC67352kd<? super List<? extends IMContact>>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C3H8 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3HD(C3H8 c3h8, InterfaceC67352kd<? super C3HD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c3h8;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3HD c3hd = new C3HD(this.LJLJI, interfaceC67352kd);
        c3hd.LJLILLLLZI = obj;
        return c3hd;
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
            List<? extends IMContact> list = (List) this.LJLILLLLZI;
            C3H8 c3h8 = this.LJLJI;
            this.LJLIL = 1;
            obj = c3h8.LJIILL(list, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(List<? extends IMContact> list, InterfaceC67352kd<? super List<? extends IMContact>> interfaceC67352kd) {
        return ((a) create(list, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
