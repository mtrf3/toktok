package X;

import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import fjb.a;
import kotlin.jvm.internal.AqS175S0100000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM$onAuthStateUpdate$1", f = "FriendsEmptyPageMainSectionVM.kt", l = {312}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class LSJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ FriendsEmptyPageMainSectionVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LSJ(boolean z, FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM, InterfaceC67352kd<? super LSJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = friendsEmptyPageMainSectionVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new LSJ(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            if (this.LJLILLLLZI) {
                return C76800UCe.LIZ;
            }
            C221018lt.LJFF("_FriendsEmpty", "onAuthStateUpdate");
            FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = this.LJLJI;
            AqS175S0100000_9 aqS175S0100000_9 = new AqS175S0100000_9(friendsEmptyPageMainSectionVM, 421);
            this.LJLIL = 1;
            if (friendsEmptyPageMainSectionVM.kv0(aqS175S0100000_9, this) == enumC58928NAu) {
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