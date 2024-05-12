package X;

import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.comp.impl.game.GameDropsShortCardAgent$loadGameDropsShortCardWithLottie$2$4", f = "GameDropsShortCardAgent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class C3E extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC30642C0w LJLIL;
    public final /* synthetic */ C30451BxH LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3E(InterfaceC30642C0w interfaceC30642C0w, C30451BxH c30451BxH, InterfaceC67352kd<? super C3E> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC30642C0w;
        this.LJLILLLLZI = c30451BxH;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3E(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3J c3j;
        C141335gf.LIZJ(obj);
        C0NB.LIZIZ("GameDropsShortCardAgent", "lottie success, add item");
        IShortTouchService iShortTouchService = (IShortTouchService) CN1.LIZ(IShortTouchService.class);
        InterfaceC30642C0w interfaceC30642C0w = this.LJLIL;
        C30451BxH c30451BxH = this.LJLILLLLZI;
        C29701Eo c29701Eo = c30451BxH.LIZIZ;
        if (c29701Eo != null) {
            c30451BxH.getClass();
            c3j = new C3J(c29701Eo);
        } else {
            c3j = null;
        }
        iShortTouchService.B10(interfaceC30642C0w, c3j);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
