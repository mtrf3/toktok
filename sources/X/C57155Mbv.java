package X;

import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM$updateUIState$1$1", f = "FriendsEmptyPageRootVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Mbv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57155Mbv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ FriendsEmptyPageRootVM LJLIL;
    public final /* synthetic */ C57159Mbz LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57155Mbv(FriendsEmptyPageRootVM friendsEmptyPageRootVM, C57159Mbz c57159Mbz, InterfaceC67352kd<? super C57155Mbv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = friendsEmptyPageRootVM;
        this.LJLILLLLZI = c57159Mbz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57155Mbv(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
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
