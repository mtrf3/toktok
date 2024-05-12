package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.sync.SyncReceiver$onDataUpdate$1", f = "SyncReceiver.kt", l = {52}, m = "invokeSuspend")
/* renamed from: X.2jM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66562jM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C74162vc LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ List<AbstractC74232vj> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C66562jM(C74162vc c74162vc, String str, List<? extends AbstractC74232vj> list, InterfaceC67352kd<? super C66562jM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c74162vc;
        this.LJLJI = str;
        this.LJLJJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66562jM(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            InterfaceC88473Ynt<String, List<? extends AbstractC74232vj>, InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88473Ynt = this.LJLILLLLZI.LJLIL;
            String str = this.LJLJI;
            List<AbstractC74232vj> list = this.LJLJJI;
            this.LJLIL = 1;
            if (interfaceC88473Ynt.invoke(str, list, this) == enumC58928NAu) {
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
