package X;

import com.ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class MH6 {
    public static boolean LIZ;

    public static final boolean LIZ() {
        if (C00F.LIZ(31744, 0, "discover_speed_detail", true) != 1) {
            return false;
        }
        return true;
    }

    public static final void LIZIZ(AbstractC51036K1g<Aweme, ?> abstractC51036K1g, List<? extends Aweme> list) {
        if (!LIZ()) {
            return;
        }
        for (Aweme aweme : list) {
            if (aweme == null || aweme.getAuthor() == null || aweme.getStatistics() == null) {
                return;
            }
        }
        if (abstractC51036K1g instanceof C56542MHa) {
            abstractC51036K1g.getClass();
            abstractC51036K1g.setItems(new ArrayList(list));
            ((MusicAwemeList) abstractC51036K1g.mData).cursor = list.size();
        }
        ChallengeDetailServiceImpl.LIZLLL().LIZIZ(abstractC51036K1g, list);
        if (abstractC51036K1g != null) {
            ProfileServiceImpl.LIZ().mobRefreshInProfileAweme(abstractC51036K1g, list);
        }
    }
}
