package X;

import fjb.a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.utils.LiveLottieUtils$loadLottieAndUpdateImages$1$3", f = "LiveLottieUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CXU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C3C5<? extends Boolean>>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ CountDownLatch LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CXU(CountDownLatch countDownLatch, InterfaceC67352kd<? super CXU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = countDownLatch;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        CXU cxu = new CXU(this.LJLILLLLZI, interfaceC67352kd);
        cxu.LJLIL = obj;
        return cxu;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        C141335gf.LIZJ(obj);
        try {
            LIZ = Boolean.valueOf(this.LJLILLLLZI.await(3000L, TimeUnit.MILLISECONDS));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        return C3C5.m6boximpl(LIZ);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C3C5<? extends Boolean>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
