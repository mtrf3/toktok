package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSUseCameraCaptureVideoPtsInRtc;

/* loaded from: classes6.dex */
public final class CKY extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final CKY LJLIL = new CKY();

    public CKY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(TTLSUseCameraCaptureVideoPtsInRtc.class));
    }
}
