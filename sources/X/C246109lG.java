package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel$joinGroup$1", f = "GroupInviteViewModel.kt", l = {115}, m = "invokeSuspend")
/* renamed from: X.9lG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246109lG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ GroupInviteViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C246109lG(GroupInviteViewModel groupInviteViewModel, InterfaceC67352kd<? super C246109lG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = groupInviteViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C246109lG(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            GroupInviteViewModel groupInviteViewModel = this.LJLILLLLZI;
            this.LJLIL = 1;
            groupInviteViewModel.setState(C254869zO.LJLIL);
            Object LJI = XKX.LJI(C78613UtF.LIZJ, new C254889zQ(groupInviteViewModel, null), this);
            if (LJI != obj2) {
                LJI = C76800UCe.LIZ;
            }
            if (LJI == obj2) {
                return obj2;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
