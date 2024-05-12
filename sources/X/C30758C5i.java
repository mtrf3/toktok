package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveALogAndMonitorDegradeAllowListSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveALogAndMonitorDegradeModel;

/* renamed from: X.C5i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30758C5i extends AbstractC65781Prl implements InterfaceC65784Pro<LiveALogAndMonitorDegradeModel> {
    public static final C30758C5i LJLIL = new C30758C5i();

    public C30758C5i() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.performance.LiveALogAndMonitorDegradeModel, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveALogAndMonitorDegradeModel invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveALogAndMonitorDegradeAllowListSetting.class);
        if (valueSafely == 0) {
            return LiveALogAndMonitorDegradeAllowListSetting.INSTANCE.getDEFAULT();
        }
        return valueSafely;
    }
}
