package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.applaunch.IMGlobalPullFinishedLegoTask$run$1", f = "IMGlobalPullFinishedLegoTask.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80943Fq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C80943Fq(InterfaceC67352kd<? super C80943Fq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C80943Fq(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C80953Fr.LIZJ.LIZ("reportTxtMsgCount");
        XKX.LIZLLL(C80953Fr.LIZ, null, null, new C80933Fp(null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C80943Fq(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
