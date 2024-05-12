package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.CommonThreadPoolParamsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.ThreadPoolConfig;

/* loaded from: classes16.dex */
public final class YKP extends AbstractC65781Prl implements InterfaceC65784Pro<ThreadPoolConfig> {
    public static final YKP LJLIL = new YKP();

    public YKP() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.broadcast.ThreadPoolConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ThreadPoolConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(CommonThreadPoolParamsSetting.class);
        if (valueSafely == 0) {
            return CommonThreadPoolParamsSetting.DEFAULT;
        }
        return valueSafely;
    }
}
