package X;

import android.util.ArrayMap;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KJK {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(String str, List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Music) it.next()).setRecommendSourceFrom(str);
        }
    }

    public static final void LIZIZ(String tag, List list, java.util.Map map) {
        String str;
        o.LJIIIZ(tag, "tag");
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "enable_music_resource_tag", true) == 0 || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Music music = (Music) it.next();
            MusicTag musicTag = new MusicTag();
            musicTag.setTagTitle(tag);
            if (map != null) {
                str = (String) ((ArrayMap) map).get(Long.valueOf(music.getId()));
            } else {
                str = null;
            }
            musicTag.setRecallReason(str);
            music.setMusicTags(C47261Igj.LJJIJ(musicTag));
        }
    }
}
