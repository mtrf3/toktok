package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerRequestSettings;

/* renamed from: X.Cjg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32156Cjg extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C32156Cjg LJLIL = new C32156Cjg();

    public C32156Cjg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveClientTriggerRequestSettings.class));
    }
}
