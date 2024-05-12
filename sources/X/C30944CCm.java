package X;

import android.content.Context;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.bytedance.android.livesdk.livesetting.subscription.SubWaveLynxUrlSetting;

/* renamed from: X.CCm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30944CCm implements CEM {
    public final /* synthetic */ SubscriptionSettingFragmentNew LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.CEM
    public final void LIZ() {
        InterfaceC30442Bx8.LJLIL.LIZJ(Boolean.TRUE);
        Context context = this.LIZ.getContext();
        String waveIntroPopup = SubWaveLynxUrlSetting.INSTANCE.getWaveIntroPopup();
        String str = this.LIZ.LJLIL;
        C31847Ceh.LJFF(context, waveIntroPopup, str, str, str, null, null, null, true, E2C.LIZJ("enable_wave_status", String.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(this.LIZIZ)) ? 1 : 0)), "popup", null, 2272);
    }

    public C30944CCm(SubscriptionSettingFragmentNew subscriptionSettingFragmentNew, boolean z) {
        this.LIZ = subscriptionSettingFragmentNew;
        this.LIZIZ = z;
    }
}
