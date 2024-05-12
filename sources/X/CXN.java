package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.roomfunction.TextPieceHelperBugfixSetting;

/* loaded from: classes6.dex */
public final class CXN extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final CXN LJLIL = new CXN();

    public CXN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(TextPieceHelperBugfixSetting.class));
    }
}
