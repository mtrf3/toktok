package X;

import Y.IDfS125S0100000;
import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {508}, m = "invokeSuspend")
/* renamed from: X.29T, reason: invalid class name */
/* loaded from: classes.dex */
public final class C29T extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC71762rk<Float> LJLILLLLZI;
    public final /* synthetic */ C45351qF LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29T(InterfaceC71762rk<Float> interfaceC71762rk, C45351qF c45351qF, InterfaceC67352kd<? super C29T> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC71762rk;
        this.LJLJI = c45351qF;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29T(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC71762rk<Float> interfaceC71762rk = this.LJLILLLLZI;
            IDfS125S0100000 iDfS125S0100000 = new IDfS125S0100000(this.LJLJI, 1);
            this.LJLIL = 1;
            if (interfaceC71762rk.collect(iDfS125S0100000, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        throw new C45784Hy0();
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
