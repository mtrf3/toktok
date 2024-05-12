package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.share.ShareDialogOptSetting;

/* renamed from: X.Bnz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29875Bnz extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C29875Bnz LJLIL = new C29875Bnz();

    public C29875Bnz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Boolean bool = (Boolean) SettingsManager.INSTANCE.getValueSafely(ShareDialogOptSetting.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = ShareDialogOptSetting.DEFAULT;
        }
        return Boolean.valueOf(z);
    }
}
