package X;

import android.os.SystemClock;

@InterfaceC65848Psq(c = "com.bytedance.ies.im.core.opt.SDKMessagePuller$netPullMessage$1", f = "SDKMessagePuller.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4Z5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Z5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C4Z5(InterfaceC67352kd<? super C4Z5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4Z5(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (C4Z3.LIZ() && SystemClock.uptimeMillis() - C4Z3.LIZIZ > 5000) {
            C4Z3.LIZIZ = SystemClock.uptimeMillis();
            C4Z3.LIZIZ(3, null);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C4Z5(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
