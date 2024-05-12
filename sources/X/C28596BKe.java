package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawShowAnimationSetting;

/* renamed from: X.BKe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28596BKe extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final C28596BKe LJLIL = new C28596BKe();

    public C28596BKe() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveDrawShowAnimationSetting.class);
    }
}
