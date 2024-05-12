package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMockChatHighlightDelaySetting;

/* renamed from: X.CQa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31296CQa extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C31296CQa LJLIL = new C31296CQa();

    public C31296CQa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LivePublicScreenMockChatHighlightDelaySetting.class));
    }
}
