package X;

import fjb.a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$notifyRedEnvelopeInfos$3$4", f = "RedEnvelopeWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BSS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ CountDownLatch LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BSS(CountDownLatch countDownLatch, InterfaceC67352kd<? super BSS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = countDownLatch;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new BSS(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return Boolean.valueOf(this.LJLIL.await(3000L, TimeUnit.MILLISECONDS));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
