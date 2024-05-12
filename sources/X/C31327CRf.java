package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenOnMessageOptSetting;

/* renamed from: X.CRf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31327CRf extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31327CRf LJLIL = new C31327CRf();

    public C31327CRf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LivePublicScreenOnMessageOptSetting.class));
    }
}
