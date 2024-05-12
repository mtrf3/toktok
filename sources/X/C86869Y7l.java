package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.PerformanceSample;
import com.bytedance.android.livesdk.livesetting.performance.PerformanceSampleSetting;

/* renamed from: X.Y7l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86869Y7l extends AbstractC65781Prl implements InterfaceC65784Pro<PerformanceSample> {
    public static final C86869Y7l LJLIL = new C86869Y7l();

    public C86869Y7l() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.model.PerformanceSample] */
    @Override // X.InterfaceC65784Pro
    public final PerformanceSample invoke() {
        return SettingsManager.INSTANCE.getValueSafely(PerformanceSampleSetting.class);
    }
}
