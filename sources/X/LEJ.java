package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.api.FeedModuleServiceImpl;
import com.ss.android.ugc.aweme.feed.api.IFeedModuleService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LEJ {
    public static volatile IFeedModuleService LIZ;

    public static IFeedModuleService LIZ() {
        if (LIZ == null) {
            LIZ = FeedModuleServiceImpl.LIZ();
        }
        IFeedModuleService iFeedModuleService = LIZ;
        o.LJI(iFeedModuleService);
        return iFeedModuleService;
    }

    public static final LAO LIZIZ(ActivityC45651qj activityC45651qj, View layout) {
        o.LJIIIZ(layout, "layout");
        return LIZ().newTopNoticeFeedManager(activityC45651qj, layout);
    }
}
