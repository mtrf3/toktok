package X;

import com.bytedance.android.live.wallet.IWalletService;

/* renamed from: X.Udm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77654Udm extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC31557Ca1> {
    public static final C77654Udm LJLIL = new C77654Udm();

    public C77654Udm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC31557Ca1 invoke() {
        return ((IWalletService) CN1.LIZ(IWalletService.class)).getPayManager();
    }
}
