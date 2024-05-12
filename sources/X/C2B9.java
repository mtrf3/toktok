package X;

import Y.IDfS125S0100000;
import fjb.a;
import kotlin.jvm.internal.IDqS420S0100000;

@InterfaceC65848Psq(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", f = "AnimatedVisibility.kt", l = {862}, m = "invokeSuspend")
/* renamed from: X.2B9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2B9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C07160Pw<EnumC06630Nv> LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2B9(C07160Pw<EnumC06630Nv> c07160Pw, InterfaceC35811ar<Boolean> interfaceC35811ar, InterfaceC67352kd<? super C2B9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c07160Pw;
        this.LJLJI = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2B9(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C3C3 LJJJJZI = C78966Uyw.LJJJJZI(new IDqS420S0100000(this.LJLILLLLZI, (C07160Pw<EnumC06630Nv>) 64));
            IDfS125S0100000 iDfS125S0100000 = new IDfS125S0100000(this.LJLJI, 11);
            this.LJLIL = 1;
            if (LJJJJZI.collect(iDfS125S0100000, this) == enumC58928NAu) {
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
