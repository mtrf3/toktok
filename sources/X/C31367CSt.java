package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveDeleteUselessPreloadSetting;

/* renamed from: X.CSt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31367CSt extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C31367CSt LJLIL = new C31367CSt();

    public C31367CSt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveDeleteUselessPreloadSetting.class));
    }
}
