package X;

import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import fjb.a;
import kotlin.jvm.internal.AqS175S0100000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment$checkEmailAuth$1", f = "SocialFriendsFeedFragment.kt", l = {671}, m = "invokeSuspend")
/* renamed from: X.2pz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70672pz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ SocialFriendsFeedFragment LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70672pz(SocialFriendsFeedFragment socialFriendsFeedFragment, InterfaceC67352kd<? super C70672pz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = socialFriendsFeedFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C70672pz c70672pz = new C70672pz(this.LJLJI, interfaceC67352kd);
        c70672pz.LJLILLLLZI = obj;
        return c70672pz;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3C3 LIZJ;
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
            InterfaceC70542pm LJJIII = C78609UtB.LJJIII(this.LJLJI, new AqS175S0100000_9((InterfaceC70422pa) this.LJLILLLLZI, 90));
            if (LJJIII != null && (LIZJ = ((C77202URq) LJJIII).LIZJ()) != null) {
                this.LJLIL = 1;
                if (V1M.LJII(LIZJ, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
