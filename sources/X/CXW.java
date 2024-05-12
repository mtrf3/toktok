package X;

import fjb.a;
import java.util.concurrent.CountDownLatch;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.utils.LiveLottieUtils$loadLottieAndUpdateImages$1$2", f = "LiveLottieUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CXW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C29701Eo LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ CountDownLatch LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CXW(boolean z, C29701Eo c29701Eo, String str, String str2, CountDownLatch countDownLatch, InterfaceC67352kd<? super CXW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = c29701Eo;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = countDownLatch;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new CXW(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL) {
            this.LJLILLLLZI.setRepeatCount(Integer.MAX_VALUE);
        }
        C15490jB.LJIIJJI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, false, new CXZ(this.LJLJJL));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
