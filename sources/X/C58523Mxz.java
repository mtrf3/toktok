package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkSyncBlockList;

/* renamed from: X.Mxz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58523Mxz extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final C58523Mxz LJLIL = new C58523Mxz();

    public C58523Mxz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveNetworkSyncBlockList.class);
    }
}
