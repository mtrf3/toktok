package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel$acceptInvitation$3", f = "GroupInviteViewModel.kt", l = {174}, m = "invokeSuspend")
/* renamed from: X.9zQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254889zQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ GroupInviteViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C254889zQ(GroupInviteViewModel groupInviteViewModel, InterfaceC67352kd<? super C254889zQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = groupInviteViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C254889zQ(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        AcceptInviteCardResponse acceptInviteCardResponse;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                String str = this.LJLILLLLZI.LJLIL;
                this.LJLIL = 1;
                if (str == null) {
                    obj = null;
                } else {
                    obj = C30U.LIZ().acceptInviteCard(str, this);
                }
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            acceptInviteCardResponse = (AcceptInviteCardResponse) obj;
        } catch (C38333F2r e) {
            this.LJLILLLLZI.setState(new AqS170S0100000_4(e, 1572));
        }
        if (acceptInviteCardResponse == null || acceptInviteCardResponse.error_code != 0) {
            this.LJLILLLLZI.setState(new AqS170S0100000_4(acceptInviteCardResponse, 1570));
            return C76800UCe.LIZ;
        }
        this.LJLILLLLZI.setState(new AqS170S0100000_4(acceptInviteCardResponse, 1571));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
