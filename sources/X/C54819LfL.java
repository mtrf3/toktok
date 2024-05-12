package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import kotlin.jvm.internal.AqS14S0010000_9;
import kotlin.jvm.internal.AqS52S0110000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LfL */
/* loaded from: classes10.dex */
public final class C54819LfL {
    public static void LIZ(String str, UserStory userStory) {
        if (str == null || userStory == null) {
            return;
        }
        boolean allViewed = userStory.getAllViewed();
        userStory.setAllViewed(true);
        C53708L6a.LIZIZ.LJ(L61.STORY, str);
        if (C54838Lfe.LJIIJJI(str) && !allViewed && !userStory.getFakeAwemeShell()) {
            C1E2.LIZJ(new AqS14S0010000_9(3));
        } else {
            C54794Lew.LIZ.LIZIZ(str);
        }
    }

    public static void LIZIZ(String str, UserStory userStory, Integer num, Aweme aweme, boolean z) {
        int i;
        int i2;
        Integer currentIndex;
        if (str == null || userStory == null) {
            return;
        }
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        if (currentInfo != null) {
            i = currentInfo.getDispatchCode();
        } else {
            i = 0;
        }
        UserStoryCurrentInfo userStoryCurrentInfo = new UserStoryCurrentInfo(num, aweme, i);
        if (!o.LJ(currentInfo, userStoryCurrentInfo)) {
            userStory.setCurrentInfo(userStoryCurrentInfo);
            if (num != null) {
                num.intValue();
                UserStoryCurrentInfo maxViewedInfo = userStory.getMaxViewedInfo();
                if (maxViewedInfo != null && (currentIndex = maxViewedInfo.getCurrentIndex()) != null) {
                    i2 = currentIndex.intValue();
                } else {
                    i2 = -1;
                }
                if (i2 < num.intValue()) {
                    userStory.setMaxViewedInfo(new UserStoryCurrentInfo(num, aweme, 0, 4, null));
                }
            }
            if (C54838Lfe.LJIIJJI(str) && !userStory.getFakeAwemeShell()) {
                C1E2.LIZJ(new AqS52S0110000_9(z, userStoryCurrentInfo, 4));
            }
        }
    }

    public static /* synthetic */ void LIZJ(C54819LfL c54819LfL, String str, UserStory userStory, Integer num, Aweme aweme) {
        c54819LfL.getClass();
        LIZIZ(str, userStory, num, aweme, false);
    }
}
