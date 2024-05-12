package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetDecorSetting;

/* renamed from: X.Bqx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30059Bqx extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30059Bqx LJLIL = new C30059Bqx();

    public C30059Bqx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveRecycleWidgetDecorSetting.class));
    }
}
