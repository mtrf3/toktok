package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsShowCountSetting;

/* renamed from: X.BzC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30570BzC extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C30570BzC LJLIL = new C30570BzC();

    public C30570BzC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Math.max(SettingsManager.INSTANCE.getIntValue(GameLivePartnershipDropsShowCountSetting.class), GameLivePartnershipDropsShowCountSetting.DEFAULT));
    }
}
