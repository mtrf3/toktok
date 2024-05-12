package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4$2$1", f = "SuspendingPointerInputFilter.kt", l = {292}, m = "invokeSuspend")
/* renamed from: X.2Gs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55742Gs extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C533427m LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C55742Gs(C533427m c533427m, InterfaceC88471Ynr<? super InterfaceC37501da, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super C55742Gs> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c533427m;
        this.LJLJJI = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C55742Gs c55742Gs = new C55742Gs(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c55742Gs.LJLILLLLZI = obj;
        return c55742Gs;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C533427m c533427m = this.LJLJI;
            c533427m.getClass();
            o.LJIIIZ(interfaceC70422pa, "<set-?>");
            c533427m.LJLJLLL = interfaceC70422pa;
            InterfaceC88471Ynr<InterfaceC37501da, InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88471Ynr = this.LJLJJI;
            C533427m c533427m2 = this.LJLJI;
            this.LJLIL = 1;
            if (interfaceC88471Ynr.invoke(c533427m2, this) == enumC58928NAu) {
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
