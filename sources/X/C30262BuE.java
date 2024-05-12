package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting;

/* renamed from: X.BuE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30262BuE extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30262BuE LJLIL = new C30262BuE();

    public C30262BuE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveLayoutPreloadSetting.class));
    }
}
