package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LikeAnimationOptModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeAnimationOptConfig;

/* loaded from: classes6.dex */
public final class CG1 extends AbstractC65781Prl implements InterfaceC65784Pro<LikeAnimationOptModel> {
    public static final CG1 LJLIL = new CG1();

    public CG1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.performance.LikeAnimationOptModel, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LikeAnimationOptModel invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveLikeAnimationOptConfig.class);
        if (valueSafely == 0) {
            return LiveLikeAnimationOptConfig.DEFAULT;
        }
        return valueSafely;
    }
}
