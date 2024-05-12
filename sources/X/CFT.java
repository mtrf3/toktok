package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.rank.api.LiveRankLynxConfig;

/* loaded from: classes6.dex */
public final class CFT extends AbstractC65781Prl implements InterfaceC65784Pro<LiveRankLynxConfig.Config> {
    public static final CFT LJLIL = new CFT();

    public CFT() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.rank.api.LiveRankLynxConfig$Config, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveRankLynxConfig.Config invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveRankLynxConfig.class);
        if (valueSafely == 0) {
            return LiveRankLynxConfig.DEFAULT;
        }
        return valueSafely;
    }
}
