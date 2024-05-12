package X;

import com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragment$observe$4$1$1$1", f = "PostModeCommentListFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7Bz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C181917Bz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PostModeCommentListFragment LJLIL;
    public final /* synthetic */ C1808077s LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C181917Bz(PostModeCommentListFragment postModeCommentListFragment, C1808077s c1808077s, InterfaceC67352kd<? super C181917Bz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = postModeCommentListFragment;
        this.LJLILLLLZI = c1808077s;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C181917Bz(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LLIIZ.LLIIIILZ(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
