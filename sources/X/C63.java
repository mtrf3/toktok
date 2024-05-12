package X;

import com.bytedance.android.livesdk.livesetting.other.LiveSelfLinkedLikeBehaviorSetting;

/* loaded from: classes6.dex */
public final class C63 extends AbstractC65781Prl implements InterfaceC65784Pro<LiveSelfLinkedLikeBehaviorSetting.LikeBehaviorConfig> {
    public static final C63 LJLIL = new C63();

    public C63() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LiveSelfLinkedLikeBehaviorSetting.LikeBehaviorConfig invoke() {
        return LiveSelfLinkedLikeBehaviorSetting.INSTANCE.getValue();
    }
}
