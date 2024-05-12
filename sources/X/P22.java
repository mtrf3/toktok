package X;

import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM$newContactUploadAsync$1$1", f = "FindFriendsPageVM.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class P22 extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C9U5>, Object> {
    public int LJLIL;
    public final /* synthetic */ FindFriendsPageVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P22(FindFriendsPageVM findFriendsPageVM, InterfaceC67352kd<? super P22> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = findFriendsPageVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new P22(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C9U5> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            C58084Mqu.LIZIZ(C58084Mqu.LIZ(this.LJLILLLLZI.getState().LJLJJL.LJLIL), 2);
            InterfaceC237529Tw interfaceC237529Tw = this.LJLILLLLZI.LJLIL;
            EnumC58085Mqv enumC58085Mqv = EnumC58085Mqv.FIND_FRIENDS;
            this.LJLIL = 1;
            obj = interfaceC237529Tw.LIZIZ(enumC58085Mqv, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
