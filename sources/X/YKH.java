package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.workaround.Options;
import com.bytedance.android.livesdk.workaround.SurfaceViewAndroid10Workaround;

/* loaded from: classes16.dex */
public final class YKH extends AbstractC65781Prl implements InterfaceC65784Pro<Options> {
    public static final YKH LJLIL = new YKH();

    public YKH() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.workaround.Options] */
    @Override // X.InterfaceC65784Pro
    public final Options invoke() {
        return SettingsManager.INSTANCE.getValueSafely(SurfaceViewAndroid10Workaround.class);
    }
}
