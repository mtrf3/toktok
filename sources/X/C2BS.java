package X;

import fjb.a;
import kotlin.jvm.internal.IDqS416S0100000;

@InterfaceC65848Psq(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", l = {432}, m = "invokeSuspend")
/* renamed from: X.2BS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C07160Pw<S> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2BS(C07160Pw<S> c07160Pw, InterfaceC67352kd<? super C2BS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c07160Pw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2BS(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        IDqS416S0100000 iDqS416S0100000;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i == 0 || i == 1) {
            C141335gf.LIZJ(obj);
            do {
                iDqS416S0100000 = new IDqS416S0100000(this.LJLILLLLZI, 137);
                this.LJLIL = 1;
            } while (C1JD.LJJJJI(iDqS416S0100000, this) != enumC58928NAu);
            return enumC58928NAu;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
