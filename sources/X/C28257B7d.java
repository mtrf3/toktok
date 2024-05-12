package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.ImageLoadTimeThresholdSetting;

/* renamed from: X.B7d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28257B7d extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C28257B7d LJLIL = new C28257B7d();

    public C28257B7d() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SettingsManager.INSTANCE.getLongValue(ImageLoadTimeThresholdSetting.class));
    }
}
