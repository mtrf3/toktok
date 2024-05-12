package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.o;

/* renamed from: X.3A4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3A4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Aweme aweme, String str, String str2, float f, float f2, Context context, long j) {
        int i;
        String str3;
        if (aweme != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("group_id", aweme.getAid());
            c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
            c188727au.LIZLLL(C79004UzY.LJJJIL(context, aweme), "is_landscape_screen");
            c188727au.LJIIIZ("enter_method", str2);
            Video video = aweme.getVideo();
            if (video != null) {
                i = video.getDuration();
            } else {
                i = 0;
            }
            c188727au.LIZLLL(i, "item_duration");
            c188727au.LIZIZ(f, "speed_mode");
            if (aweme.isPaidContent) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("is_collection_item", str3);
            c188727au.LIZIZ(f2, "prev_speed_mode");
            if (o.LJ(str2, "long_press")) {
                c188727au.LJ(j, "speedup_duration");
            }
            FMX.LJIIL("change_video_speed", c188727au.LIZ);
        }
    }
}
