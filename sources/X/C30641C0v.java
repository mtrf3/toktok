package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCustomPollMigrateShortTouchSetting;

/* renamed from: X.C0v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30641C0v extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C30641C0v LJLIL = new C30641C0v();

    public C30641C0v() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveCustomPollMigrateShortTouchSetting.class));
    }
}
