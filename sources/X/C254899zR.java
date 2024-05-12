package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel$fetchModel$3", f = "GroupInviteViewModel.kt", l = {144}, m = "invokeSuspend")
/* renamed from: X.9zR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254899zR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ GroupInviteViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C254899zR(GroupInviteViewModel groupInviteViewModel, InterfaceC67352kd<? super C254899zR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = groupInviteViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C254899zR(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InviteCardDetailInnerResponse inviteCardDetailInnerResponse;
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
                    obj = C30U.LIZ().getInviteCardDetailInner(str, this);
                }
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            inviteCardDetailInnerResponse = (InviteCardDetailInnerResponse) obj;
            this.LJLILLLLZI.jv0().LIZ(EnumC254909zS.NETWORK_END, SystemClock.elapsedRealtime());
        } catch (Exception e) {
            this.LJLILLLLZI.jv0().LIZ(EnumC254909zS.NETWORK_END, SystemClock.elapsedRealtime());
            if (e instanceof C38333F2r) {
                this.LJLILLLLZI.setState(new AqS170S0100000_4(e, 388));
            }
        }
        if (inviteCardDetailInnerResponse == null || inviteCardDetailInnerResponse.error_code != 0) {
            this.LJLILLLLZI.setState(new AqS170S0100000_4(inviteCardDetailInnerResponse, 387));
            return C76800UCe.LIZ;
        }
        PO8 po8 = this.LJLILLLLZI.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("result returned in ");
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        po8.d(X1D.LIZIZ(LIZ));
        GroupInviteViewModel groupInviteViewModel = this.LJLILLLLZI;
        groupInviteViewModel.setState(new AqS135S0200000_4(groupInviteViewModel, inviteCardDetailInnerResponse, 66));
        return C76800UCe.LIZ;
    }
}
