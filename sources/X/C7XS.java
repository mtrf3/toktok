package X;

import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.ReuseMusicStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.7XS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7XS {
    public static boolean LIZ(MusicDetail musicDetail, ReuseMusicStruct reuseMusicStruct) {
        MatchedPGCSoundInfo matchedPGCSoundInfo;
        String id;
        String str;
        MatchedPGCSoundInfo matchedPGCSoundInfo2;
        o.LJIIIZ(musicDetail, "musicDetail");
        Music music = musicDetail.music;
        String str2 = null;
        if (music != null && (matchedPGCSoundInfo = music.getMatchedPGCSoundInfo()) != null && (id = matchedPGCSoundInfo.getId()) != null && id.length() != 0) {
            if (reuseMusicStruct != null) {
                str = reuseMusicStruct.getId();
            } else {
                str = null;
            }
            Music music2 = musicDetail.music;
            if (music2 != null && (matchedPGCSoundInfo2 = music2.getMatchedPGCSoundInfo()) != null) {
                str2 = matchedPGCSoundInfo2.getId();
            }
            if (!o.LJ(str, str2)) {
                return true;
            }
        }
        return false;
    }
}
