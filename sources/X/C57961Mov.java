package X;

import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel$init$1", f = "UserCardListViewModel.kt", l = {197, 198, 435}, m = "invokeSuspend")
/* renamed from: X.Mov, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57961Mov extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ UserCardListViewModel LJLILLLLZI;
    public final /* synthetic */ AbstractC57774Mlu<RecUser> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57961Mov(UserCardListViewModel userCardListViewModel, AbstractC57774Mlu<RecUser> abstractC57774Mlu, InterfaceC67352kd<? super C57961Mov> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = userCardListViewModel;
        this.LJLJI = abstractC57774Mlu;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57961Mov(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0154 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57961Mov.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
