package X;

import com.ss.android.ugc.aweme.relation.api.InviteFriendsApiService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.friendlist.InviteFriendVM$invite$1", f = "InviteFriendVM.kt", l = {C61447O9r.LJIIJ}, m = "invokeSuspend")
/* renamed from: X.2gH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64652gH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64652gH(String str, String str2, InterfaceC67352kd<? super C64652gH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64652gH(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                InviteFriendsApiService inviteFriendsApiService = InviteFriendsApiService.LIZIZ;
                String str = this.LJLILLLLZI;
                String str2 = this.LJLJI;
                this.LJLIL = 1;
                if (inviteFriendsApiService.inviteFriend(str, str2, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
