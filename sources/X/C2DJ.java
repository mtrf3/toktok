package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", f = "Scrollable.kt", l = {289}, m = "invokeSuspend")
/* renamed from: X.2DJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C0UV LJLJI;
    public final /* synthetic */ InterfaceC24760y8<C0UL> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2DJ(C0UV c0uv, InterfaceC24760y8<C0UL> interfaceC24760y8, InterfaceC67352kd<? super C2DJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c0uv;
        this.LJLJJI = interfaceC24760y8;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2DJ c2dj = new C2DJ(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c2dj.LJLILLLLZI = obj;
        return c2dj;
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
            C2DI c2di = new C2DI(this.LJLJI, this.LJLJJI, null);
            this.LJLIL = 1;
            if (interfaceC37501da.LJIJJLI(c2di, this) == enumC58928NAu) {
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
