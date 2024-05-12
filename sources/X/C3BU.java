package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {34}, m = "invokeSuspend")
/* renamed from: X.3BU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C3BY<T, R> LJLILLLLZI;
    public final /* synthetic */ InterfaceC64672gJ<R> LJLJI;
    public final /* synthetic */ T LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3BU(C3BY<T, R> c3by, InterfaceC64672gJ<? super R> interfaceC64672gJ, T t, InterfaceC67352kd<? super C3BU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c3by;
        this.LJLJI = interfaceC64672gJ;
        this.LJLJJI = t;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3BU(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC88473Ynt<InterfaceC64672gJ<? super R>, T, InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88473Ynt = this.LJLILLLLZI.LJLILLLLZI;
            Object obj3 = this.LJLJI;
            T t = this.LJLJJI;
            this.LJLIL = 1;
            if (interfaceC88473Ynt.invoke(obj3, t, this) == obj2) {
                return obj2;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
