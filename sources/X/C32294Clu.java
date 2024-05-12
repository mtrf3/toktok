package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftListOptSetting;

/* renamed from: X.Clu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32294Clu extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C32294Clu LJLIL = new C32294Clu();

    public C32294Clu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveGiftListOptSetting.class));
    }
}
