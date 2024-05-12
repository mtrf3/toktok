package X;

import android.os.SystemClock;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.im.core.opt.SDKMessagePuller$manualPullMessage$1", f = "SDKMessagePuller.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4Z4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Z4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ java.util.Map<String, Object> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4Z4(boolean z, java.util.Map<String, ? extends Object> map, InterfaceC67352kd<? super C4Z4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = map;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4Z4(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (C4Z3.LIZ() && (SystemClock.uptimeMillis() - C4Z3.LIZIZ > 10000 || this.LJLIL)) {
            C4Z3.LIZIZ = SystemClock.uptimeMillis();
            C4Z3.LIZIZ(4, this.LJLILLLLZI);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
