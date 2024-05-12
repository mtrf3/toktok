package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.CWt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31471CWt extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C31471CWt LJLIL = new C31471CWt();

    public C31471CWt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return SettingsManager.INSTANCE.getStringValue(LiveGiftNewGifterBadgeSetting.class);
    }
}
