package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LivePreviewMPDEntranceSetting;

/* renamed from: X.My0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58524My0 extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final C58524My0 LJLIL = new C58524My0();

    public C58524My0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        return SettingsManager.INSTANCE.getStringArrayValue(LivePreviewMPDEntranceSetting.class);
    }
}
