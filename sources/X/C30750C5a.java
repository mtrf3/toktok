package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveDnsOptimizeConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.player.PreLiveDnsOptimizeSetting;

/* renamed from: X.C5a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30750C5a extends AbstractC65781Prl implements InterfaceC65784Pro<LiveDnsOptimizeConfig> {
    public static final C30750C5a LJLIL = new C30750C5a();

    public C30750C5a() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.watchlive.player.LiveDnsOptimizeConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveDnsOptimizeConfig invoke() {
        return SettingsManager.INSTANCE.getValueSafely(PreLiveDnsOptimizeSetting.class);
    }
}
