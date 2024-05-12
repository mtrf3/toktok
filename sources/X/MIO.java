package X;

import com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel$updateCollectStatusLocally$1", f = "QnaSuggestedTabViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MIO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ QnaSuggestedTabViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIO(QnaSuggestedTabViewModel qnaSuggestedTabViewModel, String str, int i, InterfaceC67352kd<? super MIO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = qnaSuggestedTabViewModel;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new MIO(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        T7O t7o = this.LJLIL.LJLJL;
        String questionId = this.LJLILLLLZI;
        int i = this.LJLJI;
        t7o.getClass();
        o.LJIIIZ(questionId, "questionId");
        t7o.LIZ.LJ(i, questionId);
        t7o.LJIIJJI(null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
