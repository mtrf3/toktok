package X;

import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import fjb.a;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS97S0101000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM$tryUpdateSectionByUserCard$1", f = "FriendsEmptyPageMainSectionVM.kt", l = {327, 330, 334, 341}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class LSS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C57778Mly LJLILLLLZI;
    public final /* synthetic */ FriendsEmptyPageMainSectionVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LSS(C57778Mly c57778Mly, FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM, InterfaceC67352kd<? super LSS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c57778Mly;
        this.LJLJI = friendsEmptyPageMainSectionVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new LSS(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "new UserCard State: ");
            LIZIZ.append(this.LJLILLLLZI);
            C221018lt.LJFF("_FriendsEmpty", X1D.LIZIZ(LIZIZ));
            C57778Mly c57778Mly = this.LJLILLLLZI;
            AbstractC72932td<C223208pQ> abstractC72932td = c57778Mly.LIZ;
            if (abstractC72932td instanceof C33X) {
                FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = this.LJLJI;
                LSR lsr = LSR.LJLIL;
                this.LJLIL = 1;
                if (friendsEmptyPageMainSectionVM.kv0(lsr, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else if (abstractC72932td instanceof C72922tc) {
                FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM2 = this.LJLJI;
                LSQ lsq = LSQ.LJLIL;
                this.LJLIL = 2;
                if (friendsEmptyPageMainSectionVM2.kv0(lsq, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else if (abstractC72932td instanceof C3C1) {
                FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM3 = this.LJLJI;
                AqS175S0100000_9 aqS175S0100000_9 = new AqS175S0100000_9(friendsEmptyPageMainSectionVM3, 422);
                this.LJLIL = 3;
                if (friendsEmptyPageMainSectionVM3.kv0(aqS175S0100000_9, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else if (abstractC72932td instanceof C72912tb) {
                if (!(c57778Mly.LIZJ instanceof C72912tb)) {
                    return C76800UCe.LIZ;
                }
                int LIZ = c57778Mly.LIZ();
                FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM4 = this.LJLJI;
                AqS97S0101000_9 aqS97S0101000_9 = new AqS97S0101000_9(LIZ, friendsEmptyPageMainSectionVM4, 6);
                this.LJLIL = 4;
                if (friendsEmptyPageMainSectionVM4.kv0(aqS97S0101000_9, this) == enumC58928NAu) {
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
