package X;

import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N48 extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Long> {
    public static final N48 LJLIL = new N48();

    public N48() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Long invoke(M95 m95) {
        long j;
        Long valueOf;
        Music music;
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        MusicModel musicModel = (MusicModel) $receiver.LIZ(MusicModel.class);
        if (musicModel != null) {
            j = musicModel.getId();
        } else {
            MusicDetail musicDetail = (MusicDetail) $receiver.LIZ(MusicDetail.class);
            if (musicDetail != null && (music = musicDetail.music) != null) {
                j = music.getId();
            } else {
                Music music2 = (Music) $receiver.LIZ(Music.class);
                if (music2 != null && (valueOf = Long.valueOf(music2.getId())) != null) {
                    j = valueOf.longValue();
                } else {
                    j = 0;
                }
            }
        }
        return Long.valueOf(j);
    }
}
