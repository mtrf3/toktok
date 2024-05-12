package X;

import fjb.a;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.composable.PaidContentReviewListKt$PaidContentReviewItem$2$1", f = "PaidContentReviewList.kt", l = {315}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class V5S extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ A4Y LJLJI;
    public final /* synthetic */ V7H LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5S(A4Y a4y, V7H v7h, InterfaceC67352kd<? super V5S> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = a4y;
        this.LJLJJI = v7h;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        V5S v5s = new V5S(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        v5s.LJLILLLLZI = obj;
        return v5s;
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
            InterfaceC37501da interfaceC37501da = (InterfaceC37501da) this.LJLILLLLZI;
            AqS144S0200000_13 aqS144S0200000_13 = new AqS144S0200000_13(this.LJLJI, this.LJLJJI, 22);
            AqS179S0100000_13 aqS179S0100000_13 = new AqS179S0100000_13(this.LJLJJI, 376);
            this.LJLIL = 1;
            if (C0UM.LIZJ(interfaceC37501da, aqS144S0200000_13, aqS179S0100000_13, this, 5) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37501da interfaceC37501da, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37501da, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
