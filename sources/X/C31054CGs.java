package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.rank.AutoRefreshRankInterval;
import com.bytedance.android.livesdk.livesetting.rank.AutoRefreshRankListSetting;

/* renamed from: X.CGs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31054CGs extends AbstractC65781Prl implements InterfaceC65784Pro<AutoRefreshRankInterval> {
    public static final C31054CGs LJLIL = new C31054CGs();

    public C31054CGs() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.rank.AutoRefreshRankInterval, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final AutoRefreshRankInterval invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(AutoRefreshRankListSetting.class);
        if (valueSafely == 0) {
            return AutoRefreshRankListSetting.DEFAULT;
        }
        return valueSafely;
    }
}
