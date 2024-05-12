package X;

import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel$requestScrollTo$1", f = "SearchGlobalViewModel.kt", l = {164}, m = "invokeSuspend")
/* renamed from: X.3Cc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80023Cc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SearchGlobalViewModel LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80023Cc(SearchGlobalViewModel searchGlobalViewModel, int i, int i2, InterfaceC67352kd<? super C80023Cc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = searchGlobalViewModel;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C80023Cc(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            XLL xll = this.LJLILLLLZI.LJLLJ;
            C80033Cd c80033Cd = new C80033Cd(this.LJLJI, this.LJLJJI);
            this.LJLIL = 1;
            if (xll.emit(c80033Cd, this) == enumC58928NAu) {
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
