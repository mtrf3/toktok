package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;

/* loaded from: classes9.dex */
public final class JP2 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(JP3.LJLIL);

    public static boolean LIZ(Aweme aweme) {
        PlayListInfo playListInfo;
        Integer mixSrc;
        if (((Number) LIZ.getValue()).intValue() == 0 || aweme == null || (playListInfo = aweme.playlist_info) == null || (mixSrc = playListInfo.getMixSrc()) == null || mixSrc.intValue() != 1) {
            return false;
        }
        return true;
    }
}
