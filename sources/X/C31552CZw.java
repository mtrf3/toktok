package X;

import com.bytedance.android.live.wallet.IWalletService;

/* renamed from: X.CZw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31552CZw extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC31557Ca1> {
    public static final C31552CZw LJLIL = new C31552CZw();

    public C31552CZw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC31557Ca1 invoke() {
        return ((IWalletService) CN1.LIZ(IWalletService.class)).getPayManager();
    }
}
