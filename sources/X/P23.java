package X;

import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM$newContactUploadAsync$1", f = "FindFriendsPageVM.kt", l = {267}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class P23 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C9U5>, Object> {
    public int LJLIL;
    public final /* synthetic */ FindFriendsPageVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P23(FindFriendsPageVM findFriendsPageVM, InterfaceC67352kd<? super P23> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = findFriendsPageVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new P23(this.LJLILLLLZI, interfaceC67352kd);
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
            P29 p29 = findFriendsPageVM.LJLJLJ;
            P22 p22 = new P22(findFriendsPageVM, null);
            this.LJLIL = 1;
            obj = p29.LIZLLL(p22, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C9U5> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}