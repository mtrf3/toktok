package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveAudienceImageCacheRefactorSetting;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class CQY extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final CQY LJLIL = new CQY();

    public CQY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int avatarHeightExtendedScreen;
        LiveAudienceImageCacheRefactorSetting liveAudienceImageCacheRefactorSetting = LiveAudienceImageCacheRefactorSetting.INSTANCE;
        if (liveAudienceImageCacheRefactorSetting.getAvatarHeightExtendedScreen() < 0) {
            avatarHeightExtendedScreen = C15380j0.LJFF(R.dimen.abn);
            liveAudienceImageCacheRefactorSetting.setAvatarHeightExtendedScreen(avatarHeightExtendedScreen);
        } else {
            avatarHeightExtendedScreen = liveAudienceImageCacheRefactorSetting.getAvatarHeightExtendedScreen();
        }
        return Integer.valueOf(avatarHeightExtendedScreen);
    }
}
