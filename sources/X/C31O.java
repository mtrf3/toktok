package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.utils.StrangerBoxUtil$refreshStrangerBox$1", f = "StrangerBoxUtil.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.31O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C31O extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C31O(InterfaceC67352kd<? super C31O> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C31O(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C82233Kp.LIZ().LIZIZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C31O(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
