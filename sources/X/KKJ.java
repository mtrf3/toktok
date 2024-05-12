package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qnasearch.repo.QnaSearchRepository$delaySend$job$1", f = "QnaSearchRepository.kt", l = {82, 86}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KKJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ KKL LJLJI;
    public final /* synthetic */ C74100T6i<OSZ<List<KKM>, String>> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KKJ(boolean z, KKL kkl, C74100T6i<? extends OSZ<? extends List<KKM>, String>> c74100T6i, InterfaceC67352kd<? super KKJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = kkl;
        this.LJLJJI = c74100T6i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new KKJ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            if (this.LJLILLLLZI) {
                this.LJLIL = 1;
                if (C1JD.LIZJ(300L, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        KKK kkk = new KKK(this.LJLJI, this.LJLJJI, null);
        this.LJLIL = 2;
        if (XKX.LJI(abstractC78621UtN, kkk, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
