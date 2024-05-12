package X;

import com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM$manualListLoadMore$1", f = "RecUserVideoListSharedVM.kt", l = {249}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MGS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ RecUserVideoListSharedVM LJLILLLLZI;
    public final /* synthetic */ C57720Ml2 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MGS(RecUserVideoListSharedVM recUserVideoListSharedVM, C57720Ml2 c57720Ml2, InterfaceC67352kd<? super MGS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = recUserVideoListSharedVM;
        this.LJLJI = c57720Ml2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new MGS(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            RecUserVideoListSharedVM recUserVideoListSharedVM = this.LJLILLLLZI;
            C57720Ml2 c57720Ml2 = this.LJLJI;
            this.LJLIL = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            AbstractC72278SYg<C57720Ml2> config = recUserVideoListSharedVM.getConfig();
            if (c57720Ml2 == null) {
                c57720Ml2 = recUserVideoListSharedVM.LJLJJI;
            }
            config.onLoadMore(xks, c57720Ml2);
            if (xks.LJIIJJI() == enumC58928NAu) {
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
