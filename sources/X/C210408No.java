package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardViewModel;
import java.util.List;
import kotlin.jvm.internal.AqS41S1000000_3;

/* renamed from: X.8No, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210408No {
    public static String LIZ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        if (str == null) {
            str = "";
        }
        return JBR.LJFF(LIZ, str, "_story_guide_card_skylight_list_view_model", LIZ);
    }

    public static Aweme LIZJ(Aweme aweme) {
        UserStory userStory;
        List<Aweme> stories;
        if (C54838Lfe.LJJ(aweme)) {
            if (aweme != null && (userStory = aweme.getUserStory()) != null && (stories = userStory.getStories()) != null) {
                return (Aweme) ORZ.LJLLLL(stories);
            }
            return null;
        }
        return aweme;
    }

    public static StoryGuideCardViewModel LIZIZ(Fragment fragment, String str) {
        if (str == null || str.length() == 0 || fragment == null) {
            return null;
        }
        return (StoryGuideCardViewModel) new C214378bB(C65352Pkq.LIZ(StoryGuideCardViewModel.class), new AqS41S1000000_3(str, 0), C214528bQ.LJLIL, C78926UyI.LJJII(fragment, false), C184077Kh.LJLIL, C210418Np.INSTANCE, null, null).getValue();
    }
}
