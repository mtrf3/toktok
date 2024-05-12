package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenRequestLayoutInvalidFixedSettings;

/* renamed from: X.Mxp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58513Mxp extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58513Mxp LJLIL = new C58513Mxp();

    public C58513Mxp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LivePublicScreenRequestLayoutInvalidFixedSettings.class));
    }
}
