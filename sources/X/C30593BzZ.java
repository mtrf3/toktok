package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipApiOptSetting;
import com.bytedance.android.livesdk.livesetting.game.partnership.GamePartnershipRefactoringSwitch;

/* renamed from: X.BzZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30593BzZ extends AbstractC65781Prl implements InterfaceC65784Pro<GamePartnershipRefactoringSwitch> {
    public static final C30593BzZ LJLIL = new C30593BzZ();

    public C30593BzZ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.game.partnership.GamePartnershipRefactoringSwitch, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final GamePartnershipRefactoringSwitch invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(GameLivePartnershipApiOptSetting.class);
        if (valueSafely == 0) {
            return GameLivePartnershipApiOptSetting.DEFAULT;
        }
        return valueSafely;
    }
}
