package X;

import com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM$setup$1", f = "SharedInviteDialogVM.kt", l = {61}, m = "invokeSuspend")
/* renamed from: X.Luh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55771Luh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SharedInviteDialogVM LJLILLLLZI;
    public final /* synthetic */ C55773Luj LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55771Luh(SharedInviteDialogVM sharedInviteDialogVM, C55773Luj c55773Luj, String str, InterfaceC67352kd<? super C55771Luh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = sharedInviteDialogVM;
        this.LJLJI = c55773Luj;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55771Luh(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            SharedInviteDialogVM sharedInviteDialogVM = this.LJLILLLLZI;
            C55773Luj c55773Luj = this.LJLJI;
            String str = this.LJLJJI;
            this.LJLIL = 1;
            if (sharedInviteDialogVM.hv0(c55773Luj, str, this) == enumC58928NAu) {
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
