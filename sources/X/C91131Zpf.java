package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.o;

/* renamed from: X.Zpf, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91131Zpf {
    public static boolean LIZ(VideoItemParams item) {
        Long l;
        com.ss.android.ugc.aweme.music.model.Dsp dsp;
        Music music;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        String str = null;
        if (aweme != null && (music = aweme.getMusic()) != null) {
            l = Long.valueOf(music.getId());
        } else {
            l = null;
        }
        Aweme aweme2 = item.getAweme();
        if (aweme2 != null && (dsp = aweme2.getDsp()) != null) {
            str = dsp.getFullClipId();
        }
        if (l != null && str != null) {
            return true;
        }
        return false;
    }
}
