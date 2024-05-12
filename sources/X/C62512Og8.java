package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.Og8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62512Og8 {
    public static final int LIZ(Aweme aweme) {
        User author;
        boolean LJJIIZI = C78996UzQ.LJJIIZI(aweme);
        if (aweme.isProhibited()) {
            return 141;
        }
        if (aweme.isDelete()) {
            return 22;
        }
        if (aweme.isSelfSee() && !LJJIIZI) {
            return 144;
        }
        if (aweme.isPrivate() && !LJJIIZI) {
            return UserLevelGeckoUpdateSetting.DEFAULT;
        }
        if (C80S.LIZJ(aweme) && (((author = aweme.getAuthor()) == null || author.getFollowStatus() != 2) && !LJJIIZI)) {
            return 141;
        }
        return 0;
    }
}
