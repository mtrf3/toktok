package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkSyncAllowList;

/* renamed from: X.Mxr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58515Mxr extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58515Mxr LJLIL = new C58515Mxr();

    public C58515Mxr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveNetworkSyncAllowList.class));
    }
}
