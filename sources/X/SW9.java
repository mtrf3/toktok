package X;

import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SW9 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicTitleRefactorAssem, SU3, C76800UCe> {
    public static final SW9 LJLIL = new SW9();

    public SW9() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicTitleRefactorAssem videoMusicTitleRefactorAssem, SU3 su3) {
        Aweme aweme;
        Music music;
        List<TT2DSPSongInfo> tT2DSPSongInfos;
        VideoMusicTitleRefactorAssem selectSubscribe = videoMusicTitleRefactorAssem;
        SU3 su32 = su3;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (su32 != null && !selectSubscribe.LLILIL && su32.LJLIL.length() > 0 && (aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme()) != null && (music = aweme.getMusic()) != null && (tT2DSPSongInfos = music.getTT2DSPSongInfos()) != null) {
            Iterator<TT2DSPSongInfo> it = tT2DSPSongInfos.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (o.LJ(it.next().getSongId(), su32.LJLIL)) {
                    selectSubscribe.LLILL = true;
                    selectSubscribe.Yp();
                    break;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
