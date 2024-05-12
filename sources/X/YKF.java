package X;

import com.bytedance.android.livesdk.livesetting.other.LiveBottomRightLikeBehaviorSetting;

/* loaded from: classes16.dex */
public final class YKF extends AbstractC65781Prl implements InterfaceC65784Pro<LiveBottomRightLikeBehaviorSetting.LikeBehaviorConfig> {
    public static final YKF LJLIL = new YKF();

    public YKF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LiveBottomRightLikeBehaviorSetting.LikeBehaviorConfig invoke() {
        return LiveBottomRightLikeBehaviorSetting.INSTANCE.getValue();
    }
}
