package X;

import com.bytedance.android.live.wallet.IWalletService;

/* renamed from: X.Udo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77656Udo extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC77674Ue6> {
    public static final C77656Udo LJLIL = new C77656Udo();

    public C77656Udo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC77674Ue6 invoke() {
        return ((IWalletService) CN1.LIZ(IWalletService.class)).getPayManagerV2();
    }
}
