package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.LiveOptShareGetThumbSetting;

/* renamed from: X.Brl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30109Brl extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30109Brl LJLIL = new C30109Brl();

    public C30109Brl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveOptShareGetThumbSetting.class));
    }
}
