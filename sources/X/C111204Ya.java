package X;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111204Ya {
    public static void LIZ(SmartImageView coverIv) {
        int i;
        o.LJIIIZ(coverIv, "coverIv");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_video_slash;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(32));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(32));
        Context context = coverIv.getContext();
        o.LJIIIIZZ(context, "coverIv.context");
        SY9 LIZ = c2068389v.LIZ(context);
        coverIv.setScaleType(ImageView.ScaleType.CENTER);
        coverIv.setImageDrawable(LIZ);
        Context context2 = coverIv.getContext();
        o.LJIIIIZZ(context2, "coverIv.context");
        Integer LJI = C79045V0n.LJI(R.attr.d4, context2);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        coverIv.setBackgroundColor(i);
    }

    public static int LIZIZ(List list) {
        UserStory userStory;
        if (list != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                Aweme aweme = (Aweme) it.next();
                if (C54838Lfe.LJJI(aweme) && (userStory = aweme.getUserStory()) != null && !userStory.isPostStyle()) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}
