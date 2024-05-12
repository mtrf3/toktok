package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.AwemeImManager$ensure$1", f = "AwemeImManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2sU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72222sU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C72222sU(InterfaceC67352kd<? super C72222sU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72222sU(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C85773Yf.LIZIZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C72222sU(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
