package X;

import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM$refreshTabHorizontalData$1", f = "SearchSeparateTabHorizontalVM.kt", l = {158}, m = "invokeSuspend")
/* renamed from: X.Joy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50320Joy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SearchSeparateTabHorizontalVM LJLILLLLZI;
    public final /* synthetic */ C50062Jko LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50320Joy(SearchSeparateTabHorizontalVM searchSeparateTabHorizontalVM, C50062Jko c50062Jko, InterfaceC67352kd<? super C50320Joy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = searchSeparateTabHorizontalVM;
        this.LJLJI = c50062Jko;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C50320Joy(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            SearchSeparateTabHorizontalVM searchSeparateTabHorizontalVM = this.LJLILLLLZI;
            C50062Jko c50062Jko = this.LJLJI;
            this.LJLIL = 1;
            if (searchSeparateTabHorizontalVM.nv0(c50062Jko, this) == enumC58928NAu) {
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