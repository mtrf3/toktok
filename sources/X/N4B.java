package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N4B extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final N4B LJLIL = new N4B();

    public N4B() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        MatchedSoundInfo matchedSongInfo;
        String id;
        Music music;
        MatchedSoundInfo matchedSongInfo2;
        String id2;
        MatchedSoundInfo matchedSongInfo3;
        String id3;
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        MusicModel musicModel = (MusicModel) $receiver.LIZ(MusicModel.class);
        if (musicModel == null || (matchedSongInfo3 = musicModel.getMatchedSongInfo()) == null || (id3 = matchedSongInfo3.getId()) == null) {
            MusicDetail musicDetail = (MusicDetail) $receiver.LIZ(MusicDetail.class);
            if (musicDetail == null || (music = musicDetail.music) == null || (matchedSongInfo2 = music.getMatchedSongInfo()) == null || (id2 = matchedSongInfo2.getId()) == null) {
                Music music2 = (Music) $receiver.LIZ(Music.class);
                if (music2 == null || (matchedSongInfo = music2.getMatchedSongInfo()) == null || (id = matchedSongInfo.getId()) == null) {
                    return CardStruct.IStatusCode.DEFAULT;
                }
                return id;
            }
            return id2;
        }
        return id3;
    }
}
