package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnableRecycleSetting;

/* renamed from: X.B7e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28258B7e extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C28258B7e LJLIL = new C28258B7e();

    public C28258B7e() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveEnableRecycleSetting.class));
    }
}
