package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", l = {419}, m = "invokeSuspend")
/* renamed from: X.2Co, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54662Co extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C31831Mt LJLILLLLZI;
    public final /* synthetic */ C0SF LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<C0UZ, InterfaceC67352kd<? super C76800UCe>, Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C54662Co(C31831Mt c31831Mt, C0SF c0sf, InterfaceC88471Ynr<? super C0UZ, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super C54662Co> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c31831Mt;
        this.LJLJI = c0sf;
        this.LJLJJI = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54662Co(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C31831Mt c31831Mt = this.LJLILLLLZI;
            C0SJ c0sj = c31831Mt.LIZJ;
            C31851Mv c31851Mv = c31831Mt.LIZIZ;
            C0SF c0sf = this.LJLJI;
            InterfaceC88471Ynr<C0UZ, InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88471Ynr = this.LJLJJI;
            this.LJLIL = 1;
            c0sj.getClass();
            if (C48841JEv.LJI(new C2CI(c0sf, c0sj, interfaceC88471Ynr, c31851Mv, null), this) == enumC58928NAu) {
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
