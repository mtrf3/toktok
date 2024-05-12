package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM$clickUserRelationButton$1", f = "TopVideoHolderVM.kt", l = {304}, m = "invokeSuspend")
/* renamed from: X.2lH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67752lH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TopVideoHolderVM LJLILLLLZI;
    public final /* synthetic */ User LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67752lH(User user, TopVideoHolderVM topVideoHolderVM, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = topVideoHolderVM;
        this.LJLJI = user;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67752lH(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
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
            TopVideoHolderVM topVideoHolderVM = this.LJLILLLLZI;
            User user = this.LJLJI;
            this.LJLIL = 1;
            topVideoHolderVM.getClass();
            if (T2R.LJJIFFI(new C67742lG(user, topVideoHolderVM, null), this) == enumC58928NAu) {
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
