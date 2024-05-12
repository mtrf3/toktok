package X;

import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N46 extends AbstractC65781Prl implements InterfaceC88472Yns<M95, EnumC58714N2o> {
    public static final N46 LJLIL = new N46();

    public N46() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final EnumC58714N2o invoke(M95 m95) {
        Music music;
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        MusicDetail musicDetail = (MusicDetail) $receiver.LIZ(MusicDetail.class);
        if ((musicDetail == null || (music = musicDetail.music) == null) && (music = (Music) $receiver.LIZ(Music.class)) == null) {
            return null;
        }
        if (C44416Hbw.LIZLLL() && (!music.isCommercialMusic())) {
            return EnumC58714N2o.UNUSABLE;
        }
        if (music.isOriginalSound()) {
            return EnumC58714N2o.USABLE_ORIGINAL_SOUND;
        }
        if (music.isCommercialMusic()) {
            return EnumC58714N2o.USABLE_COMMERCIAL_SOUND;
        }
        return EnumC58714N2o.UNUSABLE;
    }
}
