package X;

import Y.ARunnableS42S0100000_6;
import Y.ARunnableS8S0201000_5;
import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FET {
    public static boolean LIZ;
    public static final List<String> LIZIZ;
    public static final String[] LIZJ;
    public static final String[] LIZLLL;

    static {
        ArrayList arrayList = new ArrayList();
        LIZIZ = arrayList;
        LIZJ = new String[]{"common_feed_layout_video_desc", "common_feed_layout_translation_controls", "common_feed_layout_translation_status", "layout_video_multi_tag", "common_feed_layout_video_digg", "common_feed_view_video_progress_bar", "common_feed_layout_video_comment_count", "common_feed_layout_video_share", "common_feed_item_scm_label", "common_feed_layout_feed_avatar", "common_feed_view_video_caution", "common_feed_layout_video_title_music", "common_feed_layout_video_cover_music", "profile_fragment_user_mt", "profile_fragment_aweme_list_mus", "aweme_comment_fragment_input_detail"};
        LIZLLL = new String[]{"common_feed_item_feed"};
        if (((Boolean) C35138Dqg.LIZ.getValue()).booleanValue()) {
            arrayList.add("homepage_common_fragment_main_page_opt");
        } else {
            arrayList.add("homepage_common_fragment_main_page");
        }
        if (C35138Dqg.LIZJ()) {
            arrayList.add("homepage_common_fragment_main_opt");
        } else {
            arrayList.add("homepage_common_fragment_main");
        }
        if (C35138Dqg.LIZ()) {
            arrayList.add("homepage_common_view_main_tab_item_follow_opt");
        } else {
            arrayList.add("homepage_common_view_main_tab_item_follow");
        }
        if (C35138Dqg.LIZIZ()) {
            arrayList.add("common_feed_fragment_feed_opt");
        } else {
            arrayList.add("common_feed_fragment_feed");
        }
    }

    public static void LIZ() {
        for (String str : LIZLLL) {
            C16970lZ.LJIIIIZZ(str);
        }
    }

    public static synchronized void LIZJ(Context context) {
        synchronized (FET.class) {
            Iterator it = ((ArrayList) LIZIZ).iterator();
            while (it.hasNext()) {
                C16970lZ.LJFF(context, (String) it.next());
            }
        }
    }

    public static synchronized void LIZLLL(Activity activity) {
        synchronized (FET.class) {
            EKA.LIZ(activity);
            if (!FEV.LIZIZ) {
                C16970lZ.LJI(activity);
            }
            if (C38987FRv.LIZLLL().booleanValue()) {
                if (C38866FNe.LIZIZ()) {
                    C16970lZ.LJFF(activity, "common_feed_swipe_up_strengthen_layout");
                }
                if (C2NW.LIZ().LJJIIJ()) {
                    ((ArrayList) LIZIZ).add("legacy_fragment_page_container");
                    LIZJ(activity);
                }
                LIZIZ(((Number) C33842DPy.LJ.getValue()).intValue(), activity);
                if (((Boolean) C33839DPv.LIZLLL.getValue()).booleanValue()) {
                    String[] strArr = LIZJ;
                    int length = strArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        C57022Lq.LIZ.LJLIL.postDelayed(new ARunnableS8S0201000_5(2, activity, strArr[i], 1), i2 * 50);
                        i++;
                        i2++;
                    }
                }
            } else if (LIZ) {
                if (((Boolean) C34786Dl0.LJIIIZ.getValue()).booleanValue()) {
                    FN7.LIZJ(Boolean.FALSE);
                }
                if (((Boolean) C34786Dl0.LJII.getValue()).booleanValue()) {
                    LIZJ(activity);
                    LIZIZ(((Number) C34786Dl0.LJI.getValue()).intValue(), activity);
                }
                if (((Boolean) C34786Dl0.LJIIIIZZ.getValue()).booleanValue()) {
                    C37179EiV.LJFF.post(new ARunnableS42S0100000_6(activity, 154));
                }
            } else {
                LIZJ(activity);
                LIZIZ(((Number) C35331Dtn.LIZ.getValue()).intValue(), activity);
            }
            LIZ = true;
        }
    }

    public static void LIZIZ(int i, Context context) {
        if (context == null) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            for (String layoutName : LIZLLL) {
                o.LJIIIZ(layoutName, "layoutName");
                if (!o.LJ(layoutName, "common_feed_item_feed") || !((Boolean) FDY.LIZIZ.getValue()).booleanValue() || !FDY.LJIIIZ.compareAndSet(false, true)) {
                    C16970lZ.LJFF(context, layoutName);
                }
            }
        }
    }
}
