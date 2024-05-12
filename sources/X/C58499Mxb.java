package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBubbleDelayTimeSetting;

/* renamed from: X.Mxb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58499Mxb extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C58499Mxb LJLIL = new C58499Mxb();

    public C58499Mxb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SettingsManager.INSTANCE.getLongValue(LiveBubbleDelayTimeSetting.class));
    }
}
