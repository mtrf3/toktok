package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelCacheOptSettings;

/* renamed from: X.Cin, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32101Cin implements InterfaceC20980s2 {
    public final /* synthetic */ C32275Clb LIZ;

    public C32101Cin(C32275Clb c32275Clb) {
        this.LIZ = c32275Clb;
    }

    @Override // X.InterfaceC20980s2
    public final void LIZ(boolean z) {
        if (LiveGiftPanelCacheOptSettings.INSTANCE.forcePredictSuccess()) {
            this.LIZ.LIZ(true);
        } else {
            this.LIZ.LIZ(z);
        }
    }

    @Override // X.InterfaceC20980s2
    public final void onError(int i) {
        C012403c.LJ("error happen when predict, errorCode == ", i, "GiftPanelCacheUsageOptPresenter");
    }
}
