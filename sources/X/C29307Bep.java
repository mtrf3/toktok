package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMaskLayerCheckSetting;

/* renamed from: X.Bep, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29307Bep extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C29307Bep LJLIL = new C29307Bep();

    public C29307Bep() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveMaskLayerCheckSetting.class));
    }
}
