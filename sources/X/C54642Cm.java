package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.ContentInViewModifier$onSizeChanged$1$job$1", f = "ContentInViewModifier.kt", l = {178}, m = "invokeSuspend")
/* renamed from: X.2Cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54642Cm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C49561x2 LJLILLLLZI;
    public final /* synthetic */ C10390ax LJLJI;
    public final /* synthetic */ C10390ax LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54642Cm(C49561x2 c49561x2, C10390ax c10390ax, C10390ax c10390ax2, InterfaceC67352kd<? super C54642Cm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c49561x2;
        this.LJLJI = c10390ax;
        this.LJLJJI = c10390ax2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54642Cm(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C49561x2 c49561x2 = this.LJLILLLLZI;
            C10390ax c10390ax = this.LJLJI;
            C10390ax c10390ax2 = this.LJLJJI;
            this.LJLIL = 1;
            if (c49561x2.LIZLLL(c10390ax, c10390ax2, this) == enumC58928NAu) {
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
