package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkVoiceChatAudienceContainerSwitchSetting;

/* renamed from: X.Mxe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58502Mxe extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58502Mxe LJLIL = new C58502Mxe();

    public C58502Mxe() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LivesdkVoiceChatAudienceContainerSwitchSetting.class));
    }
}
