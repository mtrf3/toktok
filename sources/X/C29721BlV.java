package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleUserInfoWidgetSetting;

/* renamed from: X.BlV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29721BlV extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C29721BlV LJLIL = new C29721BlV();

    public C29721BlV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveRecycleUserInfoWidgetSetting.class));
    }
}
