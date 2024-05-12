package X;

import com.bytedance.android.live.wallet.IWalletService;

/* renamed from: X.Udp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77657Udp extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC31557Ca1> {
    public static final C77657Udp LJLIL = new C77657Udp();

    public C77657Udp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC31557Ca1 invoke() {
        return ((IWalletService) CN1.LIZ(IWalletService.class)).getPayManager();
    }
}
