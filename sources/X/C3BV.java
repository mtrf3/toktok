package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {101}, m = "invokeSuspend")
/* renamed from: X.3BV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C3BY<T, R> LJLJI;
    public final /* synthetic */ InterfaceC64672gJ<R> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3BV(C3BY<T, R> c3by, InterfaceC64672gJ<? super R> interfaceC64672gJ, InterfaceC67352kd<? super C3BV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c3by;
        this.LJLJJI = interfaceC64672gJ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3BV c3bv = new C3BV(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c3bv.LJLILLLLZI = obj;
        return c3bv;
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
            C68322mC c68322mC = new C68322mC();
            C3BY<T, R> c3by = this.LJLJI;
            InterfaceC65462ha<S> interfaceC65462ha = c3by.LJLIL;
            C3BW c3bw = new C3BW(c68322mC, interfaceC70422pa, c3by, this.LJLJJI);
            this.LJLIL = 1;
            if (interfaceC65462ha.collect(c3bw, this) == enumC58928NAu) {
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
