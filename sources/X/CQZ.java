package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenInteractionMessageAvatarSetting;

/* loaded from: classes6.dex */
public final class CQZ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final CQZ LJLIL = new CQZ();

    public CQZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LivePublicScreenInteractionMessageAvatarSetting.class));
    }
}
