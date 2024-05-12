package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$4", f = "ProduceState.kt", l = {188}, m = "invokeSuspend")
/* renamed from: X.2GR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2GR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC44011o5<Object>, InterfaceC67352kd<? super C76800UCe>, Object> LJLJI;
    public final /* synthetic */ InterfaceC35811ar<Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2GR(InterfaceC88471Ynr<? super InterfaceC44011o5<Object>, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC35811ar<Object> interfaceC35811ar, InterfaceC67352kd<? super C2GR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC88471Ynr;
        this.LJLJJI = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2GR c2gr = new C2GR(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c2gr.LJLILLLLZI = obj;
        return c2gr;
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
            InterfaceC88471Ynr<InterfaceC44011o5<Object>, InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88471Ynr = this.LJLJI;
            C530826m c530826m = new C530826m(this.LJLJJI, interfaceC70422pa.getCoroutineContext());
            this.LJLIL = 1;
            if (interfaceC88471Ynr.invoke(c530826m, this) == enumC58928NAu) {
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
