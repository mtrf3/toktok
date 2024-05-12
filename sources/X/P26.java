package X;

import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM$syncContact$2", f = "FindFriendsPageVM.kt", l = {258}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class P26 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ FindFriendsPageVM LJLILLLLZI;
    public final /* synthetic */ InterfaceC68342mE<C9U5> LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P26(FindFriendsPageVM findFriendsPageVM, InterfaceC68342mE<C9U5> interfaceC68342mE, String str, InterfaceC67352kd<? super P26> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = findFriendsPageVM;
        this.LJLJI = interfaceC68342mE;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new P26(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            FindFriendsPageVM findFriendsPageVM = this.LJLILLLLZI;
            InterfaceC68342mE<C9U5> interfaceC68342mE = this.LJLJI;
            String str = this.LJLJJI;
            this.LJLIL = 1;
            if (findFriendsPageVM.gv0(interfaceC68342mE, str, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (o.LJ(this.LJLJJI, "click")) {
            FindFriendsPageVM findFriendsPageVM2 = this.LJLILLLLZI;
            XKX.LIZLLL(findFriendsPageVM2.getAssemVMScope(), EXV.LIZ, null, new P2B(findFriendsPageVM2, EnumC58046MqI.CONTACT, null), 2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
