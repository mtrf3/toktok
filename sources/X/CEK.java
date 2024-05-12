package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentPurchaseConfig;

/* loaded from: classes6.dex */
public final class CEK extends AbstractC65781Prl implements InterfaceC65784Pro<LiveStarCommentPurchaseConfig.Config> {
    public static final CEK LJLIL = new CEK();

    public CEK() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentPurchaseConfig$Config, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveStarCommentPurchaseConfig.Config invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveStarCommentPurchaseConfig.class);
        if (valueSafely == 0) {
            return LiveStarCommentPurchaseConfig.DEFAULT;
        }
        return valueSafely;
    }
}
