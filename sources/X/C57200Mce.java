package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import kotlin.jvm.internal.o;

/* renamed from: X.Mce, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57200Mce extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoMusicCoverAssem, Double, C76800UCe> {
    public static final C57200Mce LJLIL = new C57200Mce();

    public C57200Mce() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoMusicCoverAssem videoMusicCoverAssem, Double d) {
        VideoMusicCoverAssem selectSubscribe = videoMusicCoverAssem;
        Double d2 = d;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (d2 != null) {
            double doubleValue = d2.doubleValue();
            if (!selectSubscribe.LLJJJIL && doubleValue > MusicDetailService.LJIJJ().LJIIL()) {
                selectSubscribe.LLJJJIL = true;
                ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
                MusicDetailService.LJIJJ().LJII();
            }
        }
        return C76800UCe.LIZ;
    }
}
