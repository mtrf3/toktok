package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {235}, m = "invokeSuspend")
/* renamed from: X.3CA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CA extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC64672gJ<Object> LJLILLLLZI;
    public final /* synthetic */ C68322mC<Object> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3CA(InterfaceC67352kd interfaceC67352kd, C68322mC c68322mC, InterfaceC64672gJ interfaceC64672gJ) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC64672gJ;
        this.LJLJI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3CA(interfaceC67352kd, this.LJLJI, this.LJLILLLLZI);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            InterfaceC64672gJ<Object> interfaceC64672gJ = this.LJLILLLLZI;
            C3BS c3bs = C94103mg.LIZ;
            Object obj2 = this.LJLJI.element;
            if (obj2 == c3bs) {
                obj2 = null;
            }
            this.LJLIL = 1;
            if (interfaceC64672gJ.emit(obj2, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJI.element = null;
        return C76800UCe.LIZ;
    }
}
