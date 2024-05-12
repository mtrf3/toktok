package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSEIDelayTimeCorrectSetting;

/* renamed from: X.C4d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30727C4d extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C30727C4d LJLIL = new C30727C4d();

    public C30727C4d() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SettingsManager.INSTANCE.getLongValue(LiveSEIDelayTimeCorrectSetting.class));
    }
}
