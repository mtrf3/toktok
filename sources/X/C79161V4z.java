package X;

import fjb.a;
import kotlin.jvm.internal.AqS144S0200000_13;

@InterfaceC65848Psq(c = "com.mellolabs.composestar.PaidContentReviewStarsKt$PaidContentReviewStars$1", f = "PaidContentReviewStars.kt", l = {58}, m = "invokeSuspend")
/* renamed from: X.V4z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79161V4z extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ V53 LJLJI;
    public final /* synthetic */ InterfaceC35811ar<Integer> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79161V4z(V53 v53, InterfaceC35811ar<Integer> interfaceC35811ar, InterfaceC67352kd<? super C79161V4z> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = v53;
        this.LJLJJI = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C79161V4z c79161V4z = new C79161V4z(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c79161V4z.LJLILLLLZI = obj;
        return c79161V4z;
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
            AqS144S0200000_13 aqS144S0200000_13 = new AqS144S0200000_13(this.LJLJI, (V53) this.LJLJJI, (InterfaceC35811ar<Integer>) 71);
            this.LJLIL = 1;
            if (C0UM.LIZJ(interfaceC37501da, null, aqS144S0200000_13, this, 7) == enumC58928NAu) {
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
