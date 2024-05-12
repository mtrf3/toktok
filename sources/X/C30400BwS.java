package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;

/* renamed from: X.BwS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30400BwS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30400BwS LJLIL = new C30400BwS();

    public C30400BwS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveGoal2GreenScreenSetting.class));
    }
}
