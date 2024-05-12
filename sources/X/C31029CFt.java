package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.CollectPerformanceDelayTime;

/* renamed from: X.CFt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31029CFt extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C31029CFt LJLIL = new C31029CFt();

    public C31029CFt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SettingsManager.INSTANCE.getLongValue(CollectPerformanceDelayTime.class));
    }
}
