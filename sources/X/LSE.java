package X;

import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM$updateUIState$2", f = "FriendsEmptyPageMainSectionVM.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class LSE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ FriendsEmptyPageMainSectionVM LJLIL;
    public final /* synthetic */ L97 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LSE(FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM, L97 l97, InterfaceC67352kd<? super LSE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = friendsEmptyPageMainSectionVM;
        this.LJLILLLLZI = l97;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new LSE(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLJJL.setValue(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
