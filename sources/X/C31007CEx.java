package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveSdkPublicScreenMessageScheduleStrategySetting;

/* renamed from: X.CEx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31007CEx extends AbstractC65781Prl implements InterfaceC65784Pro<LiveSdkPublicScreenMessageScheduleStrategySetting.LivePublicScreenAsyncConfig> {
    public static final C31007CEx LJLIL = new C31007CEx();

    public C31007CEx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LiveSdkPublicScreenMessageScheduleStrategySetting.LivePublicScreenAsyncConfig invoke() {
        return LiveSdkPublicScreenMessageScheduleStrategySetting.INSTANCE.getValue();
    }
}
