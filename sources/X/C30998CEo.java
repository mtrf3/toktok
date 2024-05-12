package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;
import com.bytedance.android.livesdk.livesetting.other.LivePitayaSettingsParams;

/* renamed from: X.CEo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30998CEo extends AbstractC65781Prl implements InterfaceC65784Pro<LivePitayaSettingsParams> {
    public static final C30998CEo LJLIL = new C30998CEo();

    public C30998CEo() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.other.LivePitayaSettingsParams] */
    @Override // X.InterfaceC65784Pro
    public final LivePitayaSettingsParams invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveClientAISettings.class);
        if (valueSafely == 0) {
            return LiveClientAISettings.INSTANCE.getDEFAULT();
        }
        return valueSafely;
    }
}
