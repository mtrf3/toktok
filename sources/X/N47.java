package X;

import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N47 extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Long> {
    public static final N47 LJLIL = new N47();

    public N47() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Long invoke(M95 m95) {
        Music music;
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        MusicDetail musicDetail = (MusicDetail) $receiver.LIZ(MusicDetail.class);
        if (musicDetail != null && (music = musicDetail.music) != null) {
            return Long.valueOf(music.getId());
        }
        Music music2 = (Music) $receiver.LIZ(Music.class);
        if (music2 != null) {
            return Long.valueOf(music2.getId());
        }
        return null;
    }
}
