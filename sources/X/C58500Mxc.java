package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveColdDataDelaySetting;

/* renamed from: X.Mxc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58500Mxc extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C58500Mxc LJLIL = new C58500Mxc();

    public C58500Mxc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SettingsManager.INSTANCE.getLongValue(LiveColdDataDelaySetting.class));
    }
}
