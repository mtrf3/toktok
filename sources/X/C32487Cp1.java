package X;

import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.widgets.giftwidget.presenter.FEGiftSendPresenter$preloadBanner$1", f = "FEGiftSendPresenter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Cp1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32487Cp1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C32496CpA LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32487Cp1(C32496CpA c32496CpA, InterfaceC67352kd<? super C32487Cp1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c32496CpA;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32487Cp1(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C32496CpA c32496CpA = this.LJLIL;
        if (c32496CpA.LIZ && c32496CpA.LIZIZ != null && !((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).mI(c32496CpA.LIZIZ)) {
            ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).EM(this.LJLIL.LIZIZ, new C32495Cp9());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
