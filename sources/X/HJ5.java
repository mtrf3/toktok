package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HJ5 {
    public static void LIZ(Activity activity, MvThemeData mvThemeData, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(activity, "activity");
        if (mvThemeData == null || mvThemeData.minCount < 0) {
            return;
        }
        String LJIIIZ = mvThemeData.LJIIIZ();
        if (!C39579Fg7.LIZIZ(LJIIIZ)) {
            return;
        }
        mvThemeData.needServerExecute = HJC.LIZLLL(mvThemeData);
        Bundle bundle = new Bundle();
        bundle.putString("key_mv_src_limited_toast", mvThemeData.srcLimitToast);
        bundle.putInt("upload_photo_min_height", mvThemeData.srcLimitHeight);
        bundle.putInt("upload_photo_min_width", mvThemeData.srcLimitWidth);
        bundle.putString("key_mv_hint_text", mvThemeData.LIZLLL(activity));
        bundle.putString("key_mv_resource_unzip_path", LJIIIZ);
        bundle.putParcelable("key_select_mv_data", mvThemeData);
        bundle.putParcelable("key_short_video_context", shortVideoContext);
        Effect effect = mvThemeData.effect;
        if (effect != null) {
            List<String> tags = effect.getTags();
            if (!C32151Nz.LJJIIJZLJL(tags)) {
                o.LJI(tags);
                Iterator<String> it = tags.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (ujb.o.LJJJLIIL(next, "challenge:", false)) {
                        String substring = next.substring(10);
                        o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                        if (substring != null) {
                            bundle.putString("Key_challenge_id", substring);
                        }
                    }
                }
            }
        }
        Effect effect2 = mvThemeData.effect;
        if (effect2 != null) {
            bundle.putString("key_sdk_extra_data", effect2.getSdkExtra());
        }
        bundle.putString("key_mv_algorithm_hint", mvThemeData.LJIIL());
        bundle.putInt("key_photo_select_min_count", mvThemeData.minCount);
        bundle.putInt("key_photo_select_max_count", mvThemeData.maxCount);
        bundle.putInt("key_support_flag", 3);
        bundle.putInt("key_choose_scene", 2);
        bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        HJ9.LIZJ(activity, bundle, 10001);
    }
}
