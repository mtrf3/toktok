package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveGCThreadOptSetting;

/* renamed from: X.BPm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28734BPm extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C28734BPm LJLIL = new C28734BPm();

    public C28734BPm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveGCThreadOptSetting.class));
    }
}
