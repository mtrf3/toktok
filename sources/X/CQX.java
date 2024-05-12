package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveAudienceImageCacheRefactorSetting;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class CQX extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final CQX LJLIL = new CQX();

    public CQX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int avatarHeight;
        LiveAudienceImageCacheRefactorSetting liveAudienceImageCacheRefactorSetting = LiveAudienceImageCacheRefactorSetting.INSTANCE;
        if (liveAudienceImageCacheRefactorSetting.getAvatarHeight() < 0) {
            avatarHeight = C15380j0.LJFF(R.dimen.acv);
            liveAudienceImageCacheRefactorSetting.setAvatarHeight(avatarHeight);
        } else {
            avatarHeight = liveAudienceImageCacheRefactorSetting.getAvatarHeight();
        }
        return Integer.valueOf(avatarHeight);
    }
}
