package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCoHostMatchCapsuleGovernanceSetting;

/* renamed from: X.BjC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29578BjC extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C29578BjC LJLIL = new C29578BjC();

    public C29578BjC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveCoHostMatchCapsuleGovernanceSetting.class));
    }
}
