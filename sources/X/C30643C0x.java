package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.roomfunction.PollShortTouchUrl;

/* renamed from: X.C0x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30643C0x extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C30643C0x LJLIL = new C30643C0x();

    public C30643C0x() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return SettingsManager.INSTANCE.getStringValue(PollShortTouchUrl.class);
    }
}
