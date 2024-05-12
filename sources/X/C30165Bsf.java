package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBannerDegradePhoneTransparent;

/* renamed from: X.Bsf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30165Bsf extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30165Bsf LJLIL = new C30165Bsf();

    public C30165Bsf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveBannerDegradePhoneTransparent.class));
    }
}
