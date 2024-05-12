package X;

import Y.IDeS362S0100000_10;
import Y.IDfS131S0100000_10;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.media.impl.view.recommendv2.RecommendMusicItemViewHolderV2$bindUiState$1$2", f = "RecommendMusicItemViewHolderV2.kt", l = {126}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NEB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC65462ha<NFK> LJLILLLLZI;
    public final /* synthetic */ C58879N8x LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NEB(InterfaceC65462ha<NFK> interfaceC65462ha, C58879N8x c58879N8x, InterfaceC67352kd<? super NEB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC65462ha;
        this.LJLJI = c58879N8x;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new NEB(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            InterfaceC65462ha LJIIJJI = V1M.LJIIJJI(new IDeS362S0100000_10(this.LJLILLLLZI, 5));
            IDfS131S0100000_10 iDfS131S0100000_10 = new IDfS131S0100000_10(this.LJLJI, 14);
            this.LJLIL = 1;
            if (LJIIJJI.collect(iDfS131S0100000_10, this) == enumC58928NAu) {
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
