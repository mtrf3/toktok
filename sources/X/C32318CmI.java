package X;

import com.bytedance.android.live.wallet.IWalletService;

/* renamed from: X.CmI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32318CmI extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC32295Clv> {
    public static final C32318CmI LJLIL = new C32318CmI();

    public C32318CmI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC32295Clv invoke() {
        return ((IWalletService) CN1.LIZ(IWalletService.class)).getFirstRechargePayManager();
    }
}
