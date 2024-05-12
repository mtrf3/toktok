package X;

import fjb.a;
import kotlin.jvm.internal.AqS175S0200000_13;

@InterfaceC65848Psq(c = "com.mellolabs.composestar.PaidContentReviewStarsKt$PaidContentReviewStars$2", f = "PaidContentReviewStars.kt", l = {63}, m = "invokeSuspend")
/* renamed from: X.V4y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79160V4y extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ V53 LJLJI;
    public final /* synthetic */ InterfaceC35811ar<Integer> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79160V4y(V53 v53, InterfaceC35811ar<Integer> interfaceC35811ar, InterfaceC67352kd<? super C79160V4y> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = v53;
        this.LJLJJI = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C79160V4y c79160V4y = new C79160V4y(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c79160V4y.LJLILLLLZI = obj;
        return c79160V4y;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
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
            AqS175S0200000_13 aqS175S0200000_13 = new AqS175S0200000_13(this.LJLJI, (V53) this.LJLJJI, (InterfaceC35811ar<Integer>) 11);
            this.LJLIL = 1;
            C49701xG c49701xG = C49701xG.LJLIL;
            Object LIZIZ = C0UR.LIZIZ(interfaceC37501da, new C2DD(null, C49721xI.LJLIL, C49711xH.LJLIL, c49701xG, aqS175S0200000_13), this);
            if (LIZIZ != obj2) {
                LIZIZ = C76800UCe.LIZ;
            }
            if (LIZIZ == obj2) {
                return obj2;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37501da interfaceC37501da, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37501da, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
