package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.rank.RankEntranceLoopInterval;

/* renamed from: X.CEr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31001CEr extends AbstractC65781Prl implements InterfaceC65784Pro<RankEntranceLoopInterval.Config> {
    public static final C31001CEr LJLIL = new C31001CEr();

    public C31001CEr() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.rank.RankEntranceLoopInterval$Config, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final RankEntranceLoopInterval.Config invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(RankEntranceLoopInterval.class);
        if (valueSafely == 0) {
            return RankEntranceLoopInterval.DEFAULT;
        }
        return valueSafely;
    }
}
