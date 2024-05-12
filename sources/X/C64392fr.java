package X;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2fr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64392fr extends AbstractC65782Prm implements InterfaceC88471Ynr<Throwable, InterfaceC67352kd<? super Boolean>, Object> {
    public C64392fr(InterfaceC67352kd<? super C64392fr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64392fr(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return Boolean.TRUE;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Throwable th, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return new C64392fr(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
