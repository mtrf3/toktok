package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawShowAnimationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RecommendEndAtFollowingSetting;
import com.bytedance.android.livesdk.model.LiveRecommendAtEnd;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BKU {
    public static float LJIIIIZZ;
    public static String LIZ = "";
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static String LJ = "";
    public static String LJFF = "";
    public static String LJI = "";
    public static String LJII = "";
    public static final List<String> LJIIIZ = C47261Igj.LJJIJIIJI("following_window_live_cell_refresh", "homepage_follow_live_cell_refresh", "homepage_follow_video_head_refresh", "following_window_live_cell_loadmore", "homepage_follow_live_cell_loadmore", "homepage_follow_video_head_load_more", "message_live_cell_refresh", "message_live_cell_loadmore", "inner_push_inner_push_refresh", "inner_push_inner_push_loadmore", "push_push_refresh", "push_push_loadmore", "following_list_head_refresh", "following_list_head_loadmore", "related_live_refresh", "related_live_loadmore");
    public static String LJIIJ = "";

    public static boolean LIZLLL() {
        return ORY.LJJIJIIJIL(LJIIJ, LiveDrawShowAnimationSetting.INSTANCE.getCurrentValue());
    }

    public static String LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZ);
        LIZ2.append('_');
        LIZ2.append(LIZIZ);
        return X1D.LIZIZ(LIZ2);
    }

    public static String LIZIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(BM1.LJIILL);
        LIZ2.append('_');
        LIZ2.append(BM1.LJIILLIIL);
        return X1D.LIZIZ(LIZ2);
    }

    public static boolean LIZJ(String fromType) {
        o.LJIIIZ(fromType, "fromType");
        LiveRecommendAtEnd value = RecommendEndAtFollowingSetting.INSTANCE.getValue();
        if (value.enableShowRecommend <= 0) {
            return false;
        }
        if (!value.followingEntrances.contains(fromType) && !BL6.LIZIZ(fromType)) {
            return false;
        }
        return true;
    }
}
