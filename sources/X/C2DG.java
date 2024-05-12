package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", l = {493}, m = "invokeSuspend")
/* renamed from: X.2DG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DG extends AbstractC65782Prm implements InterfaceC88471Ynr<C0UY, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C1N6 LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<C0UZ, InterfaceC67352kd<? super C76800UCe>, Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2DG(C1N6 c1n6, InterfaceC88471Ynr<? super C0UZ, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super C2DG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c1n6;
        this.LJLJJI = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2DG c2dg = new C2DG(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c2dg.LJLILLLLZI = obj;
        return c2dg;
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
            C0UY c0uy = (C0UY) this.LJLILLLLZI;
            C1N6 c1n6 = this.LJLJI;
            c1n6.getClass();
            o.LJIIIZ(c0uy, "<set-?>");
            c1n6.LIZIZ = c0uy;
            InterfaceC88471Ynr<C0UZ, InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88471Ynr = this.LJLJJI;
            C1N6 c1n62 = this.LJLJI;
            this.LJLIL = 1;
            if (interfaceC88471Ynr.invoke(c1n62, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C0UY c0uy, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c0uy, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
