package X;

@InterfaceC65848Psq(c = "com.bytedance.ies.im.core.sdk.SDKManager$loginSDK$3", f = "SDKManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3PS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C3PS(InterfaceC67352kd<? super C3PS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3PS(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C63308Osy.LJI().LJII();
        C4ZL.LIZIZ();
        C82873Nb.LJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C3PS(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
