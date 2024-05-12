package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.sending.PreRequestSendGiftInterceptor$doCheck$2", f = "PreRequestSendGiftInterceptor.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.CuI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32814CuI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Object>, Object> {
    public final /* synthetic */ C32797Cu1 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32814CuI(C32797Cu1 c32797Cu1, InterfaceC67352kd<? super C32814CuI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c32797Cu1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32814CuI(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.LJFF() != null) {
            if (C2NU.LIZ.LIZIZ()) {
                return C76800UCe.LIZ;
            }
            return new C35928E8e(C88565YpN.LIZ, true);
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Object> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
