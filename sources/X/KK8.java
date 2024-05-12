package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KK8 {
    public static final java.util.Map<String, Integer> LIZ = C113554cx.LJJL(new OSZ("search_video_cell_style_new", 4), new OSZ("search_relative_search_cover", 4), new OSZ("search_layout_video_view", 4), new OSZ("search_click_search_stub", 4), new OSZ("search_layout_search_mix_for_user", 1), new OSZ("search_item_user", 3), new OSZ("search_user_video_holder", 3), new OSZ("search_user_video_playlist", 1), new OSZ("search_item_user_showcase_bar_new", 1), new OSZ("mix_feed_profile_item_play_list_entry", 1));
    public static final java.util.Map<String, Integer> LIZIZ = C113554cx.LJJL(new OSZ("search_fragment_search_container", 1), new OSZ("search_fragment_search", 1), new OSZ("layout_mt_empty_view", 1), new OSZ("search_layout_fix_ratio_follow_feed_content_video", 4));
    public static final java.util.Map<Integer, Integer> LIZJ = C51029K0z.LJJIIZI(new OSZ(Integer.valueOf(R.layout.bl7), 3));

    public static void LIZ(Context context) {
        o.LJIIIZ(context, "context");
        for (Map.Entry<Integer, Integer> entry : LIZJ.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            for (int i = 0; i < intValue2; i++) {
                C16970lZ.LJ(intValue, context);
            }
        }
    }
}
