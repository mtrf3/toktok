package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.BaseRelationModel$recentLoader$2$2", f = "BaseRelationModel.kt", l = {67}, m = "invokeSuspend")
/* renamed from: X.3HL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HL extends AbstractC65782Prm implements InterfaceC88471Ynr<List<? extends C63120Opw>, InterfaceC67352kd<? super List<? extends C63120Opw>>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C3HO LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3HL(C3HO c3ho, InterfaceC67352kd<? super C3HL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c3ho;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3HL c3hl = new C3HL(this.LJLJI, interfaceC67352kd);
        c3hl.LJLILLLLZI = obj;
        return c3hl;
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
            List<? extends C63120Opw> list = (List) this.LJLILLLLZI;
            C3HO c3ho = this.LJLJI;
            this.LJLIL = 1;
            obj = c3ho.LJIILL(list, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(List<? extends C63120Opw> list, InterfaceC67352kd<? super List<? extends C63120Opw>> interfaceC67352kd) {
        return ((a) create(list, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
