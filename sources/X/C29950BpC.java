package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveStreamGoalCapsuleGovernanceSetting;

/* renamed from: X.BpC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29950BpC extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C29950BpC LJLIL = new C29950BpC();

    public C29950BpC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveStreamGoalCapsuleGovernanceSetting.class));
    }
}
