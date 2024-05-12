package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubCreateToolsEntranceNewSetting;

/* loaded from: classes6.dex */
public final class C7A extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C7A LJLIL = new C7A();

    public C7A() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveSubCreateToolsEntranceNewSetting.class));
    }
}
