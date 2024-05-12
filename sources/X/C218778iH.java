package X;

import Y.IDfS127S0100000_3;
import com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursInviteFriendsAssem$inputFlow$1$1", f = "AddYoursInviteFriendsAssem.kt", l = {122}, m = "invokeSuspend")
/* renamed from: X.8iH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218778iH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C33R<String> LJLILLLLZI;
    public final /* synthetic */ AddYoursInviteFriendsAssem LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C218778iH(C33R<String> c33r, AddYoursInviteFriendsAssem addYoursInviteFriendsAssem, InterfaceC67352kd<? super C218778iH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c33r;
        this.LJLJI = addYoursInviteFriendsAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C218778iH(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            InterfaceC65462ha LJIIJ = V1M.LJIIJ(this.LJLILLLLZI, 200L);
            IDfS127S0100000_3 iDfS127S0100000_3 = new IDfS127S0100000_3(this.LJLJI, 4);
            this.LJLIL = 1;
            if (LJIIJ.collect(iDfS127S0100000_3, this) == enumC58928NAu) {
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
