package X;

import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.treasurebox.presenter.ActivityTreasureBoxPresenter$handleEvent$1", f = "ActivityTreasureBoxPresenter.kt", l = {129}, m = "invokeSuspend")
/* renamed from: X.BQr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28765BQr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C28765BQr(InterfaceC67352kd<? super C28765BQr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28765BQr(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        IWalletCenter walletCenter;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLIL = 1;
            if (C1JD.LIZJ(2000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        IWalletService iWalletService = (IWalletService) CN1.LIZ(IWalletService.class);
        if (iWalletService != null && (walletCenter = iWalletService.walletCenter()) != null) {
            ((WalletCenter) walletCenter).LJIIJ();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C28765BQr(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
