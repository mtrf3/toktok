package X;

import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N4A extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final N4A LJLIL = new N4A();

    public N4A() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        MatchedSoundInfo matchedSongInfo;
        Music music;
        MatchedSoundInfo matchedSongInfo2;
        String id;
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        MusicDetail musicDetail = (MusicDetail) $receiver.LIZ(MusicDetail.class);
        if (musicDetail == null || (music = musicDetail.music) == null || (matchedSongInfo2 = music.getMatchedSongInfo()) == null || (id = matchedSongInfo2.getId()) == null) {
            Music music2 = (Music) $receiver.LIZ(Music.class);
            if (music2 != null && (matchedSongInfo = music2.getMatchedSongInfo()) != null) {
                return matchedSongInfo.getId();
            }
            return null;
        }
        return id;
    }
}
