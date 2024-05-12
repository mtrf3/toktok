package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNetworkRequestSync;

/* renamed from: X.Mxs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58516Mxs extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58516Mxs LJLIL = new C58516Mxs();

    public C58516Mxs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveNetworkRequestSync.class));
    }
}
